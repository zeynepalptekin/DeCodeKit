package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes.dex */
public final class a40 {

    /* renamed from: a, reason: collision with root package name */
    private final hu0 f2626a;

    /* renamed from: b, reason: collision with root package name */
    private final wm1 f2627b;

    public a40(hu0 hu0Var, wm1 wm1Var) {
        this.f2626a = hu0Var;
        this.f2627b = wm1Var;
    }

    public final void a(long j) {
        this.f2626a.b().a(this.f2627b.f5858b.f5551b).h("action", "ad_closed").h("show_time", String.valueOf(j)).h(FirebaseAnalytics.b.f6877b, "appopen").c();
    }
}
