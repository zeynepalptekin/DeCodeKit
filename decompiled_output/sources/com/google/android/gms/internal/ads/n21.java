package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class n21 implements rx1<e50> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ i21 f4478a;

    n21(i21 i21Var) {
        this.f4478a = i21Var;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        dw2 dw2VarL = this.f4478a.f3753a.c().l(th);
        this.f4478a.d.i(dw2VarL);
        nn1.a(dw2VarL.d, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(e50 e50Var) {
        e50Var.b();
    }
}
