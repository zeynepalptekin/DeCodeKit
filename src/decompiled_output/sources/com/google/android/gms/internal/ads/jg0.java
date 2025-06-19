package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class jg0 implements pe2<Set<ch0<com.google.android.gms.ads.c0.a>>> {

    /* renamed from: a, reason: collision with root package name */
    private final qf0 f3961a;

    private jg0(qf0 qf0Var) {
        this.f3961a = qf0Var;
    }

    public static jg0 a(qf0 qf0Var) {
        return new jg0(qf0Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(this.f3961a.g(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
