package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;

/* loaded from: classes.dex */
public final class nk implements com.google.android.gms.ads.reward.mediation.a {

    /* renamed from: a, reason: collision with root package name */
    private final mk f4554a;

    public nk(mk mkVar) {
        this.f4554a = mkVar;
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void i0(Bundle bundle) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdMetadataChanged.");
        try {
            this.f4554a.i0(bundle);
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void j0(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, com.google.android.gms.ads.k0.b bVar) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onRewarded.");
        try {
            if (bVar != null) {
                this.f4554a.H2(c.a.b.b.e.e.i2(mediationRewardedVideoAdAdapter), new qk(bVar));
            } else {
                this.f4554a.H2(c.a.b.b.e.e.i2(mediationRewardedVideoAdAdapter), new qk("", 1));
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void k0(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onVideoCompleted.");
        try {
            this.f4554a.Z5(c.a.b.b.e.e.i2(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void l0(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdClicked.");
        try {
            this.f4554a.l2(c.a.b.b.e.e.i2(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void m0(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int r3) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdFailedToLoad.");
        try {
            this.f4554a.C5(c.a.b.b.e.e.i2(mediationRewardedVideoAdAdapter), r3);
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void n0(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdLeftApplication.");
        try {
            this.f4554a.h4(c.a.b.b.e.e.i2(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void o0(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onInitializationSucceeded.");
        try {
            this.f4554a.T7(c.a.b.b.e.e.i2(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void p0(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdOpened.");
        try {
            this.f4554a.K4(c.a.b.b.e.e.i2(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void q0(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onVideoStarted.");
        try {
            this.f4554a.z6(c.a.b.b.e.e.i2(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void r0(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdLoaded.");
        try {
            this.f4554a.G2(c.a.b.b.e.e.i2(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void s0(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdClosed.");
        try {
            this.f4554a.C7(c.a.b.b.e.e.i2(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void t0(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int r3) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onInitializationFailed.");
        try {
            this.f4554a.C3(c.a.b.b.e.e.i2(mediationRewardedVideoAdAdapter), r3);
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }
}
