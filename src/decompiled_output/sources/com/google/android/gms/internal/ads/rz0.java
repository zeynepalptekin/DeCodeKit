package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class rz0 implements pe2<tz0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<yz0> f5199a;

    private rz0(ze2<yz0> ze2Var) {
        this.f5199a = ze2Var;
    }

    public static rz0 a(ze2<yz0> ze2Var) {
        return new rz0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new tz0(this.f5199a.get());
    }
}
