package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class l5 extends hh2 implements m5 {
    public l5() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        String strJ;
        List listN;
        IInterface iInterfaceG;
        boolean Z;
        g5 j5Var;
        switch (r1) {
            case 2:
                strJ = j();
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case 3:
                listN = n();
                parcel2.writeNoException();
                parcel2.writeList(listN);
                return true;
            case 4:
                strJ = k();
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case 5:
                iInterfaceG = G();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceG);
                return true;
            case 6:
                strJ = l();
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case 7:
                strJ = L();
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case 8:
                double dV = v();
                parcel2.writeNoException();
                parcel2.writeDouble(dV);
                return true;
            case 9:
                strJ = N();
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case 10:
                strJ = H();
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case 11:
                iInterfaceG = getVideoController();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceG);
                return true;
            case 12:
                strJ = e();
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case 13:
                destroy();
                parcel2.writeNoException();
                return true;
            case 14:
                iInterfaceG = i();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceG);
                return true;
            case 15:
                c0((Bundle) kh2.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                Z = Z((Bundle) kh2.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                kh2.a(parcel2, Z);
                return true;
            case 17:
                v0((Bundle) kh2.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                iInterfaceG = K();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceG);
                return true;
            case 19:
                iInterfaceG = m();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceG);
                return true;
            case 20:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                kh2.g(parcel2, extras);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    j5Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    j5Var = iInterfaceQueryLocalInterface instanceof g5 ? (g5) iInterfaceQueryLocalInterface : new j5(strongBinder);
                }
                F1(j5Var);
                parcel2.writeNoException();
                return true;
            case 22:
                V0();
                parcel2.writeNoException();
                return true;
            case 23:
                listN = f3();
                parcel2.writeNoException();
                parcel2.writeList(listN);
                return true;
            case 24:
                Z = Q5();
                parcel2.writeNoException();
                kh2.a(parcel2, Z);
                return true;
            case 25:
                n1(iz2.y8(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 26:
                j1(dz2.y8(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 27:
                N0();
                parcel2.writeNoException();
                return true;
            case 28:
                u7();
                parcel2.writeNoException();
                return true;
            case 29:
                iInterfaceG = B1();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceG);
                return true;
            case 30:
                Z = A1();
                parcel2.writeNoException();
                kh2.a(parcel2, Z);
                return true;
            case 31:
                iInterfaceG = o();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceG);
                return true;
            case 32:
                q0(rz2.y8(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
