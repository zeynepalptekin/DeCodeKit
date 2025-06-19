package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class oc0 implements pe2<mc0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Set<ch0<nc0>>> f4675a;

    private oc0(ze2<Set<ch0<nc0>>> ze2Var) {
        this.f4675a = ze2Var;
    }

    public static oc0 a(ze2<Set<ch0<nc0>>> ze2Var) {
        return new oc0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new mc0(this.f4675a.get());
    }
}
