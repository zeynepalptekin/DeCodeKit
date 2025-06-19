package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class q40 implements pe2<Set<ch0<sr2>>> {

    /* renamed from: a, reason: collision with root package name */
    private final o40 f4948a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<v60> f4949b;

    public q40(o40 o40Var, ze2<v60> ze2Var) {
        this.f4948a = o40Var;
        this.f4949b = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(Collections.singleton(new ch0(this.f4949b.get(), cs.f)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
