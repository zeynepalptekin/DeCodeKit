package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class vj extends ih2 implements wj {
    vj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    @Override // com.google.android.gms.internal.ads.wj
    public final void W7(qj qjVar, String str, String str2) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, qjVar);
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        e2(2, parcelL0);
    }
}
