package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class q01 implements pe2<r01> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f4925a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<i01> f4926b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<xr> f4927c;

    public q01(ze2<Context> ze2Var, ze2<i01> ze2Var2, ze2<xr> ze2Var3) {
        this.f4925a = ze2Var;
        this.f4926b = ze2Var2;
        this.f4927c = ze2Var3;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new r01(this.f4925a.get(), this.f4926b.get(), this.f4927c.get());
    }
}
