package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;
import java.util.List;

/* loaded from: classes.dex */
public abstract class hd extends hh2 implements ed {
    public hd() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        String strJ;
        IInterface iInterfaceM1;
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
                iInterfaceM1 = m1();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceM1);
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
                g();
                parcel2.writeNoException();
                return true;
            case 9:
                r0(c.a.b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 10:
                d1(c.a.b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
                zW0 = w0();
                parcel2.writeNoException();
                kh2.a(parcel2, zW0);
                return true;
            case 12:
                zW0 = z0();
                parcel2.writeNoException();
                kh2.a(parcel2, zW0);
                return true;
            case 13:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                kh2.g(parcel2, extras);
                return true;
            case 14:
                b0(c.a.b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                iInterfaceM1 = h0();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceM1);
                return true;
            case 16:
                iInterfaceM1 = getVideoController();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceM1);
                return true;
            case 17:
            case 18:
            default:
                return false;
            case 19:
                iInterfaceM1 = i();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceM1);
                return true;
            case 20:
                iInterfaceM1 = V();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceM1);
                return true;
            case 21:
                iInterfaceM1 = m();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceM1);
                return true;
            case 22:
                x0(c.a.b2(parcel.readStrongBinder()), c.a.b2(parcel.readStrongBinder()), c.a.b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
        }
    }
}
