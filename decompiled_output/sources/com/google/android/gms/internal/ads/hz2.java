package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class hz2 extends ih2 implements ez2 {
    hz2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    @Override // com.google.android.gms.internal.ads.ez2
    public final void e1() throws RemoteException {
        e2(1, L0());
    }
}
