package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.cv2;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class rj0 implements com.google.android.gms.ads.internal.overlay.p, nc0 {
    private final Context d;

    @androidx.annotation.i0
    private final rw e;
    private final km1 f;
    private final as g;
    private final cv2.a.EnumC0172a h;

    @androidx.annotation.i0
    @com.google.android.gms.common.util.d0
    private c.a.b.b.e.c i;

    public rj0(Context context, @androidx.annotation.i0 rw rwVar, km1 km1Var, as asVar, cv2.a.EnumC0172a enumC0172a) {
        this.d = context;
        this.e = rwVar;
        this.f = km1Var;
        this.g = asVar;
        this.h = enumC0172a;
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void q4() {
        rw rwVar;
        if (this.i == null || (rwVar = this.e) == null) {
            return;
        }
        rwVar.M("onSdkImpression", new HashMap());
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void r6() {
        this.i = null;
    }

    @Override // com.google.android.gms.internal.ads.nc0
    public final void u() {
        cv2.a.EnumC0172a enumC0172a = this.h;
        if ((enumC0172a == cv2.a.EnumC0172a.REWARD_BASED_VIDEO_AD || enumC0172a == cv2.a.EnumC0172a.INTERSTITIAL || enumC0172a == cv2.a.EnumC0172a.APP_OPEN) && this.f.N && this.e != null && com.google.android.gms.ads.internal.p.r().h(this.d)) {
            as asVar = this.g;
            int r1 = asVar.e;
            int r0 = asVar.f;
            StringBuilder sb = new StringBuilder(23);
            sb.append(r1);
            sb.append(".");
            sb.append(r0);
            c.a.b.b.e.c cVarB = com.google.android.gms.ads.internal.p.r().b(sb.toString(), this.e.getWebView(), "", "javascript", this.f.P.b());
            this.i = cVarB;
            if (cVarB == null || this.e.getView() == null) {
                return;
            }
            com.google.android.gms.ads.internal.p.r().d(this.i, this.e.getView());
            this.e.N(this.i);
            com.google.android.gms.ads.internal.p.r().e(this.i);
        }
    }
}
