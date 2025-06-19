package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class pk1 implements pe2<ik1<d40, i40>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f4831a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<no1> f4832b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<gp1> f4833c;

    public pk1(ze2<Context> ze2Var, ze2<no1> ze2Var2, ze2<gp1> ze2Var3) {
        this.f4831a = ze2Var;
        this.f4832b = ze2Var2;
        this.f4833c = ze2Var3;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ik1) we2.b(mk1.a(this.f4831a.get(), this.f4832b.get(), this.f4833c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
