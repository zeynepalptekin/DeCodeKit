package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class fj0 implements com.google.android.gms.ads.internal.overlay.p {
    private final wc0 d;
    private final wg0 e;

    public fj0(wc0 wc0Var, wg0 wg0Var) {
        this.d = wc0Var;
        this.e = wg0Var;
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void onPause() {
        this.d.onPause();
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void onResume() {
        this.d.onResume();
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void q4() {
        this.d.q4();
        this.e.I0();
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void r6() {
        this.d.r6();
        this.e.H0();
    }
}
