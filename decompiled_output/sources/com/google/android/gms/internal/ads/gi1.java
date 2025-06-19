package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class gi1 implements pe2<zh1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<gz> f3540a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f3541b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<String> f3542c;
    private final ze2<xh1> d;
    private final ze2<oi1> e;
    private final ze2<as> f;

    public gi1(ze2<gz> ze2Var, ze2<Context> ze2Var2, ze2<String> ze2Var3, ze2<xh1> ze2Var4, ze2<oi1> ze2Var5, ze2<as> ze2Var6) {
        this.f3540a = ze2Var;
        this.f3541b = ze2Var2;
        this.f3542c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new zh1(this.f3540a.get(), this.f3541b.get(), this.f3542c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
