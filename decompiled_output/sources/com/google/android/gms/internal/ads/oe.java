package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public abstract class oe extends hh2 implements le {
    public oe() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        if (r2 == 1) {
            w7(c.a.b2(parcel.readStrongBinder()));
        } else if (r2 == 2) {
            w(parcel.readString());
        } else {
            if (r2 != 3) {
                return false;
            }
            P((dw2) kh2.b(parcel, dw2.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
