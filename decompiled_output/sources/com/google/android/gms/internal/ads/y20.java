package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class y20 implements pe2<t20> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f6079a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f6080b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<ScheduledExecutorService> f6081c;
    private final ze2<wm1> d;
    private final ze2<km1> e;
    private final ze2<lr1> f;
    private final ze2<hn1> g;
    private final ze2<View> h;
    private final ze2<i52> i;
    private final ze2<f1> j;
    private final ze2<k1> k;

    private y20(ze2<Context> ze2Var, ze2<Executor> ze2Var2, ze2<ScheduledExecutorService> ze2Var3, ze2<wm1> ze2Var4, ze2<km1> ze2Var5, ze2<lr1> ze2Var6, ze2<hn1> ze2Var7, ze2<View> ze2Var8, ze2<i52> ze2Var9, ze2<f1> ze2Var10, ze2<k1> ze2Var11) {
        this.f6079a = ze2Var;
        this.f6080b = ze2Var2;
        this.f6081c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
        this.g = ze2Var7;
        this.h = ze2Var8;
        this.i = ze2Var9;
        this.j = ze2Var10;
        this.k = ze2Var11;
    }

    public static y20 a(ze2<Context> ze2Var, ze2<Executor> ze2Var2, ze2<ScheduledExecutorService> ze2Var3, ze2<wm1> ze2Var4, ze2<km1> ze2Var5, ze2<lr1> ze2Var6, ze2<hn1> ze2Var7, ze2<View> ze2Var8, ze2<i52> ze2Var9, ze2<f1> ze2Var10, ze2<k1> ze2Var11) {
        return new y20(ze2Var, ze2Var2, ze2Var3, ze2Var4, ze2Var5, ze2Var6, ze2Var7, ze2Var8, ze2Var9, ze2Var10, ze2Var11);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new t20(this.f6079a.get(), this.f6080b.get(), this.f6081c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get());
    }
}
