package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class cd1 implements pe2<ad1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cy1> f2957a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<im1> f2958b;

    private cd1(ze2<cy1> ze2Var, ze2<im1> ze2Var2) {
        this.f2957a = ze2Var;
        this.f2958b = ze2Var2;
    }

    public static cd1 a(ze2<cy1> ze2Var, ze2<im1> ze2Var2) {
        return new cd1(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new ad1(this.f2957a.get(), this.f2958b.get());
    }
}
