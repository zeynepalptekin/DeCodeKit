package androidx.lifecycle;

import androidx.annotation.e0;
import androidx.annotation.h0;
import androidx.annotation.p0;
import androidx.annotation.x0;
import androidx.annotation.y0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class c<T> {

    /* renamed from: a, reason: collision with root package name */
    final Executor f509a;

    /* renamed from: b, reason: collision with root package name */
    final LiveData<T> f510b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicBoolean f511c;
    final AtomicBoolean d;

    @x0
    final Runnable e;

    @x0
    final Runnable f;

    class a extends LiveData<T> {
        a() {
        }

        @Override // androidx.lifecycle.LiveData
        protected void k() {
            c cVar = c.this;
            cVar.f509a.execute(cVar.e);
        }
    }

    class b implements Runnable {
        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        @y0
        public void run() {
            do {
                boolean z = false;
                if (c.this.d.compareAndSet(false, true)) {
                    Object objA = null;
                    boolean z2 = false;
                    while (c.this.f511c.compareAndSet(true, false)) {
                        try {
                            objA = c.this.a();
                            z2 = true;
                        } catch (Throwable th) {
                            c.this.d.set(false);
                            throw th;
                        }
                    }
                    if (z2) {
                        c.this.f510b.m(objA);
                    }
                    c.this.d.set(false);
                    z = z2;
                }
                if (!z) {
                    return;
                }
            } while (c.this.f511c.get());
        }
    }

    /* renamed from: androidx.lifecycle.c$c, reason: collision with other inner class name */
    class RunnableC0030c implements Runnable {
        RunnableC0030c() {
        }

        @Override // java.lang.Runnable
        @e0
        public void run() {
            boolean zG = c.this.f510b.g();
            if (c.this.f511c.compareAndSet(false, true) && zG) {
                c cVar = c.this;
                cVar.f509a.execute(cVar.e);
            }
        }
    }

    public c() {
        this(b.b.a.b.a.e());
    }

    public c(@h0 Executor executor) {
        this.f511c = new AtomicBoolean(true);
        this.d = new AtomicBoolean(false);
        this.e = new b();
        this.f = new RunnableC0030c();
        this.f509a = executor;
        this.f510b = new a();
    }

    @y0
    protected abstract T a();

    @h0
    public LiveData<T> b() {
        return this.f510b;
    }

    public void c() {
        b.b.a.b.a.f().b(this.f);
    }
}
