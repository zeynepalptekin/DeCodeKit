package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class y0 extends ih2 implements w0 {
    y0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.w0
    public final String G1() throws RemoteException {
        Parcel parcelB2 = b2(2, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.w0
    public final void W4(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(3, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.w0
    public final void g() throws RemoteException {
        e2(5, L0());
    }

    @Override // com.google.android.gms.internal.ads.w0
    public final void g1() throws RemoteException {
        e2(4, L0());
    }

    @Override // com.google.android.gms.internal.ads.w0
    public final String u3() throws RemoteException {
        Parcel parcelB2 = b2(1, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }
}
