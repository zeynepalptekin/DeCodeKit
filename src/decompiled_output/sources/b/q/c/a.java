package b.q.c;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import b.i.k.k;
import b.i.o.l;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class a<D> extends c<D> {
    static final String p = "AsyncTaskLoader";
    static final boolean q = false;
    private final Executor j;
    volatile a<D>.RunnableC0091a k;
    volatile a<D>.RunnableC0091a l;
    long m;
    long n;
    Handler o;

    /* renamed from: b.q.c.a$a, reason: collision with other inner class name */
    final class RunnableC0091a extends d<Void, Void, D> implements Runnable {
        private final CountDownLatch t = new CountDownLatch(1);
        boolean u;

        RunnableC0091a() {
        }

        @Override // b.q.c.d
        protected void m(D d) {
            try {
                a.this.E(this, d);
            } finally {
                this.t.countDown();
            }
        }

        @Override // b.q.c.d
        protected void n(D d) {
            try {
                a.this.F(this, d);
            } finally {
                this.t.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.u = false;
            a.this.G();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // b.q.c.d
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public D b(Void... voidArr) {
            try {
                return (D) a.this.K();
            } catch (k e) {
                if (k()) {
                    return null;
                }
                throw e;
            }
        }

        public void v() throws InterruptedException {
            try {
                this.t.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public a(@h0 Context context) {
        this(context, d.o);
    }

    private a(@h0 Context context, @h0 Executor executor) {
        super(context);
        this.n = -10000L;
        this.j = executor;
    }

    public void D() {
    }

    void E(a<D>.RunnableC0091a runnableC0091a, D d) {
        J(d);
        if (this.l == runnableC0091a) {
            x();
            this.n = SystemClock.uptimeMillis();
            this.l = null;
            e();
            G();
        }
    }

    void F(a<D>.RunnableC0091a runnableC0091a, D d) {
        if (this.k != runnableC0091a) {
            E(runnableC0091a, d);
            return;
        }
        if (k()) {
            J(d);
            return;
        }
        c();
        this.n = SystemClock.uptimeMillis();
        this.k = null;
        f(d);
    }

    void G() {
        if (this.l != null || this.k == null) {
            return;
        }
        if (this.k.u) {
            this.k.u = false;
            this.o.removeCallbacks(this.k);
        }
        if (this.m <= 0 || SystemClock.uptimeMillis() >= this.n + this.m) {
            this.k.e(this.j, null);
        } else {
            this.k.u = true;
            this.o.postAtTime(this.k, this.n + this.m);
        }
    }

    public boolean H() {
        return this.l != null;
    }

    @i0
    public abstract D I();

    public void J(@i0 D d) {
    }

    @i0
    protected D K() {
        return I();
    }

    public void L(long j) {
        this.m = j;
        if (j != 0) {
            this.o = new Handler();
        }
    }

    @p0({p0.a.LIBRARY_GROUP})
    public void M() throws InterruptedException {
        a<D>.RunnableC0091a runnableC0091a = this.k;
        if (runnableC0091a != null) {
            runnableC0091a.v();
        }
    }

    @Override // b.q.c.c
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.k);
            printWriter.print(" waiting=");
            printWriter.println(this.k.u);
        }
        if (this.l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.l);
            printWriter.print(" waiting=");
            printWriter.println(this.l.u);
        }
        if (this.m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            l.c(this.m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            l.b(this.n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // b.q.c.c
    protected boolean o() {
        if (this.k == null) {
            return false;
        }
        if (!this.e) {
            this.h = true;
        }
        if (this.l != null) {
            if (this.k.u) {
                this.k.u = false;
                this.o.removeCallbacks(this.k);
            }
            this.k = null;
            return false;
        }
        if (this.k.u) {
            this.k.u = false;
            this.o.removeCallbacks(this.k);
            this.k = null;
            return false;
        }
        boolean zA = this.k.a(false);
        if (zA) {
            this.l = this.k;
            D();
        }
        this.k = null;
        return zA;
    }

    @Override // b.q.c.c
    protected void q() {
        super.q();
        b();
        this.k = new RunnableC0091a();
        G();
    }
}
