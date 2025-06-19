package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class wt0 implements pe2<xt0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<fu0> f5889a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<mu0> f5890b;

    private wt0(ze2<fu0> ze2Var, ze2<mu0> ze2Var2) {
        this.f5889a = ze2Var;
        this.f5890b = ze2Var2;
    }

    public static wt0 a(ze2<fu0> ze2Var, ze2<mu0> ze2Var2) {
        return new wt0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new xt0(this.f5889a.get(), this.f5890b.get());
    }
}
