package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class x03 extends by2 {
    final /* synthetic */ v03 e;

    private x03(v03 v03Var) {
        this.e = v03Var;
    }

    @Override // com.google.android.gms.internal.ads.yx2
    public final void I3(jw2 jw2Var) throws RemoteException {
        s6(jw2Var, 1);
    }

    @Override // com.google.android.gms.internal.ads.yx2
    public final String R0() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.yx2
    public final boolean Y() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.yx2
    public final String e() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.yx2
    public final void s6(jw2 jw2Var, int r2) throws RemoteException {
        tr.g("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        jr.f4014b.post(new w03(this));
    }
}
