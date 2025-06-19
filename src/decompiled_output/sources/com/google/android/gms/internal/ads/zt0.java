package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zt0 implements pe2<ch0<od0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<xt0> f6311a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f6312b;

    private zt0(ze2<xt0> ze2Var, ze2<Executor> ze2Var2) {
        this.f6311a = ze2Var;
        this.f6312b = ze2Var2;
    }

    public static zt0 a(ze2<xt0> ze2Var, ze2<Executor> ze2Var2) {
        return new zt0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f6311a.get(), this.f6312b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
