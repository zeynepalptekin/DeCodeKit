package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class za extends rs<u9> {
    private fq<u9> d;

    /* renamed from: c, reason: collision with root package name */
    private final Object f6238c = new Object();
    private boolean e = false;
    private int f = 0;

    public za(fq<u9> fqVar) {
        this.d = fqVar;
    }

    private final void j() {
        synchronized (this.f6238c) {
            com.google.android.gms.common.internal.r.q(this.f >= 0);
            if (this.e && this.f == 0) {
                oo.m("No reference is left (including root). Cleaning up engine.");
                d(new ab(this), new ps());
            } else {
                oo.m("There are still references to the engine. Not destroying.");
            }
        }
    }

    public final va g() {
        va vaVar = new va(this);
        synchronized (this.f6238c) {
            d(new ya(this, vaVar), new bb(this, vaVar));
            com.google.android.gms.common.internal.r.q(this.f >= 0);
            this.f++;
        }
        return vaVar;
    }

    protected final void h() {
        synchronized (this.f6238c) {
            com.google.android.gms.common.internal.r.q(this.f > 0);
            oo.m("Releasing 1 reference for JS Engine");
            this.f--;
            j();
        }
    }

    public final void i() {
        synchronized (this.f6238c) {
            com.google.android.gms.common.internal.r.q(this.f >= 0);
            oo.m("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.e = true;
            j();
        }
    }
}
