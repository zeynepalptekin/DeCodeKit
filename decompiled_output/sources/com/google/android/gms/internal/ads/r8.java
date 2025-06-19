package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class r8 extends ih2 implements p8 {
    r8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final e3 B1() throws RemoteException {
        Parcel parcelB2 = b2(7, L0());
        e3 e3VarY8 = i3.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return e3VarY8;
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void H3(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(6, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void S7(c.a.b.b.e.c cVar, q8 q8Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, q8Var);
        e2(5, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void destroy() throws RemoteException {
        e2(4, L0());
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final uz2 getVideoController() throws RemoteException {
        Parcel parcelB2 = b2(3, L0());
        uz2 uz2VarY8 = xz2.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return uz2VarY8;
    }
}
