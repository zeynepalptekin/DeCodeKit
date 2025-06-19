package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class bs extends ScheduledThreadPoolExecutor {
    bs(int r1, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        super.execute(hu1.a().a(runnable));
    }
}
