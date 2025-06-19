package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class cw2 implements Runnable {
    private final b d;
    private final k8 e;
    private final Runnable f;

    public cw2(b bVar, k8 k8Var, Runnable runnable) {
        this.d = bVar;
        this.e = k8Var;
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.j();
        if (this.e.a()) {
            this.d.q(this.e.f4062a);
        } else {
            this.d.r(this.e.f4064c);
        }
        if (this.e.d) {
            this.d.s("intermediate-response");
        } else {
            this.d.y("done");
        }
        Runnable runnable = this.f;
        if (runnable != null) {
            runnable.run();
        }
    }
}
