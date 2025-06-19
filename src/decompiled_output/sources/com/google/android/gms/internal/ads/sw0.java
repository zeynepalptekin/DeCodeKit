package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class sw0 {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f5315a;

    /* renamed from: b, reason: collision with root package name */
    private final cy1 f5316b;

    /* renamed from: c, reason: collision with root package name */
    private final nx0 f5317c;
    private final je2<my0> d;

    public sw0(ScheduledExecutorService scheduledExecutorService, cy1 cy1Var, nx0 nx0Var, je2<my0> je2Var) {
        this.f5315a = scheduledExecutorService;
        this.f5316b = cy1Var;
        this.f5317c = nx0Var;
        this.d = je2Var;
    }

    final /* synthetic */ dy1 a(wi wiVar, int r2, Throwable th) throws Exception {
        return this.d.get().F8(wiVar, r2);
    }

    public final dy1<InputStream> b(final wi wiVar) {
        String str = wiVar.g;
        com.google.android.gms.ads.internal.p.c();
        dy1<InputStream> dy1VarA = to.Z(str) ? qx1.a(new dy0(xn1.INTERNAL_ERROR)) : this.f5317c.e(wiVar);
        final int callingUid = Binder.getCallingUid();
        return lx1.H(dy1VarA).C(((Integer) qx2.e().c(e0.J3)).intValue(), TimeUnit.SECONDS, this.f5315a).F(Throwable.class, new ax1(this, wiVar, callingUid) { // from class: com.google.android.gms.internal.ads.rw0

            /* renamed from: a, reason: collision with root package name */
            private final sw0 f5191a;

            /* renamed from: b, reason: collision with root package name */
            private final wi f5192b;

            /* renamed from: c, reason: collision with root package name */
            private final int f5193c;

            {
                this.f5191a = this;
                this.f5192b = wiVar;
                this.f5193c = callingUid;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f5191a.a(this.f5192b, this.f5193c, (Throwable) obj);
            }
        }, this.f5316b);
    }
}
