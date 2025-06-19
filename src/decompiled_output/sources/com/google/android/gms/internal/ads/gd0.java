package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class gd0 extends pf0<kd0> {
    private final ScheduledExecutorService e;
    private final com.google.android.gms.common.util.g f;

    @GuardedBy("this")
    private long g;

    @GuardedBy("this")
    private long h;

    @GuardedBy("this")
    private boolean i;

    @androidx.annotation.i0
    @GuardedBy("this")
    private ScheduledFuture<?> j;

    public gd0(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.common.util.g gVar) {
        super(Collections.emptySet());
        this.g = -1L;
        this.h = -1L;
        this.i = false;
        this.e = scheduledExecutorService;
        this.f = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0() {
        A0(jd0.f3942a);
    }

    private final synchronized void L0(long j) {
        if (this.j != null && !this.j.isDone()) {
            this.j.cancel(true);
        }
        this.g = this.f.c() + j;
        this.j = this.e.schedule(new ld0(this), j, TimeUnit.MILLISECONDS);
    }

    public final synchronized void I0() {
        this.i = false;
        L0(0L);
    }

    public final synchronized void K0(int r7) {
        if (r7 <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(r7);
        if (!this.i) {
            if (this.f.c() > this.g || this.g - this.f.c() > millis) {
                L0(millis);
            }
        } else {
            if (this.h <= 0 || millis >= this.h) {
                millis = this.h;
            }
            this.h = millis;
        }
    }

    public final synchronized void onPause() {
        if (!this.i) {
            if (this.j == null || this.j.isCancelled()) {
                this.h = -1L;
            } else {
                this.j.cancel(true);
                this.h = this.g - this.f.c();
            }
            this.i = true;
        }
    }

    public final synchronized void onResume() {
        if (this.i) {
            if (this.h > 0 && this.j.isCancelled()) {
                L0(this.h);
            }
            this.i = false;
        }
    }
}
