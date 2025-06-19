package b.b.a.b;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.i0;
import androidx.annotation.p0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f840a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f841b = Executors.newFixedThreadPool(2, new a());

    /* renamed from: c, reason: collision with root package name */
    @i0
    private volatile Handler f842c;

    class a implements ThreadFactory {

        /* renamed from: c, reason: collision with root package name */
        private static final String f843c = "arch_disk_io_%d";

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f844a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(f843c, Integer.valueOf(this.f844a.getAndIncrement())));
            return thread;
        }
    }

    @Override // b.b.a.b.c
    public void a(Runnable runnable) {
        this.f841b.execute(runnable);
    }

    @Override // b.b.a.b.c
    public boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // b.b.a.b.c
    public void d(Runnable runnable) {
        if (this.f842c == null) {
            synchronized (this.f840a) {
                if (this.f842c == null) {
                    this.f842c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f842c.post(runnable);
    }
}
