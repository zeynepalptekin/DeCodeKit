package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class bu implements Runnable {
    private mt d;
    private boolean e = false;

    bu(mt mtVar) {
        this.d = mtVar;
    }

    private final void c() {
        to.h.removeCallbacks(this);
        to.h.postDelayed(this, 250L);
    }

    public final void a() {
        this.e = true;
        this.d.G();
    }

    public final void b() {
        this.e = false;
        c();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e) {
            return;
        }
        this.d.G();
        c();
    }
}
