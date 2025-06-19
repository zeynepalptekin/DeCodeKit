package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class u41 implements pe2<t41> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f5478a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<tq0> f5479b;

    public u41(ze2<Context> ze2Var, ze2<tq0> ze2Var2) {
        this.f5478a = ze2Var;
        this.f5479b = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new t41(this.f5478a.get(), this.f5479b.get());
    }
}
