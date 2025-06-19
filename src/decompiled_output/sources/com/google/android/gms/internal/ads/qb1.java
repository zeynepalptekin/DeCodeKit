package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class qb1 implements pe2<ob1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cy1> f4978a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f4979b;

    public qb1(ze2<cy1> ze2Var, ze2<Context> ze2Var2) {
        this.f4978a = ze2Var;
        this.f4979b = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new ob1(this.f4978a.get(), this.f4979b.get());
    }
}
