package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class at0 implements pe2<Set<ch0<ir1>>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Executor> f2743a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<rt0> f2744b;

    private at0(ze2<Executor> ze2Var, ze2<rt0> ze2Var2) {
        this.f2743a = ze2Var;
        this.f2744b = ze2Var2;
    }

    public static at0 a(ze2<Executor> ze2Var, ze2<rt0> ze2Var2) {
        return new at0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        Executor executor = this.f2743a.get();
        return (Set) we2.b(((Boolean) qx2.e().c(e0.e3)).booleanValue() ? Collections.singleton(new ch0(this.f2744b.get(), executor)) : Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
