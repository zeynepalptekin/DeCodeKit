package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ck extends ih2 implements zj {
    ck(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
    }

    @Override // com.google.android.gms.internal.ads.zj
    public final IBinder s5(c.a.b.b.e.c cVar, qc qcVar, int r4) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, qcVar);
        parcelL0.writeInt(r4);
        Parcel parcelB2 = b2(1, parcelL0);
        IBinder strongBinder = parcelB2.readStrongBinder();
        parcelB2.recycle();
        return strongBinder;
    }
}
