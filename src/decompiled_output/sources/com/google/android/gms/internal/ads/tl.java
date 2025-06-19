package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tl extends yk {
    private com.google.android.gms.ads.k e;
    private com.google.android.gms.ads.v f;

    @Override // com.google.android.gms.internal.ads.zk
    public final void J0(sk skVar) {
        com.google.android.gms.ads.v vVar = this.f;
        if (vVar != null) {
            vVar.c(new il(skVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zk
    public final void J3(dw2 dw2Var) {
        com.google.android.gms.ads.k kVar = this.e;
        if (kVar != null) {
            kVar.b(dw2Var.h());
        }
    }

    @Override // com.google.android.gms.internal.ads.zk
    public final void X6(int r1) {
    }

    @Override // com.google.android.gms.internal.ads.zk
    public final void Z2() {
        com.google.android.gms.ads.k kVar = this.e;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zk
    public final void m4() {
        com.google.android.gms.ads.k kVar = this.e;
        if (kVar != null) {
            kVar.c();
        }
    }

    public final void y8(com.google.android.gms.ads.k kVar) {
        this.e = kVar;
    }

    public final void z8(com.google.android.gms.ads.v vVar) {
        this.f = vVar;
    }
}
