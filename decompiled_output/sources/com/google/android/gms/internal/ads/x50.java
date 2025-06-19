package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class x50 implements pe2<mm> {

    /* renamed from: a, reason: collision with root package name */
    private final h50 f5933a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f5934b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<an1> f5935c;

    public x50(h50 h50Var, ze2<Context> ze2Var, ze2<an1> ze2Var2) {
        this.f5933a = h50Var;
        this.f5934b = ze2Var;
        this.f5935c = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (mm) we2.b(new mm(this.f5934b.get(), this.f5935c.get().f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
