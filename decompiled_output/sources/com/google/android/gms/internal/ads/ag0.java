package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class ag0 implements pe2<Set<ch0<pb0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final qf0 f2682a;

    private ag0(qf0 qf0Var) {
        this.f2682a = qf0Var;
    }

    public static ag0 a(qf0 qf0Var) {
        return new ag0(qf0Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(this.f2682a.e(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
