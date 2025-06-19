package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public final class j extends c.a.b.b.g.b.b implements k {
    j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    @Override // com.google.android.gms.dynamite.k
    public final int H1(c.a.b.b.e.c cVar, String str, boolean z) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.b.d.b(parcelL0, cVar);
        parcelL0.writeString(str);
        c.a.b.b.g.b.d.d(parcelL0, z);
        Parcel parcelB2 = b2(5, parcelL0);
        int r3 = parcelB2.readInt();
        parcelB2.recycle();
        return r3;
    }

    @Override // com.google.android.gms.dynamite.k
    public final c.a.b.b.e.c P0(c.a.b.b.e.c cVar, String str, int r4, c.a.b.b.e.c cVar2) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.b.d.b(parcelL0, cVar);
        parcelL0.writeString(str);
        parcelL0.writeInt(r4);
        c.a.b.b.g.b.d.b(parcelL0, cVar2);
        Parcel parcelB2 = b2(8, parcelL0);
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.dynamite.k
    public final int b() throws RemoteException {
        Parcel parcelB2 = b2(6, L0());
        int r1 = parcelB2.readInt();
        parcelB2.recycle();
        return r1;
    }

    @Override // com.google.android.gms.dynamite.k
    public final c.a.b.b.e.c e4(c.a.b.b.e.c cVar, String str, int r4) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.b.d.b(parcelL0, cVar);
        parcelL0.writeString(str);
        parcelL0.writeInt(r4);
        Parcel parcelB2 = b2(4, parcelL0);
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.dynamite.k
    public final c.a.b.b.e.c i6(c.a.b.b.e.c cVar, String str, int r4) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.b.d.b(parcelL0, cVar);
        parcelL0.writeString(str);
        parcelL0.writeInt(r4);
        Parcel parcelB2 = b2(2, parcelL0);
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.dynamite.k
    public final c.a.b.b.e.c v3(c.a.b.b.e.c cVar, String str, boolean z) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.b.d.b(parcelL0, cVar);
        parcelL0.writeString(str);
        c.a.b.b.g.b.d.d(parcelL0, z);
        Parcel parcelB2 = b2(7, parcelL0);
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.dynamite.k
    public final int z3(c.a.b.b.e.c cVar, String str, boolean z) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.b.d.b(parcelL0, cVar);
        parcelL0.writeString(str);
        c.a.b.b.g.b.d.d(parcelL0, z);
        Parcel parcelB2 = b2(3, parcelL0);
        int r3 = parcelB2.readInt();
        parcelB2.recycle();
        return r3;
    }
}
