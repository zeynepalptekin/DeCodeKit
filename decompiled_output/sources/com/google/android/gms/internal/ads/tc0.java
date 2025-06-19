package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class tc0 implements pe2<rc0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Set<ch0<xc0>>> f5382a;

    private tc0(ze2<Set<ch0<xc0>>> ze2Var) {
        this.f5382a = ze2Var;
    }

    public static tc0 a(ze2<Set<ch0<xc0>>> ze2Var) {
        return new tc0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new rc0(this.f5382a.get());
    }
}
