package c.a.b.b.k;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class l0<TResult> extends m<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1905a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final h0<TResult> f1906b = new h0<>();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private boolean f1907c;
    private volatile boolean d;

    @androidx.annotation.i0
    @GuardedBy("mLock")
    private TResult e;

    @GuardedBy("mLock")
    private Exception f;

    private static class a extends LifecycleCallback {

        /* renamed from: b, reason: collision with root package name */
        private final List<WeakReference<i0<?>>> f1908b;

        private a(com.google.android.gms.common.api.internal.d dVar) {
            super(dVar);
            this.f1908b = new ArrayList();
            this.f2502a.c("TaskOnStopCallback", this);
        }

        public static a m(Activity activity) {
            com.google.android.gms.common.api.internal.d dVarC = LifecycleCallback.c(activity);
            a aVar = (a) dVarC.g("TaskOnStopCallback", a.class);
            return aVar == null ? new a(dVarC) : aVar;
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        @androidx.annotation.e0
        public void l() {
            synchronized (this.f1908b) {
                Iterator<WeakReference<i0<?>>> it = this.f1908b.iterator();
                while (it.hasNext()) {
                    i0<?> i0Var = it.next().get();
                    if (i0Var != null) {
                        i0Var.a();
                    }
                }
                this.f1908b.clear();
            }
        }

        public final <T> void n(i0<T> i0Var) {
            synchronized (this.f1908b) {
                this.f1908b.add(new WeakReference<>(i0Var));
            }
        }
    }

    l0() {
    }

    @GuardedBy("mLock")
    private final void B() {
        com.google.android.gms.common.internal.r.r(this.f1907c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    private final void E() {
        if (this.f1907c) {
            throw d.a(this);
        }
    }

    @GuardedBy("mLock")
    private final void F() {
        if (this.d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void G() {
        synchronized (this.f1905a) {
            if (this.f1907c) {
                this.f1906b.a(this);
            }
        }
    }

    public final boolean A() {
        synchronized (this.f1905a) {
            if (this.f1907c) {
                return false;
            }
            this.f1907c = true;
            this.d = true;
            this.f1906b.a(this);
            return true;
        }
    }

    public final boolean C(@androidx.annotation.h0 Exception exc) {
        com.google.android.gms.common.internal.r.l(exc, "Exception must not be null");
        synchronized (this.f1905a) {
            if (this.f1907c) {
                return false;
            }
            this.f1907c = true;
            this.f = exc;
            this.f1906b.a(this);
            return true;
        }
    }

    public final boolean D(@androidx.annotation.i0 TResult tresult) {
        synchronized (this.f1905a) {
            if (this.f1907c) {
                return false;
            }
            this.f1907c = true;
            this.e = tresult;
            this.f1906b.a(this);
            return true;
        }
    }

    @Override // c.a.b.b.k.m
    @androidx.annotation.h0
    public final m<TResult> a(@androidx.annotation.h0 Activity activity, @androidx.annotation.h0 e eVar) {
        y yVar = new y(m0.a(o.f1912a), eVar);
        this.f1906b.b(yVar);
        a.m(activity).n(yVar);
        G();
        return this;
    }

    @Override // c.a.b.b.k.m
    @androidx.annotation.h0
    public final m<TResult> b(@androidx.annotation.h0 e eVar) {
        return c(o.f1912a, eVar);
    }

    @Override // c.a.b.b.k.m
    @androidx.annotation.h0
    public final m<TResult> c(@androidx.annotation.h0 Executor executor, @androidx.annotation.h0 e eVar) {
        this.f1906b.b(new y(m0.a(executor), eVar));
        G();
        return this;
    }

    @Override // c.a.b.b.k.m
    @androidx.annotation.h0
    public final m<TResult> d(@androidx.annotation.h0 Activity activity, @androidx.annotation.h0 f<TResult> fVar) {
        z zVar = new z(m0.a(o.f1912a), fVar);
        this.f1906b.b(zVar);
        a.m(activity).n(zVar);
        G();
        return this;
    }

    @Override // c.a.b.b.k.m
    @androidx.annotation.h0
    public final m<TResult> e(@androidx.annotation.h0 f<TResult> fVar) {
        return f(o.f1912a, fVar);
    }

    @Override // c.a.b.b.k.m
    @androidx.annotation.h0
    public final m<TResult> f(@androidx.annotation.h0 Executor executor, @androidx.annotation.h0 f<TResult> fVar) {
        this.f1906b.b(new z(m0.a(executor), fVar));
        G();
        return this;
    }

    @Override // c.a.b.b.k.m
    @androidx.annotation.h0
    public final m<TResult> g(@androidx.annotation.h0 Activity activity, @androidx.annotation.h0 g gVar) {
        c0 c0Var = new c0(m0.a(o.f1912a), gVar);
        this.f1906b.b(c0Var);
        a.m(activity).n(c0Var);
        G();
        return this;
    }

    @Override // c.a.b.b.k.m
    @androidx.annotation.h0
    public final m<TResult> h(@androidx.annotation.h0 g gVar) {
        return i(o.f1912a, gVar);
    }

    @Override // c.a.b.b.k.m
    @androidx.annotation.h0
    public final m<TResult> i(@androidx.annotation.h0 Executor executor, @androidx.annotation.h0 g gVar) {
        this.f1906b.b(new c0(m0.a(executor), gVar));
        G();
        return this;
    }

    @Override // c.a.b.b.k.m
    @androidx.annotation.h0
    public final m<TResult> j(@androidx.annotation.h0 Activity activity, @androidx.annotation.h0 h<? super TResult> hVar) {
        d0 d0Var = new d0(m0.a(o.f1912a), hVar);
        this.f1906b.b(d0Var);
        a.m(activity).n(d0Var);
        G();
        return this;
    }

    @Override // c.a.b.b.k.m
    @androidx.annotation.h0
    public final m<TResult> k(@androidx.annotation.h0 h<? super TResult> hVar) {
        return l(o.f1912a, hVar);
    }

    @Override // c.a.b.b.k.m
    @androidx.annotation.h0
    public final m<TResult> l(@androidx.annotation.h0 Executor executor, @androidx.annotation.h0 h<? super TResult> hVar) {
        this.f1906b.b(new d0(m0.a(executor), hVar));
        G();
        return this;
    }

    @Override // c.a.b.b.k.m
    @androidx.annotation.h0
    public final <TContinuationResult> m<TContinuationResult> m(@androidx.annotation.h0 c<TResult, TContinuationResult> cVar) {
        return n(o.f1912a, cVar);
    }

    @Override // c.a.b.b.k.m
    @androidx.annotation.h0
    public final <TContinuationResult> m<TContinuationResult> n(@androidx.annotation.h0 Executor executor, @androidx.annotation.h0 c<TResult, TContinuationResult> cVar) {
        l0 l0Var = new l0();
        this.f1906b.b(new t(m0.a(executor), cVar, l0Var));
        G();
        return l0Var;
    }

    @Override // c.a.b.b.k.m
    @androidx.annotation.h0
    public final <TContinuationResult> m<TContinuationResult> o(@androidx.annotation.h0 c<TResult, m<TContinuationResult>> cVar) {
        return p(o.f1912a, cVar);
    }

    @Override // c.a.b.b.k.m
    @androidx.annotation.h0
    public final <TContinuationResult> m<TContinuationResult> p(@androidx.annotation.h0 Executor executor, @androidx.annotation.h0 c<TResult, m<TContinuationResult>> cVar) {
        l0 l0Var = new l0();
        this.f1906b.b(new u(m0.a(executor), cVar, l0Var));
        G();
        return l0Var;
    }

    @Override // c.a.b.b.k.m
    @androidx.annotation.i0
    public final Exception q() {
        Exception exc;
        synchronized (this.f1905a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // c.a.b.b.k.m
    public final TResult r() {
        TResult tresult;
        synchronized (this.f1905a) {
            B();
            F();
            if (this.f != null) {
                throw new k(this.f);
            }
            tresult = this.e;
        }
        return tresult;
    }

    @Override // c.a.b.b.k.m
    public final <X extends Throwable> TResult s(@androidx.annotation.h0 Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f1905a) {
            B();
            F();
            if (cls.isInstance(this.f)) {
                throw cls.cast(this.f);
            }
            if (this.f != null) {
                throw new k(this.f);
            }
            tresult = this.e;
        }
        return tresult;
    }

    @Override // c.a.b.b.k.m
    public final boolean t() {
        return this.d;
    }

    @Override // c.a.b.b.k.m
    public final boolean u() {
        boolean z;
        synchronized (this.f1905a) {
            z = this.f1907c;
        }
        return z;
    }

    @Override // c.a.b.b.k.m
    public final boolean v() {
        boolean z;
        synchronized (this.f1905a) {
            z = this.f1907c && !this.d && this.f == null;
        }
        return z;
    }

    @Override // c.a.b.b.k.m
    @androidx.annotation.h0
    public final <TContinuationResult> m<TContinuationResult> w(@androidx.annotation.h0 l<TResult, TContinuationResult> lVar) {
        return x(o.f1912a, lVar);
    }

    @Override // c.a.b.b.k.m
    @androidx.annotation.h0
    public final <TContinuationResult> m<TContinuationResult> x(Executor executor, l<TResult, TContinuationResult> lVar) {
        l0 l0Var = new l0();
        this.f1906b.b(new g0(m0.a(executor), lVar, l0Var));
        G();
        return l0Var;
    }

    public final void y(@androidx.annotation.h0 Exception exc) {
        com.google.android.gms.common.internal.r.l(exc, "Exception must not be null");
        synchronized (this.f1905a) {
            E();
            this.f1907c = true;
            this.f = exc;
        }
        this.f1906b.a(this);
    }

    public final void z(@androidx.annotation.i0 TResult tresult) {
        synchronized (this.f1905a) {
            E();
            this.f1907c = true;
            this.e = tresult;
        }
        this.f1906b.a(this);
    }
}
