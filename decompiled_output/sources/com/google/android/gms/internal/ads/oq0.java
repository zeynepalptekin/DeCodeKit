package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* loaded from: classes.dex */
public final class oq0 implements k7 {
    private final cc0 d;

    @androidx.annotation.i0
    private final qk e;
    private final String f;
    private final String g;

    public oq0(cc0 cc0Var, km1 km1Var) {
        this.d = cc0Var;
        this.e = km1Var.l;
        this.f = km1Var.j;
        this.g = km1Var.k;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void M() {
        this.d.K0();
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void c0() {
        this.d.L0();
    }

    @Override // com.google.android.gms.internal.ads.k7
    @ParametersAreNonnullByDefault
    public final void j0(qk qkVar) {
        String str;
        int r4;
        qk qkVar2 = this.e;
        if (qkVar2 != null) {
            qkVar = qkVar2;
        }
        if (qkVar != null) {
            str = qkVar.d;
            r4 = qkVar.e;
        } else {
            str = "";
            r4 = 1;
        }
        this.d.M0(new oj(str, r4), this.f, this.g);
    }
}
