package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class pn0 implements pe2<vl0> {

    /* renamed from: a, reason: collision with root package name */
    private final mn0 f4841a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<kn0> f4842b;

    public pn0(mn0 mn0Var, ze2<kn0> ze2Var) {
        this.f4841a = mn0Var;
        this.f4842b = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (vl0) we2.b(this.f4842b.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
