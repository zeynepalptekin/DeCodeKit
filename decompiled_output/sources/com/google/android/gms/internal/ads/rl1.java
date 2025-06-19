package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class rl1 implements rx1<qq0> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ i81 f5153a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ wl1 f5154b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ql1 f5155c;

    rl1(ql1 ql1Var, i81 i81Var, wl1 wl1Var) {
        this.f5155c = ql1Var;
        this.f5153a = i81Var;
        this.f5154b = wl1Var;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        tq0 tq0Var = (tq0) this.f5155c.e.a();
        final dw2 dw2VarC = tq0Var == null ? vn1.c(th, null) : tq0Var.b().l(th);
        synchronized (this.f5155c) {
            if (tq0Var != null) {
                tq0Var.c().i(dw2VarC);
                if (((Boolean) qx2.e().c(e0.n5)).booleanValue()) {
                    this.f5155c.f5034b.execute(new Runnable(this, dw2VarC) { // from class: com.google.android.gms.internal.ads.tl1
                        private final rl1 d;
                        private final dw2 e;

                        {
                            this.d = this;
                            this.e = dw2VarC;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            rl1 rl1Var = this.d;
                            rl1Var.f5155c.d.i(this.e);
                        }
                    });
                }
            } else {
                this.f5155c.d.i(dw2VarC);
                this.f5155c.g(this.f5154b).p().b().h().G();
            }
            nn1.a(dw2VarC.d, th, "RewardedAdLoader.onFailure");
            this.f5153a.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(qq0 qq0Var) {
        qq0 qq0Var2 = qq0Var;
        synchronized (this.f5155c) {
            if (((Boolean) qx2.e().c(e0.n5)).booleanValue()) {
                qq0Var2.f().f(this.f5155c.d);
            }
            this.f5153a.b(qq0Var2);
            if (((Boolean) qx2.e().c(e0.n5)).booleanValue()) {
                this.f5155c.f5034b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ul1
                    private final rl1 d;

                    {
                        this.d = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.f5155c.d.u();
                    }
                });
            }
            this.f5155c.d.c();
        }
    }
}
