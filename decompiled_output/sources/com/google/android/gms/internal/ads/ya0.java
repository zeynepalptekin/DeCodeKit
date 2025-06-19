package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class ya0 implements pe2<wa0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Set<ch0<zv2>>> f6112a;

    private ya0(ze2<Set<ch0<zv2>>> ze2Var) {
        this.f6112a = ze2Var;
    }

    public static ya0 a(ze2<Set<ch0<zv2>>> ze2Var) {
        return new ya0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new wa0(this.f6112a.get());
    }
}
