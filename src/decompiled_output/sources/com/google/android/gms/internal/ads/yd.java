package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import c.a.a.a;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.f;
import com.google.ads.mediation.g;

/* loaded from: classes.dex */
public final class yd<NETWORK_EXTRAS extends com.google.ads.mediation.g, SERVER_PARAMETERS extends com.google.ads.mediation.f> implements com.google.ads.mediation.d, com.google.ads.mediation.e {

    /* renamed from: a, reason: collision with root package name */
    private final wc f6121a;

    public yd(wc wcVar) {
        this.f6121a = wcVar;
    }

    @Override // com.google.ads.mediation.d
    public final void a(MediationBannerAdapter<?, ?> mediationBannerAdapter, a.EnumC0118a enumC0118a) {
        String strValueOf = String.valueOf(enumC0118a);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(strValueOf);
        tr.f(sb.toString());
        qx2.a();
        if (!jr.y()) {
            tr.e("#008 Must be called on the main UI thread.", null);
            jr.f4014b.post(new be(this, enumC0118a));
        } else {
            try {
                this.f6121a.E(ke.a(enumC0118a));
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.e
    public final void b(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        tr.f("Adapter called onLeaveApplication.");
        qx2.a();
        if (!jr.y()) {
            tr.e("#008 Must be called on the main UI thread.", null);
            jr.f4014b.post(new he(this));
        } else {
            try {
                this.f6121a.h();
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.d
    public final void c(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        tr.f("Adapter called onClick.");
        qx2.a();
        if (!jr.y()) {
            tr.e("#008 Must be called on the main UI thread.", null);
            jr.f4014b.post(new xd(this));
        } else {
            try {
                this.f6121a.p();
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.d
    public final void d(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        tr.f("Adapter called onDismissScreen.");
        qx2.a();
        if (!jr.y()) {
            tr.i("#008 Must be called on the main UI thread.");
            jr.f4014b.post(new ce(this));
        } else {
            try {
                this.f6121a.r();
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.e
    public final void e(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, a.EnumC0118a enumC0118a) {
        String strValueOf = String.valueOf(enumC0118a);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(strValueOf);
        sb.append(".");
        tr.f(sb.toString());
        qx2.a();
        if (!jr.y()) {
            tr.e("#008 Must be called on the main UI thread.", null);
            jr.f4014b.post(new ie(this, enumC0118a));
        } else {
            try {
                this.f6121a.E(ke.a(enumC0118a));
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.e
    public final void f(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        tr.f("Adapter called onPresentScreen.");
        qx2.a();
        if (!jr.y()) {
            tr.e("#008 Must be called on the main UI thread.", null);
            jr.f4014b.post(new ae(this));
        } else {
            try {
                this.f6121a.s();
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.e
    public final void g(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        tr.f("Adapter called onReceivedAd.");
        qx2.a();
        if (!jr.y()) {
            tr.e("#008 Must be called on the main UI thread.", null);
            jr.f4014b.post(new zd(this));
        } else {
            try {
                this.f6121a.u();
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.e
    public final void h(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        tr.f("Adapter called onDismissScreen.");
        qx2.a();
        if (!jr.y()) {
            tr.e("#008 Must be called on the main UI thread.", null);
            jr.f4014b.post(new fe(this));
        } else {
            try {
                this.f6121a.r();
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.d
    public final void i(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        tr.f("Adapter called onReceivedAd.");
        qx2.a();
        if (!jr.y()) {
            tr.e("#008 Must be called on the main UI thread.", null);
            jr.f4014b.post(new ge(this));
        } else {
            try {
                this.f6121a.u();
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.d
    public final void j(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        tr.f("Adapter called onLeaveApplication.");
        qx2.a();
        if (!jr.y()) {
            tr.e("#008 Must be called on the main UI thread.", null);
            jr.f4014b.post(new ee(this));
        } else {
            try {
                this.f6121a.h();
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.d
    public final void k(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        tr.f("Adapter called onPresentScreen.");
        qx2.a();
        if (!jr.y()) {
            tr.e("#008 Must be called on the main UI thread.", null);
            jr.f4014b.post(new de(this));
        } else {
            try {
                this.f6121a.s();
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
            }
        }
    }
}
