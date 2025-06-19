package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class d extends rz2 {

    @androidx.annotation.i0
    private final com.google.android.gms.ads.u e;

    public d(@androidx.annotation.i0 com.google.android.gms.ads.u uVar) {
        this.e = uVar;
    }

    @Override // com.google.android.gms.internal.ads.oz2
    public final void m6(sw2 sw2Var) {
        if (this.e != null) {
            this.e.a(com.google.android.gms.ads.g.d(sw2Var.e, sw2Var.f, sw2Var.g));
        }
    }
}
