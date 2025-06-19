package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class g61 implements pe2<a61> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f3501a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<b60> f3502b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<cr1> f3503c;
    private final ze2<cy1> d;
    private final ze2<b1> e;

    public g61(ze2<Context> ze2Var, ze2<b60> ze2Var2, ze2<cr1> ze2Var3, ze2<cy1> ze2Var4, ze2<b1> ze2Var5) {
        this.f3501a = ze2Var;
        this.f3502b = ze2Var2;
        this.f3503c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new a61(this.f3501a.get(), this.f3502b.get(), this.f3503c.get(), this.d.get(), this.e.get());
    }
}
