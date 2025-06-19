package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ri extends ih2 implements pi {
    ri(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.pi
    public final void R6(yp ypVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, ypVar);
        e2(2, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.pi
    public final void k2(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, parcelFileDescriptor);
        e2(1, parcelL0);
    }
}
