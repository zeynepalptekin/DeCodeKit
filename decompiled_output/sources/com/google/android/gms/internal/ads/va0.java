package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class va0 implements pe2<ra0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<km1> f5654a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<String> f5655b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<x01> f5656c;

    private va0(ze2<km1> ze2Var, ze2<String> ze2Var2, ze2<x01> ze2Var3) {
        this.f5654a = ze2Var;
        this.f5655b = ze2Var2;
        this.f5656c = ze2Var3;
    }

    public static va0 a(ze2<km1> ze2Var, ze2<String> ze2Var2, ze2<x01> ze2Var3) {
        return new va0(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new ra0(this.f5654a.get(), this.f5655b.get(), this.f5656c.get());
    }
}
