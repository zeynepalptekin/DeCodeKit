package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class iy2 extends ih2 implements fy2 {
    iy2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    @Override // com.google.android.gms.internal.ads.fy2
    public final IBinder s2(c.a.b.b.e.c cVar, String str, qc qcVar, int r5) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        parcelL0.writeString(str);
        kh2.c(parcelL0, qcVar);
        parcelL0.writeInt(r5);
        Parcel parcelB2 = b2(1, parcelL0);
        IBinder strongBinder = parcelB2.readStrongBinder();
        parcelB2.recycle();
        return strongBinder;
    }
}
