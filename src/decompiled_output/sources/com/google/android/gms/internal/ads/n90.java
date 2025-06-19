package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class n90 implements pe2<ch0<sb0>> {

    /* renamed from: a, reason: collision with root package name */
    private final b90 f4506a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<da0> f4507b;

    private n90(b90 b90Var, ze2<da0> ze2Var) {
        this.f4506a = b90Var;
        this.f4507b = ze2Var;
    }

    public static n90 a(b90 b90Var, ze2<da0> ze2Var) {
        return new n90(b90Var, ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f4507b.get(), cs.f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
