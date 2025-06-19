package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.location.Location;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ec1 implements ff1<bc1> {

    /* renamed from: a, reason: collision with root package name */
    private gc f3252a;

    /* renamed from: b, reason: collision with root package name */
    private ScheduledExecutorService f3253b;

    /* renamed from: c, reason: collision with root package name */
    private qo f3254c;
    private ApplicationInfo d;
    an1 e;

    public ec1(gc gcVar, ScheduledExecutorService scheduledExecutorService, qo qoVar, ApplicationInfo applicationInfo, an1 an1Var) {
        this.f3252a = gcVar;
        this.f3253b = scheduledExecutorService;
        this.f3254c = qoVar;
        this.d = applicationInfo;
        this.e = an1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<bc1> a() {
        dy1 dy1VarK;
        if (p1.f4769a.a().booleanValue() && this.f3254c.v()) {
            dy1VarK = qx1.k(qx1.d(this.f3252a.a(this.d), ((Long) qx2.e().c(e0.u2)).longValue(), TimeUnit.MILLISECONDS, this.f3253b), Throwable.class, gc1.f3520a, cs.f);
        } else {
            dy1VarK = qx1.g(null);
        }
        return qx1.i(qx1.i(dy1VarK, new ru1(this) { // from class: com.google.android.gms.internal.ads.hc1

            /* renamed from: a, reason: collision with root package name */
            private final ec1 f3661a;

            {
                this.f3661a = this;
            }

            @Override // com.google.android.gms.internal.ads.ru1
            public final Object a(Object obj) {
                Location location = (Location) obj;
                return location != null ? location : this.f3661a.e.d.n;
            }
        }, this.f3253b), dc1.f3113a, cs.f3023a);
    }
}
