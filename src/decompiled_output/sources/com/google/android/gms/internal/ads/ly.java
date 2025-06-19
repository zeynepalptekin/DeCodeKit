package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

@com.google.android.gms.common.util.d0
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ly extends uy implements ey {
    private boolean A;
    private View.OnAttachStateChangeListener B;
    protected rw d;
    private zv2 g;
    private com.google.android.gms.ads.internal.overlay.p h;
    private dy i;
    private gy j;
    private b6 k;
    private d6 l;
    private fy m;
    private volatile boolean o;

    @GuardedBy("lock")
    private boolean p;

    @GuardedBy("lock")
    private boolean q;

    @GuardedBy("lock")
    private boolean r;
    private com.google.android.gms.ads.internal.overlay.v s;
    private fg t;
    private com.google.android.gms.ads.internal.a u;
    private uf v;

    @androidx.annotation.i0
    private im w;
    private boolean x;
    private boolean y;
    private int z;
    private final Object f = new Object();
    private boolean n = false;
    private final p9<rw> e = new p9<>();

    private final void J() {
        if (this.B == null) {
            return;
        }
        this.d.getView().removeOnAttachStateChangeListener(this.B);
    }

    private final void K() {
        if (this.i != null && ((this.x && this.z <= 0) || this.y)) {
            this.i.a(!this.y);
            this.i = null;
        }
        this.d.W();
    }

    private static WebResourceResponse L() {
        if (((Boolean) qx2.e().c(e0.j0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f1, code lost:
    
        com.google.android.gms.ads.internal.p.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
    
        return com.google.android.gms.internal.ads.to.Q(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.webkit.WebResourceResponse Q(com.google.android.gms.internal.ads.xy r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ly.Q(com.google.android.gms.internal.ads.xy):android.webkit.WebResourceResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(View view, im imVar, int r5) {
        if (!imVar.b() || r5 <= 0) {
            return;
        }
        imVar.h(view);
        if (imVar.b()) {
            to.h.postDelayed(new ny(this, view, imVar, r5), 100L);
        }
    }

    private final void x(AdOverlayInfoParcel adOverlayInfoParcel) throws NumberFormatException {
        com.google.android.gms.ads.internal.overlay.b bVar;
        uf ufVar = this.v;
        boolean zL = ufVar != null ? ufVar.l() : false;
        com.google.android.gms.ads.internal.p.b();
        com.google.android.gms.ads.internal.overlay.l.a(this.d.getContext(), adOverlayInfoParcel, !zL);
        if (this.w != null) {
            String str = adOverlayInfoParcel.o;
            if (str == null && (bVar = adOverlayInfoParcel.d) != null) {
                str = bVar.e;
            }
            this.w.d(str);
        }
    }

    public final void B(String str, com.google.android.gms.common.util.w<z6<? super rw>> wVar) {
        this.e.F(str, wVar);
    }

    public final void C(String str, z6<? super rw> z6Var) {
        this.e.o(str, z6Var);
    }

    public final void D(boolean z, int r16, String str) throws NumberFormatException {
        boolean zC = this.d.c();
        zv2 zv2Var = (!zC || this.d.h().e()) ? this.g : null;
        py pyVar = zC ? null : new py(this.d, this.h);
        b6 b6Var = this.k;
        d6 d6Var = this.l;
        com.google.android.gms.ads.internal.overlay.v vVar = this.s;
        rw rwVar = this.d;
        x(new AdOverlayInfoParcel(zv2Var, pyVar, b6Var, d6Var, vVar, rwVar, z, r16, str, rwVar.b()));
    }

    public final void E(boolean z, int r17, String str, String str2) throws NumberFormatException {
        boolean zC = this.d.c();
        zv2 zv2Var = (!zC || this.d.h().e()) ? this.g : null;
        py pyVar = zC ? null : new py(this.d, this.h);
        b6 b6Var = this.k;
        d6 d6Var = this.l;
        com.google.android.gms.ads.internal.overlay.v vVar = this.s;
        rw rwVar = this.d;
        x(new AdOverlayInfoParcel(zv2Var, pyVar, b6Var, d6Var, vVar, rwVar, z, r17, str, str2, rwVar.b()));
    }

    public final boolean F() {
        boolean z;
        synchronized (this.f) {
            z = this.p;
        }
        return z;
    }

    public final boolean G() {
        boolean z;
        synchronized (this.f) {
            z = this.q;
        }
        return z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener H() {
        synchronized (this.f) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener I() {
        synchronized (this.f) {
        }
        return null;
    }

    public final void M(boolean z) {
        this.n = z;
    }

    public final void N(boolean z) {
        this.A = z;
    }

    public final void O(String str, z6<? super rw> z6Var) {
        this.e.j(str, z6Var);
    }

    public final void P(boolean z, int r12) throws NumberFormatException {
        zv2 zv2Var = (!this.d.c() || this.d.h().e()) ? this.g : null;
        com.google.android.gms.ads.internal.overlay.p pVar = this.h;
        com.google.android.gms.ads.internal.overlay.v vVar = this.s;
        rw rwVar = this.d;
        x(new AdOverlayInfoParcel(zv2Var, pVar, vVar, rwVar, z, r12, rwVar.b()));
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void a(Uri uri) {
        this.e.v0(uri);
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void b(gy gyVar) {
        this.j = gyVar;
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void c() {
        this.y = true;
        K();
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void d(boolean z) {
        synchronized (this.f) {
            this.p = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final boolean e() {
        return this.o;
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void f(int r2, int r3, boolean z) {
        this.t.h(r2, r3);
        uf ufVar = this.v;
        if (ufVar != null) {
            ufVar.h(r2, r3, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void g(boolean z) {
        synchronized (this.f) {
            this.q = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void h() {
        synchronized (this.f) {
            this.n = false;
            this.o = true;
            cs.e.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ky
                private final ly d;

                {
                    this.d = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    ly lyVar = this.d;
                    lyVar.d.y();
                    com.google.android.gms.ads.internal.overlay.e eVarW0 = lyVar.d.w0();
                    if (eVarW0 != null) {
                        eVarW0.I8();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void i() {
        im imVar = this.w;
        if (imVar != null) {
            WebView webView = this.d.getWebView();
            if (b.i.p.f0.J0(webView)) {
                w(webView, imVar, 10);
                return;
            }
            J();
            this.B = new my(this, imVar);
            this.d.getView().addOnAttachStateChangeListener(this.B);
        }
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void j() {
        this.z--;
        K();
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void k(int r2, int r3) {
        uf ufVar = this.v;
        if (ufVar != null) {
            ufVar.k(r2, r3);
        }
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final im l() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void m(dy dyVar) {
        this.i = dyVar;
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final com.google.android.gms.ads.internal.a n() {
        return this.u;
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void o(zv2 zv2Var, b6 b6Var, com.google.android.gms.ads.internal.overlay.p pVar, d6 d6Var, com.google.android.gms.ads.internal.overlay.v vVar, boolean z, @androidx.annotation.i0 y6 y6Var, com.google.android.gms.ads.internal.a aVar, hg hgVar, @androidx.annotation.i0 im imVar) {
        if (aVar == null) {
            aVar = new com.google.android.gms.ads.internal.a(this.d.getContext(), imVar, null);
        }
        this.v = new uf(this.d, hgVar);
        this.w = imVar;
        if (((Boolean) qx2.e().c(e0.u0)).booleanValue()) {
            C("/adMetadata", new c6(b6Var));
        }
        C("/appEvent", new e6(d6Var));
        C("/backButton", f6.k);
        C("/refresh", f6.l);
        C("/canOpenApp", f6.f3377b);
        C("/canOpenURLs", f6.f3376a);
        C("/canOpenIntents", f6.f3378c);
        C("/click", f6.d);
        C("/close", f6.e);
        C("/customClose", f6.f);
        C("/instrument", f6.o);
        C("/delayPageLoaded", f6.q);
        C("/delayPageClosed", f6.r);
        C("/getLocationInfo", f6.s);
        C("/httpTrack", f6.g);
        C("/log", f6.h);
        C("/mraid", new a7(aVar, this.v, hgVar));
        C("/mraidLoaded", this.t);
        C("/open", new d7(aVar, this.v));
        C("/precache", new xv());
        C("/touch", f6.j);
        C("/video", f6.m);
        C("/videoMeta", f6.n);
        if (com.google.android.gms.ads.internal.p.A().k(this.d.getContext())) {
            C("/logScionEvent", new b7(this.d.getContext()));
        }
        this.g = zv2Var;
        this.h = pVar;
        this.k = b6Var;
        this.l = d6Var;
        this.s = vVar;
        this.u = aVar;
        this.n = z;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        ut2 ut2VarD0 = this.d.d0();
        if (ut2VarD0 != null && webView == ut2VarD0.getWebView()) {
            ut2VarD0.b(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.d.V(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void p() {
        synchronized (this.f) {
            this.r = true;
        }
        this.z++;
        K();
    }

    @Override // com.google.android.gms.internal.ads.uy
    public final void q(xy xyVar) {
        this.x = true;
        gy gyVar = this.j;
        if (gyVar != null) {
            gyVar.a();
            this.j = null;
        }
        K();
    }

    @Override // com.google.android.gms.internal.ads.uy
    public final void s(xy xyVar) {
        this.e.g0(xyVar.f6058b);
    }

    @Override // com.google.android.gms.internal.ads.uy
    public final boolean t(xy xyVar) throws NumberFormatException {
        String strValueOf = String.valueOf(xyVar.f6057a);
        oo.m(strValueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(strValueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uriB = xyVar.f6058b;
        if (this.e.g0(uriB)) {
            return true;
        }
        if (this.n) {
            String scheme = uriB.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                zv2 zv2Var = this.g;
                if (zv2Var != null) {
                    zv2Var.p();
                    im imVar = this.w;
                    if (imVar != null) {
                        imVar.d(xyVar.f6057a);
                    }
                    this.g = null;
                }
                return false;
            }
        }
        if (this.d.getWebView().willNotDraw()) {
            String strValueOf2 = String.valueOf(xyVar.f6057a);
            tr.i(strValueOf2.length() != 0 ? "AdWebView unable to handle URL: ".concat(strValueOf2) : new String("AdWebView unable to handle URL: "));
        } else {
            try {
                i52 i52VarK = this.d.k();
                if (i52VarK != null && i52VarK.f(uriB)) {
                    uriB = i52VarK.b(uriB, this.d.getContext(), this.d.getView(), this.d.a());
                }
            } catch (h42 unused) {
                String strValueOf3 = String.valueOf(xyVar.f6057a);
                tr.i(strValueOf3.length() != 0 ? "Unable to append parameter to URL: ".concat(strValueOf3) : new String("Unable to append parameter to URL: "));
            }
            com.google.android.gms.ads.internal.a aVar = this.u;
            if (aVar == null || aVar.d()) {
                y(new com.google.android.gms.ads.internal.overlay.b("android.intent.action.VIEW", uriB.toString(), null, null, null, null, null));
            } else {
                this.u.b(xyVar.f6057a);
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.uy
    @androidx.annotation.i0
    public final WebResourceResponse u(xy xyVar) throws ExecutionException, InterruptedException, TimeoutException {
        WebResourceResponse webResourceResponseP;
        zt2 zt2VarD;
        im imVar = this.w;
        if (imVar != null) {
            imVar.e(xyVar.f6057a, xyVar.d, 1);
        }
        if ("mraid.js".equalsIgnoreCase(new File(xyVar.f6057a).getName())) {
            h();
            String str = (String) qx2.e().c(this.d.h().e() ? e0.H : this.d.c() ? e0.G : e0.F);
            com.google.android.gms.ads.internal.p.c();
            webResourceResponseP = to.P(this.d.getContext(), this.d.b().d, str);
        } else {
            webResourceResponseP = null;
        }
        if (webResourceResponseP != null) {
            return webResourceResponseP;
        }
        try {
            if (!fn.d(xyVar.f6057a, this.d.getContext(), this.A).equals(xyVar.f6057a)) {
                return Q(xyVar);
            }
            fu2 fu2VarH = fu2.h(xyVar.f6057a);
            if (fu2VarH != null && (zt2VarD = com.google.android.gms.ads.internal.p.i().d(fu2VarH)) != null && zt2VarD.h()) {
                return new WebResourceResponse("", "", zt2VarD.i());
            }
            if (nr.a() && v1.f5625b.a().booleanValue()) {
                return Q(xyVar);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.p.g().e(e, "AdWebViewClient.interceptRequest");
            return L();
        }
    }

    public final void v() {
        im imVar = this.w;
        if (imVar != null) {
            imVar.f();
            this.w = null;
        }
        J();
        this.e.K();
        this.e.U(null);
        synchronized (this.f) {
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.s = null;
            this.m = null;
            if (this.v != null) {
                this.v.i(true);
                this.v = null;
            }
        }
    }

    public final void y(com.google.android.gms.ads.internal.overlay.b bVar) throws NumberFormatException {
        boolean zC = this.d.c();
        x(new AdOverlayInfoParcel(bVar, (!zC || this.d.h().e()) ? this.g : null, zC ? null : this.h, this.s, this.d.b()));
    }

    final void z(rw rwVar, boolean z) {
        fg fgVar = new fg(rwVar, rwVar.f0(), new o(rwVar.getContext()));
        this.d = rwVar;
        this.o = z;
        this.t = fgVar;
        this.v = null;
        this.e.U(rwVar);
    }
}
