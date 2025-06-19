package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class ou0 implements pe2<lu0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<fu0> f4745a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Set<ku0>> f4746b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<com.google.android.gms.common.util.g> f4747c;

    private ou0(ze2<fu0> ze2Var, ze2<Set<ku0>> ze2Var2, ze2<com.google.android.gms.common.util.g> ze2Var3) {
        this.f4745a = ze2Var;
        this.f4746b = ze2Var2;
        this.f4747c = ze2Var3;
    }

    public static ou0 a(ze2<fu0> ze2Var, ze2<Set<ku0>> ze2Var2, ze2<com.google.android.gms.common.util.g> ze2Var3) {
        return new ou0(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new lu0(this.f4745a.get(), this.f4746b.get(), this.f4747c.get());
    }
}
