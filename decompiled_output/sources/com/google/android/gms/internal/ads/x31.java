package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class x31 implements pe2<r31> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f5927a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<ek0> f5928b;

    public x31(ze2<Context> ze2Var, ze2<ek0> ze2Var2) {
        this.f5927a = ze2Var;
        this.f5928b = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new r31(this.f5927a.get(), this.f5928b.get());
    }
}
