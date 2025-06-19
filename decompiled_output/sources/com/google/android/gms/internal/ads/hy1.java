package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class hy1 implements Runnable {
    private final /* synthetic */ Runnable d;
    private final /* synthetic */ ey1 e;

    hy1(ey1 ey1Var, Runnable runnable) {
        this.e = ey1Var;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.d = false;
        this.d.run();
    }

    public final String toString() {
        return this.d.toString();
    }
}
