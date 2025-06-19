package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class k extends e5 {
    private final com.google.android.gms.ads.d0.n e;

    public k(com.google.android.gms.ads.d0.n nVar) {
        this.e = nVar;
    }

    @Override // com.google.android.gms.internal.ads.f5
    public final boolean p6(c.a.b.b.e.c cVar) throws RemoteException {
        return this.e.shouldDelayBannerRendering((Runnable) c.a.b.b.e.e.e2(cVar));
    }
}
