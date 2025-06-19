package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class w60 implements pe2<t60> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f5795a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<rw> f5796b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<km1> f5797c;
    private final ze2<as> d;

    public w60(ze2<Context> ze2Var, ze2<rw> ze2Var2, ze2<km1> ze2Var3, ze2<as> ze2Var4) {
        this.f5795a = ze2Var;
        this.f5796b = ze2Var2;
        this.f5797c = ze2Var3;
        this.d = ze2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new t60(this.f5795a.get(), this.f5796b.get(), this.f5797c.get(), this.d.get());
    }
}
