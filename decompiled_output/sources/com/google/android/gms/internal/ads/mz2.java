package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class mz2 extends hh2 implements nz2 {
    public mz2() {
        super("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }

    public static nz2 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        return iInterfaceQueryLocalInterface instanceof nz2 ? (nz2) iInterfaceQueryLocalInterface : new pz2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        if (r1 != 1) {
            return false;
        }
        a0();
        parcel2.writeNoException();
        return true;
    }
}
