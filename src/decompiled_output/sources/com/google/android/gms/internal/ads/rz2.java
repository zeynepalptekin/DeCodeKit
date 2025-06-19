package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class rz2 extends hh2 implements oz2 {
    public rz2() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static oz2 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof oz2 ? (oz2) iInterfaceQueryLocalInterface : new qz2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        if (r1 != 1) {
            return false;
        }
        m6((sw2) kh2.b(parcel, sw2.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
