package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class q80 implements pe2<s80> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<com.google.android.gms.common.util.g> f4964a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<un> f4965b;

    private q80(ze2<com.google.android.gms.common.util.g> ze2Var, ze2<un> ze2Var2) {
        this.f4964a = ze2Var;
        this.f4965b = ze2Var2;
    }

    public static q80 a(ze2<com.google.android.gms.common.util.g> ze2Var, ze2<un> ze2Var2) {
        return new q80(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new s80(this.f4964a.get(), this.f4965b.get());
    }
}
