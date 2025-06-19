package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class d10 implements cm1 {

    /* renamed from: a, reason: collision with root package name */
    private ze2<Context> f3056a;

    /* renamed from: b, reason: collision with root package name */
    private ze2<ik1<tq0, qq0>> f3057b;

    /* renamed from: c, reason: collision with root package name */
    private ze2<qk1> f3058c;
    private ze2<zm1> d;
    private ze2<ql1> e;
    private ze2<em1> f;
    private ze2<String> g;
    private ze2<yl1> h;
    private final /* synthetic */ e00 i;

    private d10(e00 e00Var, Context context, String str) {
        this.i = e00Var;
        pe2 pe2VarA = oe2.a(context);
        this.f3056a = pe2VarA;
        this.f3057b = new ok1(pe2VarA, this.i.c0, this.i.d0);
        this.f3058c = me2.a(new nl1(this.i.c0));
        this.d = me2.a(ym1.a());
        ze2<ql1> ze2VarA = me2.a(new vl1(this.f3056a, this.i.d, this.i.y, this.f3057b, this.f3058c, fn1.a(), this.d));
        this.e = ze2VarA;
        this.f = me2.a(new fm1(ze2VarA, this.f3058c, this.d));
        pe2 pe2VarB = oe2.b(str);
        this.g = pe2VarB;
        this.h = me2.a(new zl1(pe2VarB, this.e, this.f3056a, this.f3058c, this.d));
    }

    @Override // com.google.android.gms.internal.ads.cm1
    public final yl1 a() {
        return this.h.get();
    }

    @Override // com.google.android.gms.internal.ads.cm1
    public final em1 b() {
        return this.f.get();
    }
}
