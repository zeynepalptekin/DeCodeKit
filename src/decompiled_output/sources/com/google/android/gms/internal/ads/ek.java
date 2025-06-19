package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class ek extends hh2 implements bk {
    public ek() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public static bk y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof bk ? (bk) iInterfaceQueryLocalInterface : new dk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        qj sjVar;
        switch (r1) {
            case 1:
                r1();
                break;
            case 2:
                l1();
                break;
            case 3:
                k0();
                break;
            case 4:
                h1();
                break;
            case 5:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    sjVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    sjVar = iInterfaceQueryLocalInterface instanceof qj ? (qj) iInterfaceQueryLocalInterface : new sj(strongBinder);
                }
                S5(sjVar);
                break;
            case 6:
                k1();
                break;
            case 7:
                a1(parcel.readInt());
                break;
            case 8:
                l0();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
