package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class jg extends hh2 implements gg {
    public jg() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static gg y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof gg ? (gg) iInterfaceQueryLocalInterface : new ig(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        if (r1 != 1) {
            return false;
        }
        U5((Intent) kh2.b(parcel, Intent.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
