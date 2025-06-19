package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class e1 extends ih2 implements b1 {
    e1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.b1
    public final void V4(w0 w0Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, w0Var);
        e2(1, parcelL0);
    }
}
