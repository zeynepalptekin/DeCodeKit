package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public class y41 extends b61 {
    private mh0 n;

    public y41(wa0 wa0Var, ob0 ob0Var, cc0 cc0Var, mc0 mc0Var, eb0 eb0Var, df0 df0Var, vh0 vh0Var, wc0 wc0Var, mh0 mh0Var, ve0 ve0Var) {
        super(wa0Var, ob0Var, cc0Var, mc0Var, df0Var, wc0Var, vh0Var, ve0Var, eb0Var);
        this.n = mh0Var;
    }

    @Override // com.google.android.gms.internal.ads.b61, com.google.android.gms.internal.ads.wc
    public final void D1() {
        this.n.M();
    }

    @Override // com.google.android.gms.internal.ads.b61, com.google.android.gms.internal.ads.wc
    public final void J0(sk skVar) throws RemoteException {
        super.J0(skVar);
        this.n.j0(new qk(skVar.q(), skVar.R()));
    }

    @Override // com.google.android.gms.internal.ads.b61, com.google.android.gms.internal.ads.wc
    public final void U3(qk qkVar) {
        super.U3(qkVar);
        this.n.j0(qkVar);
    }

    @Override // com.google.android.gms.internal.ads.b61, com.google.android.gms.internal.ads.wc
    public final void n7() {
        this.n.c0();
    }

    @Override // com.google.android.gms.internal.ads.b61, com.google.android.gms.internal.ads.wc
    public final void y5() throws RemoteException {
        this.n.M();
    }
}
