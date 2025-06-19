package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class i40 extends e70 {
    private final View h;

    @androidx.annotation.i0
    private final rw i;
    private final jm1 j;
    private final int k;
    private final boolean l;
    private final boolean m;

    @androidx.annotation.i0
    private mt2 n;
    private final a40 o;

    i40(d70 d70Var, View view, @androidx.annotation.i0 rw rwVar, jm1 jm1Var, int r5, boolean z, boolean z2, a40 a40Var) {
        super(d70Var);
        this.h = view;
        this.i = rwVar;
        this.j = jm1Var;
        this.k = r5;
        this.l = z;
        this.m = z2;
        this.o = a40Var;
    }

    public final void g(ct2 ct2Var) {
        rw rwVar = this.i;
        if (rwVar != null) {
            rwVar.I(ct2Var);
        }
    }

    public final void h(mt2 mt2Var) {
        this.n = mt2Var;
    }

    public final boolean i() {
        rw rwVar = this.i;
        return (rwVar == null || rwVar.C0() == null || !this.i.C0().e()) ? false : true;
    }

    public final int j() {
        return this.k;
    }

    public final boolean k() {
        return this.l;
    }

    public final boolean l() {
        return this.m;
    }

    public final jm1 m() {
        return gn1.a(this.f3228b.q, this.j);
    }

    public final View n() {
        return this.h;
    }

    public final boolean o() {
        rw rwVar = this.i;
        return rwVar != null && rwVar.Y();
    }

    @androidx.annotation.i0
    public final mt2 p() {
        return this.n;
    }

    public final void q(long j) {
        this.o.a(j);
    }
}
