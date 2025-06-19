package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class om0 implements pe2<km0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<qo> f4714a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<an1> f4715b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<rl0> f4716c;
    private final ze2<nl0> d;
    private final ze2<sm0> e;
    private final ze2<an0> f;
    private final ze2<Executor> g;
    private final ze2<Executor> h;
    private final ze2<il0> i;

    private om0(ze2<qo> ze2Var, ze2<an1> ze2Var2, ze2<rl0> ze2Var3, ze2<nl0> ze2Var4, ze2<sm0> ze2Var5, ze2<an0> ze2Var6, ze2<Executor> ze2Var7, ze2<Executor> ze2Var8, ze2<il0> ze2Var9) {
        this.f4714a = ze2Var;
        this.f4715b = ze2Var2;
        this.f4716c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
        this.g = ze2Var7;
        this.h = ze2Var8;
        this.i = ze2Var9;
    }

    public static om0 a(ze2<qo> ze2Var, ze2<an1> ze2Var2, ze2<rl0> ze2Var3, ze2<nl0> ze2Var4, ze2<sm0> ze2Var5, ze2<an0> ze2Var6, ze2<Executor> ze2Var7, ze2<Executor> ze2Var8, ze2<il0> ze2Var9) {
        return new om0(ze2Var, ze2Var2, ze2Var3, ze2Var4, ze2Var5, ze2Var6, ze2Var7, ze2Var8, ze2Var9);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new km0(this.f4714a.get(), this.f4715b.get(), this.f4716c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
