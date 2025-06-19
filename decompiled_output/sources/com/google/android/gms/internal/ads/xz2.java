package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class xz2 extends hh2 implements uz2 {
    public xz2() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static uz2 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof uz2 ? (uz2) iInterfaceQueryLocalInterface : new wz2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        boolean zM3;
        float fM;
        zz2 b03Var;
        switch (r1) {
            case 1:
                J4();
                parcel2.writeNoException();
                return true;
            case 2:
                t();
                parcel2.writeNoException();
                return true;
            case 3:
                B5(kh2.e(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                zM3 = M3();
                parcel2.writeNoException();
                kh2.a(parcel2, zM3);
                return true;
            case 5:
                int r12 = M0();
                parcel2.writeNoException();
                parcel2.writeInt(r12);
                return true;
            case 6:
                fM = M();
                parcel2.writeNoException();
                parcel2.writeFloat(fM);
                return true;
            case 7:
                fM = X();
                parcel2.writeNoException();
                parcel2.writeFloat(fM);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    b03Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    b03Var = iInterfaceQueryLocalInterface instanceof zz2 ? (zz2) iInterfaceQueryLocalInterface : new b03(strongBinder);
                }
                P7(b03Var);
                parcel2.writeNoException();
                return true;
            case 9:
                fM = d0();
                parcel2.writeNoException();
                parcel2.writeFloat(fM);
                return true;
            case 10:
                zM3 = M4();
                parcel2.writeNoException();
                kh2.a(parcel2, zM3);
                return true;
            case 11:
                zz2 zz2VarI5 = I5();
                parcel2.writeNoException();
                kh2.c(parcel2, zz2VarI5);
                return true;
            case 12:
                zM3 = A2();
                parcel2.writeNoException();
                kh2.a(parcel2, zM3);
                return true;
            case 13:
                stop();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
