package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class ga1 implements pe2<ea1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<ub1<jf1>> f3512a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<an1> f3513b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Context> f3514c;
    private final ze2<ao> d;

    private ga1(ze2<ub1<jf1>> ze2Var, ze2<an1> ze2Var2, ze2<Context> ze2Var3, ze2<ao> ze2Var4) {
        this.f3512a = ze2Var;
        this.f3513b = ze2Var2;
        this.f3514c = ze2Var3;
        this.d = ze2Var4;
    }

    public static ga1 a(ze2<ub1<jf1>> ze2Var, ze2<an1> ze2Var2, ze2<Context> ze2Var3, ze2<ao> ze2Var4) {
        return new ga1(ze2Var, ze2Var2, ze2Var3, ze2Var4);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new ea1(this.f3512a.get(), this.f3513b.get(), this.f3514c.get(), this.d.get());
    }
}
