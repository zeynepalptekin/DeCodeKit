package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class u70 implements pe2<km1> {

    /* renamed from: a, reason: collision with root package name */
    private final v70 f5486a;

    private u70(v70 v70Var) {
        this.f5486a = v70Var;
    }

    public static u70 a(v70 v70Var) {
        return new u70(v70Var);
    }

    public static km1 b(v70 v70Var) {
        return (km1) we2.b(v70Var.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return b(this.f5486a);
    }
}
