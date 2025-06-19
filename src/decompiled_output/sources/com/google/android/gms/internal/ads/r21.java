package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r21 implements u01<gi0> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5090a;

    /* renamed from: b, reason: collision with root package name */
    private final dr0 f5091b;

    /* renamed from: c, reason: collision with root package name */
    private final hj0 f5092c;
    private final an1 d;
    private final Executor e;
    private final as f;

    public r21(Context context, as asVar, an1 an1Var, Executor executor, hj0 hj0Var, dr0 dr0Var) {
        this.f5090a = context;
        this.d = an1Var;
        this.f5092c = hj0Var;
        this.e = executor;
        this.f = asVar;
        this.f5091b = dr0Var;
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final boolean a(wm1 wm1Var, km1 km1Var) {
        nm1 nm1Var = km1Var.r;
        return (nm1Var == null || nm1Var.f4569a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final dy1<gi0> b(final wm1 wm1Var, final km1 km1Var) {
        final ur0 ur0Var = new ur0();
        dy1<gi0> dy1VarJ = qx1.j(qx1.g(null), new ax1(this, km1Var, wm1Var, ur0Var) { // from class: com.google.android.gms.internal.ads.q21

            /* renamed from: a, reason: collision with root package name */
            private final r21 f4940a;

            /* renamed from: b, reason: collision with root package name */
            private final km1 f4941b;

            /* renamed from: c, reason: collision with root package name */
            private final wm1 f4942c;
            private final ur0 d;

            {
                this.f4940a = this;
                this.f4941b = km1Var;
                this.f4942c = wm1Var;
                this.d = ur0Var;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f4940a.c(this.f4941b, this.f4942c, this.d, obj);
            }
        }, this.e);
        ur0Var.getClass();
        dy1VarJ.e(t21.a(ur0Var), this.e);
        return dy1VarJ;
    }

    final /* synthetic */ dy1 c(final km1 km1Var, wm1 wm1Var, ur0 ur0Var, Object obj) throws Exception {
        dy1<?> dy1VarB;
        final rw rwVarA = this.f5091b.a(this.d.e, km1Var, wm1Var.f5858b.f5551b, km1Var.T);
        rwVarA.o0(km1Var.Q);
        ur0Var.b(this.f5090a, rwVarA.getView());
        ks ksVar = new ks();
        final ii0 ii0VarA = this.f5092c.a(new v70(wm1Var, km1Var, null), new hi0(new y21(this.f5090a, this.f, ksVar, km1Var, rwVarA), rwVarA));
        ksVar.a(ii0VarA);
        ii0VarA.d().F0(new tb0(rwVarA) { // from class: com.google.android.gms.internal.ads.s21
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
        ii0VarA.h().i(rwVarA, true);
        if (((Boolean) qx2.e().c(e0.x4)).booleanValue() && km1Var.T) {
            dy1VarB = qx1.g(null);
        } else {
            ii0VarA.h();
            nm1 nm1Var = km1Var.r;
            dy1VarB = fr0.b(rwVarA, nm1Var.f4570b, nm1Var.f4569a);
        }
        return qx1.i(dy1VarB, new ru1(this, rwVarA, km1Var, ii0VarA) { // from class: com.google.android.gms.internal.ads.w21

            /* renamed from: a, reason: collision with root package name */
            private final r21 f5772a;

            /* renamed from: b, reason: collision with root package name */
            private final rw f5773b;

            /* renamed from: c, reason: collision with root package name */
            private final km1 f5774c;
            private final ii0 d;

            {
                this.f5772a = this;
                this.f5773b = rwVarA;
                this.f5774c = km1Var;
                this.d = ii0VarA;
            }

            @Override // com.google.android.gms.internal.ads.ru1
            public final Object a(Object obj2) {
                rw rwVar = this.f5773b;
                km1 km1Var2 = this.f5774c;
                ii0 ii0Var = this.d;
                if (km1Var2.H) {
                    rwVar.C();
                }
                rwVar.O();
                if (((Boolean) qx2.e().c(e0.k0)).booleanValue()) {
                    com.google.android.gms.ads.internal.p.e();
                    dp.j(rwVar);
                }
                return ii0Var.j();
            }
        }, this.e);
    }
}
