package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes.dex */
final class pf implements Runnable {
    private final /* synthetic */ AdOverlayInfoParcel d;
    private final /* synthetic */ zzapx e;

    pf(zzapx zzapxVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.e = zzapxVar;
        this.d = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() throws NumberFormatException {
        com.google.android.gms.ads.internal.p.b();
        com.google.android.gms.ads.internal.overlay.l.a(this.e.f6325a, this.d, true);
    }
}
