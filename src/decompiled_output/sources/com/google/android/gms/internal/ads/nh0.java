package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class nh0 implements pe2<kh0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<km1> f4538a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<nr1> f4539b;

    private nh0(ze2<km1> ze2Var, ze2<nr1> ze2Var2) {
        this.f4538a = ze2Var;
        this.f4539b = ze2Var2;
    }

    public static nh0 a(ze2<km1> ze2Var, ze2<nr1> ze2Var2) {
        return new nh0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new kh0(this.f4538a.get(), this.f4539b.get());
    }
}
