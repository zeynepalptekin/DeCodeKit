package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class lz0 implements pe2<mz0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f4319a;

    private lz0(ze2<Context> ze2Var) {
        this.f4319a = ze2Var;
    }

    public static lz0 a(ze2<Context> ze2Var) {
        return new lz0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new mz0(this.f4319a.get());
    }
}
