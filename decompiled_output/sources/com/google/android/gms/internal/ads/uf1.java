package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class uf1 implements ff1<rf1> {

    /* renamed from: a, reason: collision with root package name */
    private final vn f5512a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f5513b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f5514c;
    private final Executor d;

    public uf1(vn vnVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f5512a = vnVar;
        this.f5513b = context;
        this.f5514c = scheduledExecutorService;
        this.d = executor;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<rf1> a() {
        if (!((Boolean) qx2.e().c(e0.y0)).booleanValue()) {
            return qx1.a(new Exception("Did not ad Ad ID into query param."));
        }
        return lx1.H(this.f5512a.b(this.f5513b)).D(tf1.f5396a, this.d).C(((Long) qx2.e().c(e0.z0)).longValue(), TimeUnit.MILLISECONDS, this.f5514c).E(Throwable.class, new ru1(this) { // from class: com.google.android.gms.internal.ads.wf1

            /* renamed from: a, reason: collision with root package name */
            private final uf1 f5829a;

            {
                this.f5829a = this;
            }

            @Override // com.google.android.gms.internal.ads.ru1
            public final Object a(Object obj) {
                return this.f5829a.b((Throwable) obj);
            }
        }, this.d);
    }

    final /* synthetic */ rf1 b(Throwable th) {
        qx2.a();
        return new rf1(null, jr.m(this.f5513b));
    }
}
