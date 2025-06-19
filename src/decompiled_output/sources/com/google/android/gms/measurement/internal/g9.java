package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class g9 implements Runnable {
    private final /* synthetic */ long d;
    private final /* synthetic */ e9 e;

    g9(e9 e9Var, long j) {
        this.e = e9Var;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.J(this.d);
    }
}
