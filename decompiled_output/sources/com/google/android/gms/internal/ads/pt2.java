package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class pt2 extends hh2 implements qt2 {
    public pt2() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        if (r2 == 1) {
            J5();
        } else if (r2 == 2) {
            o7();
        } else {
            if (r2 != 3) {
                return false;
            }
            h8((dw2) kh2.b(parcel, dw2.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
