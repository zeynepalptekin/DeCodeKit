package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class or1 implements pe2<lr1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<g41> f4729a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<as> f4730b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<String> f4731c;
    private final ze2<String> d;
    private final ze2<Context> e;
    private final ze2<zm1> f;
    private final ze2<com.google.android.gms.common.util.g> g;
    private final ze2<i52> h;

    private or1(ze2<g41> ze2Var, ze2<as> ze2Var2, ze2<String> ze2Var3, ze2<String> ze2Var4, ze2<Context> ze2Var5, ze2<zm1> ze2Var6, ze2<com.google.android.gms.common.util.g> ze2Var7, ze2<i52> ze2Var8) {
        this.f4729a = ze2Var;
        this.f4730b = ze2Var2;
        this.f4731c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
        this.g = ze2Var7;
        this.h = ze2Var8;
    }

    public static or1 a(ze2<g41> ze2Var, ze2<as> ze2Var2, ze2<String> ze2Var3, ze2<String> ze2Var4, ze2<Context> ze2Var5, ze2<zm1> ze2Var6, ze2<com.google.android.gms.common.util.g> ze2Var7, ze2<i52> ze2Var8) {
        return new or1(ze2Var, ze2Var2, ze2Var3, ze2Var4, ze2Var5, ze2Var6, ze2Var7, ze2Var8);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new lr1(this.f4729a.get(), this.f4730b.get(), this.f4731c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
