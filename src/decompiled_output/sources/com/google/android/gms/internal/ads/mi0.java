package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class mi0 implements pe2<Set<ch0<pb0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final hi0 f4417a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<w90> f4418b;

    private mi0(hi0 hi0Var, ze2<w90> ze2Var) {
        this.f4417a = hi0Var;
        this.f4418b = ze2Var;
    }

    public static mi0 a(hi0 hi0Var, ze2<w90> ze2Var) {
        return new mi0(hi0Var, ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(Collections.singleton(ch0.a(this.f4418b.get(), cs.f)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
