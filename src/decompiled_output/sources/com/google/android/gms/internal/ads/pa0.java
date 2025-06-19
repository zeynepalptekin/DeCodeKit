package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class pa0 implements pe2<an1> {

    /* renamed from: a, reason: collision with root package name */
    private final ia0 f4789a;

    private pa0(ia0 ia0Var) {
        this.f4789a = ia0Var;
    }

    public static pa0 a(ia0 ia0Var) {
        return new pa0(ia0Var);
    }

    public static an1 b(ia0 ia0Var) {
        return (an1) we2.b(ia0Var.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return b(this.f4789a);
    }
}
