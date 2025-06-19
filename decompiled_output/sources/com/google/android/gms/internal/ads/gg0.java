package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class gg0 implements pe2<Set<ch0<hd0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final qf0 f3534a;

    private gg0(qf0 qf0Var) {
        this.f3534a = qf0Var;
    }

    public static gg0 a(qf0 qf0Var) {
        return new gg0(qf0Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(this.f3534a.k(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
