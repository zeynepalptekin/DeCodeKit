package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class nt2 extends com.google.android.gms.ads.b0.a {

    /* renamed from: c, reason: collision with root package name */
    private final gt2 f4610c;

    public nt2(gt2 gt2Var) {
        this.f4610c = gt2Var;
    }

    @Override // com.google.android.gms.ads.b0.a
    public final com.google.android.gms.ads.y a() {
        tz2 tz2VarO;
        try {
            tz2VarO = this.f4610c.o();
        } catch (RemoteException e) {
            tr.c("", e);
            tz2VarO = null;
        }
        return com.google.android.gms.ads.y.d(tz2VarO);
    }

    @Override // com.google.android.gms.ads.b0.a
    public final void d(Activity activity, com.google.android.gms.ads.k kVar) {
        try {
            this.f4610c.S6(c.a.b.b.e.e.i2(activity), new dt2(kVar));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.b0.a
    protected final void e(mt2 mt2Var) {
        try {
            this.f4610c.S2(mt2Var);
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.b0.a
    protected final hy2 f() {
        try {
            return this.f4610c.o6();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }
}
