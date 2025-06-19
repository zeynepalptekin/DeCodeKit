package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class kg0 implements pe2<Set<ch0<lh0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final qf0 f4090a;

    private kg0(qf0 qf0Var) {
        this.f4090a = qf0Var;
    }

    public static kg0 a(qf0 qf0Var) {
        return new kg0(qf0Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
