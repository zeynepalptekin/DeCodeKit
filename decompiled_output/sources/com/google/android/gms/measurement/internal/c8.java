package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class c8 implements Runnable {
    private final /* synthetic */ boolean d;
    private final /* synthetic */ ca e;
    private final /* synthetic */ ma f;
    private final /* synthetic */ x7 g;

    c8(x7 x7Var, boolean z, ca caVar, ma maVar) {
        this.g = x7Var;
        this.d = z;
        this.e = caVar;
        this.f = maVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        o3 o3Var = this.g.d;
        if (o3Var == null) {
            this.g.B().E().a("Discarding data. Failed to set user property");
        } else {
            this.g.L(o3Var, this.d ? null : this.e, this.f);
            this.g.f0();
        }
    }
}
