package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gt0 implements pe2<zs0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<tu2> f3579a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<rk1> f3580b;

    private gt0(ze2<tu2> ze2Var, ze2<rk1> ze2Var2) {
        this.f3579a = ze2Var;
        this.f3580b = ze2Var2;
    }

    public static gt0 a(ze2<tu2> ze2Var, ze2<rk1> ze2Var2) {
        return new gt0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new zs0(this.f3579a.get(), this.f3580b.get());
    }
}
