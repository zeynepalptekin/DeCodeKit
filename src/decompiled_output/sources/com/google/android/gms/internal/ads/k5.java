package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class k5 extends hh2 implements g5 {
    public k5() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        if (r1 == 1) {
            c1(parcel.readString());
        } else {
            if (r1 != 2) {
                return false;
            }
            z1();
        }
        parcel2.writeNoException();
        return true;
    }
}
