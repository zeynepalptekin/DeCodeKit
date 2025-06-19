package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public interface au1 {
    ExecutorService a(ThreadFactory threadFactory, int r2);

    ScheduledExecutorService b(int r1, ThreadFactory threadFactory, int r3);

    ExecutorService c(ThreadFactory threadFactory, int r2);

    ExecutorService d(int r1, ThreadFactory threadFactory, int r3);

    ExecutorService e(int r1);

    ExecutorService f(int r1);
}
