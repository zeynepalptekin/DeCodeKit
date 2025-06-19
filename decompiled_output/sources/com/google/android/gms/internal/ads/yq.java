package com.google.android.gms.internal.ads;

import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class yq {

    /* renamed from: a, reason: collision with root package name */
    private long f6163a;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("lock")
    private long f6164b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private final Object f6165c = new Object();

    public yq(long j) {
        this.f6163a = j;
    }

    public final boolean a() {
        synchronized (this.f6165c) {
            long jC = com.google.android.gms.ads.internal.p.j().c();
            if (this.f6164b + this.f6163a > jC) {
                return false;
            }
            this.f6164b = jC;
            return true;
        }
    }

    public final void b(long j) {
        synchronized (this.f6165c) {
            this.f6163a = j;
        }
    }
}
