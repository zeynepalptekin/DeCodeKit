package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class s0 extends c.a.b.b.g.b.b implements r0 {
    s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.r0
    public final boolean C6(c.a.b.b.d.c0 c0Var, c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.b.d.c(parcelL0, c0Var);
        c.a.b.b.g.b.d.b(parcelL0, cVar);
        Parcel parcelB2 = b2(5, parcelL0);
        boolean zE = c.a.b.b.g.b.d.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }
}
