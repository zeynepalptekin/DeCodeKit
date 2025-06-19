package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class e7 implements Runnable {
    private final /* synthetic */ boolean d;
    private final /* synthetic */ f6 e;

    e7(f6 f6Var, boolean z) {
        this.e = f6Var;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        boolean zL = this.e.f6543a.l();
        boolean zT = this.e.f6543a.T();
        this.e.f6543a.k(this.d);
        if (zT == this.d) {
            this.e.f6543a.B().N().b("Default data collection state already set to", Boolean.valueOf(this.d));
        }
        if (this.e.f6543a.l() == zL || this.e.f6543a.l() != this.e.f6543a.T()) {
            this.e.f6543a.B().K().c("Default data collection is different than actual status", Boolean.valueOf(this.d), Boolean.valueOf(zL));
        }
        this.e.r0();
    }
}
