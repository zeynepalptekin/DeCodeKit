package c.a.b.b.k;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class p {

    interface a extends e, g, h<Object> {
    }

    private static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final CountDownLatch f1915a;

        private b() {
            this.f1915a = new CountDownLatch(1);
        }

        /* synthetic */ b(p0 p0Var) {
            this();
        }

        public final void a() throws InterruptedException {
            this.f1915a.await();
        }

        @Override // c.a.b.b.k.h
        public final void b(Object obj) {
            this.f1915a.countDown();
        }

        @Override // c.a.b.b.k.e
        public final void c() {
            this.f1915a.countDown();
        }

        public final boolean d(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f1915a.await(j, timeUnit);
        }

        @Override // c.a.b.b.k.g
        public final void e(@androidx.annotation.h0 Exception exc) {
            this.f1915a.countDown();
        }
    }

    private static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f1916a = new Object();

        /* renamed from: b, reason: collision with root package name */
        private final int f1917b;

        /* renamed from: c, reason: collision with root package name */
        private final l0<Void> f1918c;

        @GuardedBy("mLock")
        private int d;

        @GuardedBy("mLock")
        private int e;

        @GuardedBy("mLock")
        private int f;

        @GuardedBy("mLock")
        private Exception g;

        @GuardedBy("mLock")
        private boolean h;

        public c(int r2, l0<Void> l0Var) {
            this.f1917b = r2;
            this.f1918c = l0Var;
        }

        @GuardedBy("mLock")
        private final void a() {
            if (this.d + this.e + this.f == this.f1917b) {
                if (this.g == null) {
                    if (this.h) {
                        this.f1918c.A();
                        return;
                    } else {
                        this.f1918c.z(null);
                        return;
                    }
                }
                l0<Void> l0Var = this.f1918c;
                int r2 = this.e;
                int r3 = this.f1917b;
                StringBuilder sb = new StringBuilder(54);
                sb.append(r2);
                sb.append(" out of ");
                sb.append(r3);
                sb.append(" underlying tasks failed");
                l0Var.y(new ExecutionException(sb.toString(), this.g));
            }
        }

        @Override // c.a.b.b.k.h
        public final void b(Object obj) {
            synchronized (this.f1916a) {
                this.d++;
                a();
            }
        }

        @Override // c.a.b.b.k.e
        public final void c() {
            synchronized (this.f1916a) {
                this.f++;
                this.h = true;
                a();
            }
        }

        @Override // c.a.b.b.k.g
        public final void e(@androidx.annotation.h0 Exception exc) {
            synchronized (this.f1916a) {
                this.e++;
                this.g = exc;
                a();
            }
        }
    }

    private p() {
    }

    public static <TResult> TResult a(@androidx.annotation.h0 m<TResult> mVar) throws ExecutionException, InterruptedException {
        com.google.android.gms.common.internal.r.i();
        com.google.android.gms.common.internal.r.l(mVar, "Task must not be null");
        if (mVar.u()) {
            return (TResult) n(mVar);
        }
        b bVar = new b(null);
        o(mVar, bVar);
        bVar.a();
        return (TResult) n(mVar);
    }

    public static <TResult> TResult b(@androidx.annotation.h0 m<TResult> mVar, long j, @androidx.annotation.h0 TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        com.google.android.gms.common.internal.r.i();
        com.google.android.gms.common.internal.r.l(mVar, "Task must not be null");
        com.google.android.gms.common.internal.r.l(timeUnit, "TimeUnit must not be null");
        if (mVar.u()) {
            return (TResult) n(mVar);
        }
        b bVar = new b(null);
        o(mVar, bVar);
        if (bVar.d(j, timeUnit)) {
            return (TResult) n(mVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @androidx.annotation.h0
    public static <TResult> m<TResult> c(@androidx.annotation.h0 Callable<TResult> callable) {
        return d(o.f1912a, callable);
    }

    @androidx.annotation.h0
    public static <TResult> m<TResult> d(@androidx.annotation.h0 Executor executor, @androidx.annotation.h0 Callable<TResult> callable) {
        com.google.android.gms.common.internal.r.l(executor, "Executor must not be null");
        com.google.android.gms.common.internal.r.l(callable, "Callback must not be null");
        l0 l0Var = new l0();
        executor.execute(new p0(l0Var, callable));
        return l0Var;
    }

    @androidx.annotation.h0
    public static <TResult> m<TResult> e() {
        l0 l0Var = new l0();
        l0Var.A();
        return l0Var;
    }

    @androidx.annotation.h0
    public static <TResult> m<TResult> f(@androidx.annotation.h0 Exception exc) {
        l0 l0Var = new l0();
        l0Var.y(exc);
        return l0Var;
    }

    @androidx.annotation.h0
    public static <TResult> m<TResult> g(TResult tresult) {
        l0 l0Var = new l0();
        l0Var.z(tresult);
        return l0Var;
    }

    @androidx.annotation.h0
    public static m<Void> h(@androidx.annotation.i0 Collection<? extends m<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return g(null);
        }
        Iterator<? extends m<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        l0 l0Var = new l0();
        c cVar = new c(collection.size(), l0Var);
        Iterator<? extends m<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            o(it2.next(), cVar);
        }
        return l0Var;
    }

    @androidx.annotation.h0
    public static m<Void> i(@androidx.annotation.i0 m<?>... mVarArr) {
        return (mVarArr == null || mVarArr.length == 0) ? g(null) : h(Arrays.asList(mVarArr));
    }

    @androidx.annotation.h0
    public static m<List<m<?>>> j(@androidx.annotation.i0 Collection<? extends m<?>> collection) {
        return (collection == null || collection.isEmpty()) ? g(Collections.emptyList()) : h(collection).o(new q0(collection));
    }

    @androidx.annotation.h0
    public static m<List<m<?>>> k(@androidx.annotation.i0 m<?>... mVarArr) {
        return (mVarArr == null || mVarArr.length == 0) ? g(Collections.emptyList()) : j(Arrays.asList(mVarArr));
    }

    @androidx.annotation.h0
    public static <TResult> m<List<TResult>> l(@androidx.annotation.i0 Collection<? extends m<?>> collection) {
        return (collection == null || collection.isEmpty()) ? g(Collections.emptyList()) : (m<List<TResult>>) h(collection).m(new r(collection));
    }

    @androidx.annotation.h0
    public static <TResult> m<List<TResult>> m(@androidx.annotation.i0 m<?>... mVarArr) {
        return (mVarArr == null || mVarArr.length == 0) ? g(Collections.emptyList()) : l(Arrays.asList(mVarArr));
    }

    private static <TResult> TResult n(@androidx.annotation.h0 m<TResult> mVar) throws ExecutionException {
        if (mVar.v()) {
            return mVar.r();
        }
        if (mVar.t()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(mVar.q());
    }

    private static void o(m<?> mVar, a aVar) {
        mVar.l(o.f1913b, aVar);
        mVar.i(o.f1913b, aVar);
        mVar.c(o.f1913b, aVar);
    }
}
