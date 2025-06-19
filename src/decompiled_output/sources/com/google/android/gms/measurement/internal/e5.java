package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class e5 implements Runnable {
    private final /* synthetic */ ma d;
    private final /* synthetic */ c5 e;

    e5(c5 c5Var, ma maVar) {
        this.e = c5Var;
        this.d = maVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.e.k0();
        t9 t9Var = this.e.e;
        ma maVar = this.d;
        t9Var.x().c();
        t9Var.i0();
        com.google.android.gms.common.internal.r.g(maVar.d);
        t9Var.V(maVar);
    }
}
