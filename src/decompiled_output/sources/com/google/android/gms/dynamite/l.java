package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public final class l extends c.a.b.b.g.b.b implements m {
    l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    @Override // com.google.android.gms.dynamite.m
    public final c.a.b.b.e.c P0(c.a.b.b.e.c cVar, String str, int r4, c.a.b.b.e.c cVar2) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.b.d.b(parcelL0, cVar);
        parcelL0.writeString(str);
        parcelL0.writeInt(r4);
        c.a.b.b.g.b.d.b(parcelL0, cVar2);
        Parcel parcelB2 = b2(2, parcelL0);
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.dynamite.m
    public final c.a.b.b.e.c x3(c.a.b.b.e.c cVar, String str, int r4, c.a.b.b.e.c cVar2) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.b.d.b(parcelL0, cVar);
        parcelL0.writeString(str);
        parcelL0.writeInt(r4);
        c.a.b.b.g.b.d.b(parcelL0, cVar2);
        Parcel parcelB2 = b2(3, parcelL0);
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }
}
