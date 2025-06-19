package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class t20 implements bb0, pb0, tb0, nc0, zv2 {
    private final Context d;
    private final Executor e;
    private final ScheduledExecutorService f;
    private final wm1 g;
    private final km1 h;
    private final lr1 i;
    private final hn1 j;
    private final i52 k;
    private final f1 l;
    private final k1 m;

    @androidx.annotation.i0
    private final View n;

    @GuardedBy("this")
    private boolean o;

    @GuardedBy("this")
    private boolean p;

    public t20(Context context, Executor executor, ScheduledExecutorService scheduledExecutorService, wm1 wm1Var, km1 km1Var, lr1 lr1Var, hn1 hn1Var, @androidx.annotation.i0 View view, i52 i52Var, f1 f1Var, k1 k1Var) {
        this.d = context;
        this.e = executor;
        this.f = scheduledExecutorService;
        this.g = wm1Var;
        this.h = km1Var;
        this.i = lr1Var;
        this.j = hn1Var;
        this.k = i52Var;
        this.n = view;
        this.l = f1Var;
        this.m = k1Var;
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final synchronized void U() {
        if (!this.p) {
            String strD = ((Boolean) qx2.e().c(e0.W1)).booleanValue() ? this.k.h().d(this.d, this.n, null) : null;
            if (!x1.f5914b.a().booleanValue()) {
                this.j.c(this.i.c(this.g, this.h, false, strD, null, this.h.d));
                this.p = true;
            } else {
                qx1.f(lx1.H(this.m.a(this.d, null)).C(((Long) qx2.e().c(e0.z0)).longValue(), TimeUnit.MILLISECONDS, this.f), new v20(this, strD), this.e);
                this.p = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final void d(dw2 dw2Var) {
        if (((Boolean) qx2.e().c(e0.o1)).booleanValue()) {
            hn1 hn1Var = this.j;
            lr1 lr1Var = this.i;
            wm1 wm1Var = this.g;
            km1 km1Var = this.h;
            hn1Var.c(lr1Var.b(wm1Var, km1Var, km1Var.n));
        }
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void f(qj qjVar, String str, String str2) {
        hn1 hn1Var = this.j;
        lr1 lr1Var = this.i;
        km1 km1Var = this.h;
        hn1Var.c(lr1Var.a(km1Var, km1Var.h, qjVar));
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void k0() {
        hn1 hn1Var = this.j;
        lr1 lr1Var = this.i;
        wm1 wm1Var = this.g;
        km1 km1Var = this.h;
        hn1Var.c(lr1Var.b(wm1Var, km1Var, km1Var.g));
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void l0() {
        hn1 hn1Var = this.j;
        lr1 lr1Var = this.i;
        wm1 wm1Var = this.g;
        km1 km1Var = this.h;
        hn1Var.c(lr1Var.b(wm1Var, km1Var, km1Var.i));
    }

    @Override // com.google.android.gms.internal.ads.zv2
    public final void p() {
        if (x1.f5913a.a().booleanValue()) {
            qx1.f(lx1.H(this.m.b(this.d, null, this.l.b(), this.l.c())).C(((Long) qx2.e().c(e0.z0)).longValue(), TimeUnit.MILLISECONDS, this.f), new w20(this), this.e);
            return;
        }
        hn1 hn1Var = this.j;
        lr1 lr1Var = this.i;
        wm1 wm1Var = this.g;
        km1 km1Var = this.h;
        List<String> listB = lr1Var.b(wm1Var, km1Var, km1Var.f4113c);
        com.google.android.gms.ads.internal.p.c();
        hn1Var.a(listB, to.M(this.d) ? j01.f3893b : j01.f3892a);
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void r() {
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void s() {
    }

    @Override // com.google.android.gms.internal.ads.nc0
    public final synchronized void u() {
        hn1 hn1Var;
        List<String> listB;
        if (this.o) {
            ArrayList arrayList = new ArrayList(this.h.d);
            arrayList.addAll(this.h.f);
            hn1Var = this.j;
            listB = this.i.c(this.g, this.h, true, null, null, arrayList);
        } else {
            this.j.c(this.i.b(this.g, this.h, this.h.m));
            hn1Var = this.j;
            listB = this.i.b(this.g, this.h, this.h.f);
        }
        hn1Var.c(listB);
        this.o = true;
    }
}
