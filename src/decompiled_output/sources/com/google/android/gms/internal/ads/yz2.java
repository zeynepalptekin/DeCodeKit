package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class yz2 extends hh2 implements zz2 {
    public yz2() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        if (r2 == 1) {
            O0();
        } else if (r2 == 2) {
            j0();
        } else if (r2 == 3) {
            g0();
        } else if (r2 == 4) {
            D1();
        } else {
            if (r2 != 5) {
                return false;
            }
            c2(kh2.e(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
