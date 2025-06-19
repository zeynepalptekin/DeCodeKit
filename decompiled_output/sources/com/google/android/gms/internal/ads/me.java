package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.d0.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class me extends id {
    private final com.google.android.gms.ads.mediation.e0 e;

    public me(com.google.android.gms.ads.mediation.e0 e0Var) {
        this.e = e0Var;
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final float A4() {
        return this.e.e();
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final k3 G() {
        c.b bVarI = this.e.i();
        if (bVarI != null) {
            return new v2(bVarI.a(), bVarI.d(), bVarI.c(), bVarI.e(), bVarI.b());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final String H() {
        return this.e.n();
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final String L() {
        return this.e.b();
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final String N() {
        return this.e.p();
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final c.a.b.b.e.c V() {
        View viewN = this.e.N();
        if (viewN == null) {
            return null;
        }
        return c.a.b.b.e.e.i2(viewN);
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final void b0(c.a.b.b.e.c cVar) {
        this.e.L((View) c.a.b.b.e.e.e2(cVar));
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final void g() {
        this.e.t();
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final Bundle getExtras() {
        return this.e.g();
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final uz2 getVideoController() {
        if (this.e.q() != null) {
            return this.e.q().p();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final c.a.b.b.e.c h0() {
        View viewA = this.e.a();
        if (viewA == null) {
            return null;
        }
        return c.a.b.b.e.e.i2(viewA);
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final b3 i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final String j() {
        return this.e.h();
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final String k() {
        return this.e.c();
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final String l() {
        return this.e.d();
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final float l3() {
        return this.e.k();
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final c.a.b.b.e.c m() {
        Object objO = this.e.O();
        if (objO == null) {
            return null;
        }
        return c.a.b.b.e.e.i2(objO);
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final List n() {
        List<c.b> listJ = this.e.j();
        ArrayList arrayList = new ArrayList();
        if (listJ != null) {
            for (c.b bVar : listJ) {
                arrayList.add(new v2(bVar.a(), bVar.d(), bVar.c(), bVar.e(), bVar.b()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final float q5() {
        return this.e.f();
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final void r0(c.a.b.b.e.c cVar) {
        this.e.r((View) c.a.b.b.e.e.e2(cVar));
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final double v() {
        if (this.e.o() != null) {
            return this.e.o().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final boolean w0() {
        return this.e.m();
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final void x0(c.a.b.b.e.c cVar, c.a.b.b.e.c cVar2, c.a.b.b.e.c cVar3) {
        this.e.K((View) c.a.b.b.e.e.e2(cVar), (HashMap) c.a.b.b.e.e.e2(cVar2), (HashMap) c.a.b.b.e.e.e2(cVar3));
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final boolean z0() {
        return this.e.l();
    }
}
