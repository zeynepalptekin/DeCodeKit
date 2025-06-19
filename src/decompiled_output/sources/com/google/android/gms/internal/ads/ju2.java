package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ju2 extends ih2 implements gu2 {
    ju2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    @Override // com.google.android.gms.internal.ads.gu2
    public final zt2 A5(fu2 fu2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, fu2Var);
        Parcel parcelB2 = b2(1, parcelL0);
        zt2 zt2Var = (zt2) kh2.b(parcelB2, zt2.CREATOR);
        parcelB2.recycle();
        return zt2Var;
    }
}
