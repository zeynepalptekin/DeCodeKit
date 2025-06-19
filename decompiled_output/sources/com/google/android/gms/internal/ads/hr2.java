package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class hr2 implements Runnable {
    private final /* synthetic */ int d;
    private final /* synthetic */ int e;
    private final /* synthetic */ int f;
    private final /* synthetic */ float g;
    private final /* synthetic */ er2 h;

    hr2(er2 er2Var, int r2, int r3, int r4, float f) {
        this.h = er2Var;
        this.d = r2;
        this.e = r3;
        this.f = r4;
        this.g = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.f3321b.A(this.d, this.e, this.f, this.g);
    }
}
