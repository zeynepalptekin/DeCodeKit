package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class so0 implements pe2<oo0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Executor> f5284a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<do0> f5285b;

    public so0(ze2<Executor> ze2Var, ze2<do0> ze2Var2) {
        this.f5284a = ze2Var;
        this.f5285b = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new oo0(this.f5284a.get(), this.f5285b.get());
    }
}
