package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class n4 extends ih2 implements l4 {
    n4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.l4
    public final void j5(y3 y3Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, y3Var);
        e2(1, parcelL0);
    }
}
