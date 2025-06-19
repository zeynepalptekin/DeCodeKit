package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public abstract class xj extends hh2 implements yj {
    public xj() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public static yj y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        return iInterfaceQueryLocalInterface instanceof yj ? (yj) iInterfaceQueryLocalInterface : new ak(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r3, Parcel parcel, Parcel parcel2, int r6) throws RemoteException {
        boolean zW;
        if (r3 == 1) {
            w5((hk) kh2.b(parcel, hk.CREATOR));
        } else if (r3 != 2) {
            bk dkVar = null;
            wj vjVar = null;
            if (r3 == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    dkVar = iInterfaceQueryLocalInterface instanceof bk ? (bk) iInterfaceQueryLocalInterface : new dk(strongBinder);
                }
                H0(dkVar);
            } else {
                if (r3 != 34) {
                    switch (r3) {
                        case 5:
                            zW = W();
                            break;
                        case 6:
                            t();
                            break;
                        case 7:
                            D();
                            break;
                        case 8:
                            destroy();
                            break;
                        case 9:
                            w4(c.a.b2(parcel.readStrongBinder()));
                            break;
                        case 10:
                            V2(c.a.b2(parcel.readStrongBinder()));
                            break;
                        case 11:
                            N7(c.a.b2(parcel.readStrongBinder()));
                            break;
                        case 12:
                            String strE = e();
                            parcel2.writeNoException();
                            parcel2.writeString(strE);
                            return true;
                        case 13:
                            m0(parcel.readString());
                            break;
                        case 14:
                            S0(ny2.y8(parcel.readStrongBinder()));
                            break;
                        case 15:
                            Bundle bundleA = A();
                            parcel2.writeNoException();
                            kh2.g(parcel2, bundleA);
                            return true;
                        case 16:
                            IBinder strongBinder2 = parcel.readStrongBinder();
                            if (strongBinder2 != null) {
                                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                                vjVar = iInterfaceQueryLocalInterface2 instanceof wj ? (wj) iInterfaceQueryLocalInterface2 : new vj(strongBinder2);
                            }
                            e5(vjVar);
                            break;
                        case 17:
                            x4(parcel.readString());
                            break;
                        case 18:
                            X3(c.a.b2(parcel.readStrongBinder()));
                            break;
                        case 19:
                            t1(parcel.readString());
                            break;
                        case 20:
                            zW = L1();
                            break;
                        case 21:
                            tz2 tz2VarO = o();
                            parcel2.writeNoException();
                            kh2.c(parcel2, tz2VarO);
                            return true;
                        default:
                            return false;
                    }
                    parcel2.writeNoException();
                    kh2.a(parcel2, zW);
                    return true;
                }
                T(kh2.e(parcel));
            }
        } else {
            y();
        }
        parcel2.writeNoException();
        return true;
    }
}
