package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ac1 implements pe2<ub1<lb1>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<ob1> f2665a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<com.google.android.gms.common.util.g> f2666b;

    public ac1(ze2<ob1> ze2Var, ze2<com.google.android.gms.common.util.g> ze2Var2) {
        this.f2665a = ze2Var;
        this.f2666b = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ub1) we2.b(new ub1(this.f2665a.get(), 10000L, this.f2666b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
