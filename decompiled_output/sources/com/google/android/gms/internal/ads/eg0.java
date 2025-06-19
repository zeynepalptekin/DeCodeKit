package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class eg0 implements pe2<Set<ch0<com.google.android.gms.ads.k0.a>>> {

    /* renamed from: a, reason: collision with root package name */
    private final qf0 f3268a;

    private eg0(qf0 qf0Var) {
        this.f3268a = qf0Var;
    }

    public static eg0 a(qf0 qf0Var) {
        return new eg0(qf0Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(this.f3268a.f(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
