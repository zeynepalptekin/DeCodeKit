package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class g8 extends hh2 implements d8 {
    public g8() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static d8 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof d8 ? (d8) iInterfaceQueryLocalInterface : new f8(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        if (r1 != 1) {
            return false;
        }
        p1(parcel.createTypedArrayList(a8.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
