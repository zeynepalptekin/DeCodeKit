package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class v10 implements pe2<is1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f5626a;

    public v10(ze2<Context> ze2Var) {
        this.f5626a = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (is1) we2.b(new is1(this.f5626a.get(), com.google.android.gms.ads.internal.p.q().b()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
