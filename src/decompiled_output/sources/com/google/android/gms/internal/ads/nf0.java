package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class nf0 implements pe2<ef0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Set<ch0<mf0>>> f4528a;

    private nf0(ze2<Set<ch0<mf0>>> ze2Var) {
        this.f4528a = ze2Var;
    }

    public static nf0 a(ze2<Set<ch0<mf0>>> ze2Var) {
        return new nf0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new ef0(this.f4528a.get());
    }
}
