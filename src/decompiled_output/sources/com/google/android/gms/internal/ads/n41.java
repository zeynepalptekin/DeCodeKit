package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n41<AdT> implements ax1<wm1, AdT> {

    /* renamed from: a, reason: collision with root package name */
    private final cr1 f4486a;

    /* renamed from: b, reason: collision with root package name */
    private final ab0 f4487b;

    /* renamed from: c, reason: collision with root package name */
    private final lr1 f4488c;
    private final nr1 d;
    private final Executor e;
    private final ScheduledExecutorService f;
    private final f70<AdT> g;
    private final g41 h;
    private final x01 i;

    public n41(cr1 cr1Var, g41 g41Var, ab0 ab0Var, lr1 lr1Var, nr1 nr1Var, f70<AdT> f70Var, Executor executor, ScheduledExecutorService scheduledExecutorService, x01 x01Var) {
        this.f4486a = cr1Var;
        this.h = g41Var;
        this.f4487b = ab0Var;
        this.f4488c = lr1Var;
        this.d = nr1Var;
        this.g = f70Var;
        this.e = executor;
        this.f = scheduledExecutorService;
        this.i = x01Var;
    }

    @Override // com.google.android.gms.internal.ads.ax1
    public final /* synthetic */ dy1 a(wm1 wm1Var) throws Exception {
        boolean z;
        final wm1 wm1Var2 = wm1Var;
        mm1 mm1Var = wm1Var2.f5858b.f5551b.g;
        kq1 kq1VarF = this.f4486a.g(zq1.RENDER_CONFIG_INIT).d(qx1.a(new k41(xn1.NO_FILL, mm1Var != null ? mm1Var.a() : "No ad config."))).f();
        this.f4487b.F0(new u20(wm1Var2, this.d, this.f4488c), this.e);
        int r2 = 0;
        if (((Boolean) qx2.e().c(e0.x5)).booleanValue()) {
            for (km1 km1Var : wm1Var2.f5858b.f5550a) {
                this.i.d(km1Var);
                Iterator<String> it = km1Var.f4111a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    u01<AdT> u01VarA = this.g.a(km1Var.f4112b, it.next());
                    if (u01VarA != null && u01VarA.a(wm1Var2, km1Var)) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    this.i.b(km1Var, 0L, vn1.b(xn1.INTERNAL_ERROR, null, null));
                }
            }
        }
        for (final km1 km1Var2 : wm1Var2.f5858b.f5550a) {
            Iterator<String> it2 = km1Var2.f4111a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String next = it2.next();
                final u01<AdT> u01VarA2 = this.g.a(km1Var2.f4112b, next);
                if (u01VarA2 != null && u01VarA2.a(wm1Var2, km1Var2)) {
                    uq1<I> uq1VarB = this.f4486a.b(zq1.RENDER_CONFIG_WATERFALL, kq1VarF);
                    StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 26);
                    sb.append("render-config-");
                    sb.append(r2);
                    sb.append("-");
                    sb.append(next);
                    kq1VarF = uq1VarB.i(sb.toString()).e(Throwable.class, new ax1(this, wm1Var2, km1Var2, u01VarA2) { // from class: com.google.android.gms.internal.ads.m41

                        /* renamed from: a, reason: collision with root package name */
                        private final n41 f4343a;

                        /* renamed from: b, reason: collision with root package name */
                        private final wm1 f4344b;

                        /* renamed from: c, reason: collision with root package name */
                        private final km1 f4345c;
                        private final u01 d;

                        {
                            this.f4343a = this;
                            this.f4344b = wm1Var2;
                            this.f4345c = km1Var2;
                            this.d = u01VarA2;
                        }

                        @Override // com.google.android.gms.internal.ads.ax1
                        public final dy1 a(Object obj) {
                            return this.f4343a.c(this.f4344b, this.f4345c, this.d, (Throwable) obj);
                        }
                    }).f();
                    break;
                }
            }
            r2++;
        }
        return kq1VarF;
    }

    final /* synthetic */ dy1 c(wm1 wm1Var, km1 km1Var, u01 u01Var, Throwable th) throws Exception {
        return this.h.b(wm1Var.f5858b.f5551b, km1Var, qx1.d(u01Var.b(wm1Var, km1Var), km1Var.M, TimeUnit.MILLISECONDS, this.f));
    }
}
