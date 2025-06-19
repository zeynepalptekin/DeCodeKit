package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class gm1 extends com.google.android.gms.ads.k0.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ oy2 f3556a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ em1 f3557b;

    gm1(em1 em1Var, oy2 oy2Var) {
        this.f3557b = em1Var;
        this.f3556a = oy2Var;
    }

    @Override // com.google.android.gms.ads.k0.a
    public final void c() {
        if (this.f3557b.h != null) {
            try {
                this.f3556a.a0();
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
            }
        }
    }
}
