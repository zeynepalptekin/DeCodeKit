package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class uf0 implements pe2<ab0> {

    /* renamed from: a, reason: collision with root package name */
    private final qf0 f5510a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Set<ch0<cb0>>> f5511b;

    private uf0(qf0 qf0Var, ze2<Set<ch0<cb0>>> ze2Var) {
        this.f5510a = qf0Var;
        this.f5511b = ze2Var;
    }

    public static uf0 a(qf0 qf0Var, ze2<Set<ch0<cb0>>> ze2Var) {
        return new uf0(qf0Var, ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ab0) we2.b(this.f5510a.n(this.f5511b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
