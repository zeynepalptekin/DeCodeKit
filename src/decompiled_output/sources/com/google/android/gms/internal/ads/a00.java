package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class a00 implements pe2<kj> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f2609a;

    public a00(ze2<Context> ze2Var) {
        this.f2609a = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        Context context = this.f2609a.get();
        return (kj) we2.b(new ij(context, new pj(context).a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
