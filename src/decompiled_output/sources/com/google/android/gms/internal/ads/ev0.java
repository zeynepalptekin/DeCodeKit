package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ev0 implements pe2<Set<ch0<tb0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final wu0 f3330a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<gv0> f3331b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Executor> f3332c;

    private ev0(wu0 wu0Var, ze2<gv0> ze2Var, ze2<Executor> ze2Var2) {
        this.f3330a = wu0Var;
        this.f3331b = ze2Var;
        this.f3332c = ze2Var2;
    }

    public static ev0 a(wu0 wu0Var, ze2<gv0> ze2Var, ze2<Executor> ze2Var2) {
        return new ev0(wu0Var, ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(wu0.g(this.f3331b.get(), this.f3332c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
