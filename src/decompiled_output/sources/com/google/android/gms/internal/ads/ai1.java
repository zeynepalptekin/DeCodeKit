package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ai1 implements pe2<xh1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f2695a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f2696b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<gz> f2697c;
    private final ze2<ik1<d40, i40>> d;
    private final ze2<oi1> e;
    private final ze2<cn1> f;

    public ai1(ze2<Context> ze2Var, ze2<Executor> ze2Var2, ze2<gz> ze2Var3, ze2<ik1<d40, i40>> ze2Var4, ze2<oi1> ze2Var5, ze2<cn1> ze2Var6) {
        this.f2695a = ze2Var;
        this.f2696b = ze2Var2;
        this.f2697c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new xh1(this.f2695a.get(), this.f2696b.get(), this.f2697c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
