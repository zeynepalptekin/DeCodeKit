package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class cx0 implements ay0 {
    private static final Pattern f = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a, reason: collision with root package name */
    private final xv0 f3041a;

    /* renamed from: b, reason: collision with root package name */
    private final cy1 f3042b;

    /* renamed from: c, reason: collision with root package name */
    private final an1 f3043c;
    private final ScheduledExecutorService d;
    private final vz0 e;

    cx0(an1 an1Var, xv0 xv0Var, cy1 cy1Var, ScheduledExecutorService scheduledExecutorService, vz0 vz0Var) {
        this.f3043c = an1Var;
        this.f3041a = xv0Var;
        this.f3042b = cy1Var;
        this.d = scheduledExecutorService;
        this.e = vz0Var;
    }

    @Override // com.google.android.gms.internal.ads.ay0
    public final dy1<wm1> a(wi wiVar) {
        dy1<wm1> dy1VarJ = qx1.j(this.f3041a.b(wiVar), new ax1(this) { // from class: com.google.android.gms.internal.ads.bx0

            /* renamed from: a, reason: collision with root package name */
            private final cx0 f2894a;

            {
                this.f2894a = this;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f2894a.d((InputStream) obj);
            }
        }, this.f3042b);
        if (((Boolean) qx2.e().c(e0.I3)).booleanValue()) {
            dy1VarJ = qx1.k(qx1.d(dy1VarJ, ((Integer) qx2.e().c(e0.J3)).intValue(), TimeUnit.SECONDS, this.d), TimeoutException.class, ex0.f3337a, cs.f);
        }
        qx1.f(dy1VarJ, new dx0(this), cs.f);
        return dy1VarJ;
    }

    final /* synthetic */ dy1 d(InputStream inputStream) throws Exception {
        return qx1.g(new wm1(new vm1(this.f3043c), um1.a(new InputStreamReader(inputStream))));
    }
}
