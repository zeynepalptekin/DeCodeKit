package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class k71 extends by2 {
    private final c81 e;

    public k71(Context context, gz gzVar, cn1 cn1Var, ul0 ul0Var, xx2 xx2Var) {
        e81 e81Var = new e81(ul0Var);
        e81Var.h(xx2Var);
        this.e = new c81(new k81(gzVar, context, e81Var, cn1Var), cn1Var.c());
    }

    @Override // com.google.android.gms.internal.ads.yx2
    public final void I3(jw2 jw2Var) throws RemoteException {
        this.e.d(jw2Var, 1);
    }

    @Override // com.google.android.gms.internal.ads.yx2
    public final synchronized String R0() {
        return this.e.f();
    }

    @Override // com.google.android.gms.internal.ads.yx2
    public final synchronized boolean Y() throws RemoteException {
        return this.e.b();
    }

    @Override // com.google.android.gms.internal.ads.yx2
    public final synchronized String e() {
        return this.e.a();
    }

    @Override // com.google.android.gms.internal.ads.yx2
    public final synchronized void s6(jw2 jw2Var, int r3) throws RemoteException {
        this.e.d(jw2Var, r3);
    }
}
