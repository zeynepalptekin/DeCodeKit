package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public class pw1<V> extends uy1 implements dy1<V> {
    private static final boolean g;
    private static final Logger h;
    private static final c i;
    private static final Object j;

    @NullableDecl
    private volatile Object d;

    @NullableDecl
    private volatile f e;

    @NullableDecl
    private volatile l f;

    static final class b {

        /* renamed from: c, reason: collision with root package name */
        static final b f4896c;
        static final b d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f4897a;

        /* renamed from: b, reason: collision with root package name */
        @NullableDecl
        final Throwable f4898b;

        static {
            if (pw1.g) {
                d = null;
                f4896c = null;
            } else {
                d = new b(false, null);
                f4896c = new b(true, null);
            }
        }

        b(boolean z, @NullableDecl Throwable th) {
            this.f4897a = z;
            this.f4898b = th;
        }
    }

    static abstract class c {
        private c() {
        }

        abstract void a(l lVar, l lVar2);

        abstract void b(l lVar, Thread thread);

        abstract boolean c(pw1<?> pw1Var, f fVar, f fVar2);

        abstract boolean d(pw1<?> pw1Var, l lVar, l lVar2);

        abstract boolean e(pw1<?> pw1Var, Object obj, Object obj2);
    }

    static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f4899b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f4900a;

        class a extends Throwable {
            a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f4900a = (Throwable) bv1.b(th);
        }
    }

    static final class e extends c {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, Thread> f4901a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, l> f4902b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<pw1, l> f4903c;
        final AtomicReferenceFieldUpdater<pw1, f> d;
        final AtomicReferenceFieldUpdater<pw1, Object> e;

        e(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<pw1, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<pw1, f> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<pw1, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f4901a = atomicReferenceFieldUpdater;
            this.f4902b = atomicReferenceFieldUpdater2;
            this.f4903c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.ads.pw1.c
        final void a(l lVar, l lVar2) {
            this.f4902b.lazySet(lVar, lVar2);
        }

        @Override // com.google.android.gms.internal.ads.pw1.c
        final void b(l lVar, Thread thread) {
            this.f4901a.lazySet(lVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.pw1.c
        final boolean c(pw1<?> pw1Var, f fVar, f fVar2) {
            return this.d.compareAndSet(pw1Var, fVar, fVar2);
        }

        @Override // com.google.android.gms.internal.ads.pw1.c
        final boolean d(pw1<?> pw1Var, l lVar, l lVar2) {
            return this.f4903c.compareAndSet(pw1Var, lVar, lVar2);
        }

        @Override // com.google.android.gms.internal.ads.pw1.c
        final boolean e(pw1<?> pw1Var, Object obj, Object obj2) {
            return this.e.compareAndSet(pw1Var, obj, obj2);
        }
    }

    static final class f {
        static final f d = new f(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f4904a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f4905b;

        /* renamed from: c, reason: collision with root package name */
        @NullableDecl
        f f4906c;

        f(Runnable runnable, Executor executor) {
            this.f4904a = runnable;
            this.f4905b = executor;
        }
    }

    static final class g extends c {
        private g() {
            super();
        }

        @Override // com.google.android.gms.internal.ads.pw1.c
        final void a(l lVar, l lVar2) {
            lVar.f4912b = lVar2;
        }

        @Override // com.google.android.gms.internal.ads.pw1.c
        final void b(l lVar, Thread thread) {
            lVar.f4911a = thread;
        }

        @Override // com.google.android.gms.internal.ads.pw1.c
        final boolean c(pw1<?> pw1Var, f fVar, f fVar2) {
            synchronized (pw1Var) {
                if (((pw1) pw1Var).e != fVar) {
                    return false;
                }
                ((pw1) pw1Var).e = fVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.pw1.c
        final boolean d(pw1<?> pw1Var, l lVar, l lVar2) {
            synchronized (pw1Var) {
                if (((pw1) pw1Var).f != lVar) {
                    return false;
                }
                ((pw1) pw1Var).f = lVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.pw1.c
        final boolean e(pw1<?> pw1Var, Object obj, Object obj2) {
            synchronized (pw1Var) {
                if (((pw1) pw1Var).d != obj) {
                    return false;
                }
                ((pw1) pw1Var).d = obj2;
                return true;
            }
        }
    }

    static final class h<V> implements Runnable {
        final pw1<V> d;
        final dy1<? extends V> e;

        h(pw1<V> pw1Var, dy1<? extends V> dy1Var) {
            this.d = pw1Var;
            this.e = dy1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((pw1) this.d).d != this) {
                return;
            }
            if (pw1.i.e(this.d, this, pw1.c(this.e))) {
                pw1.q(this.d);
            }
        }
    }

    static abstract class i<V> extends pw1<V> implements j<V> {
        i() {
        }

        @Override // com.google.android.gms.internal.ads.pw1, java.util.concurrent.Future
        public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j, timeUnit);
        }
    }

    interface j<V> extends dy1<V> {
    }

    static final class k extends c {

        /* renamed from: a, reason: collision with root package name */
        static final Unsafe f4907a;

        /* renamed from: b, reason: collision with root package name */
        static final long f4908b;

        /* renamed from: c, reason: collision with root package name */
        static final long f4909c;
        static final long d;
        static final long e;
        static final long f;

        class a implements PrivilegedExceptionAction<Unsafe> {
            a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            public /* synthetic */ Unsafe run() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f4909c = unsafe.objectFieldOffset(pw1.class.getDeclaredField("f"));
                f4908b = unsafe.objectFieldOffset(pw1.class.getDeclaredField("e"));
                d = unsafe.objectFieldOffset(pw1.class.getDeclaredField("d"));
                e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                f4907a = unsafe;
            } catch (Exception e3) {
                fv1.e(e3);
                throw new RuntimeException(e3);
            }
        }

        private k() {
            super();
        }

        @Override // com.google.android.gms.internal.ads.pw1.c
        final void a(l lVar, l lVar2) {
            f4907a.putObject(lVar, f, lVar2);
        }

        @Override // com.google.android.gms.internal.ads.pw1.c
        final void b(l lVar, Thread thread) {
            f4907a.putObject(lVar, e, thread);
        }

        @Override // com.google.android.gms.internal.ads.pw1.c
        final boolean c(pw1<?> pw1Var, f fVar, f fVar2) {
            return f4907a.compareAndSwapObject(pw1Var, f4908b, fVar, fVar2);
        }

        @Override // com.google.android.gms.internal.ads.pw1.c
        final boolean d(pw1<?> pw1Var, l lVar, l lVar2) {
            return f4907a.compareAndSwapObject(pw1Var, f4909c, lVar, lVar2);
        }

        @Override // com.google.android.gms.internal.ads.pw1.c
        final boolean e(pw1<?> pw1Var, Object obj, Object obj2) {
            return f4907a.compareAndSwapObject(pw1Var, d, obj, obj2);
        }
    }

    static final class l {

        /* renamed from: c, reason: collision with root package name */
        static final l f4910c = new l(false);

        /* renamed from: a, reason: collision with root package name */
        @NullableDecl
        volatile Thread f4911a;

        /* renamed from: b, reason: collision with root package name */
        @NullableDecl
        volatile l f4912b;

        l() {
            pw1.i.b(this, Thread.currentThread());
        }

        private l(boolean z) {
        }

        final void a(l lVar) {
            pw1.i.a(this, lVar);
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        c gVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        g = z;
        h = Logger.getLogger(pw1.class.getName());
        try {
            gVar = new k();
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            try {
                th2 = th3;
                gVar = new e(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(pw1.class, l.class, "f"), AtomicReferenceFieldUpdater.newUpdater(pw1.class, f.class, "e"), AtomicReferenceFieldUpdater.newUpdater(pw1.class, Object.class, "d"));
                th = null;
            } catch (Throwable th4) {
                th = th4;
                th2 = th3;
                gVar = new g();
            }
        }
        i = gVar;
        if (th != null) {
            h.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            h.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        j = new Object();
    }

    protected pw1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object c(dy1<?> dy1Var) {
        Throwable thA;
        if (dy1Var instanceof j) {
            Object obj = ((pw1) dy1Var).d;
            if (!(obj instanceof b)) {
                return obj;
            }
            b bVar = (b) obj;
            return bVar.f4897a ? bVar.f4898b != null ? new b(false, bVar.f4898b) : b.d : obj;
        }
        if ((dy1Var instanceof uy1) && (thA = xy1.a((uy1) dy1Var)) != null) {
            return new d(thA);
        }
        boolean zIsCancelled = dy1Var.isCancelled();
        if ((!g) && zIsCancelled) {
            return b.d;
        }
        try {
            Object objD = d(dy1Var);
            if (!zIsCancelled) {
                return objD == null ? j : objD;
            }
            String strValueOf = String.valueOf(dy1Var);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(strValueOf);
            return new b(false, new IllegalArgumentException(sb.toString()));
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new b(false, e2);
            }
            String strValueOf2 = String.valueOf(dy1Var);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 77);
            sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb2.append(strValueOf2);
            return new d(new IllegalArgumentException(sb2.toString(), e2));
        } catch (ExecutionException e3) {
            if (!zIsCancelled) {
                return new d(e3.getCause());
            }
            String strValueOf3 = String.valueOf(dy1Var);
            StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf3).length() + 84);
            sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb3.append(strValueOf3);
            return new b(false, new IllegalArgumentException(sb3.toString(), e3));
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static <V> V d(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private final void p(l lVar) {
        lVar.f4911a = null;
        while (true) {
            l lVar2 = this.f;
            if (lVar2 == l.f4910c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f4912b;
                if (lVar2.f4911a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f4912b = lVar4;
                    if (lVar3.f4911a == null) {
                        break;
                    }
                } else if (i.d(this, lVar2, lVar4)) {
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(pw1<?> pw1Var) {
        f fVar;
        f fVar2;
        f fVar3 = null;
        while (true) {
            l lVar = ((pw1) pw1Var).f;
            if (i.d(pw1Var, lVar, l.f4910c)) {
                while (lVar != null) {
                    Thread thread = lVar.f4911a;
                    if (thread != null) {
                        lVar.f4911a = null;
                        LockSupport.unpark(thread);
                    }
                    lVar = lVar.f4912b;
                }
                pw1Var.b();
                do {
                    fVar = ((pw1) pw1Var).e;
                } while (!i.c(pw1Var, fVar, f.d));
                while (true) {
                    fVar2 = fVar3;
                    fVar3 = fVar;
                    if (fVar3 == null) {
                        break;
                    }
                    fVar = fVar3.f4906c;
                    fVar3.f4906c = fVar2;
                }
                while (fVar2 != null) {
                    fVar3 = fVar2.f4906c;
                    Runnable runnable = fVar2.f4904a;
                    if (runnable instanceof h) {
                        h hVar = (h) runnable;
                        pw1Var = hVar.d;
                        if (((pw1) pw1Var).d == hVar) {
                            if (!i.e(pw1Var, hVar, c(hVar.e))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        r(runnable, fVar2.f4905b);
                    }
                    fVar2 = fVar3;
                }
                return;
            }
        }
    }

    private static void r(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = h;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 57 + String.valueOf(strValueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e2);
        }
    }

    private final void s(StringBuilder sb) {
        String str = "]";
        try {
            Object objD = d(this);
            sb.append("SUCCESS, result=[");
            t(sb, objD);
            sb.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append(str);
        }
    }

    private final void t(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e2) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e2.getClass());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static V u(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f4898b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f4900a);
        }
        if (obj == j) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.uy1
    @NullableDecl
    protected final Throwable a() {
        if (!(this instanceof j)) {
            return null;
        }
        Object obj = this.d;
        if (obj instanceof d) {
            return ((d) obj).f4900a;
        }
        return null;
    }

    protected void b() {
    }

    public boolean cancel(boolean z) {
        Object obj = this.d;
        if (!(obj == null) && !(obj instanceof h)) {
            return false;
        }
        b bVar = g ? new b(z, new CancellationException("Future.cancel() was called.")) : z ? b.f4896c : b.d;
        boolean z2 = false;
        pw1<V> pw1Var = this;
        while (true) {
            if (i.e(pw1Var, obj, bVar)) {
                if (z) {
                    pw1Var.f();
                }
                q(pw1Var);
                if (!(obj instanceof h)) {
                    return true;
                }
                dy1<? extends V> dy1Var = ((h) obj).e;
                if (!(dy1Var instanceof j)) {
                    dy1Var.cancel(z);
                    return true;
                }
                pw1Var = (pw1) dy1Var;
                obj = pw1Var.d;
                if (!(obj == null) && !(obj instanceof h)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = pw1Var.d;
                if (!(obj instanceof h)) {
                    return z2;
                }
            }
        }
    }

    public void e(Runnable runnable, Executor executor) {
        f fVar;
        bv1.c(runnable, "Runnable was null.");
        bv1.c(executor, "Executor was null.");
        if (!isDone() && (fVar = this.e) != f.d) {
            f fVar2 = new f(runnable, executor);
            do {
                fVar2.f4906c = fVar;
                if (i.c(this, fVar, fVar2)) {
                    return;
                } else {
                    fVar = this.e;
                }
            } while (fVar != f.d);
        }
        r(runnable, executor);
    }

    protected void f() {
    }

    final void g(@NullableDecl Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(l());
        }
    }

    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.d;
        if ((obj2 != null) && (!(obj2 instanceof h))) {
            return (V) u(obj2);
        }
        l lVar = this.f;
        if (lVar != l.f4910c) {
            l lVar2 = new l();
            do {
                lVar2.a(lVar);
                if (i.d(this, lVar, lVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            p(lVar2);
                            throw new InterruptedException();
                        }
                        obj = this.d;
                    } while (!((obj != null) & (!(obj instanceof h))));
                    return (V) u(obj);
                }
                lVar = this.f;
            } while (lVar != l.f4910c);
        }
        return (V) u(this.d);
    }

    public V get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.d;
        if ((obj != null) && (!(obj instanceof h))) {
            return (V) u(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f;
            if (lVar != l.f4910c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (i.d(this, lVar, lVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                p(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.d;
                            if ((obj2 != null) && (!(obj2 instanceof h))) {
                                return (V) u(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        p(lVar2);
                    } else {
                        lVar = this.f;
                    }
                } while (lVar != l.f4910c);
            }
            return (V) u(this.d);
        }
        while (nanos > 0) {
            Object obj3 = this.d;
            if ((obj3 != null) && (!(obj3 instanceof h))) {
                return (V) u(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb.append("Waited ");
        sb.append(j2);
        sb.append(" ");
        sb.append(lowerCase2);
        String string2 = sb.toString();
        if (nanos + 1000 < 0) {
            String strConcat = String.valueOf(string2).concat(" (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strValueOf = String.valueOf(strConcat);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 21 + String.valueOf(lowerCase).length());
                sb2.append(strValueOf);
                sb2.append(jConvert);
                sb2.append(" ");
                sb2.append(lowerCase);
                String string3 = sb2.toString();
                if (z) {
                    string3 = String.valueOf(string3).concat(",");
                }
                strConcat = String.valueOf(string3).concat(" ");
            }
            if (z) {
                String strValueOf2 = String.valueOf(strConcat);
                StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf2).length() + 33);
                sb3.append(strValueOf2);
                sb3.append(nanos2);
                sb3.append(" nanoseconds ");
                strConcat = sb3.toString();
            }
            string2 = String.valueOf(strConcat).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(string2).concat(" but future completed as timeout expired"));
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(string2).length() + 5 + String.valueOf(string).length());
        sb4.append(string2);
        sb4.append(" for ");
        sb4.append(string);
        throw new TimeoutException(sb4.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NullableDecl
    protected String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    protected boolean i(@NullableDecl V v) {
        if (v == null) {
            v = (V) j;
        }
        if (!i.e(this, null, v)) {
            return false;
        }
        q(this);
        return true;
    }

    public boolean isCancelled() {
        return this.d instanceof b;
    }

    public boolean isDone() {
        return (!(r0 instanceof h)) & (this.d != null);
    }

    protected boolean j(Throwable th) {
        if (!i.e(this, null, new d((Throwable) bv1.b(th)))) {
            return false;
        }
        q(this);
        return true;
    }

    protected final boolean k(dy1<? extends V> dy1Var) {
        d dVar;
        bv1.b(dy1Var);
        Object obj = this.d;
        if (obj == null) {
            if (dy1Var.isDone()) {
                if (!i.e(this, null, c(dy1Var))) {
                    return false;
                }
                q(this);
                return true;
            }
            h hVar = new h(this, dy1Var);
            if (i.e(this, null, hVar)) {
                try {
                    dy1Var.e(hVar, jx1.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f4899b;
                    }
                    i.e(this, hVar, dVar);
                }
                return true;
            }
            obj = this.d;
        }
        if (obj instanceof b) {
            dy1Var.cancel(((b) obj).f4897a);
        }
        return false;
    }

    protected final boolean l() {
        Object obj = this.d;
        return (obj instanceof b) && ((b) obj).f4897a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r6.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L20
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto L91
        L20:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L2a
        L26:
            r6.s(r0)
            goto L91
        L2a:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.d
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.pw1.h
            if (r4 == 0) goto L49
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            com.google.android.gms.internal.ads.pw1$h r3 = (com.google.android.gms.internal.ads.pw1.h) r3
            com.google.android.gms.internal.ads.dy1<? extends V> r3 = r3.e
            r6.t(r0, r3)
        L45:
            r0.append(r2)
            goto L83
        L49:
            java.lang.String r3 = r6.h()     // Catch: java.lang.StackOverflowError -> L52 java.lang.RuntimeException -> L54
            java.lang.String r3 = com.google.android.gms.internal.ads.dv1.a(r3)     // Catch: java.lang.StackOverflowError -> L52 java.lang.RuntimeException -> L54
            goto L78
        L52:
            r3 = move-exception
            goto L55
        L54:
            r3 = move-exception
        L55:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r4 = r4 + 38
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Exception thrown from implementation: "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
        L78:
            if (r3 == 0) goto L83
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            goto L45
        L83:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto L91
            int r3 = r0.length()
            r0.delete(r1, r3)
            goto L26
        L91:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pw1.toString():java.lang.String");
    }
}
