package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class lk1 implements pe2<ik1<p40, v40>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f4263a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<no1> f4264b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<gp1> f4265c;

    public lk1(ze2<Context> ze2Var, ze2<no1> ze2Var2, ze2<gp1> ze2Var3) {
        this.f4263a = ze2Var;
        this.f4264b = ze2Var2;
        this.f4265c = ze2Var3;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ik1) we2.b(mk1.b(this.f4263a.get(), this.f4264b.get(), this.f4265c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
