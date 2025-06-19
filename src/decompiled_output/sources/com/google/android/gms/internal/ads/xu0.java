package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class xu0 implements pe2<Set<ch0<sb0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final wu0 f6040a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<gv0> f6041b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Executor> f6042c;

    private xu0(wu0 wu0Var, ze2<gv0> ze2Var, ze2<Executor> ze2Var2) {
        this.f6040a = wu0Var;
        this.f6041b = ze2Var;
        this.f6042c = ze2Var2;
    }

    public static xu0 a(wu0 wu0Var, ze2<gv0> ze2Var, ze2<Executor> ze2Var2) {
        return new xu0(wu0Var, ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(wu0.a(this.f6041b.get(), this.f6042c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
