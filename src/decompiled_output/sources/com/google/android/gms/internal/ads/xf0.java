package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class xf0 implements pe2<Set<ch0<zv2>>> {

    /* renamed from: a, reason: collision with root package name */
    private final qf0 f5972a;

    private xf0(qf0 qf0Var) {
        this.f5972a = qf0Var;
    }

    public static xf0 a(qf0 qf0Var) {
        return new xf0(qf0Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(this.f5972a.h(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
