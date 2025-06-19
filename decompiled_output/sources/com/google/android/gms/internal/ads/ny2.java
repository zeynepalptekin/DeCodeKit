package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class ny2 extends hh2 implements oy2 {
    public ny2() {
        super("com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    public static oy2 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return iInterfaceQueryLocalInterface instanceof oy2 ? (oy2) iInterfaceQueryLocalInterface : new qy2(iBinder);
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
