package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class rl implements com.google.android.gms.ads.mediation.v {

    /* renamed from: a, reason: collision with root package name */
    private final wc f5151a;

    public rl(wc wcVar) {
        this.f5151a = wcVar;
    }

    @Override // com.google.android.gms.ads.mediation.v
    public final void O0() {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onVideoStart.");
        try {
            this.f5151a.n7();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.v
    public final void a(com.google.android.gms.ads.a aVar) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdFailedToShow.");
        int r0 = aVar.b();
        String strD = aVar.d();
        String strC = aVar.c();
        StringBuilder sb = new StringBuilder(String.valueOf(strD).length() + 87 + String.valueOf(strC).length());
        sb.append("Mediation ad failed to show: Error Code = ");
        sb.append(r0);
        sb.append(". Error Message = ");
        sb.append(strD);
        sb.append(" Error Domain = ");
        sb.append(strC);
        tr.i(sb.toString());
        try {
            this.f5151a.q3(aVar.e());
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.v
    public final void b(String str) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdFailedToShow.");
        String strValueOf = String.valueOf(str);
        tr.i(strValueOf.length() != 0 ? "Mediation ad failed to show: ".concat(strValueOf) : new String("Mediation ad failed to show: "));
        try {
            this.f5151a.o5(str);
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.v
    public final void c(com.google.android.gms.ads.l0.b bVar) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onUserEarnedReward.");
        try {
            this.f5151a.J0(new ql(bVar));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.v
    public final void k0() {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onVideoComplete.");
        try {
            this.f5151a.y5();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void r() {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdClosed.");
        try {
            this.f5151a.r();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void s() {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called onAdOpened.");
        try {
            this.f5151a.s();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void t() {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called reportAdImpression.");
        try {
            this.f5151a.U();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void u() {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        tr.f("Adapter called reportAdClicked.");
        try {
            this.f5151a.p();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }
}
