package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class j5 extends ih2 implements g5 {
    j5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.g5
    public final void c1(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        e2(1, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.g5
    public final void z1() throws RemoteException {
        e2(2, L0());
    }
}
