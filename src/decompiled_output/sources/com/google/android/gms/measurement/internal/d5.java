package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class d5 implements Runnable {
    private final /* synthetic */ g6 d;
    private final /* synthetic */ b5 e;

    d5(b5 b5Var, g6 g6Var) {
        this.e = b5Var;
        this.d = g6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.i(this.d);
        this.e.c(this.d.g);
    }
}
