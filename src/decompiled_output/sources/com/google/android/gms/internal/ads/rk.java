package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class rk extends hh2 implements sk {
    public rk() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static sk y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return iInterfaceQueryLocalInterface instanceof sk ? (sk) iInterfaceQueryLocalInterface : new uk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        if (r1 == 1) {
            String strQ = q();
            parcel2.writeNoException();
            parcel2.writeString(strQ);
        } else {
            if (r1 != 2) {
                return false;
            }
            int r12 = R();
            parcel2.writeNoException();
            parcel2.writeInt(r12);
        }
        return true;
    }
}
