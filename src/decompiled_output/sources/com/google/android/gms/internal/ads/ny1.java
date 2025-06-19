package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class ny1<V> extends kx1<V> {

    @NullableDecl
    private dy1<V> k;

    @NullableDecl
    private ScheduledFuture<?> l;

    private ny1(dy1<V> dy1Var) {
        this.k = (dy1) bv1.b(dy1Var);
    }

    static /* synthetic */ ScheduledFuture J(ny1 ny1Var, ScheduledFuture scheduledFuture) {
        ny1Var.l = null;
        return null;
    }

    static <V> dy1<V> K(dy1<V> dy1Var, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        ny1 ny1Var = new ny1(dy1Var);
        py1 py1Var = new py1(ny1Var);
        ny1Var.l = scheduledExecutorService.schedule(py1Var, j, timeUnit);
        dy1Var.e(py1Var, jx1.INSTANCE);
        return ny1Var;
    }

    @Override // com.google.android.gms.internal.ads.pw1
    protected final void b() {
        g(this.k);
        ScheduledFuture<?> scheduledFuture = this.l;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.k = null;
        this.l = null;
    }

    @Override // com.google.android.gms.internal.ads.pw1
    protected final String h() {
        dy1<V> dy1Var = this.k;
        ScheduledFuture<?> scheduledFuture = this.l;
        if (dy1Var == null) {
            return null;
        }
        String strValueOf = String.valueOf(dy1Var);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 14);
        sb.append("inputFuture=[");
        sb.append(strValueOf);
        sb.append("]");
        String string = sb.toString();
        if (scheduledFuture == null) {
            return string;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return string;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 43);
        sb2.append(strValueOf2);
        sb2.append(", remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }
}
