package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kc0;

/* loaded from: classes.dex */
public final class x51<AdT, AdapterT, ListenerT extends kc0> implements pe2<t51<AdT, AdapterT, ListenerT>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cr1> f5936a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<cy1> f5937b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<v01<AdapterT, ListenerT>> f5938c;
    private final ze2<c11<AdT, AdapterT, ListenerT>> d;

    private x51(ze2<cr1> ze2Var, ze2<cy1> ze2Var2, ze2<v01<AdapterT, ListenerT>> ze2Var3, ze2<c11<AdT, AdapterT, ListenerT>> ze2Var4) {
        this.f5936a = ze2Var;
        this.f5937b = ze2Var2;
        this.f5938c = ze2Var3;
        this.d = ze2Var4;
    }

    public static <AdT, AdapterT, ListenerT extends kc0> x51<AdT, AdapterT, ListenerT> a(ze2<cr1> ze2Var, ze2<cy1> ze2Var2, ze2<v01<AdapterT, ListenerT>> ze2Var3, ze2<c11<AdT, AdapterT, ListenerT>> ze2Var4) {
        return new x51<>(ze2Var, ze2Var2, ze2Var3, ze2Var4);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new t51(this.f5936a.get(), this.f5937b.get(), this.f5938c.get(), this.d.get());
    }
}
