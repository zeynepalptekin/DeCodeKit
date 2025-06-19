package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ko1 implements pe2<ho> {

    /* renamed from: a, reason: collision with root package name */
    private final go1 f4127a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<eo1> f4128b;

    private ko1(go1 go1Var, ze2<eo1> ze2Var) {
        this.f4127a = go1Var;
        this.f4128b = ze2Var;
    }

    public static ko1 a(go1 go1Var, ze2<eo1> ze2Var) {
        return new ko1(go1Var, ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ho) we2.b(this.f4128b.get().f3301c, "Cannot return null from a non-@Nullable @Provides method");
    }
}
