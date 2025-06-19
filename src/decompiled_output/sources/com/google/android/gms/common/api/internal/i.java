package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class i implements Runnable {
    private final /* synthetic */ LifecycleCallback d;
    private final /* synthetic */ String e;
    private final /* synthetic */ h f;

    i(h hVar, LifecycleCallback lifecycleCallback, String str) {
        this.f = hVar;
        this.d = lifecycleCallback;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f.h0 > 0) {
            this.d.g(this.f.i0 != null ? this.f.i0.getBundle(this.e) : null);
        }
        if (this.f.h0 >= 2) {
            this.d.k();
        }
        if (this.f.h0 >= 3) {
            this.d.i();
        }
        if (this.f.h0 >= 4) {
            this.d.l();
        }
        if (this.f.h0 >= 5) {
            this.d.h();
        }
    }
}
