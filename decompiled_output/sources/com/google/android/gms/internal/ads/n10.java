package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class n10 implements pe2<gc> {

    /* renamed from: a, reason: collision with root package name */
    private final i10 f4472a;

    public n10(i10 i10Var) {
        this.f4472a = i10Var;
    }

    public static gc a(i10 i10Var) {
        return (gc) we2.b(i10Var.c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f4472a);
    }
}
