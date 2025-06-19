package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class ff0 implements pe2<df0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Set<ch0<com.google.android.gms.ads.c0.a>>> f3403a;

    private ff0(ze2<Set<ch0<com.google.android.gms.ads.c0.a>>> ze2Var) {
        this.f3403a = ze2Var;
    }

    public static ff0 a(ze2<Set<ch0<com.google.android.gms.ads.c0.a>>> ze2Var) {
        return new ff0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new df0(this.f3403a.get());
    }
}
