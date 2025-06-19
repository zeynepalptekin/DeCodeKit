package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.ia0;
import com.google.android.gms.internal.ads.qf0;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class u71 extends ky2 {
    private final gz e;
    private final Context f;
    private final Executor g;
    private final s71 h = new s71();
    private final r71 i = new r71();
    private final qk1 j = new qk1(new no1());
    private final n71 k = new n71();

    @GuardedBy("this")
    private final cn1 l;

    @androidx.annotation.i0
    @GuardedBy("this")
    private b1 m;

    @androidx.annotation.i0
    @GuardedBy("this")
    private gi0 n;

    @androidx.annotation.i0
    @GuardedBy("this")
    private dy1<gi0> o;

    @GuardedBy("this")
    private boolean p;

    public u71(gz gzVar, Context context, qw2 qw2Var, String str) {
        cn1 cn1Var = new cn1();
        this.l = cn1Var;
        this.p = false;
        this.e = gzVar;
        cn1Var.u(qw2Var).z(str);
        this.g = gzVar.e();
        this.f = context;
    }

    static /* synthetic */ dy1 B8(u71 u71Var, dy1 dy1Var) {
        u71Var.o = null;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized boolean C8() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.gi0 r0 = r1.n     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L10
            com.google.android.gms.internal.ads.gi0 r0 = r1.n     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.g()     // Catch: java.lang.Throwable -> L12
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u71.C8():boolean");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final Bundle A() {
        com.google.android.gms.common.internal.r.f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final py2 A3() {
        return this.i.a();
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
        if (this.n != null) {
            this.n.c().J0(null);
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
        this.j.k(bkVar);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void I2(qw2 qw2Var) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized String K6() {
        return this.l.c();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void M6() {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final c.a.b.b.e.c Q4() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized String R0() {
        if (this.n == null || this.n.d() == null) {
            return null;
        }
        return this.n.d().e();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void R2(b1 b1Var) {
        com.google.android.gms.common.internal.r.f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.m = b1Var;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void S0(oy2 oy2Var) {
        com.google.android.gms.common.internal.r.f("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void T(boolean z) {
        com.google.android.gms.common.internal.r.f("setImmersiveMode must be called on the main UI thread.");
        this.p = z;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void T4(xx2 xx2Var) {
        com.google.android.gms.common.internal.r.f("setAdListener must be called on the main UI thread.");
        this.h.b(xx2Var);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void V1(py2 py2Var) {
        com.google.android.gms.common.internal.r.f("setAppEventListener must be called on the main UI thread.");
        this.i.b(py2Var);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void W5(m mVar) {
        this.l.n(mVar);
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
            com.google.android.gms.internal.ads.dy1<com.google.android.gms.internal.ads.gi0> r0 = r1.o     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L10
            com.google.android.gms.internal.ads.dy1<com.google.android.gms.internal.ads.gi0> r0 = r1.o     // Catch: java.lang.Throwable -> L12
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u71.Y():boolean");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void a6(vy2 vy2Var) {
        com.google.android.gms.common.internal.r.f("setCorrelationIdProvider must be called on the main UI thread");
        this.l.p(vy2Var);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void b4(sx2 sx2Var) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void destroy() {
        com.google.android.gms.common.internal.r.f("destroy must be called on the main UI thread.");
        if (this.n != null) {
            this.n.c().K0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized String e() {
        if (this.n == null || this.n.d() == null) {
            return null;
        }
        return this.n.d().e();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized boolean f5(jw2 jw2Var) {
        gj0 gj0VarB;
        com.google.android.gms.common.internal.r.f("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.p.c();
        if (to.L(this.f) && jw2Var.v == null) {
            tr.g("Failed to load the ad because app ID is missing.");
            if (this.h != null) {
                this.h.i(vn1.b(xn1.APP_ID_MISSING, null, null));
            }
            return false;
        }
        if (this.o == null && !C8()) {
            nn1.b(this.f, jw2Var.i);
            this.n = null;
            an1 an1VarE = this.l.B(jw2Var).e();
            if (((Boolean) qx2.e().c(e0.p5)).booleanValue()) {
                gj0VarB = this.e.p().w(new ia0.a().g(this.f).c(an1VarE).d()).B(new qf0.a().o()).b(new m61(this.m));
            } else {
                qf0.a aVar = new qf0.a();
                if (this.j != null) {
                    aVar.d(this.j, this.e.e()).h(this.j, this.e.e()).e(this.j, this.e.e());
                }
                gj0VarB = this.e.p().w(new ia0.a().g(this.f).c(an1VarE).d()).B(aVar.d(this.h, this.e.e()).h(this.h, this.e.e()).e(this.h, this.e.e()).l(this.h, this.e.e()).a(this.i, this.e.e()).j(this.k, this.e.e()).o()).b(new m61(this.m));
            }
            hj0 hj0VarD = gj0VarB.d();
            dy1<gi0> dy1VarG = hj0VarD.b().g();
            this.o = dy1VarG;
            qx1.f(dy1VarG, new t71(this, hj0VarD), this.g);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void g3(String str) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final uz2 getVideoController() {
        return null;
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
        this.l.m(z);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized tz2 o() {
        if (!((Boolean) qx2.e().c(e0.T4)).booleanValue()) {
            return null;
        }
        if (this.n == null) {
            return null;
        }
        return this.n.d();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void q0(oz2 oz2Var) {
        com.google.android.gms.common.internal.r.f("setPaidEventListener must be called on the main UI thread.");
        this.k.a(oz2Var);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final qw2 q8() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void showInterstitial() {
        com.google.android.gms.common.internal.r.f("showInterstitial must be called on the main UI thread.");
        if (this.n == null) {
            return;
        }
        this.n.h(this.p);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void t() {
        com.google.android.gms.common.internal.r.f("pause must be called on the main UI thread.");
        if (this.n != null) {
            this.n.c().I0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized boolean t0() {
        com.google.android.gms.common.internal.r.f("isLoaded must be called on the main UI thread.");
        return C8();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void v2(ht2 ht2Var) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final xx2 z5() {
        return this.h.a();
    }
}
