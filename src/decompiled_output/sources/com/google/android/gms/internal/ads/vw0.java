package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class vw0 extends tw0 {
    private static final Pattern g = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: b, reason: collision with root package name */
    private final xv0 f5744b;

    /* renamed from: c, reason: collision with root package name */
    private final cy1 f5745c;
    private final an1 d;
    private final ScheduledExecutorService e;
    private final vz0 f;

    vw0(nd0 nd0Var, an1 an1Var, xv0 xv0Var, cy1 cy1Var, ScheduledExecutorService scheduledExecutorService, vz0 vz0Var) {
        super(nd0Var);
        this.d = an1Var;
        this.f5744b = xv0Var;
        this.f5745c = cy1Var;
        this.e = scheduledExecutorService;
        this.f = vz0Var;
    }

    @Override // com.google.android.gms.internal.ads.tw0
    public final dy1<wm1> d(wi wiVar) throws uv0 {
        dy1<wm1> dy1VarJ = qx1.j(this.f5744b.b(wiVar), new ax1(this) { // from class: com.google.android.gms.internal.ads.yw0

            /* renamed from: a, reason: collision with root package name */
            private final vw0 f6191a;

            {
                this.f6191a = this;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f6191a.g((InputStream) obj);
            }
        }, this.f5745c);
        if (((Boolean) qx2.e().c(e0.I3)).booleanValue()) {
            dy1VarJ = qx1.k(qx1.d(dy1VarJ, ((Integer) qx2.e().c(e0.J3)).intValue(), TimeUnit.SECONDS, this.e), TimeoutException.class, xw0.f6050a, cs.f);
        }
        qx1.f(dy1VarJ, new ax0(this), cs.f);
        return dy1VarJ;
    }

    final /* synthetic */ dy1 g(InputStream inputStream) throws Exception {
        return qx1.g(new wm1(new vm1(this.d), um1.a(new InputStreamReader(inputStream))));
    }
}
