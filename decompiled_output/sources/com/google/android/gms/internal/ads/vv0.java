package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class vv0 implements pe2<iv0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Executor> f5740a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f5741b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<WeakReference<Context>> f5742c;
    private final ze2<Executor> d;
    private final ze2<fs0> e;
    private final ze2<ScheduledExecutorService> f;
    private final ze2<su0> g;
    private final ze2<as> h;

    public vv0(ze2<Executor> ze2Var, ze2<Context> ze2Var2, ze2<WeakReference<Context>> ze2Var3, ze2<Executor> ze2Var4, ze2<fs0> ze2Var5, ze2<ScheduledExecutorService> ze2Var6, ze2<su0> ze2Var7, ze2<as> ze2Var8) {
        this.f5740a = ze2Var;
        this.f5741b = ze2Var2;
        this.f5742c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
        this.g = ze2Var7;
        this.h = ze2Var8;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new iv0(this.f5740a.get(), this.f5741b.get(), this.f5742c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
