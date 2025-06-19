package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes.dex */
final class f51 implements pj0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3373a;

    /* renamed from: b, reason: collision with root package name */
    private final dr0 f3374b;

    /* renamed from: c, reason: collision with root package name */
    private final an1 f3375c;
    private final as d;
    private final km1 e;
    private final dy1<sq0> f;
    private final rw g;

    private f51(Context context, dr0 dr0Var, an1 an1Var, as asVar, km1 km1Var, dy1<sq0> dy1Var, rw rwVar) {
        this.f3373a = context;
        this.f3374b = dr0Var;
        this.f3375c = an1Var;
        this.d = asVar;
        this.e = km1Var;
        this.f = dy1Var;
        this.g = rwVar;
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final void a(boolean z, Context context) throws NumberFormatException {
        rw rwVar;
        sq0 sq0Var = (sq0) qx1.l(this.f);
        try {
            km1 km1Var = this.e;
            if (this.g.L()) {
                if (((Boolean) qx2.e().c(e0.o0)).booleanValue()) {
                    final rw rwVarC = this.f3374b.c(this.f3375c.e);
                    g7.b(rwVarC, sq0Var.l());
                    final ur0 ur0Var = new ur0();
                    ur0Var.b(this.f3373a, rwVarC.getView());
                    sq0Var.h().i(rwVarC, true);
                    rwVarC.C0().m(new dy(ur0Var, rwVarC) { // from class: com.google.android.gms.internal.ads.i51

                        /* renamed from: a, reason: collision with root package name */
                        private final ur0 f3770a;

                        /* renamed from: b, reason: collision with root package name */
                        private final rw f3771b;

                        {
                            this.f3770a = ur0Var;
                            this.f3771b = rwVarC;
                        }

                        @Override // com.google.android.gms.internal.ads.dy
                        public final void a(boolean z2) {
                            ur0 ur0Var2 = this.f3770a;
                            rw rwVar2 = this.f3771b;
                            ur0Var2.a();
                            rwVar2.O();
                            rwVar2.C0().i();
                        }
                    });
                    ey eyVarC0 = rwVarC.C0();
                    rwVarC.getClass();
                    eyVarC0.b(h51.b(rwVarC));
                    rwVarC.b0(km1Var.r.f4570b, km1Var.r.f4569a, null);
                    rwVar = rwVarC;
                } else {
                    rwVar = this.g;
                }
            } else {
                rwVar = this.g;
            }
            rwVar.y0(true);
            com.google.android.gms.ads.internal.p.c();
            boolean zJ = to.J(this.f3373a);
            km1 km1Var2 = this.e;
            com.google.android.gms.ads.internal.i iVar = new com.google.android.gms.ads.internal.i(false, zJ, false, 0.0f, -1, z, km1Var2.J, km1Var2.K);
            com.google.android.gms.ads.internal.p.b();
            fj0 fj0VarI = sq0Var.i();
            km1 km1Var3 = this.e;
            int r12 = km1Var3.L;
            as asVar = this.d;
            String str = km1Var3.A;
            nm1 nm1Var = km1Var3.r;
            com.google.android.gms.ads.internal.overlay.l.a(context, new AdOverlayInfoParcel((zv2) null, fj0VarI, (com.google.android.gms.ads.internal.overlay.v) null, rwVar, r12, asVar, str, iVar, nm1Var.f4570b, nm1Var.f4569a), true);
        } catch (dx e) {
            tr.c("", e);
        }
    }
}
