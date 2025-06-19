package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
final class l61 implements com.google.android.gms.ads.internal.g {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ks f4203a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ wm1 f4204b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ km1 f4205c;
    private final /* synthetic */ r61 d;
    private final /* synthetic */ j61 e;

    l61(j61 j61Var, ks ksVar, wm1 wm1Var, km1 km1Var, r61 r61Var) {
        this.e = j61Var;
        this.f4203a = ksVar;
        this.f4204b = wm1Var;
        this.f4205c = km1Var;
        this.d = r61Var;
    }

    @Override // com.google.android.gms.ads.internal.g
    public final void a() {
    }

    @Override // com.google.android.gms.ads.internal.g
    public final void b(View view) {
        this.f4203a.a(this.e.d.a(this.f4204b, this.f4205c, view, this.d));
    }

    @Override // com.google.android.gms.ads.internal.g
    public final void c() {
    }
}
