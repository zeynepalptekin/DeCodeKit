package com.google.android.gms.measurement.internal;

import android.os.Handler;
import c.a.b.b.g.c.jf;

/* loaded from: classes.dex */
abstract class k {
    private static volatile Handler d;

    /* renamed from: a, reason: collision with root package name */
    private final x5 f6423a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f6424b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f6425c;

    k(x5 x5Var) {
        com.google.android.gms.common.internal.r.k(x5Var);
        this.f6423a = x5Var;
        this.f6424b = new j(this, x5Var);
    }

    static /* synthetic */ long a(k kVar, long j) {
        kVar.f6425c = 0L;
        return 0L;
    }

    private final Handler f() {
        Handler handler;
        if (d != null) {
            return d;
        }
        synchronized (k.class) {
            if (d == null) {
                d = new jf(this.f6423a.F().getMainLooper());
            }
            handler = d;
        }
        return handler;
    }

    public abstract void b();

    public final void c(long j) {
        e();
        if (j >= 0) {
            this.f6425c = this.f6423a.z().a();
            if (f().postDelayed(this.f6424b, j)) {
                return;
            }
            this.f6423a.B().E().b("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean d() {
        return this.f6425c != 0;
    }

    final void e() {
        this.f6425c = 0L;
        f().removeCallbacks(this.f6424b);
    }
}
