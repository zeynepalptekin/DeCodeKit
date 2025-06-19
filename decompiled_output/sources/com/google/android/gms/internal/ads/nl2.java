package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class nl2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4565a;

    /* renamed from: b, reason: collision with root package name */
    public int f4566b;

    /* renamed from: c, reason: collision with root package name */
    public int f4567c;
    public long d;
    private final boolean e;
    private final hq2 f;
    private final hq2 g;
    private int h;
    private int i;

    public nl2(hq2 hq2Var, hq2 hq2Var2, boolean z) {
        this.g = hq2Var;
        this.f = hq2Var2;
        this.e = z;
        hq2Var2.l(12);
        this.f4565a = hq2Var2.v();
        hq2Var.l(12);
        this.i = hq2Var.v();
        vp2.f(hq2Var.d() == 1, "first_chunk must be 1");
        this.f4566b = -1;
    }

    public final boolean a() {
        int r0 = this.f4566b + 1;
        this.f4566b = r0;
        if (r0 == this.f4565a) {
            return false;
        }
        this.d = this.e ? this.f.w() : this.f.s();
        if (this.f4566b == this.h) {
            this.f4567c = this.g.v();
            this.g.m(4);
            int r02 = this.i - 1;
            this.i = r02;
            this.h = r02 > 0 ? this.g.v() - 1 : -1;
        }
        return true;
    }
}
