package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class t6 implements Runnable {
    private final /* synthetic */ e6 d;
    private final /* synthetic */ f6 e;

    t6(f6 f6Var, e6 e6Var) {
        this.e = f6Var;
        this.d = e6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.O(this.d);
    }
}
