package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class sj extends ih2 implements qj {
    sj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final int R() throws RemoteException {
        Parcel parcelB2 = b2(2, L0());
        int r1 = parcelB2.readInt();
        parcelB2.recycle();
        return r1;
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final String q() throws RemoteException {
        Parcel parcelB2 = b2(1, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }
}
