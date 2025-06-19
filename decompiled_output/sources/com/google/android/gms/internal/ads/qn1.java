package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class qn1 implements xu1 {

    @androidx.annotation.i0
    private static qn1 p;
    private final Context d;
    private final nt1 e;
    private final xt1 f;
    private final yt1 g;
    private final if2 h;
    private final xr1 i;
    private final Executor j;
    private final ch2 k;
    private final tt1 l;

    @androidx.annotation.x0
    private volatile long m = 0;
    private final Object n = new Object();
    private volatile boolean o;

    @androidx.annotation.x0
    private qn1(@androidx.annotation.h0 Context context, @androidx.annotation.h0 xr1 xr1Var, @androidx.annotation.h0 nt1 nt1Var, @androidx.annotation.h0 xt1 xt1Var, @androidx.annotation.h0 yt1 yt1Var, @androidx.annotation.h0 if2 if2Var, @androidx.annotation.h0 Executor executor, @androidx.annotation.h0 vr1 vr1Var, ch2 ch2Var) {
        this.d = context;
        this.i = xr1Var;
        this.e = nt1Var;
        this.f = xt1Var;
        this.g = yt1Var;
        this.h = if2Var;
        this.j = executor;
        this.k = ch2Var;
        this.l = new tq1(this, vr1Var);
    }

    static qn1 h(@androidx.annotation.h0 Context context, @androidx.annotation.h0 xr1 xr1Var, @androidx.annotation.h0 yr1 yr1Var) {
        return i(context, xr1Var, yr1Var, Executors.newCachedThreadPool());
    }

    private static qn1 i(@androidx.annotation.h0 Context context, @androidx.annotation.h0 xr1 xr1Var, @androidx.annotation.h0 yr1 yr1Var, @androidx.annotation.h0 Executor executor) throws IOException {
        ks1 ks1VarB = ks1.b(context, executor, xr1Var, yr1Var);
        hf2 hf2Var = new hf2(context);
        if2 if2Var = new if2(yr1Var, ks1VarB, new vf2(context, hf2Var), hf2Var);
        ch2 ch2VarC = new bt1(context, xr1Var).c();
        vr1 vr1Var = new vr1();
        return new qn1(context, xr1Var, new nt1(context, ch2VarC), new xt1(context, ch2VarC), new yt1(context, if2Var, xr1Var, vr1Var), if2Var, executor, vr1Var, ch2VarC);
    }

    public static synchronized qn1 j(@androidx.annotation.h0 String str, @androidx.annotation.h0 Context context, boolean z) {
        if (p == null) {
            yr1 yr1VarA = yr1.c().d(str).b(z).a();
            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
            qn1 qn1VarI = i(context, xr1.a(context, executorServiceNewCachedThreadPool), yr1VarA, executorServiceNewCachedThreadPool);
            p = qn1VarI;
            qn1VarI.n();
            p.q();
        }
        return p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() throws Throwable {
        String str;
        String strS;
        ot1 ot1VarT;
        fh2 fh2VarB;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ot1 ot1VarT2 = t(vt1.f5732a);
        if (ot1VarT2 != null) {
            String strQ = ot1VarT2.b().Q();
            strS = ot1VarT2.b().S();
            str = strQ;
        } else {
            str = null;
            strS = null;
        }
        try {
            rt1 rt1VarA = gs1.a(this.d, 1, this.k, str, strS, "1", this.i);
            if (rt1VarA.e != null && rt1VarA.e.length != 0) {
                eh2 eh2VarH = eh2.H(a82.S(rt1VarA.e), y82.c());
                boolean z = true;
                boolean zB = false;
                if (eh2VarH.I().Q().isEmpty() || eh2VarH.I().S().isEmpty() || eh2VarH.K().c().length == 0 || ((ot1VarT = t(vt1.f5732a)) != null && (fh2VarB = ot1VarT.b()) != null && eh2VarH.I().Q().equals(fh2VarB.Q()) && eh2VarH.I().S().equals(fh2VarB.S()))) {
                    z = false;
                }
                if (!z) {
                    this.i.h(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                    return;
                }
                tt1 tt1Var = this.l;
                int r2 = rt1VarA.f;
                if (!((Boolean) qx2.e().c(e0.x1)).booleanValue()) {
                    zB = this.e.b(eh2VarH, tt1Var);
                } else if (r2 == 3) {
                    zB = this.f.a(eh2VarH);
                } else if (r2 == 4) {
                    zB = this.f.b(eh2VarH, tt1Var);
                }
                if (!zB) {
                    this.i.h(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                    return;
                } else {
                    this.g.e(t(vt1.f5732a));
                    this.m = System.currentTimeMillis() / 1000;
                    return;
                }
            }
            this.i.h(5009, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (w92 e) {
            this.i.b(4002, System.currentTimeMillis() - jCurrentTimeMillis, e);
        }
    }

    private final void q() {
        if (this.o) {
            return;
        }
        synchronized (this.n) {
            if (!this.o) {
                if ((System.currentTimeMillis() / 1000) - this.m < 3600) {
                    return;
                }
                ot1 ot1VarD = this.g.d();
                if (ot1VarD == null || ot1VarD.f(3600L)) {
                    o();
                }
            }
        }
    }

    private final ot1 t(int r3) {
        return ((Boolean) qx2.e().c(e0.x1)).booleanValue() ? this.f.h(r3) : this.e.g(r3);
    }

    @Override // com.google.android.gms.internal.ads.xu1
    public final void a(View view) {
        this.h.d(view);
    }

    @Override // com.google.android.gms.internal.ads.xu1
    public final void b(int r1, int r2, int r3) {
    }

    @Override // com.google.android.gms.internal.ads.xu1
    public final String c(Context context) {
        q();
        as1 as1VarC = this.g.c();
        if (as1VarC == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strC = as1VarC.c(context, null);
        this.i.d(5001, System.currentTimeMillis() - jCurrentTimeMillis, strC, null);
        return strC;
    }

    @Override // com.google.android.gms.internal.ads.xu1
    public final String d(Context context, View view, Activity activity) {
        q();
        as1 as1VarC = this.g.c();
        if (as1VarC == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strD = as1VarC.d(context, null, view, activity);
        this.i.d(5002, System.currentTimeMillis() - jCurrentTimeMillis, strD, null);
        return strD;
    }

    @Override // com.google.android.gms.internal.ads.xu1
    public final String e(Context context, String str, View view) {
        return g(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.xu1
    public final void f(MotionEvent motionEvent) {
        as1 as1VarC = this.g.c();
        if (as1VarC != null) {
            try {
                as1VarC.b(null, motionEvent);
            } catch (zt1 e) {
                this.i.b(e.a(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xu1
    public final String g(Context context, String str, View view, Activity activity) {
        q();
        as1 as1VarC = this.g.c();
        if (as1VarC == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = as1VarC.a(context, null, str, view, activity);
        this.i.d(5000, System.currentTimeMillis() - jCurrentTimeMillis, strA, null);
        return strA;
    }

    final synchronized void n() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ot1 ot1VarT = t(vt1.f5732a);
        if (ot1VarT == null || ot1VarT.a()) {
            this.i.h(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else {
            this.g.e(ot1VarT);
        }
    }

    public final void o() {
        this.j.execute(new sp1(this));
    }
}
