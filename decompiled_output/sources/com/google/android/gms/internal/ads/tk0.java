package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tk0 implements pe2<vl0> {

    /* renamed from: a, reason: collision with root package name */
    private final pk0 f5413a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<mk0> f5414b;

    public tk0(pk0 pk0Var, ze2<mk0> ze2Var) {
        this.f5413a = pk0Var;
        this.f5414b = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (vl0) we2.b(this.f5414b.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
