package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class sp0 implements pe2<tp0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<String> f5289a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<bl0> f5290b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<nl0> f5291c;

    private sp0(ze2<String> ze2Var, ze2<bl0> ze2Var2, ze2<nl0> ze2Var3) {
        this.f5289a = ze2Var;
        this.f5290b = ze2Var2;
        this.f5291c = ze2Var3;
    }

    public static sp0 a(ze2<String> ze2Var, ze2<bl0> ze2Var2, ze2<nl0> ze2Var3) {
        return new sp0(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new tp0(this.f5289a.get(), this.f5290b.get(), this.f5291c.get());
    }
}
