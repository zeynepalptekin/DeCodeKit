package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class dz2 extends hh2 implements ez2 {
    public dz2() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    public static ez2 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return iInterfaceQueryLocalInterface instanceof ez2 ? (ez2) iInterfaceQueryLocalInterface : new hz2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        if (r1 != 1) {
            return false;
        }
        e1();
        parcel2.writeNoException();
        return true;
    }
}
