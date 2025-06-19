package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class gn extends ih2 implements en {
    gn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.en
    public final void X7(String str, String str2) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        e2(1, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.en
    public final void u1(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        e2(2, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.en
    public final void v1(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        kh2.d(parcelL0, bundle);
        e2(3, parcelL0);
    }
}
