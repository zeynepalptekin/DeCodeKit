package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class wa1 implements pe2<va1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Executor> f5809a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<ao> f5810b;

    private wa1(ze2<Executor> ze2Var, ze2<ao> ze2Var2) {
        this.f5809a = ze2Var;
        this.f5810b = ze2Var2;
    }

    public static va1 a(Executor executor, ao aoVar) {
        return new va1(executor, aoVar);
    }

    public static wa1 b(ze2<Executor> ze2Var, ze2<ao> ze2Var2) {
        return new wa1(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f5809a.get(), this.f5810b.get());
    }
}
