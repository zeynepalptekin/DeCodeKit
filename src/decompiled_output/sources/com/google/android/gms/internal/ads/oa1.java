package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class oa1 implements pe2<ma1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<String> f4663a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<cy1> f4664b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<fs0> f4665c;

    private oa1(ze2<String> ze2Var, ze2<cy1> ze2Var2, ze2<fs0> ze2Var3) {
        this.f4663a = ze2Var;
        this.f4664b = ze2Var2;
        this.f4665c = ze2Var3;
    }

    public static oa1 a(ze2<String> ze2Var, ze2<cy1> ze2Var2, ze2<fs0> ze2Var3) {
        return new oa1(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new ma1(this.f4663a.get(), this.f4664b.get(), this.f4665c.get());
    }
}
