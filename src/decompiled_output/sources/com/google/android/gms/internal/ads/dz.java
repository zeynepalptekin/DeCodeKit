package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class dz extends hh2 implements az {
    public dz() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        String strM5;
        switch (r2) {
            case 1:
                E2((Bundle) kh2.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundleL5 = L5((Bundle) kh2.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                kh2.g(parcel2, bundleL5);
                return true;
            case 3:
                y1(parcel.readString(), parcel.readString(), (Bundle) kh2.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                d6(parcel.readString(), parcel.readString(), c.a.b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                Map mapG2 = g2(parcel.readString(), parcel.readString(), kh2.e(parcel));
                parcel2.writeNoException();
                parcel2.writeMap(mapG2);
                return true;
            case 6:
                int r22 = E1(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(r22);
                return true;
            case 7:
                O3((Bundle) kh2.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) kh2.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                List listX0 = X0(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeList(listX0);
                return true;
            case 10:
                strM5 = m5();
                parcel2.writeNoException();
                parcel2.writeString(strM5);
                return true;
            case 11:
                strM5 = K2();
                parcel2.writeNoException();
                parcel2.writeString(strM5);
                return true;
            case 12:
                long jN6 = n6();
                parcel2.writeNoException();
                parcel2.writeLong(jN6);
                return true;
            case 13:
                e6(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                b8(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                n3(c.a.b2(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                strM5 = u6();
                parcel2.writeNoException();
                parcel2.writeString(strM5);
                return true;
            case 17:
                strM5 = E3();
                parcel2.writeNoException();
                parcel2.writeString(strM5);
                return true;
            case 18:
                strM5 = C2();
                parcel2.writeNoException();
                parcel2.writeString(strM5);
                return true;
            default:
                return false;
        }
    }
}
