package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public final class q3 extends ih2 implements o3 {
    q3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final void J7(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(9, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final void T0(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(6, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final void destroy() throws RemoteException {
        e2(4, L0());
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final c.a.b.b.e.c j3(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        Parcel parcelB2 = b2(2, parcelL0);
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final void j6(String str, c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        kh2.c(parcelL0, cVar);
        e2(1, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final void l4(e3 e3Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, e3Var);
        e2(8, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final void o0(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(3, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final void o2(c.a.b.b.e.c cVar, int r3) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        parcelL0.writeInt(r3);
        e2(5, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final void r2(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(7, parcelL0);
    }
}
