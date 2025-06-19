package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class rf implements com.google.android.gms.ads.internal.overlay.p {
    private final /* synthetic */ zzapx d;

    rf(zzapx zzapxVar) {
        this.d = zzapxVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void onPause() {
        tr.f("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void onResume() {
        tr.f("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void q4() {
        tr.f("Opening AdMobCustomTabsAdapter overlay.");
        this.d.f6326b.z(this.d);
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void r6() {
        tr.f("AdMobCustomTabsAdapter overlay is closed.");
        this.d.f6326b.t(this.d);
    }
}
