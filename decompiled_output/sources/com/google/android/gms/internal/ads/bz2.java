package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class bz2 extends ih2 implements cz2 {
    bz2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.cz2
    public final IBinder s7(c.a.b.b.e.c cVar, int r3) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        parcelL0.writeInt(r3);
        Parcel parcelB2 = b2(1, parcelL0);
        IBinder strongBinder = parcelB2.readStrongBinder();
        parcelB2.recycle();
        return strongBinder;
    }
}
