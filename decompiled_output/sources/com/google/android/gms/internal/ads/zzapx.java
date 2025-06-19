package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import b.d.b.c;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

/* loaded from: classes.dex */
public final class zzapx implements MediationInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    private Activity f6325a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.gms.ads.mediation.q f6326b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f6327c;

    @Override // com.google.android.gms.ads.mediation.g
    public final void onDestroy() {
        tr.f("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.g
    public final void onPause() {
        tr.f("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.g
    public final void onResume() {
        tr.f("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, com.google.android.gms.ads.mediation.q qVar, Bundle bundle, com.google.android.gms.ads.mediation.f fVar, Bundle bundle2) {
        this.f6326b = qVar;
        if (qVar == null) {
            tr.i("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            tr.i("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f6326b.f(this, 0);
            return;
        }
        if (!(com.google.android.gms.common.util.v.d() && g1.a(context))) {
            tr.i("Default browser does not support custom tabs. Bailing out.");
            this.f6326b.f(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            tr.i("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.f6326b.f(this, 0);
        } else {
            this.f6325a = (Activity) context;
            this.f6327c = Uri.parse(string);
            this.f6326b.q(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        b.d.b.c cVarD = new c.a().d();
        cVarD.f859a.setData(this.f6327c);
        to.h.post(new pf(this, new AdOverlayInfoParcel(new com.google.android.gms.ads.internal.overlay.b(cVarD.f859a), null, new rf(this), null, new as(0, 0, false))));
        com.google.android.gms.ads.internal.p.g().n();
    }
}
