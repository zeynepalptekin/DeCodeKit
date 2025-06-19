package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class pi0 implements pe2<ch0<nc0>> {

    /* renamed from: a, reason: collision with root package name */
    private final hi0 f4819a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<rj0> f4820b;

    private pi0(hi0 hi0Var, ze2<rj0> ze2Var) {
        this.f4819a = hi0Var;
        this.f4820b = ze2Var;
    }

    public static pi0 a(hi0 hi0Var, ze2<rj0> ze2Var) {
        return new pi0(hi0Var, ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f4820b.get(), cs.e), "Cannot return null from a non-@Nullable @Provides method");
    }
}
