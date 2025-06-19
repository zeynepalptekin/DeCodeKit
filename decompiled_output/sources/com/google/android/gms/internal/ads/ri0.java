package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ri0 implements pe2<ch0<k7>> {

    /* renamed from: a, reason: collision with root package name */
    private final hi0 f5141a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<oq0> f5142b;

    public ri0(hi0 hi0Var, ze2<oq0> ze2Var) {
        this.f5141a = hi0Var;
        this.f5142b = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f5142b.get(), cs.f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
