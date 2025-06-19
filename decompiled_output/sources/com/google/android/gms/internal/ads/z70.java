package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class z70 implements pe2<wm1> {

    /* renamed from: a, reason: collision with root package name */
    private final v70 f6230a;

    private z70(v70 v70Var) {
        this.f6230a = v70Var;
    }

    public static z70 a(v70 v70Var) {
        return new z70(v70Var);
    }

    public static wm1 b(v70 v70Var) {
        return (wm1) we2.b(v70Var.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return b(this.f6230a);
    }
}
