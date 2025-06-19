package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class fu1 implements au1 {
    private fu1() {
    }

    @Override // com.google.android.gms.internal.ads.au1
    @androidx.annotation.h0
    public final ExecutorService a(ThreadFactory threadFactory, int r2) {
        return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(threadFactory));
    }

    @Override // com.google.android.gms.internal.ads.au1
    @androidx.annotation.h0
    public final ScheduledExecutorService b(int r1, ThreadFactory threadFactory, int r3) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
    }

    @Override // com.google.android.gms.internal.ads.au1
    @androidx.annotation.h0
    public final ExecutorService c(ThreadFactory threadFactory, int r3) {
        return d(1, threadFactory, r3);
    }

    @Override // com.google.android.gms.internal.ads.au1
    @androidx.annotation.h0
    public final ExecutorService d(int r9, ThreadFactory threadFactory, int r11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(r9, r9, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.ads.au1
    @androidx.annotation.h0
    public final ExecutorService e(int r1) {
        return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    }

    @Override // com.google.android.gms.internal.ads.au1
    @androidx.annotation.h0
    public final ExecutorService f(int r3) {
        return d(1, Executors.defaultThreadFactory(), r3);
    }
}
