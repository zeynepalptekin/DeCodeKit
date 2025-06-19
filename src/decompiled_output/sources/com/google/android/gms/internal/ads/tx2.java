package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class tx2 extends com.google.android.gms.ads.c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f5457a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.gms.ads.c f5458b;

    @Override // com.google.android.gms.ads.c
    public void f() {
        synchronized (this.f5457a) {
            if (this.f5458b != null) {
                this.f5458b.f();
            }
        }
    }

    @Override // com.google.android.gms.ads.c
    public void g(int r3) {
        synchronized (this.f5457a) {
            if (this.f5458b != null) {
                this.f5458b.g(r3);
            }
        }
    }

    @Override // com.google.android.gms.ads.c
    public void h(com.google.android.gms.ads.m mVar) {
        synchronized (this.f5457a) {
            if (this.f5458b != null) {
                this.f5458b.h(mVar);
            }
        }
    }

    @Override // com.google.android.gms.ads.c
    public void j() {
        synchronized (this.f5457a) {
            if (this.f5458b != null) {
                this.f5458b.j();
            }
        }
    }

    @Override // com.google.android.gms.ads.c
    public void k() {
        synchronized (this.f5457a) {
            if (this.f5458b != null) {
                this.f5458b.k();
            }
        }
    }

    @Override // com.google.android.gms.ads.c
    public void l() {
        synchronized (this.f5457a) {
            if (this.f5458b != null) {
                this.f5458b.l();
            }
        }
    }

    public final void m(com.google.android.gms.ads.c cVar) {
        synchronized (this.f5457a) {
            this.f5458b = cVar;
        }
    }
}
