package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class lz2 extends ih2 implements jz2 {
    lz2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.internal.ads.jz2
    public final String C() throws RemoteException {
        Parcel parcelB2 = b2(1, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.jz2
    public final String p2() throws RemoteException {
        Parcel parcelB2 = b2(2, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }
}
