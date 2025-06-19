package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final /* synthetic */ class b51 implements Runnable {
    private final ur0 d;

    private b51(ur0 ur0Var) {
        this.d = ur0Var;
    }

    static Runnable a(ur0 ur0Var) {
        return new b51(ur0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a();
    }
}
