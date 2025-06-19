package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class o4 extends ih2 implements m4 {
    o4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.m4
    public final void e8(c4 c4Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, c4Var);
        e2(1, parcelL0);
    }
}
