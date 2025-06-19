package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class np0 implements pe2<kp0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<String> f4584a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<bl0> f4585b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<nl0> f4586c;

    private np0(ze2<String> ze2Var, ze2<bl0> ze2Var2, ze2<nl0> ze2Var3) {
        this.f4584a = ze2Var;
        this.f4585b = ze2Var2;
        this.f4586c = ze2Var3;
    }

    public static np0 a(ze2<String> ze2Var, ze2<bl0> ze2Var2, ze2<nl0> ze2Var3) {
        return new np0(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new kp0(this.f4584a.get(), this.f4585b.get(), this.f4586c.get());
    }
}
