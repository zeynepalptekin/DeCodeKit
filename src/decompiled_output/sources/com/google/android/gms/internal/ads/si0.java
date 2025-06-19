package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class si0 implements pe2<ch0<com.google.android.gms.ads.internal.overlay.p>> {

    /* renamed from: a, reason: collision with root package name */
    private final hi0 f5262a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<rj0> f5263b;

    private si0(hi0 hi0Var, ze2<rj0> ze2Var) {
        this.f5262a = hi0Var;
        this.f5263b = ze2Var;
    }

    public static si0 a(hi0 hi0Var, ze2<rj0> ze2Var) {
        return new si0(hi0Var, ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f5263b.get(), cs.e), "Cannot return null from a non-@Nullable @Provides method");
    }
}
