package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class jo1 implements pe2<qo> {

    /* renamed from: a, reason: collision with root package name */
    private final go1 f4004a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<eo1> f4005b;

    private jo1(go1 go1Var, ze2<eo1> ze2Var) {
        this.f4004a = go1Var;
        this.f4005b = ze2Var;
    }

    public static qo a(go1 go1Var, eo1 eo1Var) {
        return (qo) we2.b(eo1Var.f3300b, "Cannot return null from a non-@Nullable @Provides method");
    }

    public static jo1 b(go1 go1Var, ze2<eo1> ze2Var) {
        return new jo1(go1Var, ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f4004a, this.f4005b.get());
    }
}
