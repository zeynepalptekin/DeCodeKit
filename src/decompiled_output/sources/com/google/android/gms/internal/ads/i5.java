package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class i5 extends ih2 implements f5 {
    i5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // com.google.android.gms.internal.ads.f5
    public final boolean p6(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        Parcel parcelB2 = b2(2, parcelL0);
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }
}
