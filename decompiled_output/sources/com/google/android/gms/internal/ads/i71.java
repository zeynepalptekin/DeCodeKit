package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class i71 implements pe2<f71> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f3779a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<xx2> f3780b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<an1> f3781c;
    private final ze2<e50> d;

    public i71(ze2<Context> ze2Var, ze2<xx2> ze2Var2, ze2<an1> ze2Var3, ze2<e50> ze2Var4) {
        this.f3779a = ze2Var;
        this.f3780b = ze2Var2;
        this.f3781c = ze2Var3;
        this.d = ze2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new f71(this.f3779a.get(), this.f3780b.get(), this.f3781c.get(), this.d.get());
    }
}
