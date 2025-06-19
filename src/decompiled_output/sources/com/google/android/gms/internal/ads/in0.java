package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class in0 implements tb0 {
    private final nl0 d;
    private final rl0 e;

    public in0(nl0 nl0Var, rl0 rl0Var) {
        this.d = nl0Var;
        this.e = rl0Var;
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final void U() {
        if (this.d.H() == null) {
            return;
        }
        rw rwVarG = this.d.G();
        rw rwVarF = this.d.F();
        if (rwVarG == null) {
            rwVarG = rwVarF != null ? rwVarF : null;
        }
        if (!this.e.a() || rwVarG == null) {
            return;
        }
        rwVarG.M("onSdkImpression", new b.f.a());
    }
}
