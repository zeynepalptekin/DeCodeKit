package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class t5 implements Runnable {
    private final /* synthetic */ ma d;
    private final /* synthetic */ c5 e;

    t5(c5 c5Var, ma maVar) {
        this.e = c5Var;
        this.d = maVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.e.k0();
        this.e.e.S(this.d);
    }
}
