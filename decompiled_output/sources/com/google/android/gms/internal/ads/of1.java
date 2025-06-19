package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class of1 implements pe2<mf1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cy1> f4688a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f4689b;

    public of1(ze2<cy1> ze2Var, ze2<Context> ze2Var2) {
        this.f4688a = ze2Var;
        this.f4689b = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new mf1(this.f4688a.get(), this.f4689b.get());
    }
}
