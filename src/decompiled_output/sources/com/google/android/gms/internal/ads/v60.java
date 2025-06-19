package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class v60 implements nc0, sr2 {
    private final km1 d;
    private final ob0 e;
    private final rc0 f;
    private final AtomicBoolean g = new AtomicBoolean();
    private final AtomicBoolean h = new AtomicBoolean();

    public v60(km1 km1Var, ob0 ob0Var, rc0 rc0Var) {
        this.d = km1Var;
        this.e = ob0Var;
        this.f = rc0Var;
    }

    private final void e() {
        if (this.g.compareAndSet(false, true)) {
            this.e.U();
        }
    }

    @Override // com.google.android.gms.internal.ads.sr2
    public final void K(pr2 pr2Var) {
        if (this.d.e == 1 && pr2Var.m) {
            e();
        }
        if (pr2Var.m && this.h.compareAndSet(false, true)) {
            this.f.b2();
        }
    }

    @Override // com.google.android.gms.internal.ads.nc0
    public final synchronized void u() {
        if (this.d.e != 1) {
            e();
        }
    }
}
