package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class uj2 implements kj2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ sj2 f5535a;

    private uj2(sj2 sj2Var) {
        this.f5535a = sj2Var;
    }

    @Override // com.google.android.gms.internal.ads.kj2
    public final void a(int r2) {
        this.f5535a.V.g(r2);
        sj2.Q(r2);
    }

    @Override // com.google.android.gms.internal.ads.kj2
    public final void b() {
        sj2.P();
        sj2.N(this.f5535a, true);
    }

    @Override // com.google.android.gms.internal.ads.kj2
    public final void c(int r8, long j, long j2) {
        this.f5535a.V.b(r8, j, j2);
        sj2.M(r8, j, j2);
    }
}
