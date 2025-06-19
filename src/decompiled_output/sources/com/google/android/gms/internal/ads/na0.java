package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class na0 implements pe2<String> {

    /* renamed from: a, reason: collision with root package name */
    private final ia0 f4513a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<s80> f4514b;

    private na0(ia0 ia0Var, ze2<s80> ze2Var) {
        this.f4513a = ia0Var;
        this.f4514b = ze2Var;
    }

    public static String a(ia0 ia0Var, s80 s80Var) {
        return (String) we2.b(s80Var.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static na0 b(ia0 ia0Var, ze2<s80> ze2Var) {
        return new na0(ia0Var, ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f4513a, this.f4514b.get());
    }
}
