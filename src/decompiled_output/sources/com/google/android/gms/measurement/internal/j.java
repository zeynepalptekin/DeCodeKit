package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class j implements Runnable {
    private final /* synthetic */ x5 d;
    private final /* synthetic */ k e;

    j(k kVar, x5 x5Var) {
        this.e = kVar;
        this.d = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.d.e();
        if (wa.a()) {
            this.d.x().v(this);
            return;
        }
        boolean zD = this.e.d();
        k.a(this.e, 0L);
        if (zD) {
            this.e.b();
        }
    }
}
