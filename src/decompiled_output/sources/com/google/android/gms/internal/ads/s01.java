package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class s01<DelegateT, AdapterT> implements u01<AdapterT> {

    /* renamed from: a, reason: collision with root package name */
    @com.google.android.gms.common.util.d0
    private final u01<DelegateT> f5211a;

    /* renamed from: b, reason: collision with root package name */
    private final ru1<DelegateT, AdapterT> f5212b;

    public s01(u01<DelegateT> u01Var, ru1<DelegateT, AdapterT> ru1Var) {
        this.f5211a = u01Var;
        this.f5212b = ru1Var;
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final boolean a(wm1 wm1Var, km1 km1Var) {
        return this.f5211a.a(wm1Var, km1Var);
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final dy1<AdapterT> b(wm1 wm1Var, km1 km1Var) {
        return qx1.i(this.f5211a.b(wm1Var, km1Var), this.f5212b, cs.f3023a);
    }
}
