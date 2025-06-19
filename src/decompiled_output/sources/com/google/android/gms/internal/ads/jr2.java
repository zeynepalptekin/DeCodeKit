package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class jr2 implements Runnable {
    private final /* synthetic */ ck2 d;
    private final /* synthetic */ er2 e;

    jr2(er2 er2Var, ck2 ck2Var) {
        this.e = er2Var;
        this.d = ck2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a();
        this.e.f3321b.B(this.d);
    }
}
