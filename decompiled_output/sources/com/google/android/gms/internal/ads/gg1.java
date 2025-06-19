package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class gg1 implements pe2<eg1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<dj> f3535a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f3536b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<String> f3537c;
    private final ze2<cy1> d;

    public gg1(ze2<dj> ze2Var, ze2<Context> ze2Var2, ze2<String> ze2Var3, ze2<cy1> ze2Var4) {
        this.f3535a = ze2Var;
        this.f3536b = ze2Var2;
        this.f3537c = ze2Var3;
        this.d = ze2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new eg1(this.f3535a.get(), this.f3536b.get(), this.f3537c.get(), this.d.get());
    }
}
