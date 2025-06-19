package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class oi0 implements pe2<Set<ch0<af0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final hi0 f4697a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<w90> f4698b;

    private oi0(hi0 hi0Var, ze2<w90> ze2Var) {
        this.f4697a = hi0Var;
        this.f4698b = ze2Var;
    }

    public static oi0 a(hi0 hi0Var, ze2<w90> ze2Var) {
        return new oi0(hi0Var, ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(Collections.singleton(ch0.a(this.f4698b.get(), cs.f)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
