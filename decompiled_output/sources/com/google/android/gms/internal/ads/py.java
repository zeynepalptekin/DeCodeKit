package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class py implements com.google.android.gms.ads.internal.overlay.p {
    private rw d;

    @androidx.annotation.i0
    private com.google.android.gms.ads.internal.overlay.p e;

    public py(rw rwVar, @androidx.annotation.i0 com.google.android.gms.ads.internal.overlay.p pVar) {
        this.d = rwVar;
        this.e = pVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void q4() {
        com.google.android.gms.ads.internal.overlay.p pVar = this.e;
        if (pVar != null) {
            pVar.q4();
        }
        this.d.B0();
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void r6() {
        com.google.android.gms.ads.internal.overlay.p pVar = this.e;
        if (pVar != null) {
            pVar.r6();
        }
        this.d.v();
    }
}
