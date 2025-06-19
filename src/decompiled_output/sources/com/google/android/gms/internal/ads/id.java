package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;
import java.util.List;

/* loaded from: classes.dex */
public abstract class id extends hh2 implements jd {
    public id() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static jd y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterfaceQueryLocalInterface instanceof jd ? (jd) iInterfaceQueryLocalInterface : new ld(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        String strJ;
        IInterface iInterfaceG;
        boolean zW0;
        float fL3;
        switch (r1) {
            case 2:
                strJ = j();
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case 3:
                List listN = n();
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
                iInterfaceG = i();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceG);
                return true;
            case 13:
                iInterfaceG = h0();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceG);
                return true;
            case 14:
                iInterfaceG = V();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceG);
                return true;
            case 15:
                iInterfaceG = m();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceG);
                return true;
            case 16:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                kh2.g(parcel2, extras);
                return true;
            case 17:
                zW0 = w0();
                parcel2.writeNoException();
                kh2.a(parcel2, zW0);
                return true;
            case 18:
                zW0 = z0();
                parcel2.writeNoException();
                kh2.a(parcel2, zW0);
                return true;
            case 19:
                g();
                parcel2.writeNoException();
                return true;
            case 20:
                r0(c.a.b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 21:
                x0(c.a.b2(parcel.readStrongBinder()), c.a.b2(parcel.readStrongBinder()), c.a.b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                b0(c.a.b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 23:
                fL3 = l3();
                parcel2.writeNoException();
                parcel2.writeFloat(fL3);
                return true;
            case 24:
                fL3 = q5();
                parcel2.writeNoException();
                parcel2.writeFloat(fL3);
                return true;
            case 25:
                fL3 = A4();
                parcel2.writeNoException();
                parcel2.writeFloat(fL3);
                return true;
            default:
                return false;
        }
    }
}
