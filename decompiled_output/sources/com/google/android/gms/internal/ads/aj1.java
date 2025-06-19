package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class aj1 extends ky2 implements com.google.android.gms.ads.internal.overlay.p, xc0, ct2 {
    private final gz e;
    private final Context f;
    private AtomicBoolean g = new AtomicBoolean();
    private final String h;
    private final yi1 i;
    private final oi1 j;

    @GuardedBy("this")
    private long k;

    @androidx.annotation.i0
    @GuardedBy("this")
    private u30 l;

    @androidx.annotation.i0
    @GuardedBy("this")
    protected v40 m;

    public aj1(gz gzVar, Context context, String str, yi1 yi1Var, oi1 oi1Var) {
        this.e = gzVar;
        this.f = context;
        this.h = str;
        this.i = yi1Var;
        this.j = oi1Var;
        oi1Var.d(this);
        oi1Var.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A8(v40 v40Var) {
        v40Var.h(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C8, reason: merged with bridge method [inline-methods] */
    public final synchronized void E8() {
        if (this.g.compareAndSet(false, true)) {
            this.j.b();
            if (this.l != null) {
                com.google.android.gms.ads.internal.p.f().e(this.l);
            }
            if (this.m != null) {
                this.m.j(com.google.android.gms.ads.internal.p.j().c() - this.k);
            }
            destroy();
        }
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

    final /* synthetic */ void D8() {
        this.e.e().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.dj1
            private final aj1 d;

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
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized String K6() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void M6() {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final c.a.b.b.e.c Q4() {
        return null;
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
        return this.i.Y();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void a6(vy2 vy2Var) {
    }

    @Override // com.google.android.gms.internal.ads.xc0
    public final synchronized void b2() {
        if (this.m == null) {
            return;
        }
        this.k = com.google.android.gms.ads.internal.p.j().c();
        int i = this.m.i();
        if (i <= 0) {
            return;
        }
        u30 u30Var = new u30(this.e.f(), com.google.android.gms.ads.internal.p.j());
        this.l = u30Var;
        u30Var.b(i, new Runnable(this) { // from class: com.google.android.gms.internal.ads.cj1
            private final aj1 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.D8();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void b4(sx2 sx2Var) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void destroy() {
        com.google.android.gms.common.internal.r.f("destroy must be called on the main UI thread.");
        if (this.m != null) {
            this.m.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized String e() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized boolean f5(jw2 jw2Var) throws RemoteException {
        com.google.android.gms.common.internal.r.f("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.p.c();
        if (to.L(this.f) && jw2Var.v == null) {
            tr.g("Failed to load the ad because app ID is missing.");
            this.j.i(vn1.b(xn1.APP_ID_MISSING, null, null));
            return false;
        }
        if (Y()) {
            return false;
        }
        this.g = new AtomicBoolean();
        return this.i.Z(jw2Var, this.h, new fj1(this), new ej1(this));
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
        this.i.f(vw2Var);
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
        E8();
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void onResume() {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void q0(oz2 oz2Var) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void q4() {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized qw2 q8() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void r6() {
        E8();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final synchronized void showInterstitial() {
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
        this.j.h(ht2Var);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final xx2 z5() {
        return null;
    }
}
