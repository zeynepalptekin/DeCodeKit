package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class ui0 implements pe2<Set<ch0<bb0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final hi0 f5522a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<w90> f5523b;

    private ui0(hi0 hi0Var, ze2<w90> ze2Var) {
        this.f5522a = hi0Var;
        this.f5523b = ze2Var;
    }

    public static ui0 a(hi0 hi0Var, ze2<w90> ze2Var) {
        return new ui0(hi0Var, ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(this.f5522a.f(this.f5523b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
