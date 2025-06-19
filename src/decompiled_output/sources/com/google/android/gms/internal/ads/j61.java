package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class j61<AdT> implements u01<AdT> {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.i0
    private final b1 f3923a;

    /* renamed from: b, reason: collision with root package name */
    private final cy1 f3924b;

    /* renamed from: c, reason: collision with root package name */
    private final cr1 f3925c;
    private final k61<AdT> d;

    public j61(cr1 cr1Var, cy1 cy1Var, @androidx.annotation.i0 b1 b1Var, k61<AdT> k61Var) {
        this.f3925c = cr1Var;
        this.f3924b = cy1Var;
        this.f3923a = b1Var;
        this.d = k61Var;
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final boolean a(wm1 wm1Var, km1 km1Var) {
        nm1 nm1Var;
        return (this.f3923a == null || (nm1Var = km1Var.r) == null || nm1Var.f4569a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final dy1<AdT> b(wm1 wm1Var, km1 km1Var) {
        ks ksVar = new ks();
        r61 r61Var = new r61();
        r61Var.d(new l61(this, ksVar, wm1Var, km1Var, r61Var));
        nm1 nm1Var = km1Var.r;
        final u0 u0Var = new u0(r61Var, nm1Var.f4570b, nm1Var.f4569a);
        return this.f3925c.g(zq1.CUSTOM_RENDER_SYN).a(new lq1(this, u0Var) { // from class: com.google.android.gms.internal.ads.i61

            /* renamed from: a, reason: collision with root package name */
            private final j61 f3776a;

            /* renamed from: b, reason: collision with root package name */
            private final u0 f3777b;

            {
                this.f3776a = this;
                this.f3777b = u0Var;
            }

            @Override // com.google.android.gms.internal.ads.lq1
            public final void run() throws Exception {
                this.f3776a.d(this.f3777b);
            }
        }, this.f3924b).j(zq1.CUSTOM_RENDER_ACK).h(ksVar).f();
    }

    final /* synthetic */ void d(u0 u0Var) throws Exception {
        this.f3923a.V4(u0Var);
    }
}
