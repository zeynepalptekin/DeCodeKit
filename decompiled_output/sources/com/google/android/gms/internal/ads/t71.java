package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class t71 implements rx1<gi0> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ hj0 f5354a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u71 f5355b;

    t71(u71 u71Var, hj0 hj0Var) {
        this.f5355b = u71Var;
        this.f5354a = hj0Var;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        final dw2 dw2VarL = this.f5354a.b().l(th);
        synchronized (this.f5355b) {
            u71.B8(this.f5355b, null);
            this.f5354a.c().i(dw2VarL);
            if (((Boolean) qx2.e().c(e0.m5)).booleanValue()) {
                this.f5355b.e.e().execute(new Runnable(this, dw2VarL) { // from class: com.google.android.gms.internal.ads.y71
                    private final t71 d;
                    private final dw2 e;

                    {
                        this.d = this;
                        this.e = dw2VarL;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        t71 t71Var = this.d;
                        t71Var.f5355b.h.i(this.e);
                    }
                });
                this.f5355b.e.e().execute(new Runnable(this, dw2VarL) { // from class: com.google.android.gms.internal.ads.x71
                    private final t71 d;
                    private final dw2 e;

                    {
                        this.d = this;
                        this.e = dw2VarL;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        t71 t71Var = this.d;
                        t71Var.f5355b.j.i(this.e);
                    }
                });
            }
            nn1.a(dw2VarL.d, th, "InterstitialAdManagerShim.onFailure");
        }
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(gi0 gi0Var) {
        gi0 gi0Var2 = gi0Var;
        synchronized (this.f5355b) {
            u71.B8(this.f5355b, null);
            this.f5355b.n = gi0Var2;
            if (((Boolean) qx2.e().c(e0.p5)).booleanValue()) {
                gi0Var2.f().d(this.f5355b.h).c(this.f5355b.i).a(this.f5355b.k).f(this.f5355b.j);
            }
            gi0Var2.b();
            if (((Boolean) qx2.e().c(e0.p5)).booleanValue()) {
                this.f5355b.e.e().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.w71
                    private final t71 d;

                    {
                        this.d = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.f5355b.h.u();
                    }
                });
                this.f5355b.e.e().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.v71
                    private final t71 d;

                    {
                        this.d = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.f5355b.j.u();
                    }
                });
            }
        }
    }
}
