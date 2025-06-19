package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class t31 extends ve {
    private w01<ye, p21> e;
    private final /* synthetic */ r31 f;

    private t31(r31 r31Var, w01<ye, p21> w01Var) {
        this.f = r31Var;
        this.e = w01Var;
    }

    @Override // com.google.android.gms.internal.ads.se
    public final void P(dw2 dw2Var) throws RemoteException {
        ((p21) this.e.f5760c).q1(dw2Var);
    }

    @Override // com.google.android.gms.internal.ads.se
    public final void f8(jd jdVar) throws RemoteException {
        this.f.f5098c = jdVar;
        ((p21) this.e.f5760c).u();
    }

    @Override // com.google.android.gms.internal.ads.se
    public final void w(String str) throws RemoteException {
        ((p21) this.e.f5760c).l6(0, str);
    }
}
