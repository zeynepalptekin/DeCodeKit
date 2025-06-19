package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class f implements Runnable {
    private final /* synthetic */ LifecycleCallback d;
    private final /* synthetic */ String e;
    private final /* synthetic */ g f;

    f(g gVar, LifecycleCallback lifecycleCallback, String str) {
        this.f = gVar;
        this.d = lifecycleCallback;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f.e > 0) {
            this.d.g(this.f.f != null ? this.f.f.getBundle(this.e) : null);
        }
        if (this.f.e >= 2) {
            this.d.k();
        }
        if (this.f.e >= 3) {
            this.d.i();
        }
        if (this.f.e >= 4) {
            this.d.l();
        }
        if (this.f.e >= 5) {
            this.d.h();
        }
    }
}
