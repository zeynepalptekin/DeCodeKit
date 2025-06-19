package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class u10 implements pe2<iq> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f5470a;

    public u10(ze2<Context> ze2Var) {
        this.f5470a = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (iq) we2.b(new iq(this.f5470a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
