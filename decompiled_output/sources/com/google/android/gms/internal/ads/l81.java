package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class l81 implements rx1<e70> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ i81 f4216a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ek0 f4217b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k81 f4218c;

    l81(k81 k81Var, i81 i81Var, ek0 ek0Var) {
        this.f4218c = k81Var;
        this.f4216a = i81Var;
        this.f4217b = ek0Var;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        final dw2 dw2VarL = this.f4217b.c().l(th);
        this.f4217b.d().i(dw2VarL);
        if (((Boolean) qx2.e().c(e0.q5)).booleanValue()) {
            this.f4218c.f4068b.e().execute(new Runnable(this, dw2VarL) { // from class: com.google.android.gms.internal.ads.n81
                private final l81 d;
                private final dw2 e;

                {
                    this.d = this;
                    this.e = dw2VarL;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    l81 l81Var = this.d;
                    l81Var.f4218c.d.e().i(this.e);
                }
            });
        }
        nn1.a(dw2VarL.d, th, "NativeAdLoader.onFailure");
        this.f4216a.a();
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(e70 e70Var) {
        e70 e70Var2 = e70Var;
        synchronized (this.f4218c) {
            if (((Boolean) qx2.e().c(e0.q5)).booleanValue()) {
                e70Var2.f().d(this.f4218c.d.b());
            }
            this.f4216a.b(e70Var2);
            if (((Boolean) qx2.e().c(e0.q5)).booleanValue()) {
                this.f4218c.f4068b.e().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.o81
                    private final l81 d;

                    {
                        this.d = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.f4218c.d.d().u();
                    }
                });
            }
        }
    }
}
