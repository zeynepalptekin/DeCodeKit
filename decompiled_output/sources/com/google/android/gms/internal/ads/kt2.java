package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class kt2 extends hh2 implements ht2 {
    public kt2() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static ht2 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof ht2 ? (ht2) iInterfaceQueryLocalInterface : new jt2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        gt2 it2Var;
        if (r2 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                it2Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                it2Var = iInterfaceQueryLocalInterface instanceof gt2 ? (gt2) iInterfaceQueryLocalInterface : new it2(strongBinder);
            }
            W3(it2Var);
        } else if (r2 == 2) {
            o3(parcel.readInt());
        } else {
            if (r2 != 3) {
                return false;
            }
            Q2((dw2) kh2.b(parcel, dw2.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
