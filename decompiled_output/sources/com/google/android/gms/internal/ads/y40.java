package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class y40 extends ft2 {
    private final v40 e;
    private final hy2 f;
    private final oi1 g;

    public y40(v40 v40Var, hy2 hy2Var, oi1 oi1Var) {
        this.e = v40Var;
        this.f = hy2Var;
        this.g = oi1Var;
    }

    @Override // com.google.android.gms.internal.ads.gt2
    public final void S2(mt2 mt2Var) {
    }

    @Override // com.google.android.gms.internal.ads.gt2
    public final void S6(c.a.b.b.e.c cVar, qt2 qt2Var) {
        try {
            this.g.e(qt2Var);
            this.e.g((Activity) c.a.b.b.e.e.e2(cVar), qt2Var);
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.gt2
    public final tz2 o() {
        if (((Boolean) qx2.e().c(e0.T4)).booleanValue()) {
            return this.e.d();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gt2
    public final hy2 o6() {
        return this.f;
    }
}
