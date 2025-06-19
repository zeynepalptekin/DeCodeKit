package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class fr0 {

    /* renamed from: a, reason: collision with root package name */
    private final wa0 f3445a;

    /* renamed from: b, reason: collision with root package name */
    private final cc0 f3446b;

    /* renamed from: c, reason: collision with root package name */
    private final qc0 f3447c;
    private final wc0 d;
    private final df0 e;
    private final Executor f;
    private final fh0 g;
    private final g30 h;
    private final com.google.android.gms.ads.internal.a i;
    private final wb0 j;
    private final im k;
    private final i52 l;
    private final re0 m;

    public fr0(wa0 wa0Var, cc0 cc0Var, qc0 qc0Var, wc0 wc0Var, df0 df0Var, Executor executor, fh0 fh0Var, g30 g30Var, com.google.android.gms.ads.internal.a aVar, wb0 wb0Var, @androidx.annotation.i0 im imVar, i52 i52Var, re0 re0Var) {
        this.f3445a = wa0Var;
        this.f3446b = cc0Var;
        this.f3447c = qc0Var;
        this.d = wc0Var;
        this.e = df0Var;
        this.f = executor;
        this.g = fh0Var;
        this.h = g30Var;
        this.i = aVar;
        this.j = wb0Var;
        this.k = imVar;
        this.l = i52Var;
        this.m = re0Var;
    }

    public static dy1<?> b(rw rwVar, String str, String str2) {
        final ks ksVar = new ks();
        rwVar.C0().m(new dy(ksVar) { // from class: com.google.android.gms.internal.ads.rr0

            /* renamed from: a, reason: collision with root package name */
            private final ks f5179a;

            {
                this.f5179a = ksVar;
            }

            @Override // com.google.android.gms.internal.ads.dy
            public final void a(boolean z) {
                ks ksVar2 = this.f5179a;
                if (z) {
                    ksVar2.a(null);
                } else {
                    ksVar2.b(new Exception("Ad Web View failed to load."));
                }
            }
        });
        rwVar.b0(str, str2, null);
        return ksVar;
    }

    final /* synthetic */ void c(rw rwVar, rw rwVar2, Map map) {
        this.h.t(rwVar);
    }

    final /* synthetic */ boolean d(View view, MotionEvent motionEvent) {
        this.i.a();
        im imVar = this.k;
        if (imVar == null) {
            return false;
        }
        imVar.g();
        return false;
    }

    final /* synthetic */ void e(View view) {
        this.i.a();
        im imVar = this.k;
        if (imVar != null) {
            imVar.g();
        }
    }

    final /* synthetic */ void f() {
        this.f3446b.I0();
    }

    final /* synthetic */ void g() {
        this.f3445a.p();
    }

    public final void i(final rw rwVar, boolean z) {
        xu1 xu1VarH;
        rwVar.C0().o(new zv2(this) { // from class: com.google.android.gms.internal.ads.ir0
            private final fr0 d;

            {
                this.d = this;
            }

            @Override // com.google.android.gms.internal.ads.zv2
            public final void p() {
                this.d.g();
            }
        }, this.f3447c, this.d, new d6(this) { // from class: com.google.android.gms.internal.ads.hr0
            private final fr0 d;

            {
                this.d = this;
            }

            @Override // com.google.android.gms.internal.ads.d6
            public final void Q(String str, String str2) {
                this.d.j(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.v(this) { // from class: com.google.android.gms.internal.ads.lr0
            private final fr0 d;

            {
                this.d = this;
            }

            @Override // com.google.android.gms.ads.internal.overlay.v
            public final void a() {
                this.d.f();
            }
        }, z, null, this.i, new qr0(this), this.k);
        rwVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.google.android.gms.internal.ads.jr0
            private final fr0 d;

            {
                this.d = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.d.d(view, motionEvent);
            }
        });
        rwVar.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.gms.internal.ads.nr0
            private final fr0 d;

            {
                this.d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        });
        if (((Boolean) qx2.e().c(e0.F1)).booleanValue() && (xu1VarH = this.l.h()) != null) {
            xu1VarH.a(rwVar.getView());
        }
        this.g.F0(rwVar, this.f);
        this.g.F0(new sr2(rwVar) { // from class: com.google.android.gms.internal.ads.mr0
            private final rw d;

            {
                this.d = rwVar;
            }

            @Override // com.google.android.gms.internal.ads.sr2
            public final void K(pr2 pr2Var) {
                ey eyVarC0 = this.d.C0();
                Rect rect = pr2Var.f;
                eyVarC0.f(rect.left, rect.top, false);
            }
        }, this.f);
        this.g.H0(rwVar.getView());
        rwVar.o("/trackActiveViewUnit", new z6(this, rwVar) { // from class: com.google.android.gms.internal.ads.pr0

            /* renamed from: a, reason: collision with root package name */
            private final fr0 f4875a;

            /* renamed from: b, reason: collision with root package name */
            private final rw f4876b;

            {
                this.f4875a = this;
                this.f4876b = rwVar;
            }

            @Override // com.google.android.gms.internal.ads.z6
            public final void a(Object obj, Map map) {
                this.f4875a.c(this.f4876b, (rw) obj, map);
            }
        });
        this.h.u(rwVar);
        if (((Boolean) qx2.e().c(e0.p0)).booleanValue()) {
            return;
        }
        wb0 wb0Var = this.j;
        rwVar.getClass();
        wb0Var.H0(or0.b(rwVar), this.f);
    }

    final /* synthetic */ void j(String str, String str2) {
        this.e.Q(str, str2);
    }
}
