package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bo1 implements pe2<ch0<cb0>> {

    /* renamed from: a, reason: collision with root package name */
    private final yn1 f2861a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<ao1> f2862b;

    private bo1(yn1 yn1Var, ze2<ao1> ze2Var) {
        this.f2861a = yn1Var;
        this.f2862b = ze2Var;
    }

    public static bo1 a(yn1 yn1Var, ze2<ao1> ze2Var) {
        return new bo1(yn1Var, ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f2862b.get(), cs.f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
