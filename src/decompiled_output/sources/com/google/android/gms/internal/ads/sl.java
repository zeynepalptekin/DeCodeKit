package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class sl extends fl {
    private final com.google.android.gms.ads.m0.b e;
    private final vl f;

    public sl(com.google.android.gms.ads.m0.b bVar, vl vlVar) {
        this.e = bVar;
        this.f = vlVar;
    }

    @Override // com.google.android.gms.internal.ads.cl
    public final void P1(dw2 dw2Var) {
        com.google.android.gms.ads.m0.b bVar = this.e;
        if (bVar != null) {
            bVar.b(dw2Var.i());
        }
    }

    @Override // com.google.android.gms.internal.ads.cl
    public final void P3(int r2) {
        com.google.android.gms.ads.m0.b bVar = this.e;
        if (bVar != null) {
            bVar.a(r2);
        }
    }

    @Override // com.google.android.gms.internal.ads.cl
    public final void Y2() {
        vl vlVar;
        com.google.android.gms.ads.m0.b bVar = this.e;
        if (bVar == null || (vlVar = this.f) == null) {
            return;
        }
        bVar.c(vlVar);
    }
}
