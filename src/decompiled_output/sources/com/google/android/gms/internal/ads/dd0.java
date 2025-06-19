package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class dd0 implements pe2<wc0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Set<ch0<com.google.android.gms.ads.internal.overlay.p>>> f3116a;

    private dd0(ze2<Set<ch0<com.google.android.gms.ads.internal.overlay.p>>> ze2Var) {
        this.f3116a = ze2Var;
    }

    public static dd0 a(ze2<Set<ch0<com.google.android.gms.ads.internal.overlay.p>>> ze2Var) {
        return new dd0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new wc0(this.f3116a.get());
    }
}
