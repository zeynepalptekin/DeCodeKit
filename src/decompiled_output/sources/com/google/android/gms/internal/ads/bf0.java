package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class bf0 implements pe2<ve0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Set<ch0<af0>>> f2828a;

    private bf0(ze2<Set<ch0<af0>>> ze2Var) {
        this.f2828a = ze2Var;
    }

    public static bf0 a(ze2<Set<ch0<af0>>> ze2Var) {
        return new bf0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new ve0(this.f2828a.get());
    }
}
