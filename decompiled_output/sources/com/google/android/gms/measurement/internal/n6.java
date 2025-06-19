package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class n6 implements Runnable {
    private final /* synthetic */ long d;
    private final /* synthetic */ f6 e;

    n6(f6 f6Var, long j) {
        this.e = f6Var;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.i().p.b(this.d);
        this.e.B().M().b("Minimum session duration set", Long.valueOf(this.d));
    }
}
