package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class sr0 implements pe2<dr0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<zw> f5294a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f5295b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<i52> f5296c;
    private final ze2<f1> d;
    private final ze2<as> e;
    private final ze2<com.google.android.gms.ads.internal.b> f;
    private final ze2<tu2> g;
    private final ze2<gd0> h;
    private final ze2<ai0> i;

    private sr0(ze2<zw> ze2Var, ze2<Context> ze2Var2, ze2<i52> ze2Var3, ze2<f1> ze2Var4, ze2<as> ze2Var5, ze2<com.google.android.gms.ads.internal.b> ze2Var6, ze2<tu2> ze2Var7, ze2<gd0> ze2Var8, ze2<ai0> ze2Var9) {
        this.f5294a = ze2Var;
        this.f5295b = ze2Var2;
        this.f5296c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
        this.g = ze2Var7;
        this.h = ze2Var8;
        this.i = ze2Var9;
    }

    public static sr0 a(ze2<zw> ze2Var, ze2<Context> ze2Var2, ze2<i52> ze2Var3, ze2<f1> ze2Var4, ze2<as> ze2Var5, ze2<com.google.android.gms.ads.internal.b> ze2Var6, ze2<tu2> ze2Var7, ze2<gd0> ze2Var8, ze2<ai0> ze2Var9) {
        return new sr0(ze2Var, ze2Var2, ze2Var3, ze2Var4, ze2Var5, ze2Var6, ze2Var7, ze2Var8, ze2Var9);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new dr0(this.f5294a.get(), this.f5295b.get(), this.f5296c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
