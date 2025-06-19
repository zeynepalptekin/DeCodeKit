package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class el extends ih2 implements cl {
    el(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.cl
    public final void P1(dw2 dw2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, dw2Var);
        e2(3, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.cl
    public final void P3(int r2) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeInt(r2);
        e2(2, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.cl
    public final void Y2() throws RemoteException {
        e2(1, L0());
    }
}
