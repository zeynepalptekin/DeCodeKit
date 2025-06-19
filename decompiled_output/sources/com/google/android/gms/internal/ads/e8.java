package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class e8 extends ih2 implements c8 {
    e8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final void f0() throws RemoteException {
        e2(2, L0());
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final void i1(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        e2(3, parcelL0);
    }
}
