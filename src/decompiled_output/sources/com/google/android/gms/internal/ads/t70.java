package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class t70 implements rx1<k70> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ rx1 f5352a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ l70 f5353b;

    t70(l70 l70Var, rx1 rx1Var) {
        this.f5353b = l70Var;
        this.f5352a = rx1Var;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        this.f5352a.a(th);
        this.f5353b.g();
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(k70 k70Var) {
        this.f5353b.f(k70Var.f4058a, this.f5352a);
    }
}
