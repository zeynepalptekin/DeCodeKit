package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class hj1 implements pe2<aj1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<gz> f3683a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f3684b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<String> f3685c;
    private final ze2<yi1> d;
    private final ze2<oi1> e;

    public hj1(ze2<gz> ze2Var, ze2<Context> ze2Var2, ze2<String> ze2Var3, ze2<yi1> ze2Var4, ze2<oi1> ze2Var5) {
        this.f3683a = ze2Var;
        this.f3684b = ze2Var2;
        this.f3685c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new aj1(this.f3683a.get(), this.f3684b.get(), this.f3685c.get(), this.d.get(), this.e.get());
    }
}
