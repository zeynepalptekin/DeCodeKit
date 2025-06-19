package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.a0;
import com.google.android.gms.ads.mediation.e0;
import com.google.android.gms.ads.mediation.k;
import com.google.android.gms.ads.mediation.t;
import com.google.android.gms.ads.mediation.x;
import com.google.android.gms.ads.q;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.internal.ads.tr;

@com.google.android.gms.common.annotation.c
@KeepName
/* loaded from: classes.dex */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    @d0
    private static final com.google.android.gms.ads.a e = new com.google.android.gms.ads.a(0, "Could not instantiate custom event adapter", q.f2483a);

    /* renamed from: a, reason: collision with root package name */
    private View f2440a;

    /* renamed from: b, reason: collision with root package name */
    @d0
    private CustomEventBanner f2441b;

    /* renamed from: c, reason: collision with root package name */
    @d0
    private CustomEventInterstitial f2442c;

    @d0
    private CustomEventNative d;

    @d0
    static final class a implements com.google.android.gms.ads.mediation.customevent.b {

        /* renamed from: a, reason: collision with root package name */
        private final CustomEventAdapter f2443a;

        /* renamed from: b, reason: collision with root package name */
        private final k f2444b;

        public a(CustomEventAdapter customEventAdapter, k kVar) {
            this.f2443a = customEventAdapter;
            this.f2444b = kVar;
        }

        @Override // com.google.android.gms.ads.mediation.customevent.e
        public final void E(int r3) {
            tr.f("Custom event adapter called onAdFailedToLoad.");
            this.f2444b.A(this.f2443a, r3);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.e
        public final void F(com.google.android.gms.ads.a aVar) {
            tr.f("Custom event adapter called onAdFailedToLoad.");
            this.f2444b.g(this.f2443a, aVar);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.b
        public final void a(View view) {
            tr.f("Custom event adapter called onAdLoaded.");
            this.f2443a.a(view);
            this.f2444b.k(this.f2443a);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.e
        public final void h() {
            tr.f("Custom event adapter called onAdLeftApplication.");
            this.f2444b.l(this.f2443a);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.e
        public final void p() {
            tr.f("Custom event adapter called onAdClicked.");
            this.f2444b.h(this.f2443a);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.e
        public final void r() {
            tr.f("Custom event adapter called onAdClosed.");
            this.f2444b.a(this.f2443a);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.e
        public final void s() {
            tr.f("Custom event adapter called onAdOpened.");
            this.f2444b.s(this.f2443a);
        }
    }

    @d0
    static class b implements f {

        /* renamed from: a, reason: collision with root package name */
        private final CustomEventAdapter f2445a;

        /* renamed from: b, reason: collision with root package name */
        private final t f2446b;

        public b(CustomEventAdapter customEventAdapter, t tVar) {
            this.f2445a = customEventAdapter;
            this.f2446b = tVar;
        }

        @Override // com.google.android.gms.ads.mediation.customevent.e
        public final void E(int r3) {
            tr.f("Custom event adapter called onAdFailedToLoad.");
            this.f2446b.m(this.f2445a, r3);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.e
        public final void F(com.google.android.gms.ads.a aVar) {
            tr.f("Custom event adapter called onAdFailedToLoad.");
            this.f2446b.c(this.f2445a, aVar);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.f
        public final void U() {
            tr.f("Custom event adapter called onAdImpression.");
            this.f2446b.y(this.f2445a);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.f
        public final void V(x xVar) {
            tr.f("Custom event adapter called onAdLoaded.");
            this.f2446b.u(this.f2445a, xVar);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.f
        public final void W(e0 e0Var) {
            tr.f("Custom event adapter called onAdLoaded.");
            this.f2446b.v(this.f2445a, e0Var);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.e
        public final void h() {
            tr.f("Custom event adapter called onAdLeftApplication.");
            this.f2446b.i(this.f2445a);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.e
        public final void p() {
            tr.f("Custom event adapter called onAdClicked.");
            this.f2446b.o(this.f2445a);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.e
        public final void r() {
            tr.f("Custom event adapter called onAdClosed.");
            this.f2446b.j(this.f2445a);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.e
        public final void s() {
            tr.f("Custom event adapter called onAdOpened.");
            this.f2446b.b(this.f2445a);
        }
    }

    @d0
    class c implements d {

        /* renamed from: a, reason: collision with root package name */
        private final CustomEventAdapter f2447a;

        /* renamed from: b, reason: collision with root package name */
        private final com.google.android.gms.ads.mediation.q f2448b;

        public c(CustomEventAdapter customEventAdapter, com.google.android.gms.ads.mediation.q qVar) {
            this.f2447a = customEventAdapter;
            this.f2448b = qVar;
        }

        @Override // com.google.android.gms.ads.mediation.customevent.e
        public final void E(int r3) {
            tr.f("Custom event adapter called onFailedToReceiveAd.");
            this.f2448b.f(this.f2447a, r3);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.e
        public final void F(com.google.android.gms.ads.a aVar) {
            tr.f("Custom event adapter called onFailedToReceiveAd.");
            this.f2448b.n(this.f2447a, aVar);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.e
        public final void h() {
            tr.f("Custom event adapter called onAdLeftApplication.");
            this.f2448b.e(this.f2447a);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.e
        public final void p() {
            tr.f("Custom event adapter called onAdClicked.");
            this.f2448b.w(this.f2447a);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.e
        public final void r() {
            tr.f("Custom event adapter called onAdClosed.");
            this.f2448b.t(this.f2447a);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.e
        public final void s() {
            tr.f("Custom event adapter called onAdOpened.");
            this.f2448b.z(this.f2447a);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.d
        public final void u() {
            tr.f("Custom event adapter called onReceivedAd.");
            this.f2448b.q(CustomEventAdapter.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(View view) {
        this.f2440a = view;
    }

    private static <T> T c(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            tr.i(sb.toString());
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public final View getBannerView() {
        return this.f2440a;
    }

    @Override // com.google.android.gms.ads.mediation.g
    public final void onDestroy() {
        CustomEventBanner customEventBanner = this.f2441b;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f2442c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.d;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.g
    public final void onPause() {
        CustomEventBanner customEventBanner = this.f2441b;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f2442c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.d;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.g
    public final void onResume() {
        CustomEventBanner customEventBanner = this.f2441b;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f2442c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.d;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public final void requestBannerAd(Context context, k kVar, Bundle bundle, com.google.android.gms.ads.f fVar, com.google.android.gms.ads.mediation.f fVar2, Bundle bundle2) {
        CustomEventBanner customEventBanner = (CustomEventBanner) c(bundle.getString("class_name"));
        this.f2441b = customEventBanner;
        if (customEventBanner == null) {
            kVar.g(this, e);
        } else {
            this.f2441b.requestBannerAd(context, new a(this, kVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), fVar, fVar2, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, com.google.android.gms.ads.mediation.q qVar, Bundle bundle, com.google.android.gms.ads.mediation.f fVar, Bundle bundle2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) c(bundle.getString("class_name"));
        this.f2442c = customEventInterstitial;
        if (customEventInterstitial == null) {
            qVar.n(this, e);
        } else {
            this.f2442c.requestInterstitialAd(context, new c(this, qVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), fVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void requestNativeAd(Context context, t tVar, Bundle bundle, a0 a0Var, Bundle bundle2) {
        CustomEventNative customEventNative = (CustomEventNative) c(bundle.getString("class_name"));
        this.d = customEventNative;
        if (customEventNative == null) {
            tVar.c(this, e);
        } else {
            this.d.requestNativeAd(context, new b(this, tVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), a0Var, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        this.f2442c.showInterstitial();
    }
}
