package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class p01 implements pe2<i01> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f4767a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<cy1> f4768b;

    public p01(ze2<Context> ze2Var, ze2<cy1> ze2Var2) {
        this.f4767a = ze2Var;
        this.f4768b = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new i01(this.f4767a.get(), this.f4768b.get());
    }
}
