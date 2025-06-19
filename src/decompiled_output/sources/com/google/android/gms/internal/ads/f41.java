package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ia0;

/* loaded from: classes.dex */
public final class f41 implements pe2<c41> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<gz> f3370a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<ia0.a> f3371b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<m61> f3372c;
    private final ze2<qf0> d;

    public f41(ze2<gz> ze2Var, ze2<ia0.a> ze2Var2, ze2<m61> ze2Var3, ze2<qf0> ze2Var4) {
        this.f3370a = ze2Var;
        this.f3371b = ze2Var2;
        this.f3372c = ze2Var3;
        this.d = ze2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new c41(this.f3370a.get(), this.f3371b.get(), this.f3372c.get(), this.d.get());
    }
}
