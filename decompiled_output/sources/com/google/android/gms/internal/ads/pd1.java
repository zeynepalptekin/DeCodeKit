package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.cf1;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class pd1<S extends cf1<?>> implements ff1<S> {

    /* renamed from: a, reason: collision with root package name */
    private final ff1<S> f4805a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4806b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f4807c;

    public pd1(ff1<S> ff1Var, long j, ScheduledExecutorService scheduledExecutorService) {
        this.f4805a = ff1Var;
        this.f4806b = j;
        this.f4807c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<S> a() {
        dy1<S> dy1VarA = this.f4805a.a();
        long j = this.f4806b;
        if (j > 0) {
            dy1VarA = qx1.d(dy1VarA, j, TimeUnit.MILLISECONDS, this.f4807c);
        }
        return qx1.k(dy1VarA, Throwable.class, sd1.f5247a, cs.f);
    }
}
