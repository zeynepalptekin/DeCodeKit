package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class hn extends hh2 implements en {
    public hn() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r3, Parcel parcel, Parcel parcel2, int r6) throws RemoteException {
        if (r3 == 1) {
            X7(parcel.readString(), parcel.readString());
        } else if (r3 == 2) {
            u1(parcel.readString());
        } else {
            if (r3 != 3) {
                return false;
            }
            v1(parcel.readString(), parcel.readString(), (Bundle) kh2.b(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
