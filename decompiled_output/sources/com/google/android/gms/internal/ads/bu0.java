package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class bu0 implements pe2<ch0<nc0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<xt0> f2877a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f2878b;

    private bu0(ze2<xt0> ze2Var, ze2<Executor> ze2Var2) {
        this.f2877a = ze2Var;
        this.f2878b = ze2Var2;
    }

    public static bu0 a(ze2<xt0> ze2Var, ze2<Executor> ze2Var2) {
        return new bu0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f2877a.get(), this.f2878b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
