package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class bv0 implements pe2<Set<ch0<zv2>>> {

    /* renamed from: a, reason: collision with root package name */
    private final wu0 f2881a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<gv0> f2882b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Executor> f2883c;

    private bv0(wu0 wu0Var, ze2<gv0> ze2Var, ze2<Executor> ze2Var2) {
        this.f2881a = wu0Var;
        this.f2882b = ze2Var;
        this.f2883c = ze2Var2;
    }

    public static bv0 a(wu0 wu0Var, ze2<gv0> ze2Var, ze2<Executor> ze2Var2) {
        return new bv0(wu0Var, ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(wu0.h(this.f2882b.get(), this.f2883c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
