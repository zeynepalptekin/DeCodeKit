package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class yu0 implements pe2<Set<ch0<cb0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final wu0 f6179a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<gv0> f6180b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Executor> f6181c;

    private yu0(wu0 wu0Var, ze2<gv0> ze2Var, ze2<Executor> ze2Var2) {
        this.f6179a = wu0Var;
        this.f6180b = ze2Var;
        this.f6181c = ze2Var2;
    }

    public static yu0 a(wu0 wu0Var, ze2<gv0> ze2Var, ze2<Executor> ze2Var2) {
        return new yu0(wu0Var, ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(wu0.e(this.f6180b.get(), this.f6181c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
