package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class db1 implements ff1<ab1> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3104a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f3105b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f3106c;

    public db1(Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f3104a = context;
        this.f3105b = scheduledExecutorService;
        this.f3106c = executor;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<ab1> a() {
        if (!((Boolean) qx2.e().c(e0.x4)).booleanValue()) {
            return qx1.g(null);
        }
        final ks ksVar = new ks();
        try {
            new nu1(ksVar) { // from class: com.google.android.gms.internal.ads.cb1

                /* renamed from: a, reason: collision with root package name */
                private final ks f2953a;

                {
                    this.f2953a = ksVar;
                }

                @Override // com.google.android.gms.internal.ads.nu1
                public final void a(boolean z) {
                    this.f2953a.a(Boolean.FALSE);
                }
            }.a(false);
        } catch (Throwable unused) {
            tr.g("ArCoreApk is not ready.");
            ksVar.a(Boolean.FALSE);
        }
        return qx1.k(qx1.i(qx1.d(ksVar, 200L, TimeUnit.MILLISECONDS, this.f3105b), new ru1(this) { // from class: com.google.android.gms.internal.ads.gb1

            /* renamed from: a, reason: collision with root package name */
            private final db1 f3518a;

            {
                this.f3518a = this;
            }

            @Override // com.google.android.gms.internal.ads.ru1
            public final Object a(Object obj) {
                return new ab1(false, false, ((Boolean) obj).booleanValue());
            }
        }, this.f3106c), Throwable.class, fb1.f3396a, this.f3106c);
    }
}
