package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class d7 implements Runnable {
    private final /* synthetic */ Boolean d;
    private final /* synthetic */ f6 e;

    d7(f6 f6Var, Boolean bool) {
        this.e = f6Var;
        this.d = bool;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.e.U(this.d, true);
    }
}
