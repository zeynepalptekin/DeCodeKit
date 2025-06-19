package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import c.a.a.a;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.internal.ads.tr;

@KeepName
/* loaded from: classes.dex */
public final class CustomEventAdapter implements MediationBannerAdapter<com.google.android.gms.ads.mediation.customevent.c, e>, MediationInterstitialAdapter<com.google.android.gms.ads.mediation.customevent.c, e> {

    /* renamed from: a, reason: collision with root package name */
    private View f2323a;

    /* renamed from: b, reason: collision with root package name */
    @d0
    private CustomEventBanner f2324b;

    /* renamed from: c, reason: collision with root package name */
    @d0
    private CustomEventInterstitial f2325c;

    @d0
    static final class a implements com.google.ads.mediation.customevent.b {

        /* renamed from: a, reason: collision with root package name */
        private final CustomEventAdapter f2326a;

        /* renamed from: b, reason: collision with root package name */
        private final com.google.ads.mediation.d f2327b;

        public a(CustomEventAdapter customEventAdapter, com.google.ads.mediation.d dVar) {
            this.f2326a = customEventAdapter;
            this.f2327b = dVar;
        }

        @Override // com.google.ads.mediation.customevent.d
        public final void a() {
            tr.f("Custom event adapter called onFailedToReceiveAd.");
            this.f2327b.j(this.f2326a);
        }

        @Override // com.google.ads.mediation.customevent.d
        public final void b() {
            tr.f("Custom event adapter called onFailedToReceiveAd.");
            this.f2327b.k(this.f2326a);
        }

        @Override // com.google.ads.mediation.customevent.b
        public final void d(View view) {
            tr.f("Custom event adapter called onReceivedAd.");
            this.f2326a.a(view);
            this.f2327b.i(this.f2326a);
        }

        @Override // com.google.ads.mediation.customevent.d
        public final void e() {
            tr.f("Custom event adapter called onFailedToReceiveAd.");
            this.f2327b.a(this.f2326a, a.EnumC0118a.NO_FILL);
        }

        @Override // com.google.ads.mediation.customevent.b
        public final void f() {
            tr.f("Custom event adapter called onFailedToReceiveAd.");
            this.f2327b.c(this.f2326a);
        }

        @Override // com.google.ads.mediation.customevent.d
        public final void g() {
            tr.f("Custom event adapter called onFailedToReceiveAd.");
            this.f2327b.d(this.f2326a);
        }
    }

    @d0
    class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final CustomEventAdapter f2328a;

        /* renamed from: b, reason: collision with root package name */
        private final com.google.ads.mediation.e f2329b;

        public b(CustomEventAdapter customEventAdapter, com.google.ads.mediation.e eVar) {
            this.f2328a = customEventAdapter;
            this.f2329b = eVar;
        }

        @Override // com.google.ads.mediation.customevent.d
        public final void a() {
            tr.f("Custom event adapter called onLeaveApplication.");
            this.f2329b.b(this.f2328a);
        }

        @Override // com.google.ads.mediation.customevent.d
        public final void b() {
            tr.f("Custom event adapter called onPresentScreen.");
            this.f2329b.f(this.f2328a);
        }

        @Override // com.google.ads.mediation.customevent.c
        public final void c() {
            tr.f("Custom event adapter called onReceivedAd.");
            this.f2329b.g(CustomEventAdapter.this);
        }

        @Override // com.google.ads.mediation.customevent.d
        public final void e() {
            tr.f("Custom event adapter called onFailedToReceiveAd.");
            this.f2329b.e(this.f2328a, a.EnumC0118a.NO_FILL);
        }

        @Override // com.google.ads.mediation.customevent.d
        public final void g() {
            tr.f("Custom event adapter called onDismissScreen.");
            this.f2329b.h(this.f2328a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(View view) {
        this.f2323a = view;
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

    @Override // com.google.ads.mediation.c
    public final void destroy() {
        CustomEventBanner customEventBanner = this.f2324b;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f2325c;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    @Override // com.google.ads.mediation.c
    public final Class<com.google.android.gms.ads.mediation.customevent.c> getAdditionalParametersType() {
        return com.google.android.gms.ads.mediation.customevent.c.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public final View getBannerView() {
        return this.f2323a;
    }

    @Override // com.google.ads.mediation.c
    public final Class<e> getServerParametersType() {
        return e.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public final void requestBannerAd(com.google.ads.mediation.d dVar, Activity activity, e eVar, c.a.a.b bVar, com.google.ads.mediation.b bVar2, com.google.android.gms.ads.mediation.customevent.c cVar) {
        CustomEventBanner customEventBanner = (CustomEventBanner) c(eVar.f2332b);
        this.f2324b = customEventBanner;
        if (customEventBanner == null) {
            dVar.a(this, a.EnumC0118a.INTERNAL_ERROR);
        } else {
            this.f2324b.requestBannerAd(new a(this, dVar), activity, eVar.f2331a, eVar.f2333c, bVar, bVar2, cVar == null ? null : cVar.a(eVar.f2331a));
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(com.google.ads.mediation.e eVar, Activity activity, e eVar2, com.google.ads.mediation.b bVar, com.google.android.gms.ads.mediation.customevent.c cVar) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) c(eVar2.f2332b);
        this.f2325c = customEventInterstitial;
        if (customEventInterstitial == null) {
            eVar.e(this, a.EnumC0118a.INTERNAL_ERROR);
        } else {
            this.f2325c.requestInterstitialAd(new b(this, eVar), activity, eVar2.f2331a, eVar2.f2333c, bVar, cVar == null ? null : cVar.a(eVar2.f2331a));
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        this.f2325c.showInterstitial();
    }
}
