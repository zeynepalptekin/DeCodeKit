package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class qb0 implements pe2<ob0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Set<ch0<tb0>>> f4977a;

    private qb0(ze2<Set<ch0<tb0>>> ze2Var) {
        this.f4977a = ze2Var;
    }

    public static qb0 a(ze2<Set<ch0<tb0>>> ze2Var) {
        return new qb0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new ob0(this.f4977a.get());
    }
}
