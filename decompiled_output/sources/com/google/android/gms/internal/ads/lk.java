package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public abstract class lk extends hh2 implements mk {
    public lk() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static mk y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof mk ? (mk) iInterfaceQueryLocalInterface : new ok(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        switch (r1) {
            case 1:
                T7(c.a.b2(parcel.readStrongBinder()));
                break;
            case 2:
                C3(c.a.b2(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                G2(c.a.b2(parcel.readStrongBinder()));
                break;
            case 4:
                K4(c.a.b2(parcel.readStrongBinder()));
                break;
            case 5:
                z6(c.a.b2(parcel.readStrongBinder()));
                break;
            case 6:
                C7(c.a.b2(parcel.readStrongBinder()));
                break;
            case 7:
                H2(c.a.b2(parcel.readStrongBinder()), (qk) kh2.b(parcel, qk.CREATOR));
                break;
            case 8:
                l2(c.a.b2(parcel.readStrongBinder()));
                break;
            case 9:
                C5(c.a.b2(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                h4(c.a.b2(parcel.readStrongBinder()));
                break;
            case 11:
                Z5(c.a.b2(parcel.readStrongBinder()));
                break;
            case 12:
                i0((Bundle) kh2.b(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
