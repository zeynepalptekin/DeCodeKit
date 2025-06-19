package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class dm0 implements pe2<mm> {

    /* renamed from: a, reason: collision with root package name */
    private final zl0 f3137a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f3138b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<an1> f3139c;

    private dm0(zl0 zl0Var, ze2<Context> ze2Var, ze2<an1> ze2Var2) {
        this.f3137a = zl0Var;
        this.f3138b = ze2Var;
        this.f3139c = ze2Var2;
    }

    public static dm0 a(zl0 zl0Var, ze2<Context> ze2Var, ze2<an1> ze2Var2) {
        return new dm0(zl0Var, ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (mm) we2.b(new mm(this.f3138b.get(), this.f3139c.get().f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
