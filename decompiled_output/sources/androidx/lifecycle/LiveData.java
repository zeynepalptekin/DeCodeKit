package androidx.lifecycle;

import androidx.annotation.e0;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.lifecycle.g;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    static final int j = -1;
    static final Object k = new Object();
    private boolean g;
    private boolean h;

    /* renamed from: a, reason: collision with root package name */
    final Object f492a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private b.b.a.c.b<p<? super T>, LiveData<T>.c> f493b = new b.b.a.c.b<>();

    /* renamed from: c, reason: collision with root package name */
    int f494c = 0;
    private volatile Object d = k;
    volatile Object e = k;
    private int f = -1;
    private final Runnable i = new a();

    class LifecycleBoundObserver extends LiveData<T>.c implements f {

        @h0
        final j e;

        LifecycleBoundObserver(@h0 j jVar, p<? super T> pVar) {
            super(pVar);
            this.e = jVar;
        }

        @Override // androidx.lifecycle.h
        public void d(j jVar, g.a aVar) {
            if (this.e.b().b() == g.b.DESTROYED) {
                LiveData.this.n(this.f495a);
            } else {
                h(k());
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        void i() {
            this.e.b().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean j(j jVar) {
            return this.e == jVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean k() {
            return this.e.b().b().e(g.b.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f492a) {
                obj = LiveData.this.e;
                LiveData.this.e = LiveData.k;
            }
            LiveData.this.p(obj);
        }
    }

    private class b extends LiveData<T>.c {
        b(p<? super T> pVar) {
            super(pVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean k() {
            return true;
        }
    }

    private abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final p<? super T> f495a;

        /* renamed from: b, reason: collision with root package name */
        boolean f496b;

        /* renamed from: c, reason: collision with root package name */
        int f497c = -1;

        c(p<? super T> pVar) {
            this.f495a = pVar;
        }

        void h(boolean z) {
            if (z == this.f496b) {
                return;
            }
            this.f496b = z;
            boolean z2 = LiveData.this.f494c == 0;
            LiveData.this.f494c += this.f496b ? 1 : -1;
            if (z2 && this.f496b) {
                LiveData.this.k();
            }
            LiveData liveData = LiveData.this;
            if (liveData.f494c == 0 && !this.f496b) {
                liveData.l();
            }
            if (this.f496b) {
                LiveData.this.d(this);
            }
        }

        void i() {
        }

        boolean j(j jVar) {
            return false;
        }

        abstract boolean k();
    }

    private static void b(String str) {
        if (b.b.a.b.a.f().c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void c(LiveData<T>.c cVar) {
        if (cVar.f496b) {
            if (!cVar.k()) {
                cVar.h(false);
                return;
            }
            int r0 = cVar.f497c;
            int r1 = this.f;
            if (r0 >= r1) {
                return;
            }
            cVar.f497c = r1;
            cVar.f495a.a((Object) this.d);
        }
    }

    void d(@i0 LiveData<T>.c cVar) {
        if (this.g) {
            this.h = true;
            return;
        }
        this.g = true;
        do {
            this.h = false;
            if (cVar != null) {
                c(cVar);
                cVar = null;
            } else {
                b.b.a.c.b<p<? super T>, LiveData<T>.c>.d dVarJ = this.f493b.j();
                while (dVarJ.hasNext()) {
                    c((c) dVarJ.next().getValue());
                    if (this.h) {
                        break;
                    }
                }
            }
        } while (this.h);
        this.g = false;
    }

    @i0
    public T e() {
        T t = (T) this.d;
        if (t != k) {
            return t;
        }
        return null;
    }

    int f() {
        return this.f;
    }

    public boolean g() {
        return this.f494c > 0;
    }

    public boolean h() {
        return this.f493b.size() > 0;
    }

    @e0
    public void i(@h0 j jVar, @h0 p<? super T> pVar) {
        b("observe");
        if (jVar.b().b() == g.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(jVar, pVar);
        LiveData<T>.c cVarO = this.f493b.o(pVar, lifecycleBoundObserver);
        if (cVarO != null && !cVarO.j(jVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarO != null) {
            return;
        }
        jVar.b().a(lifecycleBoundObserver);
    }

    @e0
    public void j(@h0 p<? super T> pVar) {
        b("observeForever");
        b bVar = new b(pVar);
        LiveData<T>.c cVarO = this.f493b.o(pVar, bVar);
        if (cVarO != null && (cVarO instanceof LifecycleBoundObserver)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarO != null) {
            return;
        }
        bVar.h(true);
    }

    protected void k() {
    }

    protected void l() {
    }

    protected void m(T t) {
        boolean z;
        synchronized (this.f492a) {
            z = this.e == k;
            this.e = t;
        }
        if (z) {
            b.b.a.b.a.f().d(this.i);
        }
    }

    @e0
    public void n(@h0 p<? super T> pVar) {
        b("removeObserver");
        LiveData<T>.c cVarR = this.f493b.r(pVar);
        if (cVarR == null) {
            return;
        }
        cVarR.i();
        cVarR.h(false);
    }

    @e0
    public void o(@h0 j jVar) {
        b("removeObservers");
        Iterator<Map.Entry<p<? super T>, LiveData<T>.c>> it = this.f493b.iterator();
        while (it.hasNext()) {
            Map.Entry<p<? super T>, LiveData<T>.c> next = it.next();
            if (next.getValue().j(jVar)) {
                n(next.getKey());
            }
        }
    }

    @e0
    protected void p(T t) {
        b("setValue");
        this.f++;
        this.d = t;
        d(null);
    }
}
