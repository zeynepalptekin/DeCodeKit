package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b11 implements u01<v40> {

    /* renamed from: a, reason: collision with root package name */
    private final p40 f2772a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f2773b;

    /* renamed from: c, reason: collision with root package name */
    private final dr0 f2774c;
    private final an1 d;
    private final Executor e;
    private final as f;

    public b11(p40 p40Var, Context context, Executor executor, dr0 dr0Var, an1 an1Var, as asVar) {
        this.f2773b = context;
        this.f2772a = p40Var;
        this.e = executor;
        this.f2774c = dr0Var;
        this.d = an1Var;
        this.f = asVar;
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final boolean a(wm1 wm1Var, km1 km1Var) {
        nm1 nm1Var = km1Var.r;
        return (nm1Var == null || nm1Var.f4569a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final dy1<v40> b(final wm1 wm1Var, final km1 km1Var) {
        final ur0 ur0Var = new ur0();
        dy1<v40> dy1VarJ = qx1.j(qx1.g(null), new ax1(this, km1Var, wm1Var, ur0Var) { // from class: com.google.android.gms.internal.ads.e11

            /* renamed from: a, reason: collision with root package name */
            private final b11 f3204a;

            /* renamed from: b, reason: collision with root package name */
            private final km1 f3205b;

            /* renamed from: c, reason: collision with root package name */
            private final wm1 f3206c;
            private final ur0 d;

            {
                this.f3204a = this;
                this.f3205b = km1Var;
                this.f3206c = wm1Var;
                this.d = ur0Var;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f3204a.c(this.f3205b, this.f3206c, this.d, obj);
            }
        }, this.e);
        ur0Var.getClass();
        dy1VarJ.e(d11.a(ur0Var), this.e);
        return dy1VarJ;
    }

    final /* synthetic */ dy1 c(final km1 km1Var, wm1 wm1Var, ur0 ur0Var, Object obj) throws Exception {
        dy1<?> dy1VarB;
        gn1.b(this.f2773b, km1Var.t);
        final rw rwVarA = this.f2774c.a(this.d.e, km1Var, wm1Var.f5858b.f5551b, km1Var.T);
        rwVarA.o0(km1Var.Q);
        ur0Var.b(this.f2773b, rwVarA.getView());
        ks ksVar = new ks();
        final k40 k40VarE = this.f2772a.e(new v70(wm1Var, km1Var, null), new hi0(new h11(this.f2773b, this.f, ksVar, km1Var, rwVarA, this.d), rwVarA), new o40(rwVarA.getView(), rwVarA, km1Var.V, km1Var.Z, km1Var.J));
        k40VarE.i().i(rwVarA, false);
        ksVar.a(k40VarE);
        k40VarE.d().F0(new tb0(rwVarA) { // from class: com.google.android.gms.internal.ads.g11
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
        if (((Boolean) qx2.e().c(e0.x4)).booleanValue() && km1Var.T) {
            dy1VarB = qx1.g(null);
        } else {
            k40VarE.i();
            nm1 nm1Var = km1Var.r;
            dy1VarB = fr0.b(rwVarA, nm1Var.f4570b, nm1Var.f4569a);
        }
        return qx1.i(dy1VarB, new ru1(this, rwVarA, km1Var, k40VarE) { // from class: com.google.android.gms.internal.ads.f11

            /* renamed from: a, reason: collision with root package name */
            private final b11 f3357a;

            /* renamed from: b, reason: collision with root package name */
            private final rw f3358b;

            /* renamed from: c, reason: collision with root package name */
            private final km1 f3359c;
            private final k40 d;

            {
                this.f3357a = this;
                this.f3358b = rwVarA;
                this.f3359c = km1Var;
                this.d = k40VarE;
            }

            @Override // com.google.android.gms.internal.ads.ru1
            public final Object a(Object obj2) {
                rw rwVar = this.f3358b;
                km1 km1Var2 = this.f3359c;
                k40 k40Var = this.d;
                if (km1Var2.H) {
                    rwVar.C();
                }
                rwVar.O();
                if (((Boolean) qx2.e().c(e0.k0)).booleanValue()) {
                    com.google.android.gms.ads.internal.p.e();
                    dp.j(rwVar);
                }
                return k40Var.h();
            }
        }, this.e);
    }
}
