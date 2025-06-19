package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class b40 implements pe2<Set<ch0<sr2>>> {

    /* renamed from: a, reason: collision with root package name */
    private final w30 f2790a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<v60> f2791b;

    public b40(w30 w30Var, ze2<v60> ze2Var) {
        this.f2790a = w30Var;
        this.f2791b = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(Collections.singleton(new ch0(this.f2791b.get(), cs.f)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
