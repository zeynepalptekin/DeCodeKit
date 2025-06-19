package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class jy1 extends gy1 implements cy1, ScheduledExecutorService {
    private final ScheduledExecutorService e;

    jy1(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.e = (ScheduledExecutorService) bv1.b(scheduledExecutorService);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ry1 ry1VarI = ry1.I(runnable, null);
        return new iy1(ry1VarI, this.e.schedule(ry1VarI, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        ry1 ry1VarJ = ry1.J(callable);
        return new iy1(ry1VarJ, this.e.schedule(ry1VarJ, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ly1 ly1Var = new ly1(runnable);
        return new iy1(ly1Var, this.e.scheduleAtFixedRate(ly1Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ly1 ly1Var = new ly1(runnable);
        return new iy1(ly1Var, this.e.scheduleWithFixedDelay(ly1Var, j, j2, timeUnit));
    }
}
