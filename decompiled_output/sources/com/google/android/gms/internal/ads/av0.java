package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class av0 implements pe2<Set<ch0<nc0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final wu0 f2756a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<gv0> f2757b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Executor> f2758c;

    private av0(wu0 wu0Var, ze2<gv0> ze2Var, ze2<Executor> ze2Var2) {
        this.f2756a = wu0Var;
        this.f2757b = ze2Var;
        this.f2758c = ze2Var2;
    }

    public static Set<ch0<nc0>> a(wu0 wu0Var, gv0 gv0Var, Executor executor) {
        return (Set) we2.b(wu0.c(gv0Var, executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static av0 b(wu0 wu0Var, ze2<gv0> ze2Var, ze2<Executor> ze2Var2) {
        return new av0(wu0Var, ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f2756a, this.f2757b.get(), this.f2758c.get());
    }
}
