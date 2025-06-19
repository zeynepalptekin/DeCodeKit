package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.internal.ads.to;
import com.google.android.gms.internal.ads.zv2;

/* loaded from: classes.dex */
public final class l {
    public static void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) throws NumberFormatException {
        if (adOverlayInfoParcel.n == 4 && adOverlayInfoParcel.f == null) {
            zv2 zv2Var = adOverlayInfoParcel.e;
            if (zv2Var != null) {
                zv2Var.p();
            }
            com.google.android.gms.ads.internal.p.a();
            a.b(context, adOverlayInfoParcel.d, adOverlayInfoParcel.l);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.e);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.p.g);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.h(intent, adOverlayInfoParcel);
        if (!com.google.android.gms.common.util.v.j()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        com.google.android.gms.ads.internal.p.c();
        to.i(context, intent);
    }
}
