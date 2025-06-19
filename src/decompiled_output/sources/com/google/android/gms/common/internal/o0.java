package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class o0 extends c.a.b.b.g.b.a implements m0 {
    public o0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static m0 b2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof m0 ? (m0) iInterfaceQueryLocalInterface : new n0(iBinder);
    }

    @Override // c.a.b.b.g.b.a
    protected final boolean L0(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        if (r1 == 1) {
            c.a.b.b.e.c cVarB = b();
            parcel2.writeNoException();
            c.a.b.b.g.b.d.b(parcel2, cVarB);
        } else {
            if (r1 != 2) {
                return false;
            }
            int r12 = c();
            parcel2.writeNoException();
            parcel2.writeInt(r12);
        }
        return true;
    }
}
