package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class w4 extends ih2 implements x4 {
    w4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
    }

    @Override // com.google.android.gms.internal.ads.x4
    public final void Z4() throws RemoteException {
        e2(2, L0());
    }
}
