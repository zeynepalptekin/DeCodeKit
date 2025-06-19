package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class iu0 implements pe2<hu0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<mu0> f3866a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f3867b;

    public iu0(ze2<mu0> ze2Var, ze2<Executor> ze2Var2) {
        this.f3866a = ze2Var;
        this.f3867b = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new hu0(this.f3866a.get(), this.f3867b.get());
    }
}
