package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class i21 implements u01<e50> {

    /* renamed from: a, reason: collision with root package name */
    private final b60 f3753a;

    /* renamed from: b, reason: collision with root package name */
    private final n11 f3754b;

    /* renamed from: c, reason: collision with root package name */
    private final cy1 f3755c;
    private final ab0 d;
    private final ScheduledExecutorService e;

    public i21(b60 b60Var, n11 n11Var, ab0 ab0Var, ScheduledExecutorService scheduledExecutorService, cy1 cy1Var) {
        this.f3753a = b60Var;
        this.f3754b = n11Var;
        this.d = ab0Var;
        this.e = scheduledExecutorService;
        this.f3755c = cy1Var;
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final boolean a(wm1 wm1Var, km1 km1Var) {
        return wm1Var.f5857a.f5710a.a() != null && this.f3754b.a(wm1Var, km1Var);
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final dy1<e50> b(final wm1 wm1Var, final km1 km1Var) {
        return this.f3755c.submit(new Callable(this, wm1Var, km1Var) { // from class: com.google.android.gms.internal.ads.l21

            /* renamed from: a, reason: collision with root package name */
            private final i21 f4184a;

            /* renamed from: b, reason: collision with root package name */
            private final wm1 f4185b;

            /* renamed from: c, reason: collision with root package name */
            private final km1 f4186c;

            {
                this.f4184a = this;
                this.f4185b = wm1Var;
                this.f4186c = km1Var;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4184a.e(this.f4185b, this.f4186c);
            }
        });
    }

    final /* synthetic */ e50 e(final wm1 wm1Var, final km1 km1Var) throws Exception {
        return this.f3753a.b(new v70(wm1Var, km1Var, null), new q60(wm1Var.f5857a.f5710a.a(), new Runnable(this, wm1Var, km1Var) { // from class: com.google.android.gms.internal.ads.k21
            private final i21 d;
            private final wm1 e;
            private final km1 f;

            {
                this.d = this;
                this.e = wm1Var;
                this.f = km1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.f(this.e, this.f);
            }
        })).a();
    }

    final /* synthetic */ void f(wm1 wm1Var, km1 km1Var) {
        qx1.f(qx1.d(this.f3754b.b(wm1Var, km1Var), km1Var.M, TimeUnit.SECONDS, this.e), new n21(this), this.f3755c);
    }
}
