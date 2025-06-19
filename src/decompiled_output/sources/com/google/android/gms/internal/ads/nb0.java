package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class nb0 implements pe2<ib0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Set<ch0<pb0>>> f4516a;

    private nb0(ze2<Set<ch0<pb0>>> ze2Var) {
        this.f4516a = ze2Var;
    }

    public static nb0 a(ze2<Set<ch0<pb0>>> ze2Var) {
        return new nb0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new ib0(this.f4516a.get());
    }
}
