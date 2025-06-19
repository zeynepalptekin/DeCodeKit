package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class v8 implements Runnable {
    private final /* synthetic */ o3 d;
    private final /* synthetic */ s8 e;

    v8(s8 s8Var, o3 o3Var) {
        this.e = s8Var;
        this.d = o3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.e) {
            s8.f(this.e, false);
            if (!this.e.f.W()) {
                this.e.f.B().N().a("Connected to service");
                this.e.f.K(this.d);
            }
        }
    }
}
