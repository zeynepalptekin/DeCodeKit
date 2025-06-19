package c.a.b.b.g.c;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class k9 implements j8 {
    private k9() {
    }

    private static ExecutorService b(int r8, ThreadFactory threadFactory, int r10) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // c.a.b.b.g.c.j8
    public final ExecutorService a(ThreadFactory threadFactory, int r3) {
        return b(1, threadFactory, r3);
    }

    @Override // c.a.b.b.g.c.j8
    public final ExecutorService e(int r3) {
        return b(1, Executors.defaultThreadFactory(), r3);
    }
}
