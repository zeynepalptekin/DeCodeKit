package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class dv0 implements pe2<Set<ch0<ir1>>> {

    /* renamed from: a, reason: collision with root package name */
    private final wu0 f3178a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<gv0> f3179b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Executor> f3180c;

    private dv0(wu0 wu0Var, ze2<gv0> ze2Var, ze2<Executor> ze2Var2) {
        this.f3178a = wu0Var;
        this.f3179b = ze2Var;
        this.f3180c = ze2Var2;
    }

    public static dv0 a(wu0 wu0Var, ze2<gv0> ze2Var, ze2<Executor> ze2Var2) {
        return new dv0(wu0Var, ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(wu0.i(this.f3179b.get(), this.f3180c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
