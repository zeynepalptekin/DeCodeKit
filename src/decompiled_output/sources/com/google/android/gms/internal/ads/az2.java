package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;
import java.util.List;

/* loaded from: classes.dex */
public abstract class az2 extends hh2 implements xy2 {
    public az2() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        switch (r1) {
            case 1:
                E0();
                break;
            case 2:
                b5(parcel.readFloat());
                break;
            case 3:
                F6(parcel.readString());
                break;
            case 4:
                L4(kh2.e(parcel));
                break;
            case 5:
                T1(c.a.b2(parcel.readStrongBinder()), parcel.readString());
                break;
            case 6:
                u8(parcel.readString(), c.a.b2(parcel.readStrongBinder()));
                break;
            case 7:
                float fM2 = M2();
                parcel2.writeNoException();
                parcel2.writeFloat(fM2);
                return true;
            case 8:
                boolean zR7 = R7();
                parcel2.writeNoException();
                kh2.a(parcel2, zR7);
                return true;
            case 9:
                String strI8 = i8();
                parcel2.writeNoException();
                parcel2.writeString(strI8);
                return true;
            case 10:
                t7(parcel.readString());
                break;
            case 11:
                S1(tc.y8(parcel.readStrongBinder()));
                break;
            case 12:
                G4(g8.y8(parcel.readStrongBinder()));
                break;
            case 13:
                List<a8> listG6 = g6();
                parcel2.writeNoException();
                parcel2.writeTypedList(listG6);
                return true;
            case 14:
                w2((g) kh2.b(parcel, g.CREATOR));
                break;
            case 15:
                c4();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
