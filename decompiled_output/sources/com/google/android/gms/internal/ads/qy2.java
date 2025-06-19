package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qy2 extends ih2 implements oy2 {
    qy2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    @Override // com.google.android.gms.internal.ads.oy2
    public final void a0() throws RemoteException {
        e2(1, L0());
    }
}
