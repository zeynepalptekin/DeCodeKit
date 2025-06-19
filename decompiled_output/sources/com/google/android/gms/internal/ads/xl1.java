package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class xl1 extends com.google.android.gms.ads.k0.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ nz2 f5995a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ yl1 f5996b;

    xl1(yl1 yl1Var, nz2 nz2Var) {
        this.f5996b = yl1Var;
        this.f5995a = nz2Var;
    }

    @Override // com.google.android.gms.ads.k0.a
    public final void c() {
        if (this.f5996b.j != null) {
            try {
                this.f5995a.a0();
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
            }
        }
    }
}
