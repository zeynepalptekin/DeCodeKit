package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class t90 implements pe2<p90> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f5366a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<an1> f5367b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<as> f5368c;
    private final ze2<qo> d;
    private final ze2<iv0> e;

    private t90(ze2<Context> ze2Var, ze2<an1> ze2Var2, ze2<as> ze2Var3, ze2<qo> ze2Var4, ze2<iv0> ze2Var5) {
        this.f5366a = ze2Var;
        this.f5367b = ze2Var2;
        this.f5368c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
    }

    public static t90 a(ze2<Context> ze2Var, ze2<an1> ze2Var2, ze2<as> ze2Var3, ze2<qo> ze2Var4, ze2<iv0> ze2Var5) {
        return new t90(ze2Var, ze2Var2, ze2Var3, ze2Var4, ze2Var5);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new p90(this.f5366a.get(), this.f5367b.get(), this.f5368c.get(), this.d.get(), this.e.get());
    }
}
