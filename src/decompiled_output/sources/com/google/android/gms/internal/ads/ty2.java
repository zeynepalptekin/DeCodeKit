package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public abstract class ty2 extends hh2 implements uy2 {
    public ty2() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r7, Parcel parcel, Parcel parcel2, int r10) throws RemoteException {
        IInterface iInterfaceR5;
        switch (r7) {
            case 1:
                iInterfaceR5 = r5(c.a.b2(parcel.readStrongBinder()), (qw2) kh2.b(parcel, qw2.CREATOR), parcel.readString(), tc.y8(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 2:
                iInterfaceR5 = W6(c.a.b2(parcel.readStrongBinder()), (qw2) kh2.b(parcel, qw2.CREATOR), parcel.readString(), tc.y8(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                iInterfaceR5 = N5(c.a.b2(parcel.readStrongBinder()), parcel.readString(), tc.y8(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 4:
                iInterfaceR5 = j7(c.a.b2(parcel.readStrongBinder()));
                break;
            case 5:
                iInterfaceR5 = s8(c.a.b2(parcel.readStrongBinder()), c.a.b2(parcel.readStrongBinder()));
                break;
            case 6:
                iInterfaceR5 = p7(c.a.b2(parcel.readStrongBinder()), tc.y8(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 7:
                iInterfaceR5 = h5(c.a.b2(parcel.readStrongBinder()));
                break;
            case 8:
                iInterfaceR5 = F0(c.a.b2(parcel.readStrongBinder()));
                break;
            case 9:
                iInterfaceR5 = c6(c.a.b2(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                iInterfaceR5 = t2(c.a.b2(parcel.readStrongBinder()), (qw2) kh2.b(parcel, qw2.CREATOR), parcel.readString(), parcel.readInt());
                break;
            case 11:
                iInterfaceR5 = t3(c.a.b2(parcel.readStrongBinder()), c.a.b2(parcel.readStrongBinder()), c.a.b2(parcel.readStrongBinder()));
                break;
            case 12:
                iInterfaceR5 = D7(c.a.b2(parcel.readStrongBinder()), parcel.readString(), tc.y8(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 13:
                iInterfaceR5 = W1(c.a.b2(parcel.readStrongBinder()), (qw2) kh2.b(parcel, qw2.CREATOR), parcel.readString(), tc.y8(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 14:
                iInterfaceR5 = Y1(c.a.b2(parcel.readStrongBinder()), tc.y8(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 15:
                iInterfaceR5 = Y0(c.a.b2(parcel.readStrongBinder()), tc.y8(parcel.readStrongBinder()), parcel.readInt());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        kh2.c(parcel2, iInterfaceR5);
        return true;
    }
}
