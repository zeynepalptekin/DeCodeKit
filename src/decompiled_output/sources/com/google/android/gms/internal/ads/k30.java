package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k30 implements pe2<x20> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<mr2> f4048a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<yb> f4049b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Executor> f4050c;

    private k30(ze2<mr2> ze2Var, ze2<yb> ze2Var2, ze2<Executor> ze2Var3) {
        this.f4048a = ze2Var;
        this.f4049b = ze2Var2;
        this.f4050c = ze2Var3;
    }

    public static k30 a(ze2<mr2> ze2Var, ze2<yb> ze2Var2, ze2<Executor> ze2Var3) {
        return new k30(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        mr2 mr2Var = this.f4048a.get();
        return (x20) we2.b(new x20(mr2Var.a(), this.f4049b.get(), this.f4050c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
