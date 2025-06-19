package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class oi extends ih2 implements mi {
    oi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.mi
    public final void S4(gi giVar, ni niVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, giVar);
        kh2.c(parcelL0, niVar);
        e2(2, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.mi
    public final void Z7(wi wiVar, pi piVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, wiVar);
        kh2.c(parcelL0, piVar);
        e2(6, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.mi
    public final ii r3(gi giVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, giVar);
        Parcel parcelB2 = b2(1, parcelL0);
        ii iiVar = (ii) kh2.b(parcelB2, ii.CREATOR);
        parcelB2.recycle();
        return iiVar;
    }

    @Override // com.google.android.gms.internal.ads.mi
    public final void r4(String str, pi piVar) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        kh2.c(parcelL0, piVar);
        e2(7, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.mi
    public final void s4(wi wiVar, pi piVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, wiVar);
        kh2.c(parcelL0, piVar);
        e2(4, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.mi
    public final void v6(wi wiVar, pi piVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, wiVar);
        kh2.c(parcelL0, piVar);
        e2(5, parcelL0);
    }
}
