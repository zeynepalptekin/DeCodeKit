package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q91 implements pe2<o91> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Executor> f4968a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<sw0> f4969b;

    public q91(ze2<Executor> ze2Var, ze2<sw0> ze2Var2) {
        this.f4968a = ze2Var;
        this.f4969b = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new o91(this.f4968a.get(), this.f4969b.get());
    }
}
