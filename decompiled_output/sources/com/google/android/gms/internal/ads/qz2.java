package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qz2 extends ih2 implements oz2 {
    qz2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.internal.ads.oz2
    public final void m6(sw2 sw2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, sw2Var);
        e2(1, parcelL0);
    }
}
