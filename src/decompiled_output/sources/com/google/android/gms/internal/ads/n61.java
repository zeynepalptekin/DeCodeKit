package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class n61<AdT> implements pe2<j61<AdT>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cr1> f4497a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<cy1> f4498b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<b1> f4499c;
    private final ze2<k61<AdT>> d;

    public n61(ze2<cr1> ze2Var, ze2<cy1> ze2Var2, ze2<b1> ze2Var3, ze2<k61<AdT>> ze2Var4) {
        this.f4497a = ze2Var;
        this.f4498b = ze2Var2;
        this.f4499c = ze2Var3;
        this.d = ze2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new j61(this.f4497a.get(), this.f4498b.get(), this.f4499c.get(), this.d.get());
    }
}
