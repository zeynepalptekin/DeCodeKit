package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public abstract class z0 extends hh2 implements w0 {
    public z0() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        String strU3;
        if (r2 == 1) {
            strU3 = u3();
        } else {
            if (r2 != 2) {
                if (r2 == 3) {
                    W4(c.a.b2(parcel.readStrongBinder()));
                } else if (r2 == 4) {
                    g1();
                } else {
                    if (r2 != 5) {
                        return false;
                    }
                    g();
                }
                parcel2.writeNoException();
                return true;
            }
            strU3 = G1();
        }
        parcel2.writeNoException();
        parcel2.writeString(strU3);
        return true;
    }
}
