package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xt0 implements cb0, nc0, od0 {
    private final fu0 d;
    private final mu0 e;

    public xt0(fu0 fu0Var, mu0 mu0Var) {
        this.d = fu0Var;
        this.e = mu0Var;
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void e0(wi wiVar) {
        this.d.b(wiVar.d);
    }

    @Override // com.google.android.gms.internal.ads.cb0
    public final void i(dw2 dw2Var) {
        this.d.c().put("action", "ftl");
        this.d.c().put("ftl", String.valueOf(dw2Var.d));
        this.d.c().put("ed", dw2Var.f);
        this.e.d(this.d.c());
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void t(wm1 wm1Var) {
        this.d.a(wm1Var);
    }

    @Override // com.google.android.gms.internal.ads.nc0
    public final void u() {
        this.d.c().put("action", "loaded");
        this.e.d(this.d.c());
    }
}
