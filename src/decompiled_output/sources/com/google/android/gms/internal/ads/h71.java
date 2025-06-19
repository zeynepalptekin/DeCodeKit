package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class h71 extends cy2 {
    private final Context e;
    private final gz f;

    @com.google.android.gms.common.util.d0
    private final cn1 g = new cn1();

    @com.google.android.gms.common.util.d0
    private final wl0 h = new wl0();
    private xx2 i;

    public h71(gz gzVar, Context context, String str) {
        this.f = gzVar;
        this.g.z(str);
        this.e = context;
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void B3(m4 m4Var) {
        this.h.d(m4Var);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final yx2 C4() {
        ul0 ul0VarB = this.h.b();
        this.g.q(ul0VarB.f());
        this.g.s(ul0VarB.g());
        cn1 cn1Var = this.g;
        if (cn1Var.F() == null) {
            cn1Var.u(qw2.l());
        }
        return new k71(this.e, this.f, this.g, ul0VarB, this.i);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void D4(com.google.android.gms.ads.d0.m mVar) {
        this.g.g(mVar);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void F2(n8 n8Var) {
        this.g.i(n8Var);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void J1(v8 v8Var) {
        this.h.f(v8Var);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void P2(String str, s4 s4Var, r4 r4Var) {
        this.h.g(str, s4Var, r4Var);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void Q3(z2 z2Var) {
        this.g.h(z2Var);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void W2(z4 z4Var, qw2 qw2Var) {
        this.h.a(z4Var);
        this.g.u(qw2Var);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void c3(xx2 xx2Var) {
        this.i = xx2Var;
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void n5(l4 l4Var) {
        this.h.c(l4Var);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void q6(vy2 vy2Var) {
        this.g.p(vy2Var);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void u2(a5 a5Var) {
        this.h.e(a5Var);
    }
}
