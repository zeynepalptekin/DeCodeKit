package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class t8 extends hh2 implements q8 {
    public t8() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        if (r2 == 1) {
            U1();
        } else {
            if (r2 != 2) {
                return false;
            }
            x5(parcel.readInt());
        }
        parcel2.writeNoException();
        return true;
    }
}
