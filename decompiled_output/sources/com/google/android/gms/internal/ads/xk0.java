package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xk0 implements pe2<ch0<tb0>> {

    /* renamed from: a, reason: collision with root package name */
    private final pk0 f5987a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<in0> f5988b;

    public xk0(pk0 pk0Var, ze2<in0> ze2Var) {
        this.f5987a = pk0Var;
        this.f5988b = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f5988b.get(), cs.f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
