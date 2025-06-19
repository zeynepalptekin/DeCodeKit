package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public abstract class u3 extends hh2 implements r3 {
    public u3() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static r3 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return iInterfaceQueryLocalInterface instanceof r3 ? (r3) iInterfaceQueryLocalInterface : new t3(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        if (r2 == 1) {
            o0(c.a.b2(parcel.readStrongBinder()));
        } else if (r2 == 2) {
            l5();
        } else {
            if (r2 != 3) {
                return false;
            }
            T0(c.a.b2(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
