package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class am1 implements i81<qq0> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ yl1 f2711a;

    am1(yl1 yl1Var) {
        this.f2711a = yl1Var;
    }

    @Override // com.google.android.gms.internal.ads.i81
    public final void a() {
        synchronized (this.f2711a) {
            this.f2711a.j = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.i81
    public final /* synthetic */ void b(qq0 qq0Var) {
        qq0 qq0Var2 = qq0Var;
        synchronized (this.f2711a) {
            this.f2711a.j = qq0Var2;
            this.f2711a.j.b();
        }
    }
}
