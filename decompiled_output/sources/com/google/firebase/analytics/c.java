package com.google.firebase.analytics;

import c.a.b.b.g.c.mb;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class c extends ThreadPoolExecutor {
    c(FirebaseAnalytics firebaseAnalytics, int r9, int r10, long j, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30L, timeUnit, blockingQueue);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        super.execute(mb.a().b(runnable));
    }
}
