package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class lg0 implements pe2<Set<ch0<sr2>>> {

    /* renamed from: a, reason: collision with root package name */
    private final qf0 f4253a;

    private lg0(qf0 qf0Var) {
        this.f4253a = qf0Var;
    }

    public static lg0 a(qf0 qf0Var) {
        return new lg0(qf0Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
