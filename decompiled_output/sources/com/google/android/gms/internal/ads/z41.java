package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z41 implements u01<qq0> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6220a;

    /* renamed from: b, reason: collision with root package name */
    private final dr0 f6221b;

    /* renamed from: c, reason: collision with root package name */
    private final tq0 f6222c;
    private final an1 d;
    private final Executor e;
    private final as f;

    public z41(Context context, as asVar, an1 an1Var, Executor executor, tq0 tq0Var, dr0 dr0Var) {
        this.f6220a = context;
        this.d = an1Var;
        this.f6222c = tq0Var;
        this.e = executor;
        this.f = asVar;
        this.f6221b = dr0Var;
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final boolean a(wm1 wm1Var, km1 km1Var) {
        nm1 nm1Var = km1Var.r;
        return (nm1Var == null || nm1Var.f4569a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final dy1<qq0> b(final wm1 wm1Var, final km1 km1Var) {
        final ur0 ur0Var = new ur0();
        dy1<qq0> dy1VarJ = qx1.j(qx1.g(null), new ax1(this, km1Var, wm1Var, ur0Var) { // from class: com.google.android.gms.internal.ads.c51

            /* renamed from: a, reason: collision with root package name */
            private final z41 f2925a;

            /* renamed from: b, reason: collision with root package name */
            private final km1 f2926b;

            /* renamed from: c, reason: collision with root package name */
            private final wm1 f2927c;
            private final ur0 d;

            {
                this.f2925a = this;
                this.f2926b = km1Var;
                this.f2927c = wm1Var;
                this.d = ur0Var;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f2925a.c(this.f2926b, this.f2927c, this.d, obj);
            }
        }, this.e);
        ur0Var.getClass();
        dy1VarJ.e(b51.a(ur0Var), this.e);
        return dy1VarJ;
    }

    final /* synthetic */ dy1 c(final km1 km1Var, wm1 wm1Var, ur0 ur0Var, Object obj) throws Exception {
        dy1<?> dy1VarB;
        final rw rwVarA = this.f6221b.a(this.d.e, km1Var, wm1Var.f5858b.f5551b, km1Var.T);
        rwVarA.o0(km1Var.Q);
        ur0Var.b(this.f6220a, rwVarA.getView());
        ks ksVar = new ks();
        final sq0 sq0VarE = this.f6222c.e(new v70(wm1Var, km1Var, null), new rq0(new f51(this.f6220a, this.f6221b, this.d, this.f, km1Var, ksVar, rwVarA), rwVarA));
        ksVar.a(sq0VarE);
        g7.b(rwVarA, sq0VarE.l());
        sq0VarE.d().F0(new tb0(rwVarA) { // from class: com.google.android.gms.internal.ads.e51
            private final rw d;

            {
                this.d = rwVarA;
            }

            @Override // com.google.android.gms.internal.ads.tb0
            public final void U() {
                rw rwVar = this.d;
                if (rwVar.C0() != null) {
                    rwVar.C0().i();
                }
            }
        }, cs.f);
        sq0VarE.h().i(rwVarA, true);
        if (((Boolean) qx2.e().c(e0.x4)).booleanValue() && km1Var.T) {
            dy1VarB = qx1.g(null);
        } else {
            sq0VarE.h();
            nm1 nm1Var = km1Var.r;
            dy1VarB = fr0.b(rwVarA, nm1Var.f4570b, nm1Var.f4569a);
        }
        return qx1.i(dy1VarB, new ru1(this, rwVarA, km1Var, sq0VarE) { // from class: com.google.android.gms.internal.ads.d51

            /* renamed from: a, reason: collision with root package name */
            private final z41 f3069a;

            /* renamed from: b, reason: collision with root package name */
            private final rw f3070b;

            /* renamed from: c, reason: collision with root package name */
            private final km1 f3071c;
            private final sq0 d;

            {
                this.f3069a = this;
                this.f3070b = rwVarA;
                this.f3071c = km1Var;
                this.d = sq0VarE;
            }

            @Override // com.google.android.gms.internal.ads.ru1
            public final Object a(Object obj2) {
                rw rwVar = this.f3070b;
                km1 km1Var2 = this.f3071c;
                sq0 sq0Var = this.d;
                if (km1Var2.H) {
                    rwVar.C();
                }
                rwVar.O();
                if (((Boolean) qx2.e().c(e0.k0)).booleanValue()) {
                    com.google.android.gms.ads.internal.p.e();
                    dp.j(rwVar);
                }
                return sq0Var.k();
            }
        }, this.e);
    }
}
