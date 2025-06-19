package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class bg0 implements pe2<Set<ch0<cb0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final qf0 f2831a;

    private bg0(qf0 qf0Var) {
        this.f2831a = qf0Var;
    }

    public static bg0 a(qf0 qf0Var) {
        return new bg0(qf0Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(this.f2831a.d(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
