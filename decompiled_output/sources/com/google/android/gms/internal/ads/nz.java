package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class nz implements pe2<v01<rn1, p21>> {

    /* renamed from: a, reason: collision with root package name */
    private final jz f4617a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<fs0> f4618b;

    public nz(jz jzVar, ze2<fs0> ze2Var) {
        this.f4617a = jzVar;
        this.f4618b = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (v01) we2.b(new i31(this.f4618b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
