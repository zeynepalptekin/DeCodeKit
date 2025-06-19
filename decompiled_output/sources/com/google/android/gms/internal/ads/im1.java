package com.google.android.gms.internal.ads;

import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class im1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.g f3838a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f3839b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("lock")
    private volatile int f3840c = hm1.f3689a;
    private volatile long d = 0;

    public im1(com.google.android.gms.common.util.g gVar) {
        this.f3838a = gVar;
    }

    private final void a() {
        long jA = this.f3838a.a();
        synchronized (this.f3839b) {
            if (this.f3840c == hm1.f3691c) {
                if (this.d + ((Long) qx2.e().c(e0.f4)).longValue() <= jA) {
                    this.f3840c = hm1.f3689a;
                }
            }
        }
    }

    private final void e(int r5, int r6) {
        a();
        long jA = this.f3838a.a();
        synchronized (this.f3839b) {
            if (this.f3840c != r5) {
                return;
            }
            this.f3840c = r6;
            if (this.f3840c == hm1.f3691c) {
                this.d = jA;
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.f3839b) {
            a();
            z = this.f3840c == hm1.f3690b;
        }
        return z;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.f3839b) {
            a();
            z = this.f3840c == hm1.f3691c;
        }
        return z;
    }

    public final void d(boolean z) {
        int r2;
        int r0;
        if (z) {
            r2 = hm1.f3689a;
            r0 = hm1.f3690b;
        } else {
            r2 = hm1.f3690b;
            r0 = hm1.f3689a;
        }
        e(r2, r0);
    }

    public final void f() {
        e(hm1.f3690b, hm1.f3691c);
    }
}
