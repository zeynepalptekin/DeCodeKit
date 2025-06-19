package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class wx0 implements pe2<xx0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f5900a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<lm> f5901b;

    private wx0(ze2<Context> ze2Var, ze2<lm> ze2Var2) {
        this.f5900a = ze2Var;
        this.f5901b = ze2Var2;
    }

    public static wx0 a(ze2<Context> ze2Var, ze2<lm> ze2Var2) {
        return new wx0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new xx0(this.f5900a.get(), this.f5901b.get());
    }
}
