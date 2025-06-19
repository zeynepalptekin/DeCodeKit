package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class ca0 implements pe2<da0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f2949a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<km1> f2950b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<bh> f2951c;

    private ca0(ze2<Context> ze2Var, ze2<km1> ze2Var2, ze2<bh> ze2Var3) {
        this.f2949a = ze2Var;
        this.f2950b = ze2Var2;
        this.f2951c = ze2Var3;
    }

    public static ca0 a(ze2<Context> ze2Var, ze2<km1> ze2Var2, ze2<bh> ze2Var3) {
        return new ca0(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new da0(this.f2949a.get(), this.f2950b.get(), this.f2951c.get());
    }
}
