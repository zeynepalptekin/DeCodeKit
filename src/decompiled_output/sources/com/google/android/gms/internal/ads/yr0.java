package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yr0 implements pe2<ch0<sb0>> {

    /* renamed from: a, reason: collision with root package name */
    private final zr0 f6169a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<xr0> f6170b;

    private yr0(zr0 zr0Var, ze2<xr0> ze2Var) {
        this.f6169a = zr0Var;
        this.f6170b = ze2Var;
    }

    public static yr0 a(zr0 zr0Var, ze2<xr0> ze2Var) {
        return new yr0(zr0Var, ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f6170b.get(), cs.e), "Cannot return null from a non-@Nullable @Provides method");
    }
}
