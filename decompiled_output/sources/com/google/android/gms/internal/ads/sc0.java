package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class sc0 implements pe2<qc0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Set<ch0<com.google.android.gms.ads.k0.a>>> f5241a;

    private sc0(ze2<Set<ch0<com.google.android.gms.ads.k0.a>>> ze2Var) {
        this.f5241a = ze2Var;
    }

    public static sc0 a(ze2<Set<ch0<com.google.android.gms.ads.k0.a>>> ze2Var) {
        return new sc0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new qc0(this.f5241a.get());
    }
}
