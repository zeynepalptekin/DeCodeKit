package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class kn1 implements pe2<hn1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<i01> f4120a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<nr1> f4121b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<km1> f4122c;
    private final ze2<lm1> d;

    private kn1(ze2<i01> ze2Var, ze2<nr1> ze2Var2, ze2<km1> ze2Var3, ze2<lm1> ze2Var4) {
        this.f4120a = ze2Var;
        this.f4121b = ze2Var2;
        this.f4122c = ze2Var3;
        this.d = ze2Var4;
    }

    public static kn1 a(ze2<i01> ze2Var, ze2<nr1> ze2Var2, ze2<km1> ze2Var3, ze2<lm1> ze2Var4) {
        return new kn1(ze2Var, ze2Var2, ze2Var3, ze2Var4);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new hn1(this.f4120a.get(), this.f4121b.get(), this.f4122c.get(), this.d.get());
    }
}
