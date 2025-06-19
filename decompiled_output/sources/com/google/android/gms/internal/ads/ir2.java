package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ir2 implements Runnable {
    private final /* synthetic */ int d;
    private final /* synthetic */ long e;
    private final /* synthetic */ er2 f;

    ir2(er2 er2Var, int r2, long j) {
        this.f = er2Var;
        this.d = r2;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.f3321b.w(this.d, this.e);
    }
}
