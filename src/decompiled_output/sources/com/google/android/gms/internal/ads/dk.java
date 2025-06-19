package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class dk extends ih2 implements bk {
    dk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.bk
    public final void S5(qj qjVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, qjVar);
        e2(5, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.bk
    public final void a1(int r2) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeInt(r2);
        e2(7, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.bk
    public final void h1() throws RemoteException {
        e2(4, L0());
    }

    @Override // com.google.android.gms.internal.ads.bk
    public final void k0() throws RemoteException {
        e2(3, L0());
    }

    @Override // com.google.android.gms.internal.ads.bk
    public final void k1() throws RemoteException {
        e2(6, L0());
    }

    @Override // com.google.android.gms.internal.ads.bk
    public final void l0() throws RemoteException {
        e2(8, L0());
    }

    @Override // com.google.android.gms.internal.ads.bk
    public final void l1() throws RemoteException {
        e2(2, L0());
    }

    @Override // com.google.android.gms.internal.ads.bk
    public final void r1() throws RemoteException {
        e2(1, L0());
    }
}
