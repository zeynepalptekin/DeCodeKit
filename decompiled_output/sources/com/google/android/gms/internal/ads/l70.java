package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l70 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4209a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f4210b;

    /* renamed from: c, reason: collision with root package name */
    private final dy1<k70> f4211c;
    private volatile boolean d = true;

    public l70(Executor executor, ScheduledExecutorService scheduledExecutorService, dy1<k70> dy1Var) {
        this.f4209a = executor;
        this.f4210b = scheduledExecutorService;
        this.f4211c = dy1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(List<? extends dy1<? extends e70>> list, final rx1<e70> rx1Var) {
        if (list == null || list.isEmpty()) {
            this.f4209a.execute(new Runnable(rx1Var) { // from class: com.google.android.gms.internal.ads.o70
                private final rx1 d;

                {
                    this.d = rx1Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.d.a(new uv0(xn1.NO_FILL));
                }
            });
            return;
        }
        dy1 dy1VarG = qx1.g(null);
        for (final dy1<? extends e70> dy1Var : list) {
            dy1VarG = qx1.j(qx1.k(dy1VarG, Throwable.class, new ax1(rx1Var) { // from class: com.google.android.gms.internal.ads.n70

                /* renamed from: a, reason: collision with root package name */
                private final rx1 f4500a;

                {
                    this.f4500a = rx1Var;
                }

                @Override // com.google.android.gms.internal.ads.ax1
                public final dy1 a(Object obj) {
                    this.f4500a.a((Throwable) obj);
                    return qx1.g(null);
                }
            }, this.f4209a), new ax1(this, rx1Var, dy1Var) { // from class: com.google.android.gms.internal.ads.r70

                /* renamed from: a, reason: collision with root package name */
                private final l70 f5107a;

                /* renamed from: b, reason: collision with root package name */
                private final rx1 f5108b;

                /* renamed from: c, reason: collision with root package name */
                private final dy1 f5109c;

                {
                    this.f5107a = this;
                    this.f5108b = rx1Var;
                    this.f5109c = dy1Var;
                }

                @Override // com.google.android.gms.internal.ads.ax1
                public final dy1 a(Object obj) {
                    return this.f5107a.b(this.f5108b, this.f5109c, (e70) obj);
                }
            }, this.f4209a);
        }
        qx1.f(dy1VarG, new s70(this, rx1Var), this.f4209a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        cs.e.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.p70
            private final l70 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.h();
            }
        });
    }

    public final boolean a() {
        return this.d;
    }

    final /* synthetic */ dy1 b(rx1 rx1Var, dy1 dy1Var, e70 e70Var) throws Exception {
        if (e70Var != null) {
            rx1Var.b(e70Var);
        }
        return qx1.d(dy1Var, k2.f4045b.a().longValue(), TimeUnit.MILLISECONDS, this.f4210b);
    }

    public final void e(rx1<e70> rx1Var) {
        qx1.f(this.f4211c, new t70(this, rx1Var), this.f4209a);
    }

    final /* synthetic */ void h() {
        this.d = false;
    }
}
