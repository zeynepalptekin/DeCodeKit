package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class ho1 implements pe2<co1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f3702a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<as> f3703b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<ao> f3704c;

    public ho1(ze2<Context> ze2Var, ze2<as> ze2Var2, ze2<ao> ze2Var3) {
        this.f3702a = ze2Var;
        this.f3703b = ze2Var2;
        this.f3704c = ze2Var3;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new co1(this.f3702a.get(), this.f3703b.get(), this.f3704c.get());
    }
}
