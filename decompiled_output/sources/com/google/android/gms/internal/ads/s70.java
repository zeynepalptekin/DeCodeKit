package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class s70 implements rx1<e70> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ rx1 f5227a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ l70 f5228b;

    s70(l70 l70Var, rx1 rx1Var) {
        this.f5228b = l70Var;
        this.f5227a = rx1Var;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        this.f5228b.g();
        this.f5227a.a(th);
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(e70 e70Var) {
        this.f5228b.g();
        this.f5227a.b(e70Var);
    }
}
