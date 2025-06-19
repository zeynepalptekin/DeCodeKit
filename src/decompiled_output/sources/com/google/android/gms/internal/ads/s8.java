package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class s8 extends ih2 implements q8 {
    s8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.q8
    public final void U1() throws RemoteException {
        e2(1, L0());
    }

    @Override // com.google.android.gms.internal.ads.q8
    public final void x5(int r2) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeInt(r2);
        e2(2, parcelL0);
    }
}
