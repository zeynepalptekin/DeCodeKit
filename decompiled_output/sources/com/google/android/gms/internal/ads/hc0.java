package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class hc0 implements pe2<cc0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Set<ch0<bb0>>> f3660a;

    private hc0(ze2<Set<ch0<bb0>>> ze2Var) {
        this.f3660a = ze2Var;
    }

    public static hc0 a(ze2<Set<ch0<bb0>>> ze2Var) {
        return new hc0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new cc0(this.f3660a.get());
    }
}
