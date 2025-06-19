package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class l41 implements pe2<i41> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<mn1> f4194a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<as0> f4195b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<hu0> f4196c;

    private l41(ze2<mn1> ze2Var, ze2<as0> ze2Var2, ze2<hu0> ze2Var3) {
        this.f4194a = ze2Var;
        this.f4195b = ze2Var2;
        this.f4196c = ze2Var3;
    }

    public static l41 a(ze2<mn1> ze2Var, ze2<as0> ze2Var2, ze2<hu0> ze2Var3) {
        return new l41(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new i41(this.f4194a.get(), this.f4195b.get(), this.f4196c.get());
    }
}
