package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ap0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f2732a;

    /* renamed from: b, reason: collision with root package name */
    private final q30 f2733b;

    /* renamed from: c, reason: collision with root package name */
    private final fh0 f2734c;

    ap0(Executor executor, q30 q30Var, fh0 fh0Var) {
        this.f2732a = executor;
        this.f2734c = fh0Var;
        this.f2733b = q30Var;
    }

    final /* synthetic */ void a(rw rwVar, Map map) {
        this.f2733b.e();
    }

    final /* synthetic */ void b(rw rwVar, Map map) {
        this.f2733b.i();
    }

    public final void c(final rw rwVar) {
        if (rwVar == null) {
            return;
        }
        this.f2734c.H0(rwVar.getView());
        this.f2734c.F0(new sr2(rwVar) { // from class: com.google.android.gms.internal.ads.zo0
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
        }, this.f2732a);
        this.f2734c.F0(new sr2(rwVar) { // from class: com.google.android.gms.internal.ads.cp0
            private final rw d;

            {
                this.d = rwVar;
            }

            @Override // com.google.android.gms.internal.ads.sr2
            public final void K(pr2 pr2Var) {
                rw rwVar2 = this.d;
                HashMap map = new HashMap();
                map.put("isVisible", pr2Var.m ? "1" : "0");
                rwVar2.M("onAdVisibilityChanged", map);
            }
        }, this.f2732a);
        this.f2734c.F0(this.f2733b, this.f2732a);
        this.f2733b.s(rwVar);
        rwVar.o("/trackActiveViewUnit", new z6(this) { // from class: com.google.android.gms.internal.ads.bp0

            /* renamed from: a, reason: collision with root package name */
            private final ap0 f2863a;

            {
                this.f2863a = this;
            }

            @Override // com.google.android.gms.internal.ads.z6
            public final void a(Object obj, Map map) {
                this.f2863a.b((rw) obj, map);
            }
        });
        rwVar.o("/untrackActiveViewUnit", new z6(this) { // from class: com.google.android.gms.internal.ads.ep0

            /* renamed from: a, reason: collision with root package name */
            private final ap0 f3302a;

            {
                this.f3302a = this;
            }

            @Override // com.google.android.gms.internal.ads.z6
            public final void a(Object obj, Map map) {
                this.f3302a.a((rw) obj, map);
            }
        });
    }
}
