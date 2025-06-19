package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.d0.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class ud extends cd {
    private final com.google.android.gms.ads.mediation.y e;

    public ud(com.google.android.gms.ads.mediation.y yVar) {
        this.e = yVar;
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final k3 G() {
        c.b bVarW = this.e.w();
        if (bVarW != null) {
            return new v2(bVarW.a(), bVarW.d(), bVarW.c(), bVarW.e(), bVarW.b());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final String H() {
        return this.e.y();
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final String N() {
        return this.e.A();
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final c.a.b.b.e.c V() {
        View viewS = this.e.s();
        if (viewS == null) {
            return null;
        }
        return c.a.b.b.e.e.i2(viewS);
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final void b0(c.a.b.b.e.c cVar) {
        this.e.q((View) c.a.b.b.e.e.e2(cVar));
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final void d1(c.a.b.b.e.c cVar) {
        this.e.o((View) c.a.b.b.e.e.e2(cVar));
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final void g() {
        this.e.h();
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final Bundle getExtras() {
        return this.e.b();
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final uz2 getVideoController() {
        if (this.e.e() != null) {
            return this.e.e().p();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final c.a.b.b.e.c h0() {
        View viewA = this.e.a();
        if (viewA == null) {
            return null;
        }
        return c.a.b.b.e.e.i2(viewA);
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final b3 i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final String j() {
        return this.e.v();
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final String k() {
        return this.e.t();
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final String l() {
        return this.e.u();
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final c.a.b.b.e.c m() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final List n() {
        List<c.b> listX = this.e.x();
        if (listX == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (c.b bVar : listX) {
            arrayList.add(new v2(bVar.a(), bVar.d(), bVar.c(), bVar.e(), bVar.b()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final void r0(c.a.b.b.e.c cVar) {
        this.e.f((View) c.a.b.b.e.e.e2(cVar));
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final double v() {
        return this.e.z();
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final boolean w0() {
        return this.e.d();
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final void x0(c.a.b.b.e.c cVar, c.a.b.b.e.c cVar2, c.a.b.b.e.c cVar3) {
        this.e.p((View) c.a.b.b.e.e.e2(cVar), (HashMap) c.a.b.b.e.e.e2(cVar2), (HashMap) c.a.b.b.e.e.e2(cVar3));
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final boolean z0() {
        return this.e.c();
    }
}
