package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;
import java.util.List;

/* loaded from: classes.dex */
public abstract class cd extends hh2 implements dd {
    public cd() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        String strJ;
        IInterface iInterfaceG;
        boolean zW0;
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
                double dV = v();
                parcel2.writeNoException();
                parcel2.writeDouble(dV);
                return true;
            case 8:
                strJ = N();
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case 9:
                strJ = H();
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case 10:
                g();
                parcel2.writeNoException();
                return true;
            case 11:
                r0(c.a.b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                d1(c.a.b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                zW0 = w0();
                parcel2.writeNoException();
                kh2.a(parcel2, zW0);
                return true;
            case 14:
                zW0 = z0();
                parcel2.writeNoException();
                kh2.a(parcel2, zW0);
                return true;
            case 15:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                kh2.g(parcel2, extras);
                return true;
            case 16:
                b0(c.a.b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 17:
                iInterfaceG = getVideoController();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceG);
                return true;
            case 18:
                iInterfaceG = h0();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceG);
                return true;
            case 19:
                iInterfaceG = i();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceG);
                return true;
            case 20:
                iInterfaceG = V();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceG);
                return true;
            case 21:
                iInterfaceG = m();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceG);
                return true;
            case 22:
                x0(c.a.b2(parcel.readStrongBinder()), c.a.b2(parcel.readStrongBinder()), c.a.b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
