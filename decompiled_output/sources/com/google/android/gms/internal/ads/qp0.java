package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class qp0 implements pe2<op0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f5044a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<nl0> f5045b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<km0> f5046c;
    private final ze2<bl0> d;

    private qp0(ze2<Context> ze2Var, ze2<nl0> ze2Var2, ze2<km0> ze2Var3, ze2<bl0> ze2Var4) {
        this.f5044a = ze2Var;
        this.f5045b = ze2Var2;
        this.f5046c = ze2Var3;
        this.d = ze2Var4;
    }

    public static qp0 a(ze2<Context> ze2Var, ze2<nl0> ze2Var2, ze2<km0> ze2Var3, ze2<bl0> ze2Var4) {
        return new qp0(ze2Var, ze2Var2, ze2Var3, ze2Var4);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new op0(this.f5044a.get(), this.f5045b.get(), this.f5046c.get(), this.d.get());
    }
}
