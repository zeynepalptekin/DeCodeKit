package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class x70 implements pe2<String> {

    /* renamed from: a, reason: collision with root package name */
    private final v70 f5945a;

    private x70(v70 v70Var) {
        this.f5945a = v70Var;
    }

    public static x70 a(v70 v70Var) {
        return new x70(v70Var);
    }

    public static String b(v70 v70Var) {
        return (String) we2.b(v70Var.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return b(this.f5945a);
    }
}
