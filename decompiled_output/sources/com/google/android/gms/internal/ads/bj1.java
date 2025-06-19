package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class bj1 implements pe2<yi1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f2838a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f2839b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<gz> f2840c;
    private final ze2<ik1<p40, v40>> d;
    private final ze2<oi1> e;
    private final ze2<cn1> f;

    public bj1(ze2<Context> ze2Var, ze2<Executor> ze2Var2, ze2<gz> ze2Var3, ze2<ik1<p40, v40>> ze2Var4, ze2<oi1> ze2Var5, ze2<cn1> ze2Var6) {
        this.f2838a = ze2Var;
        this.f2839b = ze2Var2;
        this.f2840c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new yi1(this.f2838a.get(), this.f2839b.get(), this.f2840c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
