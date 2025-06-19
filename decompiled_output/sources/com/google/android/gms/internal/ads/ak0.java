package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ak0 implements pe2<ul0> {

    /* renamed from: a, reason: collision with root package name */
    private final zj0 f2700a;

    private ak0(zj0 zj0Var) {
        this.f2700a = zj0Var;
    }

    public static ak0 a(zj0 zj0Var) {
        return new ak0(zj0Var);
    }

    public static ul0 b(zj0 zj0Var) {
        return (ul0) we2.b(zj0Var.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return b(this.f2700a);
    }
}
