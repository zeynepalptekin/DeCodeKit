package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;

/* loaded from: classes.dex */
public final class sd implements com.google.android.gms.ads.mediation.k, com.google.android.gms.ads.mediation.q, com.google.android.gms.ads.mediation.t {

    /* renamed from: a, reason: collision with root package name */
    private final wc f5243a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.gms.ads.mediation.x f5244b;

    /* renamed from: c, reason: collision with root package name */
    private com.google.android.gms.ads.mediation.e0 f5245c;
    private com.google.android.gms.ads.d0.k d;

    public sd(wc wcVar) {
        this.f5243a = wcVar;
    }

    private static void B(MediationNativeAdapter mediationNativeAdapter, @androidx.annotation.i0 com.google.android.gms.ads.mediation.e0 e0Var, @androidx.annotation.i0 com.google.android.gms.ads.mediation.x xVar) {
        if (mediationNativeAdapter instanceof AdMobAdapter) {
            return;
        }
        com.google.android.gms.ads.z zVar = new com.google.android.gms.ads.z();
        zVar.o(new kd());
        if (e0Var != null && e0Var.s()) {
            e0Var.M(zVar);
        }
        if (xVar == null || !xVar.g()) {
            return;
        }
        xVar.r(zVar);
    }

    @Override // com.google.android.gms.ads.mediation.k
    public final void A(MediationBannerAdapter mediationBannerAdapter, int r3) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(r3);
        tr.f(sb.toString());
        try {
            this.f5243a.E(r3);
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final com.google.android.gms.ads.mediation.x C() {
        return this.f5244b;
    }

    public final com.google.android.gms.ads.mediation.e0 D() {
        return this.f5245c;
    }

    public final com.google.android.gms.ads.d0.k E() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.mediation.k
    public final void a(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdClosed.");
        try {
            this.f5243a.r();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.t
    public final void b(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdOpened.");
        try {
            this.f5243a.s();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.t
    public final void c(MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.ads.a aVar) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        int r5 = aVar.b();
        String strD = aVar.d();
        String strC = aVar.c();
        StringBuilder sb = new StringBuilder(String.valueOf(strD).length() + 97 + String.valueOf(strC).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(r5);
        sb.append(". ErrorMessage: ");
        sb.append(strD);
        sb.append(". ErrorDomain: ");
        sb.append(strC);
        tr.f(sb.toString());
        try {
            this.f5243a.q1(aVar.e());
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.t
    public final void d(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onVideoEnd.");
        try {
            this.f5243a.D1();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.q
    public final void e(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdLeftApplication.");
        try {
            this.f5243a.h();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.q
    public final void f(MediationInterstitialAdapter mediationInterstitialAdapter, int r3) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(r3);
        sb.append(".");
        tr.f(sb.toString());
        try {
            this.f5243a.E(r3);
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.k
    public final void g(MediationBannerAdapter mediationBannerAdapter, com.google.android.gms.ads.a aVar) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        int r5 = aVar.b();
        String strD = aVar.d();
        String strC = aVar.c();
        StringBuilder sb = new StringBuilder(String.valueOf(strD).length() + 97 + String.valueOf(strC).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(r5);
        sb.append(". ErrorMessage: ");
        sb.append(strD);
        sb.append(". ErrorDomain: ");
        sb.append(strC);
        tr.f(sb.toString());
        try {
            this.f5243a.q1(aVar.e());
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.k
    public final void h(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdClicked.");
        try {
            this.f5243a.p();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.t
    public final void i(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdLeftApplication.");
        try {
            this.f5243a.h();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.t
    public final void j(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdClosed.");
        try {
            this.f5243a.r();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.k
    public final void k(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdLoaded.");
        try {
            this.f5243a.u();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.k
    public final void l(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdLeftApplication.");
        try {
            this.f5243a.h();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.t
    public final void m(MediationNativeAdapter mediationNativeAdapter, int r3) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(r3);
        sb.append(".");
        tr.f(sb.toString());
        try {
            this.f5243a.E(r3);
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.q
    public final void n(MediationInterstitialAdapter mediationInterstitialAdapter, com.google.android.gms.ads.a aVar) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        int r5 = aVar.b();
        String strD = aVar.d();
        String strC = aVar.c();
        StringBuilder sb = new StringBuilder(String.valueOf(strD).length() + 97 + String.valueOf(strC).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(r5);
        sb.append(". ErrorMessage: ");
        sb.append(strD);
        sb.append(". ErrorDomain: ");
        sb.append(strC);
        tr.f(sb.toString());
        try {
            this.f5243a.q1(aVar.e());
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.t
    public final void o(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.mediation.x xVar = this.f5244b;
        com.google.android.gms.ads.mediation.e0 e0Var = this.f5245c;
        if (this.d == null) {
            if (xVar == null && e0Var == null) {
                tr.e("#007 Could not call remote method.", null);
                return;
            }
            if (e0Var != null && !e0Var.l()) {
                tr.f("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            } else if (xVar != null && !xVar.c()) {
                tr.f("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        tr.f("Adapter called onAdClicked.");
        try {
            this.f5243a.p();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.t
    public final void p(MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.ads.d0.k kVar) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        String strValueOf = String.valueOf(kVar.Z0());
        tr.f(strValueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(strValueOf) : new String("Adapter called onAdLoaded with template id "));
        this.d = kVar;
        try {
            this.f5243a.u();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.q
    public final void q(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdLoaded.");
        try {
            this.f5243a.u();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.k
    public final void r(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAppEvent.");
        try {
            this.f5243a.Q(str, str2);
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.k
    public final void s(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdOpened.");
        try {
            this.f5243a.s();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.q
    public final void t(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdClosed.");
        try {
            this.f5243a.r();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.t
    public final void u(MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.ads.mediation.x xVar) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdLoaded.");
        this.f5244b = xVar;
        this.f5245c = null;
        B(mediationNativeAdapter, null, xVar);
        try {
            this.f5243a.u();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.t
    public final void v(MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.ads.mediation.e0 e0Var) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdLoaded.");
        this.f5245c = e0Var;
        this.f5244b = null;
        B(mediationNativeAdapter, e0Var, null);
        try {
            this.f5243a.u();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.q
    public final void w(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdClicked.");
        try {
            this.f5243a.p();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.t
    public final void x(MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.ads.d0.k kVar, String str) {
        if (!(kVar instanceof i4)) {
            tr.i("Unexpected native custom template ad type.");
            return;
        }
        try {
            this.f5243a.W0(((i4) kVar).a(), str);
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.t
    public final void y(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.mediation.x xVar = this.f5244b;
        com.google.android.gms.ads.mediation.e0 e0Var = this.f5245c;
        if (this.d == null) {
            if (xVar == null && e0Var == null) {
                tr.e("#007 Could not call remote method.", null);
                return;
            }
            if (e0Var != null && !e0Var.m()) {
                tr.f("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            } else if (xVar != null && !xVar.d()) {
                tr.f("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        tr.f("Adapter called onAdImpression.");
        try {
            this.f5243a.U();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.q
    public final void z(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdOpened.");
        try {
            this.f5243a.s();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }
}
