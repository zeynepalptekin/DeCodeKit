package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class w7 implements Runnable {
    private final /* synthetic */ long d;
    private final /* synthetic */ s7 e;

    w7(s7 s7Var, long j) {
        this.e = s7Var;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.k().r(this.d);
        this.e.e = null;
    }
}
