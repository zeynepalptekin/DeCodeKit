package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class cf extends hh2 implements df {
    public cf() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        if (r2 == 1) {
            O4(parcel.readString());
        } else if (r2 == 2) {
            S(parcel.readString());
        } else {
            if (r2 != 3) {
                return false;
            }
            g5((dw2) kh2.b(parcel, dw2.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
