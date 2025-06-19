package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class rg1 implements pe2<pg1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<hu2> f5136a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<cy1> f5137b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Context> f5138c;

    public rg1(ze2<hu2> ze2Var, ze2<cy1> ze2Var2, ze2<Context> ze2Var3) {
        this.f5136a = ze2Var;
        this.f5137b = ze2Var2;
        this.f5138c = ze2Var3;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new pg1(this.f5136a.get(), this.f5137b.get(), this.f5138c.get());
    }
}
