package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gm0 implements pe2<nl0> {

    /* renamed from: a, reason: collision with root package name */
    private final zl0 f3555a;

    private gm0(zl0 zl0Var) {
        this.f3555a = zl0Var;
    }

    public static gm0 a(zl0 zl0Var) {
        return new gm0(zl0Var);
    }

    public static nl0 b(zl0 zl0Var) {
        return (nl0) we2.b(zl0Var.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return b(this.f3555a);
    }
}
