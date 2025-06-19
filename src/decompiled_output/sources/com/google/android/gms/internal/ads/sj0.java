package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class sj0 implements pe2<tj0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<wb0> f5268a;

    private sj0(ze2<wb0> ze2Var) {
        this.f5268a = ze2Var;
    }

    public static sj0 a(ze2<wb0> ze2Var) {
        return new sj0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new tj0(this.f5268a.get());
    }
}
