package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class aa0 implements pe2<gd0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<gd0> f2657a;

    private aa0(ze2<gd0> ze2Var) {
        this.f2657a = ze2Var;
    }

    public static aa0 a(ze2<gd0> ze2Var) {
        return new aa0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (gd0) we2.b(this.f2657a.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
