package com.google.android.gms.internal.ads;

/* JADX INFO: Add missing generic type declarations: [AppOpenAd] */
/* loaded from: classes.dex */
final class ni1<AppOpenAd> implements rx1<AppOpenAd> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ i81 f4544a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ pi1 f4545b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ hi1 f4546c;

    ni1(hi1 hi1Var, i81 i81Var, pi1 pi1Var) {
        this.f4546c = hi1Var;
        this.f4544a = i81Var;
        this.f4545b = pi1Var;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        j40 j40Var = (j40) this.f4546c.e.a();
        final dw2 dw2VarC = j40Var == null ? vn1.c(th, null) : j40Var.b().l(th);
        synchronized (this.f4546c) {
            hi1.e(this.f4546c, null);
            if (j40Var != null) {
                j40Var.c().i(dw2VarC);
                if (((Boolean) qx2.e().c(e0.o5)).booleanValue()) {
                    this.f4546c.f3680b.execute(new Runnable(this, dw2VarC) { // from class: com.google.android.gms.internal.ads.mi1
                        private final ni1 d;
                        private final dw2 e;

                        {
                            this.d = this;
                            this.e = dw2VarC;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ni1 ni1Var = this.d;
                            ni1Var.f4546c.d.i(this.e);
                        }
                    });
                }
            } else {
                this.f4546c.d.i(dw2VarC);
                ((j40) this.f4546c.h(this.f4545b).d()).b().h().G();
            }
            nn1.a(dw2VarC.d, th, "AppOpenAdLoader.onFailure");
            this.f4544a.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(Object obj) {
        e70 e70Var = (e70) obj;
        synchronized (this.f4546c) {
            hi1.e(this.f4546c, null);
            if (((Boolean) qx2.e().c(e0.o5)).booleanValue()) {
                e70Var.f().e(this.f4546c.d);
            }
            this.f4544a.b(e70Var);
        }
    }
}
