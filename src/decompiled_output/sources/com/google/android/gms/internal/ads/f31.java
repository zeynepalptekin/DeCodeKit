package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class f31 implements pe2<e31> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f3367a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<hj0> f3368b;

    public f31(ze2<Context> ze2Var, ze2<hj0> ze2Var2) {
        this.f3367a = ze2Var;
        this.f3368b = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new e31(this.f3367a.get(), this.f3368b.get());
    }
}
