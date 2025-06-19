package b.i.l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.x0;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class c {
    private static final int i = 1;
    private static final int j = 0;

    /* renamed from: b, reason: collision with root package name */
    @u("mLock")
    private HandlerThread f1097b;

    /* renamed from: c, reason: collision with root package name */
    @u("mLock")
    private Handler f1098c;
    private final int f;
    private final int g;
    private final String h;

    /* renamed from: a, reason: collision with root package name */
    private final Object f1096a = new Object();
    private Handler.Callback e = new a();

    @u("mLock")
    private int d = 0;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int r0 = message.what;
            if (r0 == 0) {
                c.this.c();
                return true;
            }
            if (r0 != 1) {
                return true;
            }
            c.this.d((Runnable) message.obj);
            return true;
        }
    }

    class b implements Runnable {
        final /* synthetic */ Callable d;
        final /* synthetic */ Handler e;
        final /* synthetic */ d f;

        class a implements Runnable {
            final /* synthetic */ Object d;

            a(Object obj) {
                this.d = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f.a(this.d);
            }
        }

        b(Callable callable, Handler handler, d dVar) {
            this.d = callable;
            this.e = handler;
            this.f = dVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Exception {
            Object objCall;
            try {
                objCall = this.d.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.e.post(new a(objCall));
        }
    }

    /* renamed from: b.i.l.c$c, reason: collision with other inner class name */
    class RunnableC0064c implements Runnable {
        final /* synthetic */ AtomicReference d;
        final /* synthetic */ Callable e;
        final /* synthetic */ ReentrantLock f;
        final /* synthetic */ AtomicBoolean g;
        final /* synthetic */ Condition h;

        RunnableC0064c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.d = atomicReference;
            this.e = callable;
            this.f = reentrantLock;
            this.g = atomicBoolean;
            this.h = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.d.set(this.e.call());
            } catch (Exception unused) {
            }
            this.f.lock();
            try {
                this.g.set(false);
                this.h.signal();
            } finally {
                this.f.unlock();
            }
        }
    }

    public interface d<T> {
        void a(T t);
    }

    public c(String str, int r3, int r4) {
        this.h = str;
        this.g = r3;
        this.f = r4;
    }

    private void e(Runnable runnable) {
        synchronized (this.f1096a) {
            if (this.f1097b == null) {
                HandlerThread handlerThread = new HandlerThread(this.h, this.g);
                this.f1097b = handlerThread;
                handlerThread.start();
                this.f1098c = new Handler(this.f1097b.getLooper(), this.e);
                this.d++;
            }
            this.f1098c.removeMessages(0);
            this.f1098c.sendMessage(this.f1098c.obtainMessage(1, runnable));
        }
    }

    @x0
    public int a() {
        int r1;
        synchronized (this.f1096a) {
            r1 = this.d;
        }
        return r1;
    }

    @x0
    public boolean b() {
        boolean z;
        synchronized (this.f1096a) {
            z = this.f1097b != null;
        }
        return z;
    }

    void c() {
        synchronized (this.f1096a) {
            if (this.f1098c.hasMessages(1)) {
                return;
            }
            this.f1097b.quit();
            this.f1097b = null;
            this.f1098c = null;
        }
    }

    void d(Runnable runnable) {
        runnable.run();
        synchronized (this.f1096a) {
            this.f1098c.removeMessages(0);
            this.f1098c.sendMessageDelayed(this.f1098c.obtainMessage(0), this.f);
        }
    }

    public <T> void f(Callable<T> callable, d<T> dVar) {
        e(new b(callable, new Handler(), dVar));
    }

    public <T> T g(Callable<T> callable, int r14) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        e(new RunnableC0064c(atomicReference, callable, reentrantLock, atomicBoolean, conditionNewCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(r14);
            do {
                try {
                    nanos = conditionNewCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }
}
