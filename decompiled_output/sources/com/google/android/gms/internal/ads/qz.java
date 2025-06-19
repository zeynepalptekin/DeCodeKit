package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qz implements pe2<v01<rn1, o21>> {

    /* renamed from: a, reason: collision with root package name */
    private final jz f5074a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<fs0> f5075b;

    public qz(jz jzVar, ze2<fs0> ze2Var) {
        this.f5074a = jzVar;
        this.f5075b = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (v01) we2.b(new a51(this.f5075b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
