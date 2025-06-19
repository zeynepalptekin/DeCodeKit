package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class ut0 implements pe2<vt0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f5596a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<mn1> f5597b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<hu0> f5598c;
    private final ze2<wm1> d;
    private final ze2<km1> e;
    private final ze2<i01> f;

    private ut0(ze2<Context> ze2Var, ze2<mn1> ze2Var2, ze2<hu0> ze2Var3, ze2<wm1> ze2Var4, ze2<km1> ze2Var5, ze2<i01> ze2Var6) {
        this.f5596a = ze2Var;
        this.f5597b = ze2Var2;
        this.f5598c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
    }

    public static ut0 a(ze2<Context> ze2Var, ze2<mn1> ze2Var2, ze2<hu0> ze2Var3, ze2<wm1> ze2Var4, ze2<km1> ze2Var5, ze2<i01> ze2Var6) {
        return new ut0(ze2Var, ze2Var2, ze2Var3, ze2Var4, ze2Var5, ze2Var6);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new vt0(this.f5596a.get(), this.f5597b.get(), this.f5598c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
