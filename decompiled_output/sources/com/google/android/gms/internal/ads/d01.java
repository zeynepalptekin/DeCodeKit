package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class d01 implements pe2<yz0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f3053a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<fa0> f3054b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<vz0> f3055c;
    private final ze2<oz0> d;

    private d01(ze2<Context> ze2Var, ze2<fa0> ze2Var2, ze2<vz0> ze2Var3, ze2<oz0> ze2Var4) {
        this.f3053a = ze2Var;
        this.f3054b = ze2Var2;
        this.f3055c = ze2Var3;
        this.d = ze2Var4;
    }

    public static d01 a(ze2<Context> ze2Var, ze2<fa0> ze2Var2, ze2<vz0> ze2Var3, ze2<oz0> ze2Var4) {
        return new d01(ze2Var, ze2Var2, ze2Var3, ze2Var4);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new yz0(this.f3053a.get(), this.f3054b.get(), this.f3055c.get(), this.d.get());
    }
}
