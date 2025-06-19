package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class pu0 implements pe2<mu0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Executor> f4888a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<xr> f4889b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Context> f4890c;
    private final ze2<as> d;

    public pu0(ze2<Executor> ze2Var, ze2<xr> ze2Var2, ze2<Context> ze2Var3, ze2<as> ze2Var4) {
        this.f4888a = ze2Var;
        this.f4889b = ze2Var2;
        this.f4890c = ze2Var3;
        this.d = ze2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new mu0(this.f4888a.get(), this.f4889b.get(), this.f4890c.get(), this.d.get());
    }
}
