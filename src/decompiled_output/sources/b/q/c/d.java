package b.q.c;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import androidx.annotation.p0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
abstract class d<Params, Progress, Result> {
    private static final String i = "AsyncTask";
    private static final int j = 5;
    private static final int k = 128;
    private static final int l = 1;
    private static final ThreadFactory m = new a();
    private static final BlockingQueue<Runnable> n = new LinkedBlockingQueue(10);
    public static final Executor o;
    private static final int p = 1;
    private static final int q = 2;
    private static f r;
    private static volatile Executor s;
    private volatile g f = g.PENDING;
    final AtomicBoolean g = new AtomicBoolean();
    final AtomicBoolean h = new AtomicBoolean();
    private final h<Params, Result> d = new b();
    private final FutureTask<Result> e = new c(this.d);

    static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f1332a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f1332a.getAndIncrement());
        }
    }

    class b extends h<Params, Result> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            d.this.h.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) d.this.b(this.f1337a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    class c extends FutureTask<Result> {
        c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                d.this.r(get());
            } catch (InterruptedException e) {
                Log.w(d.i, e);
            } catch (CancellationException unused) {
                d.this.r(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: b.q.c.d$d, reason: collision with other inner class name */
    static /* synthetic */ class C0093d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1334a;

        static {
            int[] r0 = new int[g.values().length];
            f1334a = r0;
            try {
                r0[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1334a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class e<Data> {

        /* renamed from: a, reason: collision with root package name */
        final d f1335a;

        /* renamed from: b, reason: collision with root package name */
        final Data[] f1336b;

        e(d dVar, Data... dataArr) {
            this.f1335a = dVar;
            this.f1336b = dataArr;
        }
    }

    private static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int r3 = message.what;
            if (r3 == 1) {
                eVar.f1335a.f(eVar.f1336b[0]);
            } else {
                if (r3 != 2) {
                    return;
                }
                eVar.f1335a.p(eVar.f1336b);
            }
        }
    }

    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    private static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: a, reason: collision with root package name */
        Params[] f1337a;

        h() {
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, n, m);
        o = threadPoolExecutor;
        s = threadPoolExecutor;
    }

    d() {
    }

    public static void d(Runnable runnable) {
        s.execute(runnable);
    }

    private static Handler i() {
        f fVar;
        synchronized (d.class) {
            if (r == null) {
                r = new f();
            }
            fVar = r;
        }
        return fVar;
    }

    @p0({p0.a.LIBRARY_GROUP})
    public static void t(Executor executor) {
        s = executor;
    }

    public final boolean a(boolean z) {
        this.g.set(true);
        return this.e.cancel(z);
    }

    protected abstract Result b(Params... paramsArr);

    public final d<Params, Progress, Result> c(Params... paramsArr) {
        return e(s, paramsArr);
    }

    public final d<Params, Progress, Result> e(Executor executor, Params... paramsArr) {
        if (this.f == g.PENDING) {
            this.f = g.RUNNING;
            o();
            this.d.f1337a = paramsArr;
            executor.execute(this.e);
            return this;
        }
        int r3 = C0093d.f1334a[this.f.ordinal()];
        if (r3 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (r3 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    void f(Result result) {
        if (k()) {
            m(result);
        } else {
            n(result);
        }
        this.f = g.FINISHED;
    }

    public final Result g() throws ExecutionException, InterruptedException {
        return this.e.get();
    }

    public final Result h(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.e.get(j2, timeUnit);
    }

    public final g j() {
        return this.f;
    }

    public final boolean k() {
        return this.g.get();
    }

    protected void l() {
    }

    protected void m(Result result) {
        l();
    }

    protected void n(Result result) {
    }

    protected void o() {
    }

    protected void p(Progress... progressArr) {
    }

    Result q(Result result) {
        i().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    void r(Result result) {
        if (this.h.get()) {
            return;
        }
        q(result);
    }

    protected final void s(Progress... progressArr) {
        if (k()) {
            return;
        }
        i().obtainMessage(2, new e(this, progressArr)).sendToTarget();
    }
}
