package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i50 implements pe2<g50> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<d70> f3767a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f3768b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<jm1> f3769c;
    private final ze2<View> d;
    private final ze2<rw> e;
    private final ze2<b70> f;
    private final ze2<ul0> g;
    private final ze2<gh0> h;
    private final ze2<f71> i;
    private final ze2<Executor> j;

    public i50(ze2<d70> ze2Var, ze2<Context> ze2Var2, ze2<jm1> ze2Var3, ze2<View> ze2Var4, ze2<rw> ze2Var5, ze2<b70> ze2Var6, ze2<ul0> ze2Var7, ze2<gh0> ze2Var8, ze2<f71> ze2Var9, ze2<Executor> ze2Var10) {
        this.f3767a = ze2Var;
        this.f3768b = ze2Var2;
        this.f3769c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
        this.g = ze2Var7;
        this.h = ze2Var8;
        this.i = ze2Var9;
        this.j = ze2Var10;
    }

    public static g50 a(d70 d70Var, Context context, jm1 jm1Var, View view, rw rwVar, b70 b70Var, ul0 ul0Var, gh0 gh0Var, je2<f71> je2Var, Executor executor) {
        return new g50(d70Var, context, jm1Var, view, rwVar, b70Var, ul0Var, gh0Var, je2Var, executor);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f3767a.get(), this.f3768b.get(), this.f3769c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), me2.b(this.i), this.j.get());
    }
}
