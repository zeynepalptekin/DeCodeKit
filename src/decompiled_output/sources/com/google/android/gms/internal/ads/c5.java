package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class c5 extends ih2 implements a5 {
    c5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.a5
    public final void d4(m5 m5Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, m5Var);
        e2(1, parcelL0);
    }
}
