package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public abstract class in extends hh2 implements jn {
    public in() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static jn y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof jn ? (jn) iInterfaceQueryLocalInterface : new ln(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r3, Parcel parcel, Parcel parcel2, int r6) throws RemoteException {
        en gnVar;
        c.a.b.b.e.c cVarN6;
        switch (r3) {
            case 1:
                c.a.b.b.e.c cVarB2 = c.a.b2(parcel.readStrongBinder());
                pn pnVar = (pn) kh2.b(parcel, pn.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    gnVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    gnVar = iInterfaceQueryLocalInterface instanceof en ? (en) iInterfaceQueryLocalInterface : new gn(strongBinder);
                }
                T5(cVarB2, pnVar, gnVar);
                parcel2.writeNoException();
                return true;
            case 2:
                c7(c.a.b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 3:
                cVarN6 = N6(c.a.b2(parcel.readStrongBinder()), c.a.b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                kh2.c(parcel2, cVarN6);
                return true;
            case 4:
                cVarN6 = I1(c.a.b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                kh2.c(parcel2, cVarN6);
                return true;
            case 5:
                g7(parcel.createTypedArrayList(Uri.CREATOR), c.a.b2(parcel.readStrongBinder()), kh.y8(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                a2(parcel.createTypedArrayList(Uri.CREATOR), c.a.b2(parcel.readStrongBinder()), kh.y8(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                L2((th) kh2.b(parcel, th.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
