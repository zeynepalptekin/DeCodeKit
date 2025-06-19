package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zc extends hh2 implements wc {
    public zc() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static wc y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof wc ? (wc) iInterfaceQueryLocalInterface : new yc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        bd adVar;
        switch (r1) {
            case 1:
                p();
                break;
            case 2:
                r();
                break;
            case 3:
                E(parcel.readInt());
                break;
            case 4:
                h();
                break;
            case 5:
                s();
                break;
            case 6:
                u();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    adVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    adVar = iInterfaceQueryLocalInterface instanceof bd ? (bd) iInterfaceQueryLocalInterface : new ad(strongBinder);
                }
                O5(adVar);
                break;
            case 8:
                U();
                break;
            case 9:
                Q(parcel.readString(), parcel.readString());
                break;
            case 10:
                W0(f4.y8(parcel.readStrongBinder()), parcel.readString());
                break;
            case 11:
                D1();
                break;
            case 12:
                j4(parcel.readString());
                break;
            case 13:
                n7();
                break;
            case 14:
                U3((qk) kh2.b(parcel, qk.CREATOR));
                break;
            case 15:
                g0();
                break;
            case 16:
                J0(rk.y8(parcel.readStrongBinder()));
                break;
            case 17:
                l7(parcel.readInt());
                break;
            case 18:
                y5();
                break;
            case 19:
                i0((Bundle) kh2.b(parcel, Bundle.CREATOR));
                break;
            case 20:
                j0();
                break;
            case 21:
                o5(parcel.readString());
                break;
            case 22:
                l6(parcel.readInt(), parcel.readString());
                break;
            case 23:
                q1((dw2) kh2.b(parcel, dw2.CREATOR));
                break;
            case 24:
                q3((dw2) kh2.b(parcel, dw2.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
