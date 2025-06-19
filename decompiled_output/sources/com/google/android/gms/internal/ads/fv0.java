package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class fv0 implements pe2<gv0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<uu0> f3461a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<gz> f3462b;

    private fv0(ze2<uu0> ze2Var, ze2<gz> ze2Var2) {
        this.f3461a = ze2Var;
        this.f3462b = ze2Var2;
    }

    public static fv0 a(ze2<uu0> ze2Var, ze2<gz> ze2Var2) {
        return new fv0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new gv0(this.f3461a.get(), this.f3462b.get());
    }
}
