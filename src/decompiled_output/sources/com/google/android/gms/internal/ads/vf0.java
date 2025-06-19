package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class vf0 implements pe2<Set<ch0<com.google.android.gms.ads.internal.overlay.p>>> {

    /* renamed from: a, reason: collision with root package name */
    private final qf0 f5673a;

    private vf0(qf0 qf0Var) {
        this.f5673a = qf0Var;
    }

    public static vf0 a(qf0 qf0Var) {
        return new vf0(qf0Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(this.f5673a.l(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
