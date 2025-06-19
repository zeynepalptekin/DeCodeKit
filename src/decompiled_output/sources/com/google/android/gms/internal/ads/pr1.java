package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class pr1 implements pe2<nr1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Executor> f4877a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<xr> f4878b;

    private pr1(ze2<Executor> ze2Var, ze2<xr> ze2Var2) {
        this.f4877a = ze2Var;
        this.f4878b = ze2Var2;
    }

    public static pr1 a(ze2<Executor> ze2Var, ze2<xr> ze2Var2) {
        return new pr1(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new nr1(this.f4877a.get(), this.f4878b.get());
    }
}
