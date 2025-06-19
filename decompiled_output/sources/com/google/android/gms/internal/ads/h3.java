package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public final class h3 extends ih2 implements e3 {
    h3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.e3
    public final float M() throws RemoteException {
        Parcel parcelB2 = b2(5, L0());
        float f = parcelB2.readFloat();
        parcelB2.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.e3
    public final c.a.b.b.e.c U7() throws RemoteException {
        Parcel parcelB2 = b2(4, L0());
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.internal.ads.e3
    public final float X() throws RemoteException {
        Parcel parcelB2 = b2(6, L0());
        float f = parcelB2.readFloat();
        parcelB2.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.e3
    public final float d0() throws RemoteException {
        Parcel parcelB2 = b2(2, L0());
        float f = parcelB2.readFloat();
        parcelB2.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.e3
    public final boolean f1() throws RemoteException {
        Parcel parcelB2 = b2(8, L0());
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.e3
    public final uz2 getVideoController() throws RemoteException {
        Parcel parcelB2 = b2(7, L0());
        uz2 uz2VarY8 = xz2.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return uz2VarY8;
    }

    @Override // com.google.android.gms.internal.ads.e3
    public final void v7(x4 x4Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, x4Var);
        e2(9, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.e3
    public final void w3(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(3, parcelL0);
    }
}
