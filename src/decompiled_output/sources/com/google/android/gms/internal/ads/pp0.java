package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class pp0 implements pe2<mp0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<String> f4858a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<bl0> f4859b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<nl0> f4860c;

    private pp0(ze2<String> ze2Var, ze2<bl0> ze2Var2, ze2<nl0> ze2Var3) {
        this.f4858a = ze2Var;
        this.f4859b = ze2Var2;
        this.f4860c = ze2Var3;
    }

    public static pp0 a(ze2<String> ze2Var, ze2<bl0> ze2Var2, ze2<nl0> ze2Var3) {
        return new pp0(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new mp0(this.f4858a.get(), this.f4859b.get(), this.f4860c.get());
    }
}
