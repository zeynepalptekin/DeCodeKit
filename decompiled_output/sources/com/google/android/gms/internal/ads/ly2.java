package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ly2 extends ih2 implements my2 {
    ly2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.my2
    public final IBinder y2(c.a.b.b.e.c cVar, qw2 qw2Var, String str, qc qcVar, int r6, int r7) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.d(parcelL0, qw2Var);
        parcelL0.writeString(str);
        kh2.c(parcelL0, qcVar);
        parcelL0.writeInt(r6);
        parcelL0.writeInt(r7);
        Parcel parcelB2 = b2(2, parcelL0);
        IBinder strongBinder = parcelB2.readStrongBinder();
        parcelB2.recycle();
        return strongBinder;
    }
}
