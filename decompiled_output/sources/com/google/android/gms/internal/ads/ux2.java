package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ux2 extends ih2 implements sx2 {
    ux2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.sx2
    public final void p() throws RemoteException {
        e2(1, L0());
    }
}
