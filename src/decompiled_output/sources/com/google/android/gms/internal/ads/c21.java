package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;

/* loaded from: classes.dex */
final class c21 extends oe {
    private w01<ye, p21> e;
    private final /* synthetic */ b21 f;

    private c21(b21 b21Var, w01<ye, p21> w01Var) {
        this.f = b21Var;
        this.e = w01Var;
    }

    @Override // com.google.android.gms.internal.ads.le
    public final void P(dw2 dw2Var) throws RemoteException {
        ((p21) this.e.f5760c).q1(dw2Var);
    }

    @Override // com.google.android.gms.internal.ads.le
    public final void w(String str) throws RemoteException {
        ((p21) this.e.f5760c).l6(0, str);
    }

    @Override // com.google.android.gms.internal.ads.le
    public final void w7(c.a.b.b.e.c cVar) throws RemoteException {
        this.f.f2782c = (View) c.a.b.b.e.e.e2(cVar);
        ((p21) this.e.f5760c).u();
    }
}
