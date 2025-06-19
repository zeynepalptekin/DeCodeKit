package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class pz0 implements pe2<oz0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<mz0> f4920a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<cy1> f4921b;

    private pz0(ze2<mz0> ze2Var, ze2<cy1> ze2Var2) {
        this.f4920a = ze2Var;
        this.f4921b = ze2Var2;
    }

    public static pz0 a(ze2<mz0> ze2Var, ze2<cy1> ze2Var2) {
        return new pz0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new oz0(this.f4920a.get(), this.f4921b.get());
    }
}
