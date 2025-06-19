package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class e extends mz2 {
    private final com.google.android.gms.ads.l0.a e;

    public e(com.google.android.gms.ads.l0.a aVar) {
        this.e = aVar;
    }

    @Override // com.google.android.gms.internal.ads.nz2
    public final void a0() throws RemoteException {
        com.google.android.gms.ads.l0.a aVar = this.e;
        if (aVar != null) {
            aVar.a0();
        }
    }
}
