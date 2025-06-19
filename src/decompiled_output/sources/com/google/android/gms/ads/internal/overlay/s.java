package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.tg;
import com.google.android.gms.internal.ads.zv2;

/* loaded from: classes.dex */
public final class s extends tg {
    private AdOverlayInfoParcel e;
    private Activity f;
    private boolean g = false;
    private boolean h = false;

    public s(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.e = adOverlayInfoParcel;
        this.f = activity;
    }

    private final synchronized void z8() {
        if (!this.h) {
            if (this.e.f != null) {
                this.e.f.r6();
            }
            this.h = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void A6() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void C0() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void C1(Bundle bundle) {
        p pVar;
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.e;
        if (adOverlayInfoParcel == null || z) {
            this.f.finish();
            return;
        }
        if (bundle == null) {
            zv2 zv2Var = adOverlayInfoParcel.e;
            if (zv2Var != null) {
                zv2Var.p();
            }
            if (this.f.getIntent() != null && this.f.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (pVar = this.e.f) != null) {
                pVar.q4();
            }
        }
        com.google.android.gms.ads.internal.p.a();
        Activity activity = this.f;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.e;
        if (a.b(activity, adOverlayInfoParcel2.d, adOverlayInfoParcel2.l)) {
            return;
        }
        this.f.finish();
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void N4() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void U0() throws RemoteException {
        if (this.f.isFinishing()) {
            z8();
        }
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void Z1() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void c5(c.a.b.b.e.c cVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void f2(int r1, int r2, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final boolean k7() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void onDestroy() throws RemoteException {
        if (this.f.isFinishing()) {
            z8();
        }
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void onPause() throws RemoteException {
        p pVar = this.e.f;
        if (pVar != null) {
            pVar.onPause();
        }
        if (this.f.isFinishing()) {
            z8();
        }
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void onResume() throws RemoteException {
        if (this.g) {
            this.f.finish();
            return;
        }
        this.g = true;
        p pVar = this.e.f;
        if (pVar != null) {
            pVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void x1(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.g);
    }
}
