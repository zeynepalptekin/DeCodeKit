package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b4 extends hh2 implements c4 {
    public b4() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        IInterface iInterfaceK;
        String strJ;
        switch (r1) {
            case 2:
                iInterfaceK = K();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceK);
                return true;
            case 3:
                strJ = j();
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case 4:
                List listN = n();
                parcel2.writeNoException();
                parcel2.writeList(listN);
                return true;
            case 5:
                strJ = k();
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case 6:
                iInterfaceK = m1();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceK);
                return true;
            case 7:
                strJ = l();
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case 8:
                strJ = L();
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case 9:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                kh2.g(parcel2, extras);
                return true;
            case 10:
                destroy();
                parcel2.writeNoException();
                return true;
            case 11:
                iInterfaceK = getVideoController();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceK);
                return true;
            case 12:
                c0((Bundle) kh2.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean Z = Z((Bundle) kh2.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                kh2.a(parcel2, Z);
                return true;
            case 14:
                v0((Bundle) kh2.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                iInterfaceK = i();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceK);
                return true;
            case 16:
                iInterfaceK = m();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceK);
                return true;
            case 17:
                strJ = e();
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            default:
                return false;
        }
    }
}
