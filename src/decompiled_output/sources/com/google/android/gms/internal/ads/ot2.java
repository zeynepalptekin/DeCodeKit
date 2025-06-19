package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ot2 extends ih2 implements mt2 {
    ot2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
    }

    @Override // com.google.android.gms.internal.ads.mt2
    public final void t4() throws RemoteException {
        e2(1, L0());
    }
}
