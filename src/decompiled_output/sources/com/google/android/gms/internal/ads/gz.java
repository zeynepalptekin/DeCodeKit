package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.i10;
import com.google.android.gms.internal.ads.jz;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public abstract class gz implements j20 {

    /* renamed from: a, reason: collision with root package name */
    @GuardedBy("AppComponent.class")
    private static gz f3595a;

    public static gz b(Context context, qc qcVar, int r2) {
        gz gzVarX = x(context, r2);
        gzVarX.j().c(qcVar);
        return gzVarX;
    }

    @Deprecated
    private static gz c(as asVar, Context context, i10.a aVar) {
        gz gzVar;
        synchronized (gz.class) {
            if (f3595a == null) {
                f3595a = new w00().c(new jz(new jz.a().b(asVar).d(context))).a(new i10(aVar)).b();
                e0.a(context);
                com.google.android.gms.ads.internal.p.g().k(context, asVar);
                com.google.android.gms.ads.internal.p.i().c(context);
                com.google.android.gms.ads.internal.p.c().u(context);
                com.google.android.gms.ads.internal.p.c().v(context);
                mo.a(context);
                com.google.android.gms.ads.internal.p.f().c(context);
                com.google.android.gms.ads.internal.p.x().a(context);
                if (((Boolean) qx2.e().c(e0.s4)).booleanValue()) {
                    new f01(context, asVar, new tu2(new yu2(context)), new oz0(new mz0(context), f3595a.h())).a();
                }
            }
            gzVar = f3595a;
        }
        return gzVar;
    }

    @Deprecated
    public static gz x(Context context, int r5) {
        synchronized (gz.class) {
            if (f3595a == null) {
                return c(new as(202510000, r5, true, false), context, new b00());
            }
            return f3595a;
        }
    }

    @Override // com.google.android.gms.internal.ads.j20
    public final yf1 a(wi wiVar, int r3) {
        return d(new ih1(wiVar, r3));
    }

    protected abstract yf1 d(ih1 ih1Var);

    public abstract Executor e();

    public abstract ScheduledExecutorService f();

    public abstract Executor g();

    public abstract cy1 h();

    public abstract gd0 i();

    public abstract fs0 j();

    public abstract o10 k();

    public abstract a60 l();

    public abstract c40 m();

    public abstract s40 n();

    public abstract ii1 o();

    public abstract gj0 p();

    public abstract ck0 q();

    public abstract wq0 r();

    public abstract bm1 s();

    public abstract p81 t();

    public abstract s81 u();

    public abstract r01 v();

    public abstract pn1<up0> w();
}
