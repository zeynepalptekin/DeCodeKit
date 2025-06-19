package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class fg0 implements pe2<Set<ch0<nc0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final qf0 f3407a;

    private fg0(qf0 qf0Var) {
        this.f3407a = qf0Var;
    }

    public static fg0 a(qf0 qf0Var) {
        return new fg0(qf0Var);
    }

    public static Set<ch0<nc0>> b(qf0 qf0Var) {
        return (Set) we2.b(qf0Var.c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return b(this.f3407a);
    }
}
