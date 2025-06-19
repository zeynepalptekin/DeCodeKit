package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class jt2 extends ih2 implements ht2 {
    jt2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.ht2
    public final void Q2(dw2 dw2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, dw2Var);
        e2(3, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.ht2
    public final void W3(gt2 gt2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, gt2Var);
        e2(1, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.ht2
    public final void o3(int r2) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeInt(r2);
        e2(2, parcelL0);
    }
}
