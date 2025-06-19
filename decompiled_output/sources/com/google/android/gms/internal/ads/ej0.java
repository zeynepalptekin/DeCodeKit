package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ej0 implements pe2<fj0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<wc0> f3280a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<wg0> f3281b;

    private ej0(ze2<wc0> ze2Var, ze2<wg0> ze2Var2) {
        this.f3280a = ze2Var;
        this.f3281b = ze2Var2;
    }

    public static ej0 a(ze2<wc0> ze2Var, ze2<wg0> ze2Var2) {
        return new ej0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new fj0(this.f3280a.get(), this.f3281b.get());
    }
}
