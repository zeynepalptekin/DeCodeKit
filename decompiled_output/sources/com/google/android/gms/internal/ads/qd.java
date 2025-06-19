package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class qd implements com.google.android.gms.ads.mediation.b {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ c8 f4985a;

    qd(md mdVar, c8 c8Var) {
        this.f4985a = c8Var;
    }

    @Override // com.google.android.gms.ads.mediation.b
    public final void f0() {
        try {
            this.f4985a.f0();
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.b
    public final void i1(String str) {
        try {
            this.f4985a.i1(str);
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }
}
