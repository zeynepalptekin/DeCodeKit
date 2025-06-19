package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class si extends hh2 implements pi {
    public si() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        if (r2 == 1) {
            k2((ParcelFileDescriptor) kh2.b(parcel, ParcelFileDescriptor.CREATOR));
        } else {
            if (r2 != 2) {
                return false;
            }
            R6((yp) kh2.b(parcel, yp.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
