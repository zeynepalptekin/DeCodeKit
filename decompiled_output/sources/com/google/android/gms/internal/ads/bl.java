package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class bl extends ih2 implements zk {
    bl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zk
    public final void J0(sk skVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, skVar);
        e2(3, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.zk
    public final void J3(dw2 dw2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, dw2Var);
        e2(5, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.zk
    public final void X6(int r2) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeInt(r2);
        e2(4, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.zk
    public final void Z2() throws RemoteException {
        e2(2, L0());
    }

    @Override // com.google.android.gms.internal.ads.zk
    public final void m4() throws RemoteException {
        e2(1, L0());
    }
}
