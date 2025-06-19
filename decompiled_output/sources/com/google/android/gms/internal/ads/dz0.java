package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class dz0 implements pe2<my0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f3186a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f3187b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<nj> f3188c;
    private final ze2<j20> d;
    private final ze2<kj> e;
    private final ze2<HashMap<String, cz0>> f;

    private dz0(ze2<Context> ze2Var, ze2<Executor> ze2Var2, ze2<nj> ze2Var3, ze2<j20> ze2Var4, ze2<kj> ze2Var5, ze2<HashMap<String, cz0>> ze2Var6) {
        this.f3186a = ze2Var;
        this.f3187b = ze2Var2;
        this.f3188c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
    }

    public static dz0 a(ze2<Context> ze2Var, ze2<Executor> ze2Var2, ze2<nj> ze2Var3, ze2<j20> ze2Var4, ze2<kj> ze2Var5, ze2<HashMap<String, cz0>> ze2Var6) {
        return new dz0(ze2Var, ze2Var2, ze2Var3, ze2Var4, ze2Var5, ze2Var6);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new my0(this.f3186a.get(), this.f3187b.get(), this.f3188c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
