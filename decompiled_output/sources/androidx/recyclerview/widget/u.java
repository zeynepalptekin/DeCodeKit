package androidx.recyclerview.widget;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.f0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
class u<T> implements e0<T> {

    class a implements e0.b<T> {
        static final int f = 1;
        static final int g = 2;
        static final int h = 3;

        /* renamed from: a, reason: collision with root package name */
        final c f732a = new c();

        /* renamed from: b, reason: collision with root package name */
        private final Handler f733b = new Handler(Looper.getMainLooper());

        /* renamed from: c, reason: collision with root package name */
        private Runnable f734c = new RunnableC0035a();
        final /* synthetic */ e0.b d;

        /* renamed from: androidx.recyclerview.widget.u$a$a, reason: collision with other inner class name */
        class RunnableC0035a implements Runnable {
            RunnableC0035a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    d dVarA = a.this.f732a.a();
                    if (dVarA == null) {
                        return;
                    }
                    int r1 = dVarA.f740b;
                    if (r1 == 1) {
                        a.this.d.a(dVarA.f741c, dVarA.d);
                    } else if (r1 == 2) {
                        a.this.d.b(dVarA.f741c, (f0.a) dVarA.h);
                    } else if (r1 != 3) {
                        Log.e("ThreadUtil", "Unsupported message, what=" + dVarA.f740b);
                    } else {
                        a.this.d.c(dVarA.f741c, dVarA.d);
                    }
                }
            }
        }

        a(e0.b bVar) {
            this.d = bVar;
        }

        private void d(d dVar) {
            this.f732a.c(dVar);
            this.f733b.post(this.f734c);
        }

        @Override // androidx.recyclerview.widget.e0.b
        public void a(int r2, int r3) {
            d(d.a(1, r2, r3));
        }

        @Override // androidx.recyclerview.widget.e0.b
        public void b(int r2, f0.a<T> aVar) {
            d(d.c(2, r2, aVar));
        }

        @Override // androidx.recyclerview.widget.e0.b
        public void c(int r2, int r3) {
            d(d.a(3, r2, r3));
        }
    }

    class b implements e0.a<T> {
        static final int g = 1;
        static final int h = 2;
        static final int i = 3;
        static final int j = 4;

        /* renamed from: a, reason: collision with root package name */
        final c f735a = new c();

        /* renamed from: b, reason: collision with root package name */
        private final Executor f736b = AsyncTask.THREAD_POOL_EXECUTOR;

        /* renamed from: c, reason: collision with root package name */
        AtomicBoolean f737c = new AtomicBoolean(false);
        private Runnable d = new a();
        final /* synthetic */ e0.a e;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    d dVarA = b.this.f735a.a();
                    if (dVarA == null) {
                        b.this.f737c.set(false);
                        return;
                    }
                    int r1 = dVarA.f740b;
                    if (r1 == 1) {
                        b.this.f735a.b(1);
                        b.this.e.d(dVarA.f741c);
                    } else if (r1 == 2) {
                        b.this.f735a.b(2);
                        b.this.f735a.b(3);
                        b.this.e.b(dVarA.f741c, dVarA.d, dVarA.e, dVarA.f, dVarA.g);
                    } else if (r1 == 3) {
                        b.this.e.c(dVarA.f741c, dVarA.d);
                    } else if (r1 != 4) {
                        Log.e("ThreadUtil", "Unsupported message, what=" + dVarA.f740b);
                    } else {
                        b.this.e.a((f0.a) dVarA.h);
                    }
                }
            }
        }

        b(e0.a aVar) {
            this.e = aVar;
        }

        private void e() {
            if (this.f737c.compareAndSet(false, true)) {
                this.f736b.execute(this.d);
            }
        }

        private void f(d dVar) {
            this.f735a.c(dVar);
            e();
        }

        private void g(d dVar) {
            this.f735a.d(dVar);
            e();
        }

        @Override // androidx.recyclerview.widget.e0.a
        public void a(f0.a<T> aVar) {
            f(d.c(4, 0, aVar));
        }

        @Override // androidx.recyclerview.widget.e0.a
        public void b(int r8, int r9, int r10, int r11, int r12) {
            g(d.b(2, r8, r9, r10, r11, r12, null));
        }

        @Override // androidx.recyclerview.widget.e0.a
        public void c(int r2, int r3) {
            f(d.a(3, r2, r3));
        }

        @Override // androidx.recyclerview.widget.e0.a
        public void d(int r3) {
            g(d.c(1, r3, null));
        }
    }

    static class c {

        /* renamed from: a, reason: collision with root package name */
        private d f738a;

        c() {
        }

        synchronized d a() {
            if (this.f738a == null) {
                return null;
            }
            d dVar = this.f738a;
            this.f738a = this.f738a.f739a;
            return dVar;
        }

        synchronized void b(int r5) {
            while (this.f738a != null && this.f738a.f740b == r5) {
                d dVar = this.f738a;
                this.f738a = this.f738a.f739a;
                dVar.d();
            }
            if (this.f738a != null) {
                d dVar2 = this.f738a;
                d dVar3 = dVar2.f739a;
                while (dVar3 != null) {
                    d dVar4 = dVar3.f739a;
                    if (dVar3.f740b == r5) {
                        dVar2.f739a = dVar4;
                        dVar3.d();
                    } else {
                        dVar2 = dVar3;
                    }
                    dVar3 = dVar4;
                }
            }
        }

        synchronized void c(d dVar) {
            if (this.f738a == null) {
                this.f738a = dVar;
                return;
            }
            d dVar2 = this.f738a;
            while (dVar2.f739a != null) {
                dVar2 = dVar2.f739a;
            }
            dVar2.f739a = dVar;
        }

        synchronized void d(d dVar) {
            dVar.f739a = this.f738a;
            this.f738a = dVar;
        }
    }

    static class d {
        private static d i;
        private static final Object j = new Object();

        /* renamed from: a, reason: collision with root package name */
        d f739a;

        /* renamed from: b, reason: collision with root package name */
        public int f740b;

        /* renamed from: c, reason: collision with root package name */
        public int f741c;
        public int d;
        public int e;
        public int f;
        public int g;
        public Object h;

        d() {
        }

        static d a(int r7, int r8, int r9) {
            return b(r7, r8, r9, 0, 0, 0, null);
        }

        static d b(int r3, int r4, int r5, int r6, int r7, int r8, Object obj) {
            d dVar;
            synchronized (j) {
                if (i == null) {
                    dVar = new d();
                } else {
                    dVar = i;
                    i = i.f739a;
                    dVar.f739a = null;
                }
                dVar.f740b = r3;
                dVar.f741c = r4;
                dVar.d = r5;
                dVar.e = r6;
                dVar.f = r7;
                dVar.g = r8;
                dVar.h = obj;
            }
            return dVar;
        }

        static d c(int r7, int r8, Object obj) {
            return b(r7, r8, 0, 0, 0, 0, obj);
        }

        void d() {
            this.f739a = null;
            this.g = 0;
            this.f = 0;
            this.e = 0;
            this.d = 0;
            this.f741c = 0;
            this.f740b = 0;
            this.h = null;
            synchronized (j) {
                if (i != null) {
                    this.f739a = i;
                }
                i = this;
            }
        }
    }

    u() {
    }

    @Override // androidx.recyclerview.widget.e0
    public e0.a<T> a(e0.a<T> aVar) {
        return new b(aVar);
    }

    @Override // androidx.recyclerview.widget.e0
    public e0.b<T> b(e0.b<T> bVar) {
        return new a(bVar);
    }
}
