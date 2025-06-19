package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bk0 implements pe2<zj0> {

    /* renamed from: a, reason: collision with root package name */
    private final zj0 f2841a;

    private bk0(zj0 zj0Var) {
        this.f2841a = zj0Var;
    }

    public static bk0 a(zj0 zj0Var) {
        return new bk0(zj0Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        zj0 zj0Var = this.f2841a;
        if (zj0Var != null) {
            return (zj0) we2.b(zj0Var, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw null;
    }
}
