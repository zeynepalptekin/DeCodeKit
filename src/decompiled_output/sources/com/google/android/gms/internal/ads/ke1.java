package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class ke1 implements pe2<ge1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cy1> f4079a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<ScheduledExecutorService> f4080b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<String> f4081c;
    private final ze2<a71> d;
    private final ze2<Context> e;
    private final ze2<an1> f;
    private final ze2<x61> g;

    private ke1(ze2<cy1> ze2Var, ze2<ScheduledExecutorService> ze2Var2, ze2<String> ze2Var3, ze2<a71> ze2Var4, ze2<Context> ze2Var5, ze2<an1> ze2Var6, ze2<x61> ze2Var7) {
        this.f4079a = ze2Var;
        this.f4080b = ze2Var2;
        this.f4081c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
        this.g = ze2Var7;
    }

    public static ke1 a(ze2<cy1> ze2Var, ze2<ScheduledExecutorService> ze2Var2, ze2<String> ze2Var3, ze2<a71> ze2Var4, ze2<Context> ze2Var5, ze2<an1> ze2Var6, ze2<x61> ze2Var7) {
        return new ke1(ze2Var, ze2Var2, ze2Var3, ze2Var4, ze2Var5, ze2Var6, ze2Var7);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new ge1(this.f4079a.get(), this.f4080b.get(), this.f4081c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
