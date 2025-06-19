package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public abstract class n3 extends hh2 implements o3 {
    public n3() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static o3 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof o3 ? (o3) iInterfaceQueryLocalInterface : new q3(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        e3 h3Var;
        switch (r1) {
            case 1:
                j6(parcel.readString(), c.a.b2(parcel.readStrongBinder()));
                break;
            case 2:
                c.a.b.b.e.c cVarJ3 = j3(parcel.readString());
                parcel2.writeNoException();
                kh2.c(parcel2, cVarJ3);
                return true;
            case 3:
                o0(c.a.b2(parcel.readStrongBinder()));
                break;
            case 4:
                destroy();
                break;
            case 5:
                o2(c.a.b2(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 6:
                T0(c.a.b2(parcel.readStrongBinder()));
                break;
            case 7:
                r2(c.a.b2(parcel.readStrongBinder()));
                break;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    h3Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    h3Var = iInterfaceQueryLocalInterface instanceof e3 ? (e3) iInterfaceQueryLocalInterface : new h3(strongBinder);
                }
                l4(h3Var);
                break;
            case 9:
                J7(c.a.b2(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
