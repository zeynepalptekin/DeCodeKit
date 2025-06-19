package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class iq2 implements aq2 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f3858a;

    /* renamed from: b, reason: collision with root package name */
    private long f3859b;

    /* renamed from: c, reason: collision with root package name */
    private long f3860c;
    private ji2 d = ji2.d;

    public final void a() {
        if (this.f3858a) {
            return;
        }
        this.f3860c = SystemClock.elapsedRealtime();
        this.f3858a = true;
    }

    @Override // com.google.android.gms.internal.ads.aq2
    public final ji2 b() {
        return this.d;
    }

    public final void c() {
        if (this.f3858a) {
            g(f());
            this.f3858a = false;
        }
    }

    public final void d(aq2 aq2Var) {
        g(aq2Var.f());
        this.d = aq2Var.b();
    }

    @Override // com.google.android.gms.internal.ads.aq2
    public final ji2 e(ji2 ji2Var) {
        if (this.f3858a) {
            g(f());
        }
        this.d = ji2Var;
        return ji2Var;
    }

    @Override // com.google.android.gms.internal.ads.aq2
    public final long f() {
        long j = this.f3859b;
        if (!this.f3858a) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f3860c;
        ji2 ji2Var = this.d;
        return j + (ji2Var.f3968a == 1.0f ? ph2.b(jElapsedRealtime) : ji2Var.a(jElapsedRealtime));
    }

    public final void g(long j) {
        this.f3859b = j;
        if (this.f3858a) {
            this.f3860c = SystemClock.elapsedRealtime();
        }
    }
}
