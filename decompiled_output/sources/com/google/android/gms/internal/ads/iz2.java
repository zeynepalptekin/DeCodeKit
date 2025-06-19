package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class iz2 extends hh2 implements jz2 {
    public iz2() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static jz2 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof jz2 ? (jz2) iInterfaceQueryLocalInterface : new lz2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        String strC;
        if (r1 == 1) {
            strC = C();
        } else {
            if (r1 != 2) {
                return false;
            }
            strC = p2();
        }
        parcel2.writeNoException();
        parcel2.writeString(strC);
        return true;
    }
}
