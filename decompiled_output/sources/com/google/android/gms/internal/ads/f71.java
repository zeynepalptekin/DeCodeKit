package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;

/* loaded from: classes.dex */
public final class f71 extends ky2 {
    private final Context e;
    private final xx2 f;
    private final an1 g;
    private final e50 h;
    private final ViewGroup i;

    public f71(Context context, @androidx.annotation.i0 xx2 xx2Var, an1 an1Var, e50 e50Var) {
        this.e = context;
        this.f = xx2Var;
        this.g = an1Var;
        this.h = e50Var;
        FrameLayout frameLayout = new FrameLayout(this.e);
        frameLayout.removeAllViews();
        frameLayout.addView(this.h.j(), com.google.android.gms.ads.internal.p.e().r());
        frameLayout.setMinimumHeight(q8().f);
        frameLayout.setMinimumWidth(q8().i);
        this.i = frameLayout;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final Bundle A() throws RemoteException {
        tr.h("getAdMetadata is not supported in Publisher AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final py2 A3() throws RemoteException {
        return this.g.m;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void A7(gh ghVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void B2() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void D() throws RemoteException {
        com.google.android.gms.common.internal.r.f("destroy must be called on the main UI thread.");
        this.h.c().J0(null);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void E6(a03 a03Var) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void G3(ah ahVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void H0(bk bkVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void I2(qw2 qw2Var) throws RemoteException {
        com.google.android.gms.common.internal.r.f("setAdSize must be called on the main UI thread.");
        e50 e50Var = this.h;
        if (e50Var != null) {
            e50Var.h(this.i, qw2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final String K6() throws RemoteException {
        return this.g.f;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void M6() throws RemoteException {
        this.h.m();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final c.a.b.b.e.c Q4() throws RemoteException {
        return c.a.b.b.e.e.i2(this.i);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final String R0() throws RemoteException {
        if (this.h.d() != null) {
            return this.h.d().e();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void R2(b1 b1Var) throws RemoteException {
        tr.h("setOnCustomRenderedAdLoadedListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void S0(oy2 oy2Var) throws RemoteException {
        tr.h("setAdMetadataListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void T(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void T4(xx2 xx2Var) throws RemoteException {
        tr.h("setAdListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void V1(py2 py2Var) throws RemoteException {
        tr.h("setAppEventListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void W5(m mVar) throws RemoteException {
        tr.h("setVideoOptions is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final boolean Y() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void a6(vy2 vy2Var) throws RemoteException {
        tr.h("setCorrelationIdProvider is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void b4(sx2 sx2Var) throws RemoteException {
        tr.h("setAdClickListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void destroy() throws RemoteException {
        com.google.android.gms.common.internal.r.f("destroy must be called on the main UI thread.");
        this.h.a();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final String e() throws RemoteException {
        if (this.h.d() != null) {
            return this.h.d().e();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final boolean f5(jw2 jw2Var) throws RemoteException {
        tr.h("loadAd is not supported for a Publisher AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void g3(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final uz2 getVideoController() throws RemoteException {
        return this.h.g();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void l8(vw2 vw2Var) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void m0(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void m3(boolean z) throws RemoteException {
        tr.h("setManualImpressionsEnabled is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final tz2 o() {
        return this.h.d();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void q0(oz2 oz2Var) {
        tr.h("setOnPaidEventListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final qw2 q8() {
        com.google.android.gms.common.internal.r.f("getAdSize must be called on the main UI thread.");
        return gn1.b(this.e, Collections.singletonList(this.h.i()));
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void showInterstitial() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void t() throws RemoteException {
        com.google.android.gms.common.internal.r.f("destroy must be called on the main UI thread.");
        this.h.c().I0(null);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final boolean t0() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void v2(ht2 ht2Var) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final xx2 z5() throws RemoteException {
        return this.f;
    }
}
