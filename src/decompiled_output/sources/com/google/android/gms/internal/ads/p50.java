package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class p50 implements pe2<jm1> {

    /* renamed from: a, reason: collision with root package name */
    private final h50 f4783a;

    public p50(h50 h50Var) {
        this.f4783a = h50Var;
    }

    public static jm1 a(h50 h50Var) {
        return (jm1) we2.b(h50Var.e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f4783a);
    }
}
