package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class mc1 implements pe2<ic1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f4385a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<cy1> f4386b;

    private mc1(ze2<Context> ze2Var, ze2<cy1> ze2Var2) {
        this.f4385a = ze2Var;
        this.f4386b = ze2Var2;
    }

    public static ic1 a(Context context, cy1 cy1Var) {
        return new ic1(context, cy1Var);
    }

    public static mc1 b(ze2<Context> ze2Var, ze2<cy1> ze2Var2) {
        return new mc1(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f4385a.get(), this.f4386b.get());
    }
}
