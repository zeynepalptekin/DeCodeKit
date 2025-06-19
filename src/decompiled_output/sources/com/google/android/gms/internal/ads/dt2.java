package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class dt2 extends pt2 {
    private final com.google.android.gms.ads.k e;

    public dt2(com.google.android.gms.ads.k kVar) {
        this.e = kVar;
    }

    @Override // com.google.android.gms.internal.ads.qt2
    public final void J5() throws RemoteException {
        this.e.c();
    }

    @Override // com.google.android.gms.internal.ads.qt2
    public final void h8(dw2 dw2Var) throws RemoteException {
        this.e.b(dw2Var.h());
    }

    @Override // com.google.android.gms.internal.ads.qt2
    public final void o7() throws RemoteException {
        this.e.a();
    }
}
