package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class jl0 implements pe2<bl0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<d70> f3987a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f3988b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<nl0> f3989c;
    private final ze2<vl0> d;
    private final ze2<km0> e;
    private final ze2<rl0> f;
    private final ze2<ul0> g;
    private final ze2<mp0> h;
    private final ze2<kp0> i;
    private final ze2<tp0> j;
    private final ze2<fp0> k;
    private final ze2<op0> l;
    private final ze2<mm> m;
    private final ze2<i52> n;
    private final ze2<as> o;
    private final ze2<Context> p;
    private final ze2<il0> q;
    private final ze2<n71> r;

    private jl0(ze2<d70> ze2Var, ze2<Executor> ze2Var2, ze2<nl0> ze2Var3, ze2<vl0> ze2Var4, ze2<km0> ze2Var5, ze2<rl0> ze2Var6, ze2<ul0> ze2Var7, ze2<mp0> ze2Var8, ze2<kp0> ze2Var9, ze2<tp0> ze2Var10, ze2<fp0> ze2Var11, ze2<op0> ze2Var12, ze2<mm> ze2Var13, ze2<i52> ze2Var14, ze2<as> ze2Var15, ze2<Context> ze2Var16, ze2<il0> ze2Var17, ze2<n71> ze2Var18) {
        this.f3987a = ze2Var;
        this.f3988b = ze2Var2;
        this.f3989c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
        this.g = ze2Var7;
        this.h = ze2Var8;
        this.i = ze2Var9;
        this.j = ze2Var10;
        this.k = ze2Var11;
        this.l = ze2Var12;
        this.m = ze2Var13;
        this.n = ze2Var14;
        this.o = ze2Var15;
        this.p = ze2Var16;
        this.q = ze2Var17;
        this.r = ze2Var18;
    }

    public static jl0 a(ze2<d70> ze2Var, ze2<Executor> ze2Var2, ze2<nl0> ze2Var3, ze2<vl0> ze2Var4, ze2<km0> ze2Var5, ze2<rl0> ze2Var6, ze2<ul0> ze2Var7, ze2<mp0> ze2Var8, ze2<kp0> ze2Var9, ze2<tp0> ze2Var10, ze2<fp0> ze2Var11, ze2<op0> ze2Var12, ze2<mm> ze2Var13, ze2<i52> ze2Var14, ze2<as> ze2Var15, ze2<Context> ze2Var16, ze2<il0> ze2Var17, ze2<n71> ze2Var18) {
        return new jl0(ze2Var, ze2Var2, ze2Var3, ze2Var4, ze2Var5, ze2Var6, ze2Var7, ze2Var8, ze2Var9, ze2Var10, ze2Var11, ze2Var12, ze2Var13, ze2Var14, ze2Var15, ze2Var16, ze2Var17, ze2Var18);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new bl0(this.f3987a.get(), this.f3988b.get(), this.f3989c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), me2.b(this.h), me2.b(this.i), me2.b(this.j), me2.b(this.k), me2.b(this.l), this.m.get(), this.n.get(), this.o.get(), this.p.get(), this.q.get(), this.r.get());
    }
}
