package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class q61 implements k61<gi0> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4961a;

    /* renamed from: b, reason: collision with root package name */
    private final hj0 f4962b;

    public q61(Context context, hj0 hj0Var) {
        this.f4961a = context;
        this.f4962b = hj0Var;
    }

    @Override // com.google.android.gms.internal.ads.k61
    public final /* synthetic */ gi0 a(wm1 wm1Var, km1 km1Var, View view, r61 r61Var) {
        ii0 ii0VarA = this.f4962b.a(new v70(wm1Var, km1Var, null), new s61(this, t61.f5350a));
        r61Var.d(new v61(this, ii0VarA));
        return ii0VarA.j();
    }
}
