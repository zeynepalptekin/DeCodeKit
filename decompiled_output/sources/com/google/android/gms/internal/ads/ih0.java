package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class ih0 implements pe2<gh0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Set<ch0<lh0>>> f3824a;

    private ih0(ze2<Set<ch0<lh0>>> ze2Var) {
        this.f3824a = ze2Var;
    }

    public static ih0 a(ze2<Set<ch0<lh0>>> ze2Var) {
        return new ih0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new gh0(this.f3824a.get());
    }
}
