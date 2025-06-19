package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class n50 implements pe2<b70> {

    /* renamed from: a, reason: collision with root package name */
    private final h50 f4492a;

    public n50(h50 h50Var) {
        this.f4492a = h50Var;
    }

    public static b70 a(h50 h50Var) {
        return (b70) we2.b(h50Var.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f4492a);
    }
}
