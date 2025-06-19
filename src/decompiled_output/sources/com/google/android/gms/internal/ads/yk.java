package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class yk extends hh2 implements zk {
    public yk() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        sk ukVar;
        if (r2 == 1) {
            m4();
        } else if (r2 == 2) {
            Z2();
        } else if (r2 == 3) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                ukVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                ukVar = iInterfaceQueryLocalInterface instanceof sk ? (sk) iInterfaceQueryLocalInterface : new uk(strongBinder);
            }
            J0(ukVar);
        } else if (r2 == 4) {
            X6(parcel.readInt());
        } else {
            if (r2 != 5) {
                return false;
            }
            J3((dw2) kh2.b(parcel, dw2.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
