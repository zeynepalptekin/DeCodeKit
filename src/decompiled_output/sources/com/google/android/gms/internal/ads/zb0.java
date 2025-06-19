package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class zb0 implements pe2<wb0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Set<ch0<sb0>>> f6245a;

    private zb0(ze2<Set<ch0<sb0>>> ze2Var) {
        this.f6245a = ze2Var;
    }

    public static zb0 a(ze2<Set<ch0<sb0>>> ze2Var) {
        return new zb0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new wb0(this.f6245a.get());
    }
}
