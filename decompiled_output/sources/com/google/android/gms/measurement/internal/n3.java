package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class n3 extends c.a.b.b.g.c.c1 implements o3 {
    public n3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // c.a.b.b.g.c.c1
    protected final boolean L0(int r7, Parcel parcel, Parcel parcel2, int r10) throws RemoteException {
        Collection collectionM1;
        switch (r7) {
            case 1:
                a4((s) c.a.b.b.g.c.b0.a(parcel, s.CREATOR), (ma) c.a.b.b.g.c.b0.a(parcel, ma.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                k6((ca) c.a.b.b.g.c.b0.a(parcel, ca.CREATOR), (ma) c.a.b.b.g.c.b0.a(parcel, ma.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                R1((ma) c.a.b.b.g.c.b0.a(parcel, ma.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                F7((s) c.a.b.b.g.c.b0.a(parcel, s.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                L3((ma) c.a.b.b.g.c.b0.a(parcel, ma.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                collectionM1 = M1((ma) c.a.b.b.g.c.b0.a(parcel, ma.CREATOR), c.a.b.b.g.c.b0.e(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionM1);
                return true;
            case 9:
                byte[] bArrZ3 = Z3((s) c.a.b.b.g.c.b0.a(parcel, s.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrZ3);
                return true;
            case 10:
                m7(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String strK5 = K5((ma) c.a.b.b.g.c.b0.a(parcel, ma.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(strK5);
                return true;
            case 12:
                N1((va) c.a.b.b.g.c.b0.a(parcel, va.CREATOR), (ma) c.a.b.b.g.c.b0.a(parcel, ma.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                U2((va) c.a.b.b.g.c.b0.a(parcel, va.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                collectionM1 = K1(parcel.readString(), parcel.readString(), c.a.b.b.g.c.b0.e(parcel), (ma) c.a.b.b.g.c.b0.a(parcel, ma.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionM1);
                return true;
            case 15:
                collectionM1 = V3(parcel.readString(), parcel.readString(), parcel.readString(), c.a.b.b.g.c.b0.e(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionM1);
                return true;
            case 16:
                collectionM1 = H7(parcel.readString(), parcel.readString(), (ma) c.a.b.b.g.c.b0.a(parcel, ma.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionM1);
                return true;
            case 17:
                collectionM1 = z7(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionM1);
                return true;
            case 18:
                y7((ma) c.a.b.b.g.c.b0.a(parcel, ma.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                Y5((Bundle) c.a.b.b.g.c.b0.a(parcel, Bundle.CREATOR), (ma) c.a.b.b.g.c.b0.a(parcel, ma.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                q2((ma) c.a.b.b.g.c.b0.a(parcel, ma.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
