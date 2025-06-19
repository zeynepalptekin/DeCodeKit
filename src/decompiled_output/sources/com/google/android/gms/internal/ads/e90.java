package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e90 implements pe2<ch0<zv2>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<rd0> f3236a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f3237b;

    private e90(ze2<rd0> ze2Var, ze2<Executor> ze2Var2) {
        this.f3236a = ze2Var;
        this.f3237b = ze2Var2;
    }

    public static e90 a(ze2<rd0> ze2Var, ze2<Executor> ze2Var2) {
        return new e90(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f3236a.get(), this.f3237b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
