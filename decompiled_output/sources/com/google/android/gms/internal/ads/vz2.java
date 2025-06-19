package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class vz2 extends ih2 implements tz2 {
    vz2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.internal.ads.tz2
    public final String e() throws RemoteException {
        Parcel parcelB2 = b2(1, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.tz2
    public final String f4() throws RemoteException {
        Parcel parcelB2 = b2(2, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.tz2
    public final List<uw2> j2() throws RemoteException {
        Parcel parcelB2 = b2(3, L0());
        ArrayList arrayListCreateTypedArrayList = parcelB2.createTypedArrayList(uw2.CREATOR);
        parcelB2.recycle();
        return arrayListCreateTypedArrayList;
    }
}
