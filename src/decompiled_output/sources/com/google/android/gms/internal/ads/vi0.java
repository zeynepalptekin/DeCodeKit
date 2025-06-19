package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vi0 implements pe2<ch0<bb0>> {

    /* renamed from: a, reason: collision with root package name */
    private final hi0 f5680a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<vj0> f5681b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Executor> f5682c;

    private vi0(hi0 hi0Var, ze2<vj0> ze2Var, ze2<Executor> ze2Var2) {
        this.f5680a = hi0Var;
        this.f5681b = ze2Var;
        this.f5682c = ze2Var2;
    }

    public static vi0 a(hi0 hi0Var, ze2<vj0> ze2Var, ze2<Executor> ze2Var2) {
        return new vi0(hi0Var, ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f5681b.get(), this.f5682c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
