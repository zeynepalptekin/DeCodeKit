package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class w90 implements bb0, pb0, af0, tg0 {
    private final ob0 d;
    private final km1 e;
    private final ScheduledExecutorService f;
    private final Executor g;
    private ky1<Boolean> h = ky1.C();
    private ScheduledFuture<?> i;

    public w90(ob0 ob0Var, km1 km1Var, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.d = ob0Var;
        this.e = km1Var;
        this.f = scheduledExecutorService;
        this.g = executor;
    }

    @Override // com.google.android.gms.internal.ads.af0
    public final synchronized void a() {
        if (this.h.isDone()) {
            return;
        }
        if (this.i != null) {
            this.i.cancel(true);
        }
        this.h.i(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.af0
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final synchronized void d(dw2 dw2Var) {
        if (this.h.isDone()) {
            return;
        }
        if (this.i != null) {
            this.i.cancel(true);
        }
        this.h.j(new Exception());
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final void e() {
        if (((Boolean) qx2.e().c(e0.p1)).booleanValue()) {
            km1 km1Var = this.e;
            if (km1Var.S == 2) {
                if (km1Var.p == 0) {
                    this.d.U();
                } else {
                    qx1.f(this.h, new y90(this), this.g);
                    this.i = this.f.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.z90
                        private final w90 d;

                        {
                            this.d = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.d.i();
                        }
                    }, this.e.p, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void f(qj qjVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void h() {
    }

    final /* synthetic */ void i() {
        synchronized (this) {
            if (this.h.isDone()) {
                return;
            }
            this.h.i(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void k0() {
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void l0() {
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void r() {
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void s() {
        int r0 = this.e.S;
        if (r0 == 0 || r0 == 1) {
            this.d.U();
        }
    }
}
