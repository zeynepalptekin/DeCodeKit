package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class te0 implements pe2<re0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Set<ch0<we0>>> f5392a;

    private te0(ze2<Set<ch0<we0>>> ze2Var) {
        this.f5392a = ze2Var;
    }

    public static te0 a(ze2<Set<ch0<we0>>> ze2Var) {
        return new te0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new re0(this.f5392a.get());
    }
}
