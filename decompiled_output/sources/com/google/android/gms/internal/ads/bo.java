package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class bo {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2855a;

    /* renamed from: b, reason: collision with root package name */
    private volatile int f2856b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f2857c;

    private bo() {
        this.f2855a = new Object();
        this.f2856b = eo.f3294a;
        this.f2857c = 0L;
    }

    /* synthetic */ bo(co coVar) {
        this();
    }

    public final void a() {
        long jA = com.google.android.gms.ads.internal.p.j().a();
        synchronized (this.f2855a) {
            if (this.f2856b == eo.f3296c) {
                if (this.f2857c + ((Long) qx2.e().c(e0.f4)).longValue() <= jA) {
                    this.f2856b = eo.f3294a;
                }
            }
        }
        long jA2 = com.google.android.gms.ads.internal.p.j().a();
        synchronized (this.f2855a) {
            if (this.f2856b != 2) {
                return;
            }
            this.f2856b = 3;
            if (this.f2856b == eo.f3296c) {
                this.f2857c = jA2;
            }
        }
    }
}
