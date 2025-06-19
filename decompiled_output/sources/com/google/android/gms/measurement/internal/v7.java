package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class v7 implements Runnable {
    private final /* synthetic */ p7 d;
    private final /* synthetic */ long e;
    private final /* synthetic */ s7 f;

    v7(s7 s7Var, p7 p7Var, long j) {
        this.f = s7Var;
        this.d = p7Var;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.N(this.d, false, this.e);
        s7 s7Var = this.f;
        s7Var.e = null;
        s7Var.n().M(null);
    }
}
