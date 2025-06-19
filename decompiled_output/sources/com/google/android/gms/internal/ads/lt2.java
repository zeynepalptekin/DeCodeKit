package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class lt2 extends hh2 implements mt2 {
    public lt2() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        if (r1 != 1) {
            return false;
        }
        t4();
        parcel2.writeNoException();
        return true;
    }
}
