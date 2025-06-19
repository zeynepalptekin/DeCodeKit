package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ig1 implements ff1<fg1> {

    /* renamed from: a, reason: collision with root package name */
    private final vn f3821a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3822b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f3823c;
    private final ao d;
    private final ScheduledExecutorService e;
    private final Executor f;

    public ig1(vn vnVar, int r2, Context context, ao aoVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f3821a = vnVar;
        this.f3822b = r2;
        this.f3823c = context;
        this.d = aoVar;
        this.e = scheduledExecutorService;
        this.f = executor;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<fg1> a() {
        return lx1.H(qx1.c(new bx1(this) { // from class: com.google.android.gms.internal.ads.hg1

            /* renamed from: a, reason: collision with root package name */
            private final ig1 f3668a;

            {
                this.f3668a = this;
            }

            @Override // com.google.android.gms.internal.ads.bx1
            public final dy1 a() {
                return this.f3668a.b();
            }
        }, this.f)).D(lg1.f4254a, this.f).C(((Long) qx2.e().c(e0.z0)).longValue(), TimeUnit.MILLISECONDS, this.e).E(Exception.class, new ru1(this) { // from class: com.google.android.gms.internal.ads.kg1

            /* renamed from: a, reason: collision with root package name */
            private final ig1 f4091a;

            {
                this.f4091a = this;
            }

            @Override // com.google.android.gms.internal.ads.ru1
            public final Object a(Object obj) {
                return this.f4091a.c((Exception) obj);
            }
        }, fy1.c());
    }

    final /* synthetic */ dy1 b() throws Exception {
        return this.f3821a.a(this.f3823c, this.f3822b);
    }

    final /* synthetic */ fg1 c(Exception exc) {
        this.d.e(exc, "AttestationTokenSignal");
        return null;
    }
}
