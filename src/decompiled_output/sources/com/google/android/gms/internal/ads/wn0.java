package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class wn0 implements pe2<un0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<iq> f5862a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<com.google.android.gms.common.util.g> f5863b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Executor> f5864c;

    public wn0(ze2<iq> ze2Var, ze2<com.google.android.gms.common.util.g> ze2Var2, ze2<Executor> ze2Var3) {
        this.f5862a = ze2Var;
        this.f5863b = ze2Var2;
        this.f5864c = ze2Var3;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new un0(this.f5862a.get(), this.f5863b.get(), this.f5864c.get());
    }
}
