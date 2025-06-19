package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class oe1 implements pe2<me1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<lm> f4683a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<cy1> f4684b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Context> f4685c;

    private oe1(ze2<lm> ze2Var, ze2<cy1> ze2Var2, ze2<Context> ze2Var3) {
        this.f4683a = ze2Var;
        this.f4684b = ze2Var2;
        this.f4685c = ze2Var3;
    }

    public static oe1 a(ze2<lm> ze2Var, ze2<cy1> ze2Var2, ze2<Context> ze2Var3) {
        return new oe1(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new me1(this.f4683a.get(), this.f4684b.get(), this.f4685c.get());
    }
}
