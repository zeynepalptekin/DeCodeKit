package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class df1 implements pe2<we1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cy1> f3120a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f3121b;

    private df1(ze2<cy1> ze2Var, ze2<Context> ze2Var2) {
        this.f3120a = ze2Var;
        this.f3121b = ze2Var2;
    }

    public static we1 a(cy1 cy1Var, Context context) {
        return new we1(cy1Var, context);
    }

    public static df1 b(ze2<cy1> ze2Var, ze2<Context> ze2Var2) {
        return new df1(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f3120a.get(), this.f3121b.get());
    }
}
