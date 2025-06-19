package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class cw extends sv {
    public cw(zt ztVar) {
        super(ztVar);
    }

    @Override // com.google.android.gms.internal.ads.sv
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.sv
    public final boolean w(String str) {
        zt ztVar = this.f.get();
        if (ztVar != null) {
            ztVar.f(x(str), this);
        }
        tr.i("VideoStreamNoopCache is doing nothing.");
        o(str, x(str), "noop", "Noop cache is a noop.");
        return false;
    }
}
