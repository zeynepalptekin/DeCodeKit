package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n11 implements u01<e50> {

    /* renamed from: a, reason: collision with root package name */
    private final b60 f4473a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4474b;

    /* renamed from: c, reason: collision with root package name */
    private final dr0 f4475c;
    private final an1 d;
    private final Executor e;
    private final ru1<km1, pp> f;

    public n11(b60 b60Var, Context context, Executor executor, dr0 dr0Var, an1 an1Var, ru1<km1, pp> ru1Var) {
        this.f4474b = context;
        this.f4473a = b60Var;
        this.e = executor;
        this.f4475c = dr0Var;
        this.d = an1Var;
        this.f = ru1Var;
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final boolean a(wm1 wm1Var, km1 km1Var) {
        nm1 nm1Var = km1Var.r;
        return (nm1Var == null || nm1Var.f4569a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final dy1<e50> b(final wm1 wm1Var, final km1 km1Var) {
        return qx1.j(qx1.g(null), new ax1(this, wm1Var, km1Var) { // from class: com.google.android.gms.internal.ads.q11

            /* renamed from: a, reason: collision with root package name */
            private final n11 f4933a;

            /* renamed from: b, reason: collision with root package name */
            private final wm1 f4934b;

            /* renamed from: c, reason: collision with root package name */
            private final km1 f4935c;

            {
                this.f4933a = this;
                this.f4934b = wm1Var;
                this.f4935c = km1Var;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f4933a.c(this.f4934b, this.f4935c, obj);
            }
        }, this.e);
    }

    final /* synthetic */ dy1 c(wm1 wm1Var, km1 km1Var, Object obj) throws Exception {
        qw2 qw2VarB = gn1.b(this.f4474b, km1Var.t);
        final rw rwVarA = this.f4475c.a(qw2VarB, km1Var, wm1Var.f5858b.f5551b, km1Var.T);
        rwVarA.o0(km1Var.Q);
        View viewA = (((Boolean) qx2.e().c(e0.c5)).booleanValue() && km1Var.c0) ? u60.a(this.f4474b, rwVarA.getView(), km1Var) : new vr0(this.f4474b, rwVarA.getView(), this.f.a(km1Var));
        b60 b60Var = this.f4473a;
        v70 v70Var = new v70(wm1Var, km1Var, null);
        rwVarA.getClass();
        final d50 d50VarA = b60Var.a(v70Var, new h50(viewA, rwVarA, p11.a(rwVarA), gn1.c(qw2VarB)));
        d50VarA.h().i(rwVarA, false);
        d50VarA.d().F0(new tb0(rwVarA) { // from class: com.google.android.gms.internal.ads.s11
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
        d50VarA.h();
        nm1 nm1Var = km1Var.r;
        dy1<?> dy1VarB = fr0.b(rwVarA, nm1Var.f4570b, nm1Var.f4569a);
        if (km1Var.H) {
            rwVarA.getClass();
            dy1VarB.e(r11.a(rwVarA), this.e);
        }
        dy1VarB.e(new Runnable(this, rwVarA) { // from class: com.google.android.gms.internal.ads.v11
            private final n11 d;
            private final rw e;

            {
                this.d = this;
                this.e = rwVarA;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.d(this.e);
            }
        }, this.e);
        return qx1.i(dy1VarB, new ru1(d50VarA) { // from class: com.google.android.gms.internal.ads.t11

            /* renamed from: a, reason: collision with root package name */
            private final d50 f5338a;

            {
                this.f5338a = d50VarA;
            }

            @Override // com.google.android.gms.internal.ads.ru1
            public final Object a(Object obj2) {
                return this.f5338a.i();
            }
        }, cs.f);
    }

    final /* synthetic */ void d(rw rwVar) {
        rwVar.O();
        mx mxVarN = rwVar.n();
        m mVar = this.d.f2720b;
        if (mVar == null || mxVarN == null) {
            return;
        }
        mxVarN.D8(mVar);
    }
}
