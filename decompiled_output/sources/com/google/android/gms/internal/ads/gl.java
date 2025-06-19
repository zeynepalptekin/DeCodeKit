package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class gl extends ih2 implements hl {
    gl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    @Override // com.google.android.gms.internal.ads.hl
    public final void Y6(sk skVar, String str, String str2) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, skVar);
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        e2(2, parcelL0);
    }
}
