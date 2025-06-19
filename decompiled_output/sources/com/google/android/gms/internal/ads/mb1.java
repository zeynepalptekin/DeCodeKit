package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class mb1 implements pe2<kb1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cy1> f4379a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f4380b;

    private mb1(ze2<cy1> ze2Var, ze2<Context> ze2Var2) {
        this.f4379a = ze2Var;
        this.f4380b = ze2Var2;
    }

    public static mb1 a(ze2<cy1> ze2Var, ze2<Context> ze2Var2) {
        return new mb1(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new kb1(this.f4379a.get(), this.f4380b.get());
    }
}
