package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* loaded from: classes.dex */
public final class gv0 implements com.google.android.gms.ads.c0.a, bb0, cb0, sb0, tb0, nc0, od0, ir1, zv2 {
    private final List<Object> d;
    private final uu0 e;
    private long f;

    public gv0(uu0 uu0Var, gz gzVar) {
        this.e = uu0Var;
        this.d = Collections.singletonList(gzVar);
    }

    private final void g(Class<?> cls, String str, Object... objArr) throws IOException {
        uu0 uu0Var = this.e;
        List<Object> list = this.d;
        String strValueOf = String.valueOf(cls.getSimpleName());
        uu0Var.a(list, strValueOf.length() != 0 ? "Event-".concat(strValueOf) : new String("Event-"), str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final void D(Context context) throws IOException {
        g(sb0.class, "onPause", context);
    }

    @Override // com.google.android.gms.ads.c0.a
    public final void Q(String str, String str2) throws IOException {
        g(com.google.android.gms.ads.c0.a.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final void U() throws IOException {
        g(tb0.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.ir1
    public final void a(zq1 zq1Var, String str) throws IOException {
        g(ar1.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.ir1
    public final void b(zq1 zq1Var, String str) throws IOException {
        g(ar1.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.ir1
    public final void c(zq1 zq1Var, String str) throws IOException {
        g(ar1.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.ir1
    public final void d(zq1 zq1Var, String str, Throwable th) throws IOException {
        g(ar1.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final void e(Context context) throws IOException {
        g(sb0.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void e0(wi wiVar) throws IOException {
        this.f = com.google.android.gms.ads.internal.p.j().c();
        g(od0.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.bb0
    @ParametersAreNonnullByDefault
    public final void f(qj qjVar, String str, String str2) throws IOException {
        g(bb0.class, "onRewarded", qjVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void h() throws IOException {
        g(bb0.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.cb0
    public final void i(dw2 dw2Var) throws IOException {
        g(cb0.class, "onAdFailedToLoad", Integer.valueOf(dw2Var.d), dw2Var.e, dw2Var.f);
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void k0() throws IOException {
        g(bb0.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void l0() throws IOException {
        g(bb0.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zv2
    public final void p() throws IOException {
        g(zv2.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final void q(Context context) throws IOException {
        g(sb0.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void r() throws IOException {
        g(bb0.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void s() throws IOException {
        g(bb0.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void t(wm1 wm1Var) {
    }

    @Override // com.google.android.gms.internal.ads.nc0
    public final void u() throws IOException {
        long jC = com.google.android.gms.ads.internal.p.j().c() - this.f;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(jC);
        oo.m(sb.toString());
        g(nc0.class, "onAdLoaded", new Object[0]);
    }
}
