package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class cl0 implements pe2<zk0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<nl0> f2988a;

    private cl0(ze2<nl0> ze2Var) {
        this.f2988a = ze2Var;
    }

    public static cl0 a(ze2<nl0> ze2Var) {
        return new cl0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new zk0(this.f2988a.get());
    }
}
