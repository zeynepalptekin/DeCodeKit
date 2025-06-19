package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class z51 implements jc0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6225a = false;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ w01 f6226b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ ks f6227c;
    private final /* synthetic */ t51 d;

    z51(t51 t51Var, w01 w01Var, ks ksVar) {
        this.d = t51Var;
        this.f6226b = w01Var;
        this.f6227c = ksVar;
    }

    private final void b(dw2 dw2Var) {
        xn1 xn1Var = xn1.INTERNAL_ERROR;
        if (((Boolean) qx2.e().c(e0.F3)).booleanValue()) {
            xn1Var = xn1.NO_FILL;
        }
        this.f6227c.b(new y01(xn1Var, dw2Var));
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public final void E(int r8) {
        if (this.f6225a) {
            return;
        }
        b(new dw2(r8, t51.d(this.f6226b.f5758a, r8), com.google.android.gms.ads.a.e, null, null));
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public final synchronized void a(int r7, @androidx.annotation.i0 String str) {
        if (this.f6225a) {
            return;
        }
        this.f6225a = true;
        if (str == null) {
            str = t51.d(this.f6226b.f5758a, r7);
        }
        b(new dw2(r7, str, com.google.android.gms.ads.a.e, null, null));
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public final synchronized void i(dw2 dw2Var) {
        this.f6225a = true;
        b(dw2Var);
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public final synchronized void u() {
        this.f6227c.a(null);
    }
}
