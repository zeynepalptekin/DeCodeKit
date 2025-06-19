package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class gr0 implements com.google.android.gms.ads.internal.k {
    private final /* synthetic */ dr0 d;

    gr0(dr0 dr0Var) {
        this.d = dr0Var;
    }

    @Override // com.google.android.gms.ads.internal.k
    public final void Q() {
        this.d.h.onPause();
    }

    @Override // com.google.android.gms.ads.internal.k
    public final void g0() {
        this.d.h.onResume();
    }
}
