package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public abstract class i3 extends hh2 implements e3 {
    public i3() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    public static e3 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
        return iInterfaceQueryLocalInterface instanceof e3 ? (e3) iInterfaceQueryLocalInterface : new h3(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        float fD0;
        IInterface iInterfaceU7;
        x4 w4Var;
        switch (r1) {
            case 2:
                fD0 = d0();
                parcel2.writeNoException();
                parcel2.writeFloat(fD0);
                return true;
            case 3:
                w3(c.a.b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                iInterfaceU7 = U7();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceU7);
                return true;
            case 5:
                fD0 = M();
                parcel2.writeNoException();
                parcel2.writeFloat(fD0);
                return true;
            case 6:
                fD0 = X();
                parcel2.writeNoException();
                parcel2.writeFloat(fD0);
                return true;
            case 7:
                iInterfaceU7 = getVideoController();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceU7);
                return true;
            case 8:
                boolean zF1 = f1();
                parcel2.writeNoException();
                kh2.a(parcel2, zF1);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    w4Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    w4Var = iInterfaceQueryLocalInterface instanceof x4 ? (x4) iInterfaceQueryLocalInterface : new w4(strongBinder);
                }
                v7(w4Var);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
