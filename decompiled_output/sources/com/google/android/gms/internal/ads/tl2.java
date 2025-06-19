package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class tl2 implements ql2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f5418a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5419b;

    /* renamed from: c, reason: collision with root package name */
    private final hq2 f5420c;

    public tl2(ll2 ll2Var) {
        hq2 hq2Var = ll2Var.Q0;
        this.f5420c = hq2Var;
        hq2Var.l(12);
        this.f5418a = this.f5420c.v();
        this.f5419b = this.f5420c.v();
    }

    @Override // com.google.android.gms.internal.ads.ql2
    public final int a() {
        int r0 = this.f5418a;
        return r0 == 0 ? this.f5420c.v() : r0;
    }

    @Override // com.google.android.gms.internal.ads.ql2
    public final boolean b() {
        return this.f5418a != 0;
    }

    @Override // com.google.android.gms.internal.ads.ql2
    public final int c() {
        return this.f5419b;
    }
}
