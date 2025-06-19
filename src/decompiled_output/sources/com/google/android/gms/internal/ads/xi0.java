package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class xi0 implements pe2<Set<ch0<xg0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<tj0> f5979a;

    private xi0(ze2<tj0> ze2Var) {
        this.f5979a = ze2Var;
    }

    public static xi0 a(ze2<tj0> ze2Var) {
        return new xi0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(Collections.singleton(ch0.a(this.f5979a.get(), cs.f)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
