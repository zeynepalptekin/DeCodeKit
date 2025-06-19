package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class t3 extends ih2 implements r3 {
    t3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.r3
    public final void T0(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(3, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.r3
    public final void l5() throws RemoteException {
        e2(2, L0());
    }

    @Override // com.google.android.gms.internal.ads.r3
    public final void o0(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(1, parcelL0);
    }
}
