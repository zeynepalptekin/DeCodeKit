package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public abstract class xk extends hh2 implements tk {
    public xk() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static tk y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof tk ? (tk) iInterfaceQueryLocalInterface : new wk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        IInterface iInterfaceB6;
        cl elVar = null;
        cl elVar2 = null;
        hl glVar = null;
        zk blVar = null;
        switch (r2) {
            case 1:
                jw2 jw2Var = (jw2) kh2.b(parcel, jw2.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    elVar = iInterfaceQueryLocalInterface instanceof cl ? (cl) iInterfaceQueryLocalInterface : new el(strongBinder);
                }
                v5(jw2Var, elVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    blVar = iInterfaceQueryLocalInterface2 instanceof zk ? (zk) iInterfaceQueryLocalInterface2 : new bl(strongBinder2);
                }
                h6(blVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zW = W();
                parcel2.writeNoException();
                kh2.a(parcel2, zW);
                return true;
            case 4:
                String strE = e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 5:
                G5(c.a.b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    glVar = iInterfaceQueryLocalInterface3 instanceof hl ? (hl) iInterfaceQueryLocalInterface3 : new gl(strongBinder3);
                }
                f6(glVar);
                parcel2.writeNoException();
                return true;
            case 7:
                w8((pl) kh2.b(parcel, pl.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                I6(mz2.y8(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleA = A();
                parcel2.writeNoException();
                kh2.g(parcel2, bundleA);
                return true;
            case 10:
                r8(c.a.b2(parcel.readStrongBinder()), kh2.e(parcel));
                parcel2.writeNoException();
                return true;
            case 11:
                iInterfaceB6 = b6();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceB6);
                return true;
            case 12:
                iInterfaceB6 = o();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceB6);
                return true;
            case 13:
                q0(rz2.y8(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 14:
                jw2 jw2Var2 = (jw2) kh2.b(parcel, jw2.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    elVar2 = iInterfaceQueryLocalInterface4 instanceof cl ? (cl) iInterfaceQueryLocalInterface4 : new el(strongBinder4);
                }
                o8(jw2Var2, elVar2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
