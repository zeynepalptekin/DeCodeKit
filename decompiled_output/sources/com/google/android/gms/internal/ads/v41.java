package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class v41 extends we {
    private w01<ye, p21> e;

    private v41(t41 t41Var, w01<ye, p21> w01Var) {
        this.e = w01Var;
    }

    @Override // com.google.android.gms.internal.ads.xe
    public final void P(dw2 dw2Var) throws RemoteException {
        ((p21) this.e.f5760c).q1(dw2Var);
    }

    @Override // com.google.android.gms.internal.ads.xe
    public final void w(String str) throws RemoteException {
        ((p21) this.e.f5760c).l6(0, str);
    }

    @Override // com.google.android.gms.internal.ads.xe
    public final void w1() throws RemoteException {
        ((p21) this.e.f5760c).u();
    }
}
