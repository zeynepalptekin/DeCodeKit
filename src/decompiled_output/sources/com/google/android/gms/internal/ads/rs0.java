package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class rs0 implements pe2<ch0<mf0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<zs0> f5182a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f5183b;

    private rs0(ze2<zs0> ze2Var, ze2<Executor> ze2Var2) {
        this.f5182a = ze2Var;
        this.f5183b = ze2Var2;
    }

    public static rs0 a(ze2<zs0> ze2Var, ze2<Executor> ze2Var2) {
        return new rs0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f5182a.get(), this.f5183b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
