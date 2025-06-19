package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class lp0 implements pe2<fp0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<bl0> f4290a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<nl0> f4291b;

    private lp0(ze2<bl0> ze2Var, ze2<nl0> ze2Var2) {
        this.f4290a = ze2Var;
        this.f4291b = ze2Var2;
    }

    public static lp0 a(ze2<bl0> ze2Var, ze2<nl0> ze2Var2) {
        return new lp0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new fp0(this.f4290a.get(), this.f4291b.get());
    }
}
