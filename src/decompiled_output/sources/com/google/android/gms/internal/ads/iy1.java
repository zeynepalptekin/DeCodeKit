package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class iy1<V> extends ox1<V> implements dy1<V>, ScheduledFuture<V> {
    private final ScheduledFuture<?> e;

    public iy1(dy1<V> dy1Var, ScheduledFuture<?> scheduledFuture) {
        super(dy1Var);
        this.e = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.mx1, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = super.cancel(z);
        if (zCancel) {
            this.e.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Delayed delayed) {
        return this.e.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.e.getDelay(timeUnit);
    }
}
