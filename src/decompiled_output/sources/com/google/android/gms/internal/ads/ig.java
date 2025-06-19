package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ig extends ih2 implements gg {
    ig(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.gg
    public final void U5(Intent intent) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, intent);
        e2(1, parcelL0);
    }
}
