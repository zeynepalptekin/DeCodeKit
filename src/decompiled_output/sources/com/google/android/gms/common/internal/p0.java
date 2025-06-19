package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class p0 extends c.a.b.b.g.b.b implements m {
    p0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.common.internal.m
    public final void I7(int r2, Bundle bundle) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeInt(r2);
        c.a.b.b.g.b.d.c(parcelL0, bundle);
        e2(2, parcelL0);
    }

    @Override // com.google.android.gms.common.internal.m
    public final void P4(int r2, IBinder iBinder, c0 c0Var) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeInt(r2);
        parcelL0.writeStrongBinder(iBinder);
        c.a.b.b.g.b.d.c(parcelL0, c0Var);
        e2(3, parcelL0);
    }

    @Override // com.google.android.gms.common.internal.m
    public final void t8(int r2, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeInt(r2);
        parcelL0.writeStrongBinder(iBinder);
        c.a.b.b.g.b.d.c(parcelL0, bundle);
        e2(1, parcelL0);
    }
}
