package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class sf1 implements pe2<qf1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cy1> f5253a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f5254b;

    private sf1(ze2<cy1> ze2Var, ze2<Context> ze2Var2) {
        this.f5253a = ze2Var;
        this.f5254b = ze2Var2;
    }

    public static sf1 a(ze2<cy1> ze2Var, ze2<Context> ze2Var2) {
        return new sf1(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new qf1(this.f5253a.get(), this.f5254b.get());
    }
}
