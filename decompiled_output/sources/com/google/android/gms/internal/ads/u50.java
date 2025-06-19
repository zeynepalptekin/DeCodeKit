package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class u50 implements pe2<Set<ch0<sr2>>> {

    /* renamed from: a, reason: collision with root package name */
    private final h50 f5480a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<v60> f5481b;

    public u50(h50 h50Var, ze2<v60> ze2Var) {
        this.f5480a = h50Var;
        this.f5481b = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(Collections.singleton(new ch0(this.f5481b.get(), cs.f)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
