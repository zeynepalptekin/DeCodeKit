package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k51 implements pe2<z41> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f4054a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<as> f4055b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<an1> f4056c;
    private final ze2<Executor> d;
    private final ze2<tq0> e;
    private final ze2<dr0> f;

    public k51(ze2<Context> ze2Var, ze2<as> ze2Var2, ze2<an1> ze2Var3, ze2<Executor> ze2Var4, ze2<tq0> ze2Var5, ze2<dr0> ze2Var6) {
        this.f4054a = ze2Var;
        this.f4055b = ze2Var2;
        this.f4056c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new z41(this.f4054a.get(), this.f4055b.get(), this.f4056c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
