package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class dh1 implements ff1<ah1> {

    /* renamed from: a, reason: collision with root package name */
    private gc f3125a;

    /* renamed from: b, reason: collision with root package name */
    private ScheduledExecutorService f3126b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3127c;
    private ApplicationInfo d;

    public dh1(gc gcVar, ScheduledExecutorService scheduledExecutorService, boolean z, ApplicationInfo applicationInfo) {
        this.f3125a = gcVar;
        this.f3126b = scheduledExecutorService;
        this.f3127c = z;
        this.d = applicationInfo;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<ah1> a() {
        if (!p1.f4770b.a().booleanValue()) {
            return qx1.a(new Exception("Auto Collect Location by gms is disabled."));
        }
        if (!this.f3127c) {
            return qx1.a(new Exception("Auto Collect Location is false."));
        }
        return qx1.i(qx1.d(this.f3125a.a(this.d), ((Long) qx2.e().c(e0.u2)).longValue(), TimeUnit.MILLISECONDS, this.f3126b), ch1.f2973a, cs.f3023a);
    }
}
