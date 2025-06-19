package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.ia0;
import com.google.android.gms.internal.ads.qf0;
import java.util.Collections;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class j71 extends ky2 implements kd0 {
    private final gz e;
    private final Context f;
    private final ViewGroup g;
    private final gd0 l;
    private qw2 m;

    @androidx.annotation.i0
    @GuardedBy("this")
    private b1 o;

    @androidx.annotation.i0
    @GuardedBy("this")
    private e50 p;

    @androidx.annotation.i0
    @GuardedBy("this")
    private dy1<e50> q;
    private final s71 h = new s71();
    private final p71 i = new p71();
    private final r71 j = new r71();
    private final n71 k = new n71();

    @GuardedBy("this")
    private final cn1 n = new cn1();

    public j71(gz gzVar, Context context, qw2 qw2Var, String str) {
        this.g = new FrameLayout(context);
        this.e = gzVar;
        this.f = context;
        this.n.u(qw2Var).z(str);
        gd0 gd0VarI = gzVar.i();
        this.l = gd0VarI;
        gd0VarI.F0(this, this.e.e());
        this.m = qw2Var;
    }

    static /* synthetic */ dy1 B8(j71 j71Var, dy1 dy1Var) {
        j71Var.q = null;
        return null;
    }

    private final synchronized b60 D8(an1 an1Var) {
        if (((Boolean) qx2.e().c(e0.m5)).booleanValue()) {
            return this.e.l().f(new ia0.a().g(this.f).c(an1Var).d()).c(new qf0.a().o()).h(new m61(this.o)).e(new zj0(ul0.h, null)).q(new x60(this.l)).m(new z40(this.g)).d();
        }
        return this.e.l().f(new ia0.a().g(this.f).c(an1Var).d()).c(new qf0.a().l(this.h, this.e.e()).l(this.i, this.e.e()).d(this.h, this.e.e()).h(this.h, this.e.e()).e(this.h, this.e.e()).a(this.j, this.e.e()).j(this.k, this.e.e()).o()).h(new m61(this.o)).e(new zj0(ul0.h, null)).q(new x60(this.l)).m(new z40(this.g)).d();
    }

    private final synchronized void G8(qw2 qw2Var) {
        this.n.u(qw2Var);
        this.n.l(this.m.q);
    }

    private final synchronized boolean K8(jw2 jw2Var) {
        com.google.android.gms.common.internal.r.f("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.p.c();
        if (to.L(this.f) && jw2Var.v == null) {
            tr.g("Failed to load the ad because app ID is missing.");
            if (this.h != null) {
                this.h.i(vn1.b(xn1.APP_ID_MISSING, null, null));
            }
            return false;
        }
        if (this.q != null) {
            return false;
        }
        nn1.b(this.f, jw2Var.i);
        an1 an1VarE = this.n.B(jw2Var).e();
        if (b2.f2778c.a().booleanValue() && this.n.F().n && this.h != null) {
            this.h.i(vn1.b(xn1.INVALID_AD_SIZE, null, null));
            return false;
        }
        b60 b60VarD8 = D8(an1VarE);
        dy1<e50> dy1VarG = b60VarD8.c().g();
        this.q = dy1VarG;
        qx1.f(dy1VarG, new m71(this, b60VarD8), this.e.e());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final Bundle A() {
        com.google.android.gms.common.internal.r.f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final py2 A3() {
        return this.j.a();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void A7(gh ghVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void B2() {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void D() {
        com.google.android.gms.common.internal.r.f("resume must be called on the main UI thread.");
        if (this.p != null) {
            this.p.c().J0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void E6(a03 a03Var) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void G3(ah ahVar) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void H0(bk bkVar) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void I2(qw2 qw2Var) {
        com.google.android.gms.common.internal.r.f("setAdSize must be called on the main UI thread.");
        this.n.u(qw2Var);
        this.m = qw2Var;
        if (this.p != null) {
            this.p.h(this.g, qw2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized String K6() {
        return this.n.c();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void M6() {
        com.google.android.gms.common.internal.r.f("recordManualImpression must be called on the main UI thread.");
        if (this.p != null) {
            this.p.m();
        }
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final c.a.b.b.e.c Q4() {
        com.google.android.gms.common.internal.r.f("destroy must be called on the main UI thread.");
        return c.a.b.b.e.e.i2(this.g);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized String R0() {
        if (this.p == null || this.p.d() == null) {
            return null;
        }
        return this.p.d().e();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void R2(b1 b1Var) {
        com.google.android.gms.common.internal.r.f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.o = b1Var;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void S0(oy2 oy2Var) {
        com.google.android.gms.common.internal.r.f("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void T(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void T4(xx2 xx2Var) {
        com.google.android.gms.common.internal.r.f("setAdListener must be called on the main UI thread.");
        this.h.b(xx2Var);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void V1(py2 py2Var) {
        com.google.android.gms.common.internal.r.f("setAppEventListener must be called on the main UI thread.");
        this.j.b(py2Var);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void W5(m mVar) {
        com.google.android.gms.common.internal.r.f("setVideoOptions must be called on the main UI thread.");
        this.n.n(mVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    @Override // com.google.android.gms.internal.ads.hy2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean Y() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.dy1<com.google.android.gms.internal.ads.e50> r0 = r1.q     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L10
            com.google.android.gms.internal.ads.dy1<com.google.android.gms.internal.ads.e50> r0 = r1.q     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isDone()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L10
            r0 = 1
        Le:
            monitor-exit(r1)
            return r0
        L10:
            r0 = 0
            goto Le
        L12:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j71.Y():boolean");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void a6(vy2 vy2Var) {
        com.google.android.gms.common.internal.r.f("setCorrelationIdProvider must be called on the main UI thread");
        this.n.p(vy2Var);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void b4(sx2 sx2Var) {
        com.google.android.gms.common.internal.r.f("setAdListener must be called on the main UI thread.");
        this.i.a(sx2Var);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void destroy() {
        com.google.android.gms.common.internal.r.f("destroy must be called on the main UI thread.");
        if (this.p != null) {
            this.p.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized String e() {
        if (this.p == null || this.p.d() == null) {
            return null;
        }
        return this.p.d().e();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized boolean f5(jw2 jw2Var) {
        G8(this.m);
        return K8(jw2Var);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void g3(String str) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized uz2 getVideoController() {
        com.google.android.gms.common.internal.r.f("getVideoController must be called from the main thread.");
        if (this.p == null) {
            return null;
        }
        return this.p.g();
    }

    @Override // com.google.android.gms.internal.ads.kd0
    public final synchronized void k4() {
        boolean zQ;
        Object parent = this.g.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            zQ = com.google.android.gms.ads.internal.p.c().q(view, view.getContext());
        } else {
            zQ = false;
        }
        if (!zQ) {
            this.l.K0(60);
            return;
        }
        qw2 qw2VarF = this.n.F();
        if (this.p != null && this.p.k() != null && this.n.f()) {
            qw2VarF = gn1.b(this.f, Collections.singletonList(this.p.k()));
        }
        G8(qw2VarF);
        K8(this.n.b());
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void l8(vw2 vw2Var) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void m0(String str) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void m3(boolean z) {
        com.google.android.gms.common.internal.r.f("setManualImpressionsEnabled must be called from the main thread.");
        this.n.m(z);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized tz2 o() {
        if (!((Boolean) qx2.e().c(e0.T4)).booleanValue()) {
            return null;
        }
        if (this.p == null) {
            return null;
        }
        return this.p.d();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void q0(oz2 oz2Var) {
        com.google.android.gms.common.internal.r.f("setPaidEventListener must be called on the main UI thread.");
        this.k.a(oz2Var);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized qw2 q8() {
        com.google.android.gms.common.internal.r.f("getAdSize must be called on the main UI thread.");
        if (this.p != null) {
            return gn1.b(this.f, Collections.singletonList(this.p.i()));
        }
        return this.n.F();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void showInterstitial() {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void t() {
        com.google.android.gms.common.internal.r.f("pause must be called on the main UI thread.");
        if (this.p != null) {
            this.p.c().I0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final boolean t0() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void v2(ht2 ht2Var) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final xx2 z5() {
        return this.h.a();
    }
}
