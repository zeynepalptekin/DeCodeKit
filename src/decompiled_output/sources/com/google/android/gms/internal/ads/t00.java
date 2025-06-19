package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class t00 implements fi1 {

    /* renamed from: a, reason: collision with root package name */
    private ze2<Context> f5326a;

    /* renamed from: b, reason: collision with root package name */
    private ze2<String> f5327b;

    /* renamed from: c, reason: collision with root package name */
    private ze2<ik1<d40, i40>> f5328c;
    private ze2<oi1> d;
    private ze2<xh1> e;
    private ze2<zh1> f;
    private ze2<ik1<p40, v40>> g;
    private ze2<yi1> h;
    private ze2<aj1> i;
    private final /* synthetic */ e00 j;

    private t00(e00 e00Var, Context context, String str) {
        this.j = e00Var;
        this.f5326a = oe2.a(context);
        this.f5327b = oe2.a(str);
        this.f5328c = new pk1(this.f5326a, this.j.c0, this.j.d0);
        this.d = me2.a(new zi1(this.j.c0));
        this.e = me2.a(new ai1(this.f5326a, this.j.d, this.j.y, this.f5328c, this.d, fn1.a()));
        this.f = me2.a(new gi1(this.j.y, this.f5326a, this.f5327b, this.e, this.d, this.j.l));
        this.g = new lk1(this.f5326a, this.j.c0, this.j.d0);
        this.h = me2.a(new bj1(this.f5326a, this.j.d, this.j.y, this.g, this.d, fn1.a()));
        this.i = me2.a(new hj1(this.j.y, this.f5326a, this.f5327b, this.h, this.d));
    }

    @Override // com.google.android.gms.internal.ads.fi1
    public final zh1 a() {
        return this.f.get();
    }

    @Override // com.google.android.gms.internal.ads.fi1
    public final aj1 b() {
        return this.i.get();
    }
}
