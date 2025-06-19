package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class uk0 implements pe2<rl0> {

    /* renamed from: a, reason: collision with root package name */
    private final pk0 f5536a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<ql0> f5537b;

    public uk0(pk0 pk0Var, ze2<ql0> ze2Var) {
        this.f5536a = pk0Var;
        this.f5537b = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (rl0) we2.b(this.f5537b.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
