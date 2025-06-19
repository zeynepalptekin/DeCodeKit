package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class dh0 implements pe2<wg0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Set<ch0<xg0>>> f3124a;

    private dh0(ze2<Set<ch0<xg0>>> ze2Var) {
        this.f3124a = ze2Var;
    }

    public static dh0 a(ze2<Set<ch0<xg0>>> ze2Var) {
        return new dh0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new wg0(this.f3124a.get());
    }
}
