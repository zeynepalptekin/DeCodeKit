package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class dm1 implements i81<qq0> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ em1 f3140a;

    dm1(em1 em1Var) {
        this.f3140a = em1Var;
    }

    @Override // com.google.android.gms.internal.ads.i81
    public final void a() {
        synchronized (this.f3140a) {
            this.f3140a.h = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.i81
    public final /* synthetic */ void b(qq0 qq0Var) {
        qq0 qq0Var2 = qq0Var;
        synchronized (this.f3140a) {
            this.f3140a.h = qq0Var2;
            this.f3140a.h.b();
        }
    }
}
