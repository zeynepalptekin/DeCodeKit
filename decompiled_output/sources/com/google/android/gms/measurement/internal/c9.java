package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class c9 implements Runnable {
    private final /* synthetic */ t9 d;
    private final /* synthetic */ Runnable e;

    c9(b9 b9Var, t9 t9Var, Runnable runnable) {
        this.d = t9Var;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.k0();
        this.d.w(this.e);
        this.d.j0();
    }
}
