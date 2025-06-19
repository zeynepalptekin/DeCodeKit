package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d3 extends ih2 implements b3 {
    d3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final String X2() throws RemoteException {
        Parcel parcelB2 = b2(2, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final List<k3> u5() throws RemoteException {
        Parcel parcelB2 = b2(3, L0());
        ArrayList arrayListF = kh2.f(parcelB2);
        parcelB2.recycle();
        return arrayListF;
    }
}
