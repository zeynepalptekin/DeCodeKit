package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f4 extends hh2 implements h4 {
    public f4() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static h4 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof h4 ? (h4) iInterfaceQueryLocalInterface : new j4(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        String strZ4;
        IInterface iInterfaceD6;
        boolean zG8;
        switch (r1) {
            case 1:
                strZ4 = z4(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strZ4);
                return true;
            case 2:
                iInterfaceD6 = D6(parcel.readString());
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceD6);
                return true;
            case 3:
                List<String> listD0 = D0();
                parcel2.writeNoException();
                parcel2.writeStringList(listD0);
                return true;
            case 4:
                strZ4 = Z0();
                parcel2.writeNoException();
                parcel2.writeString(strZ4);
                return true;
            case 5:
                Q0(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                g();
                parcel2.writeNoException();
                return true;
            case 7:
                iInterfaceD6 = getVideoController();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceD6);
                return true;
            case 8:
                destroy();
                parcel2.writeNoException();
                return true;
            case 9:
                iInterfaceD6 = S3();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceD6);
                return true;
            case 10:
                zG8 = g8(c.a.b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                kh2.a(parcel2, zG8);
                return true;
            case 11:
                iInterfaceD6 = K();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceD6);
                return true;
            case 12:
                zG8 = X1();
                parcel2.writeNoException();
                kh2.a(parcel2, zG8);
                return true;
            case 13:
                zG8 = e7();
                parcel2.writeNoException();
                kh2.a(parcel2, zG8);
                return true;
            case 14:
                L6(c.a.b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                p5();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
