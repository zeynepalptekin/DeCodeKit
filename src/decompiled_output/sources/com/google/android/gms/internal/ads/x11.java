package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class x11 implements pe2<n11> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<b60> f5917a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f5918b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Executor> f5919c;
    private final ze2<dr0> d;
    private final ze2<an1> e;
    private final ze2<ru1<km1, pp>> f;

    public x11(ze2<b60> ze2Var, ze2<Context> ze2Var2, ze2<Executor> ze2Var3, ze2<dr0> ze2Var4, ze2<an1> ze2Var5, ze2<ru1<km1, pp>> ze2Var6) {
        this.f5917a = ze2Var;
        this.f5918b = ze2Var2;
        this.f5919c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new n11(this.f5917a.get(), this.f5918b.get(), this.f5919c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
