package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zb1 implements pe2<ub1<jf1>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<mf1> f6246a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<com.google.android.gms.common.util.g> f6247b;

    public zb1(ze2<mf1> ze2Var, ze2<com.google.android.gms.common.util.g> ze2Var2) {
        this.f6246a = ze2Var;
        this.f6247b = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ub1) we2.b(new ub1(this.f6246a.get(), s1.f5214a.a().longValue(), this.f6247b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
