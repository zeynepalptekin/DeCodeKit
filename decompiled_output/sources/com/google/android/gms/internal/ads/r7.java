package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class r7 extends ih2 implements s7 {
    r7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    @Override // com.google.android.gms.internal.ads.s7
    public final void t5(m7 m7Var, q7 q7Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, m7Var);
        kh2.c(parcelL0, q7Var);
        i2(2, parcelL0);
    }
}
