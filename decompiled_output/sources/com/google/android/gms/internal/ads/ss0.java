package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ss0 implements pe2<ch0<tb0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<zs0> f5297a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f5298b;

    private ss0(ze2<zs0> ze2Var, ze2<Executor> ze2Var2) {
        this.f5297a = ze2Var;
        this.f5298b = ze2Var2;
    }

    public static ss0 a(ze2<zs0> ze2Var, ze2<Executor> ze2Var2) {
        return new ss0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f5297a.get(), this.f5298b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
