package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class lo1 implements pe2<Context> {

    /* renamed from: a, reason: collision with root package name */
    private final go1 f4285a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<eo1> f4286b;

    private lo1(go1 go1Var, ze2<eo1> ze2Var) {
        this.f4285a = go1Var;
        this.f4286b = ze2Var;
    }

    public static Context a(go1 go1Var, eo1 eo1Var) {
        return (Context) we2.b(eo1Var.f3299a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public static lo1 b(go1 go1Var, ze2<eo1> ze2Var) {
        return new lo1(go1Var, ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f4285a, this.f4286b.get());
    }
}
