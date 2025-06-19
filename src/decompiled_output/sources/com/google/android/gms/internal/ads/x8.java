package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class x8 extends ih2 implements v8 {
    x8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.v8
    public final void U6(int r2) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeInt(r2);
        e2(2, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.v8
    public final void a5(dw2 dw2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, dw2Var);
        e2(3, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.v8
    public final void y6(p8 p8Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, p8Var);
        e2(1, parcelL0);
    }
}
