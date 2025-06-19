package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k11 implements u01<i40> {

    /* renamed from: a, reason: collision with root package name */
    private final d40 f4041a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4042b;

    /* renamed from: c, reason: collision with root package name */
    private final dr0 f4043c;
    private final Executor d;

    public k11(d40 d40Var, Context context, Executor executor, dr0 dr0Var) {
        this.f4042b = context;
        this.f4041a = d40Var;
        this.d = executor;
        this.f4043c = dr0Var;
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final boolean a(wm1 wm1Var, km1 km1Var) {
        nm1 nm1Var = km1Var.r;
        return (nm1Var == null || nm1Var.f4569a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final dy1<i40> b(final wm1 wm1Var, final km1 km1Var) {
        return qx1.j(qx1.g(null), new ax1(this, wm1Var, km1Var) { // from class: com.google.android.gms.internal.ads.j11

            /* renamed from: a, reason: collision with root package name */
            private final k11 f3896a;

            /* renamed from: b, reason: collision with root package name */
            private final wm1 f3897b;

            /* renamed from: c, reason: collision with root package name */
            private final km1 f3898c;

            {
                this.f3896a = this;
                this.f3897b = wm1Var;
                this.f3898c = km1Var;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f3896a.c(this.f3897b, this.f3898c, obj);
            }
        }, this.d);
    }

    final /* synthetic */ dy1 c(wm1 wm1Var, km1 km1Var, Object obj) throws Exception {
        qw2 qw2VarB = gn1.b(this.f4042b, km1Var.t);
        final rw rwVarA = this.f4043c.a(qw2VarB, km1Var, wm1Var.f5858b.f5551b, km1Var.T);
        final x30 x30VarE = this.f4041a.e(new v70(wm1Var, km1Var, null), new w30(rwVarA.getView(), rwVarA, gn1.c(qw2VarB), km1Var.V, km1Var.Z, km1Var.J));
        x30VarE.h().i(rwVarA, false);
        x30VarE.d().F0(new tb0(rwVarA) { // from class: com.google.android.gms.internal.ads.m11
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
        x30VarE.h();
        nm1 nm1Var = km1Var.r;
        return qx1.i(fr0.b(rwVarA, nm1Var.f4570b, nm1Var.f4569a), new ru1(x30VarE) { // from class: com.google.android.gms.internal.ads.l11

            /* renamed from: a, reason: collision with root package name */
            private final x30 f4178a;

            {
                this.f4178a = x30VarE;
            }

            @Override // com.google.android.gms.internal.ads.ru1
            public final Object a(Object obj2) {
                return this.f4178a.i();
            }
        }, cs.f);
    }
}
