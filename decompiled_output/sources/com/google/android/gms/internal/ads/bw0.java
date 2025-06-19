package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bw0 implements pe2<xv0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cy1> f2888a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<cy1> f2889b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<jx0> f2890c;
    private final ze2<my0> d;

    private bw0(ze2<cy1> ze2Var, ze2<cy1> ze2Var2, ze2<jx0> ze2Var3, ze2<my0> ze2Var4) {
        this.f2888a = ze2Var;
        this.f2889b = ze2Var2;
        this.f2890c = ze2Var3;
        this.d = ze2Var4;
    }

    public static bw0 a(ze2<cy1> ze2Var, ze2<cy1> ze2Var2, ze2<jx0> ze2Var3, ze2<my0> ze2Var4) {
        return new bw0(ze2Var, ze2Var2, ze2Var3, ze2Var4);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new xv0(this.f2888a.get(), this.f2889b.get(), this.f2890c.get(), me2.b(this.d));
    }
}
