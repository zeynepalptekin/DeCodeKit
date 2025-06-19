package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vu0 implements pe2<Set<ch0<bb0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final wu0 f5735a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<gv0> f5736b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Executor> f5737c;

    private vu0(wu0 wu0Var, ze2<gv0> ze2Var, ze2<Executor> ze2Var2) {
        this.f5735a = wu0Var;
        this.f5736b = ze2Var;
        this.f5737c = ze2Var2;
    }

    public static vu0 a(wu0 wu0Var, ze2<gv0> ze2Var, ze2<Executor> ze2Var2) {
        return new vu0(wu0Var, ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(wu0.f(this.f5736b.get(), this.f5737c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
