package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class h5 implements Runnable {
    private final /* synthetic */ va d;
    private final /* synthetic */ c5 e;

    h5(c5 c5Var, va vaVar) {
        this.e = c5Var;
        this.d = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.e.k0();
        if (this.d.f.h() == null) {
            this.e.e.T(this.d);
        } else {
            this.e.e.u(this.d);
        }
    }
}
