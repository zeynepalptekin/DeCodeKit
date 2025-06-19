package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class dg0 implements pe2<Set<ch0<tb0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final qf0 f3122a;

    private dg0(qf0 qf0Var) {
        this.f3122a = qf0Var;
    }

    public static dg0 a(qf0 qf0Var) {
        return new dg0(qf0Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(this.f3122a.i(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
