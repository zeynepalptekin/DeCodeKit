package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class f21 implements pe2<b21> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f3362a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<b60> f3363b;

    public f21(ze2<Context> ze2Var, ze2<b60> ze2Var2) {
        this.f3362a = ze2Var;
        this.f3363b = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new b21(this.f3362a.get(), this.f3363b.get());
    }
}
