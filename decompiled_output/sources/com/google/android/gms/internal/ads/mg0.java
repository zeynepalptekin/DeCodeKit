package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class mg0 implements pe2<g41> {

    /* renamed from: a, reason: collision with root package name */
    private final qf0 f4409a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<com.google.android.gms.common.util.g> f4410b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<i41> f4411c;
    private final ze2<x01> d;

    private mg0(qf0 qf0Var, ze2<com.google.android.gms.common.util.g> ze2Var, ze2<i41> ze2Var2, ze2<x01> ze2Var3) {
        this.f4409a = qf0Var;
        this.f4410b = ze2Var;
        this.f4411c = ze2Var2;
        this.d = ze2Var3;
    }

    public static mg0 a(qf0 qf0Var, ze2<com.google.android.gms.common.util.g> ze2Var, ze2<i41> ze2Var2, ze2<x01> ze2Var3) {
        return new mg0(qf0Var, ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (g41) we2.b(this.f4409a.a(this.f4410b.get(), this.f4411c.get(), this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
