package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q51 implements pe2<j51> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f4956a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f4957b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<tq0> f4958c;

    public q51(ze2<Context> ze2Var, ze2<Executor> ze2Var2, ze2<tq0> ze2Var3) {
        this.f4956a = ze2Var;
        this.f4957b = ze2Var2;
        this.f4958c = ze2Var3;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new j51(this.f4956a.get(), this.f4957b.get(), this.f4958c.get());
    }
}
