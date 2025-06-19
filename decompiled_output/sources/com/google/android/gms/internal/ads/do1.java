package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class do1 implements pe2<ao1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f3150a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<ho> f3151b;

    private do1(ze2<Context> ze2Var, ze2<ho> ze2Var2) {
        this.f3150a = ze2Var;
        this.f3151b = ze2Var2;
    }

    public static do1 a(ze2<Context> ze2Var, ze2<ho> ze2Var2) {
        return new do1(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new ao1(this.f3150a.get(), this.f3151b.get());
    }
}
