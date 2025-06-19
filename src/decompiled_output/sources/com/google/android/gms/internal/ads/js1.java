package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.ads.vc0;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@com.google.android.gms.common.util.d0
/* loaded from: classes.dex */
final class js1 implements d.a, d.b {

    @com.google.android.gms.common.util.d0
    private gt1 d;
    private final String e;
    private final String f;
    private final ch2 g;
    private final int h = 1;
    private final LinkedBlockingQueue<rt1> i;
    private final HandlerThread j;
    private final xr1 k;
    private final long l;

    public js1(Context context, int r8, ch2 ch2Var, String str, String str2, String str3, xr1 xr1Var) {
        this.e = str;
        this.g = ch2Var;
        this.f = str2;
        this.k = xr1Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.j = handlerThread;
        handlerThread.start();
        this.l = System.currentTimeMillis();
        this.d = new gt1(context, this.j.getLooper(), this, this, 19621000);
        this.i = new LinkedBlockingQueue<>();
        this.d.a();
    }

    private final void d() {
        gt1 gt1Var = this.d;
        if (gt1Var != null) {
            if (gt1Var.D() || this.d.E()) {
                this.d.e();
            }
        }
    }

    private final jt1 e() {
        try {
            return this.d.m0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @com.google.android.gms.common.util.d0
    private static rt1 f() {
        return new rt1(null, 1);
    }

    private final void g(int r4, long j, Exception exc) {
        xr1 xr1Var = this.k;
        if (xr1Var != null) {
            xr1Var.b(r4, System.currentTimeMillis() - j, exc);
        }
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void a(int r4) throws InterruptedException {
        try {
            g(4011, this.l, null);
            this.i.put(f());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.d.b
    public final void b(c.a.b.b.d.c cVar) throws InterruptedException {
        try {
            g(4012, this.l, null);
            this.i.put(f());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void c(Bundle bundle) {
        jt1 jt1VarE = e();
        if (jt1VarE != null) {
            try {
                rt1 rt1VarK5 = jt1VarE.k5(new pt1(this.h, this.g, this.e, this.f));
                g(5011, this.l, null);
                this.i.put(rt1VarK5);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public final rt1 h(int r5) throws InterruptedException {
        rt1 rt1VarPoll;
        try {
            rt1VarPoll = this.i.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            g(2009, this.l, e);
            rt1VarPoll = null;
        }
        g(3004, this.l, null);
        if (rt1VarPoll != null) {
            xr1.f(rt1VarPoll.f == 7 ? vc0.a.c.DISABLED : vc0.a.c.ENABLED);
        }
        return rt1VarPoll == null ? f() : rt1VarPoll;
    }
}
