package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class rl2 implements ql2 {

    /* renamed from: a, reason: collision with root package name */
    private final hq2 f5156a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5157b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5158c;
    private int d;
    private int e;

    public rl2(ll2 ll2Var) {
        hq2 hq2Var = ll2Var.Q0;
        this.f5156a = hq2Var;
        hq2Var.l(12);
        this.f5158c = this.f5156a.v() & 255;
        this.f5157b = this.f5156a.v();
    }

    @Override // com.google.android.gms.internal.ads.ql2
    public final int a() {
        int r0 = this.f5158c;
        if (r0 == 8) {
            return this.f5156a.g();
        }
        if (r0 == 16) {
            return this.f5156a.h();
        }
        int r02 = this.d;
        this.d = r02 + 1;
        if (r02 % 2 != 0) {
            return this.e & 15;
        }
        int r03 = this.f5156a.g();
        this.e = r03;
        return (r03 & 240) >> 4;
    }

    @Override // com.google.android.gms.internal.ads.ql2
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ql2
    public final int c() {
        return this.f5157b;
    }
}
