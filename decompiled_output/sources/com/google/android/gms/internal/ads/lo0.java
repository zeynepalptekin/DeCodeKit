package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class lo0 implements pe2<do0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f4282a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<un0> f4283b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<i52> f4284c;
    private final ze2<as> d;
    private final ze2<com.google.android.gms.ads.internal.b> e;
    private final ze2<tu2> f;
    private final ze2<Executor> g;
    private final ze2<an1> h;
    private final ze2<ro0> i;
    private final ze2<ScheduledExecutorService> j;

    public lo0(ze2<Context> ze2Var, ze2<un0> ze2Var2, ze2<i52> ze2Var3, ze2<as> ze2Var4, ze2<com.google.android.gms.ads.internal.b> ze2Var5, ze2<tu2> ze2Var6, ze2<Executor> ze2Var7, ze2<an1> ze2Var8, ze2<ro0> ze2Var9, ze2<ScheduledExecutorService> ze2Var10) {
        this.f4282a = ze2Var;
        this.f4283b = ze2Var2;
        this.f4284c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
        this.g = ze2Var7;
        this.h = ze2Var8;
        this.i = ze2Var9;
        this.j = ze2Var10;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new do0(this.f4282a.get(), this.f4283b.get(), this.f4284c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
