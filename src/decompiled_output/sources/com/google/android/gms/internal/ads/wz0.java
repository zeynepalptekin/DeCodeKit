package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class wz0 implements ir1 {
    private final vz0 d;

    wz0(vz0 vz0Var) {
        this.d = vz0Var;
    }

    @Override // com.google.android.gms.internal.ads.ir1
    public final void a(zq1 zq1Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.ir1
    public final void b(zq1 zq1Var, String str) {
        if (((Boolean) qx2.e().c(e0.s4)).booleanValue() && zq1.RENDERER == zq1Var) {
            this.d.h(com.google.android.gms.ads.internal.p.j().c());
        }
    }

    @Override // com.google.android.gms.internal.ads.ir1
    public final void c(zq1 zq1Var, String str) {
        if (((Boolean) qx2.e().c(e0.s4)).booleanValue() && zq1.RENDERER == zq1Var && this.d.c() != 0) {
            this.d.g(com.google.android.gms.ads.internal.p.j().c() - this.d.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.ir1
    public final void d(zq1 zq1Var, String str, Throwable th) {
        if (((Boolean) qx2.e().c(e0.s4)).booleanValue() && zq1.RENDERER == zq1Var && this.d.c() != 0) {
            this.d.g(com.google.android.gms.ads.internal.p.j().c() - this.d.c());
        }
    }
}
