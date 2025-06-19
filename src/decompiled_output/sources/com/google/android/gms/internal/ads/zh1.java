package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class zh1 extends ky2 implements com.google.android.gms.ads.internal.overlay.w, xc0, ct2 {
    private final gz e;
    private final Context f;
    private final ViewGroup g;
    private AtomicBoolean h = new AtomicBoolean();
    private final String i;
    private final xh1 j;
    private final oi1 k;
    private final as l;
    private long m;

    @androidx.annotation.i0
    private u30 n;

    @androidx.annotation.i0
    @GuardedBy("this")
    protected i40 o;

    public zh1(gz gzVar, Context context, String str, xh1 xh1Var, oi1 oi1Var, as asVar) {
        this.g = new FrameLayout(context);
        this.e = gzVar;
        this.f = context;
        this.i = str;
        this.j = xh1Var;
        this.k = oi1Var;
        oi1Var.d(this);
        this.l = asVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.android.gms.ads.internal.overlay.o A8(i40 i40Var) {
        boolean zI = i40Var.i();
        int r0 = ((Integer) qx2.e().c(e0.d3)).intValue();
        com.google.android.gms.ads.internal.overlay.r rVar = new com.google.android.gms.ads.internal.overlay.r();
        rVar.e = 50;
        rVar.f2416a = zI ? r0 : 0;
        rVar.f2417b = zI ? 0 : r0;
        rVar.f2418c = 0;
        rVar.d = r0;
        return new com.google.android.gms.ads.internal.overlay.o(this.f, rVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C8, reason: merged with bridge method [inline-methods] */
    public final void F8() {
        if (this.h.compareAndSet(false, true)) {
            i40 i40Var = this.o;
            if (i40Var != null && i40Var.p() != null) {
                this.k.j(this.o.p());
            }
            this.k.b();
            this.g.removeAllViews();
            u30 u30Var = this.n;
            if (u30Var != null) {
                com.google.android.gms.ads.internal.p.f().e(u30Var);
            }
            i40 i40Var2 = this.o;
            if (i40Var2 != null) {
                i40Var2.q(com.google.android.gms.ads.internal.p.j().c() - this.m);
            }
            destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qw2 D8() {
        return gn1.b(this.f, Collections.singletonList(this.o.m()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RelativeLayout.LayoutParams G8(i40 i40Var) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(i40Var.i() ? 11 : 9);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K8(i40 i40Var) {
        i40Var.g(this);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final Bundle A() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final py2 A3() {
        return null;
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
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void E6(a03 a03Var) {
    }

    final /* synthetic */ void E8() {
        this.e.e().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ci1
            private final zh1 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.F8();
            }
        });
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
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized String K6() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void M6() {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final c.a.b.b.e.c Q4() {
        com.google.android.gms.common.internal.r.f("getAdFrame must be called on the main UI thread.");
        return c.a.b.b.e.e.i2(this.g);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized String R0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void R2(b1 b1Var) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void S0(oy2 oy2Var) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void T(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void T4(xx2 xx2Var) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void V1(py2 py2Var) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void W5(m mVar) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized boolean Y() {
        return this.j.Y();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void a6(vy2 vy2Var) {
    }

    @Override // com.google.android.gms.internal.ads.xc0
    public final void b2() {
        if (this.o == null) {
            return;
        }
        this.m = com.google.android.gms.ads.internal.p.j().c();
        int r0 = this.o.j();
        if (r0 <= 0) {
            return;
        }
        u30 u30Var = new u30(this.e.f(), com.google.android.gms.ads.internal.p.j());
        this.n = u30Var;
        u30Var.b(r0, new Runnable(this) { // from class: com.google.android.gms.internal.ads.bi1
            private final zh1 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.E8();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void b4(sx2 sx2Var) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void destroy() {
        com.google.android.gms.common.internal.r.f("destroy must be called on the main UI thread.");
        if (this.o != null) {
            this.o.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized String e() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.w
    public final void e2() {
        F8();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized boolean f5(jw2 jw2Var) throws RemoteException {
        com.google.android.gms.common.internal.r.f("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.p.c();
        if (to.L(this.f) && jw2Var.v == null) {
            tr.g("Failed to load the ad because app ID is missing.");
            this.k.i(vn1.b(xn1.APP_ID_MISSING, null, null));
            return false;
        }
        if (Y()) {
            return false;
        }
        this.h = new AtomicBoolean();
        return this.j.Z(jw2Var, this.i, new ei1(this), new di1(this));
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void g3(String str) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized uz2 getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void l8(vw2 vw2Var) {
        this.j.f(vw2Var);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void m0(String str) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void m3(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized tz2 o() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ct2
    public final void o4() {
        F8();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void q0(oz2 oz2Var) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized qw2 q8() {
        com.google.android.gms.common.internal.r.f("getAdSize must be called on the main UI thread.");
        if (this.o == null) {
            return null;
        }
        return gn1.b(this.f, Collections.singletonList(this.o.m()));
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void showInterstitial() {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void t() {
        com.google.android.gms.common.internal.r.f("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final boolean t0() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void v2(ht2 ht2Var) {
        this.k.h(ht2Var);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final xx2 z5() {
        return null;
    }
}
