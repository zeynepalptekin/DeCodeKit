package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class fy1 {
    public static cy1 a(ExecutorService executorService) {
        return executorService instanceof cy1 ? (cy1) executorService : executorService instanceof ScheduledExecutorService ? new jy1((ScheduledExecutorService) executorService) : new gy1(executorService);
    }

    static Executor b(Executor executor, pw1<?> pw1Var) {
        bv1.b(executor);
        bv1.b(pw1Var);
        return executor == jx1.INSTANCE ? executor : new ey1(executor, pw1Var);
    }

    public static Executor c() {
        return jx1.INSTANCE;
    }
}
