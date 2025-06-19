package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class cg0 implements pe2<Set<ch0<bb0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final qf0 f2969a;

    private cg0(qf0 qf0Var) {
        this.f2969a = qf0Var;
    }

    public static cg0 a(qf0 qf0Var) {
        return new cg0(qf0Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(this.f2969a.b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
