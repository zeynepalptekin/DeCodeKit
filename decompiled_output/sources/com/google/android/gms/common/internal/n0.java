package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public final class n0 extends c.a.b.b.g.b.b implements m0 {
    n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.m0
    public final c.a.b.b.e.c b() throws RemoteException {
        Parcel parcelB2 = b2(1, L0());
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.common.internal.m0
    public final int c() throws RemoteException {
        Parcel parcelB2 = b2(2, L0());
        int r1 = parcelB2.readInt();
        parcelB2.recycle();
        return r1;
    }
}
