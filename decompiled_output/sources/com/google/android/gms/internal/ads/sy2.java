package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class sy2 extends hh2 implements py2 {
    public sy2() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static py2 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterfaceQueryLocalInterface instanceof py2 ? (py2) iInterfaceQueryLocalInterface : new ry2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        if (r1 != 1) {
            return false;
        }
        Q(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
