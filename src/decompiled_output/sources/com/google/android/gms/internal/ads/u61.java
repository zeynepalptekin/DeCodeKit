package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class u61 implements pe2<q61> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f5482a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<hj0> f5483b;

    public u61(ze2<Context> ze2Var, ze2<hj0> ze2Var2) {
        this.f5482a = ze2Var;
        this.f5483b = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new q61(this.f5482a.get(), this.f5483b.get());
    }
}
