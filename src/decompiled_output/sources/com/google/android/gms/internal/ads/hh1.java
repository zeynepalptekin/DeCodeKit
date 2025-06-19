package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class hh1 implements ff1<eh1> {

    /* renamed from: a, reason: collision with root package name */
    private yg f3674a;

    /* renamed from: b, reason: collision with root package name */
    private ScheduledExecutorService f3675b;

    /* renamed from: c, reason: collision with root package name */
    private Context f3676c;

    public hh1(yg ygVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.f3674a = ygVar;
        this.f3675b = scheduledExecutorService;
        this.f3676c = context;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<eh1> a() {
        return qx1.i(qx1.d(this.f3674a.a(this.f3676c), ((Long) qx2.e().c(e0.C2)).longValue(), TimeUnit.MILLISECONDS, this.f3675b), gh1.f3538a, cs.f3023a);
    }
}
