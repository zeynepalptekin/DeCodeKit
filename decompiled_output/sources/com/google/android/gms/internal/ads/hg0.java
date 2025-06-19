package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class hg0 implements pe2<Set<ch0<xc0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final qf0 f3667a;

    private hg0(qf0 qf0Var) {
        this.f3667a = qf0Var;
    }

    public static hg0 a(qf0 qf0Var) {
        return new hg0(qf0Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(this.f3667a.j(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
