package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class fl2 implements el2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ dl2 f3417a;

    private fl2(dl2 dl2Var) {
        this.f3417a = dl2Var;
    }

    /* synthetic */ fl2(dl2 dl2Var, gl2 gl2Var) {
        this(dl2Var);
    }

    @Override // com.google.android.gms.internal.ads.el2
    public final void A(int r7, long j, long j2) throws ki2 {
        this.f3417a.r(r7, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.el2
    public final int B(int r1) {
        return dl2.m(r1);
    }

    @Override // com.google.android.gms.internal.ads.el2
    public final boolean C(int r1) {
        return dl2.n(r1);
    }

    @Override // com.google.android.gms.internal.ads.el2
    public final void D(int r2, int r3, pk2 pk2Var) throws InterruptedException, IOException {
        this.f3417a.g(r2, r3, pk2Var);
    }

    @Override // com.google.android.gms.internal.ads.el2
    public final void E(int r2) throws ki2 {
        this.f3417a.o(r2);
    }

    @Override // com.google.android.gms.internal.ads.el2
    public final void l(int r2, long j) throws ki2 {
        this.f3417a.q(r2, j);
    }

    @Override // com.google.android.gms.internal.ads.el2
    public final void t(int r2, String str) throws ki2 {
        this.f3417a.i(r2, str);
    }

    @Override // com.google.android.gms.internal.ads.el2
    public final void z(int r2, double d) throws ki2 {
        this.f3417a.c(r2, d);
    }
}
