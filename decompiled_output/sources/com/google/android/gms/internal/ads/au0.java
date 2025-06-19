package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class au0 implements pe2<ch0<ir1>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<lu0> f2751a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f2752b;

    private au0(ze2<lu0> ze2Var, ze2<Executor> ze2Var2) {
        this.f2751a = ze2Var;
        this.f2752b = ze2Var2;
    }

    public static au0 a(ze2<lu0> ze2Var, ze2<Executor> ze2Var2) {
        return new au0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f2751a.get(), this.f2752b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
