package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class u30 implements gs2 {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f5473a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.util.g f5474b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.i0
    @GuardedBy("this")
    private ScheduledFuture<?> f5475c;

    @GuardedBy("this")
    private long d = -1;

    @GuardedBy("this")
    private long e = -1;

    @GuardedBy("this")
    private Runnable f = null;

    @GuardedBy("this")
    private boolean g = false;

    public u30(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.common.util.g gVar) {
        this.f5473a = scheduledExecutorService;
        this.f5474b = gVar;
        com.google.android.gms.ads.internal.p.f().d(this);
    }

    @com.google.android.gms.common.util.d0
    private final synchronized void c() {
        if (!this.g) {
            if (this.f5475c == null || this.f5475c.isDone()) {
                this.e = -1L;
            } else {
                this.f5475c.cancel(true);
                this.e = this.d - this.f5474b.c();
            }
            this.g = true;
        }
    }

    @com.google.android.gms.common.util.d0
    private final synchronized void d() {
        if (this.g) {
            if (this.e > 0 && this.f5475c != null && this.f5475c.isCancelled()) {
                this.f5475c = this.f5473a.schedule(this.f, this.e, TimeUnit.MILLISECONDS);
            }
            this.g = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs2
    public final void a(boolean z) {
        if (z) {
            d();
        } else {
            c();
        }
    }

    public final synchronized void b(int r5, Runnable runnable) {
        this.f = runnable;
        long j = r5;
        this.d = this.f5474b.c() + j;
        this.f5475c = this.f5473a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
