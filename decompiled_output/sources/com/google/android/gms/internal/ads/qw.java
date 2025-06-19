package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.vu2;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

@com.google.android.gms.common.util.d0
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class qw extends WebViewClient implements ey {

    /* renamed from: a, reason: collision with root package name */
    protected rw f5066a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.i0
    private final tu2 f5067b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, List<z6<? super rw>>> f5068c;
    private final Object d;
    private zv2 e;
    private com.google.android.gms.ads.internal.overlay.p f;
    private dy g;
    private gy h;
    private b6 i;
    private d6 j;
    private fy k;
    private boolean l;

    @GuardedBy("lock")
    private boolean m;

    @GuardedBy("lock")
    private boolean n;

    @GuardedBy("lock")
    private boolean o;

    @GuardedBy("lock")
    private boolean p;
    private com.google.android.gms.ads.internal.overlay.v q;
    private final fg r;
    private com.google.android.gms.ads.internal.a s;
    private uf t;

    @androidx.annotation.i0
    protected im u;
    private boolean v;
    private boolean w;
    private int x;
    private boolean y;
    private View.OnAttachStateChangeListener z;

    public qw(rw rwVar, tu2 tu2Var, boolean z) {
        this(rwVar, tu2Var, z, new fg(rwVar, rwVar.f0(), new o(rwVar.getContext())), null);
    }

    @com.google.android.gms.common.util.d0
    private qw(rw rwVar, tu2 tu2Var, boolean z, fg fgVar, uf ufVar) {
        this.f5068c = new HashMap<>();
        this.d = new Object();
        this.l = false;
        this.f5067b = tu2Var;
        this.f5066a = rwVar;
        this.m = z;
        this.r = fgVar;
        this.t = null;
    }

    private final void F() {
        if (this.z == null) {
            return;
        }
        this.f5066a.getView().removeOnAttachStateChangeListener(this.z);
    }

    private final void G() {
        if (this.g != null && ((this.v && this.x <= 0) || this.w)) {
            this.g.a(!this.w);
            this.g = null;
        }
        this.f5066a.W();
    }

    private static WebResourceResponse H() {
        if (((Boolean) qx2.e().c(e0.j0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ed, code lost:
    
        com.google.android.gms.ads.internal.p.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f4, code lost:
    
        return com.google.android.gms.internal.ads.to.Q(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.webkit.WebResourceResponse N(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qw.N(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(View view, im imVar, int r5) {
        if (!imVar.b() || r5 <= 0) {
            return;
        }
        imVar.h(view);
        if (imVar.b()) {
            to.h.postDelayed(new vw(this, view, imVar, r5), 100L);
        }
    }

    private final void s(AdOverlayInfoParcel adOverlayInfoParcel) throws NumberFormatException {
        com.google.android.gms.ads.internal.overlay.b bVar;
        uf ufVar = this.t;
        boolean zL = ufVar != null ? ufVar.l() : false;
        com.google.android.gms.ads.internal.p.b();
        com.google.android.gms.ads.internal.overlay.l.a(this.f5066a.getContext(), adOverlayInfoParcel, !zL);
        if (this.u != null) {
            String str = adOverlayInfoParcel.o;
            if (str == null && (bVar = adOverlayInfoParcel.d) != null) {
                str = bVar.e;
            }
            this.u.d(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(Map<String, String> map, List<z6<? super rw>> list, String str) {
        if (tr.a(2)) {
            String strValueOf = String.valueOf(str);
            oo.m(strValueOf.length() != 0 ? "Received GMSG: ".concat(strValueOf) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                oo.m(sb.toString());
            }
        }
        Iterator<z6<? super rw>> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(this.f5066a, map);
        }
    }

    public final void A(boolean z, int r17, String str, String str2) throws NumberFormatException {
        boolean zC = this.f5066a.c();
        zv2 zv2Var = (!zC || this.f5066a.h().e()) ? this.e : null;
        ww wwVar = zC ? null : new ww(this.f5066a, this.f);
        b6 b6Var = this.i;
        d6 d6Var = this.j;
        com.google.android.gms.ads.internal.overlay.v vVar = this.q;
        rw rwVar = this.f5066a;
        s(new AdOverlayInfoParcel(zv2Var, wwVar, b6Var, d6Var, vVar, rwVar, z, r17, str, str2, rwVar.b()));
    }

    public final boolean B() {
        boolean z;
        synchronized (this.d) {
            z = this.n;
        }
        return z;
    }

    public final boolean C() {
        boolean z;
        synchronized (this.d) {
            z = this.o;
        }
        return z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener D() {
        synchronized (this.d) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener E() {
        synchronized (this.d) {
        }
        return null;
    }

    public final void I(boolean z) {
        this.l = z;
    }

    public final void J(boolean z) {
        this.y = z;
    }

    public final void K(String str, z6<? super rw> z6Var) {
        synchronized (this.d) {
            List<z6<? super rw>> list = this.f5068c.get(str);
            if (list == null) {
                return;
            }
            list.remove(z6Var);
        }
    }

    public final void L(boolean z, int r12) throws NumberFormatException {
        zv2 zv2Var = (!this.f5066a.c() || this.f5066a.h().e()) ? this.e : null;
        com.google.android.gms.ads.internal.overlay.p pVar = this.f;
        com.google.android.gms.ads.internal.overlay.v vVar = this.q;
        rw rwVar = this.f5066a;
        s(new AdOverlayInfoParcel(zv2Var, pVar, vVar, rwVar, z, r12, rwVar.b()));
    }

    @androidx.annotation.i0
    protected final WebResourceResponse M(String str, Map<String, String> map) {
        zt2 zt2VarD;
        try {
            String strD = fn.d(str, this.f5066a.getContext(), this.y);
            if (!strD.equals(str)) {
                return N(strD, map);
            }
            fu2 fu2VarH = fu2.h(str);
            if (fu2VarH != null && (zt2VarD = com.google.android.gms.ads.internal.p.i().d(fu2VarH)) != null && zt2VarD.h()) {
                return new WebResourceResponse("", "", zt2VarD.i());
            }
            if (nr.a() && v1.f5625b.a().booleanValue()) {
                return N(str, map);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.p.g().e(e, "AdWebViewClient.interceptRequest");
            return H();
        }
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void a(Uri uri) {
        final String path = uri.getPath();
        List<z6<? super rw>> list = this.f5068c.get(path);
        if (list != null) {
            if (((Boolean) qx2.e().c(e0.N3)).booleanValue()) {
                qx1.f(com.google.android.gms.ads.internal.p.c().c0(uri), new xw(this, list, path), cs.f);
                return;
            } else {
                com.google.android.gms.ads.internal.p.c();
                y(to.d0(uri), list, path);
                return;
            }
        }
        String strValueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 32);
        sb.append("No GMSG handler found for GMSG: ");
        sb.append(strValueOf);
        oo.m(sb.toString());
        if (!((Boolean) qx2.e().c(e0.S4)).booleanValue() || com.google.android.gms.ads.internal.p.g().l() == null) {
            return;
        }
        cs.f3023a.execute(new Runnable(path) { // from class: com.google.android.gms.internal.ads.sw
            private final String d;

            {
                this.d = path;
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                com.google.android.gms.ads.internal.p.g().l().f(this.d.substring(1));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void b(gy gyVar) {
        this.h = gyVar;
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void c() {
        tu2 tu2Var = this.f5067b;
        if (tu2Var != null) {
            tu2Var.b(vu2.a.b.DELAY_PAGE_LOAD_CANCELLED_AD);
        }
        this.w = true;
        G();
        if (((Boolean) qx2.e().c(e0.R3)).booleanValue()) {
            this.f5066a.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void d(boolean z) {
        synchronized (this.d) {
            this.n = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final boolean e() {
        boolean z;
        synchronized (this.d) {
            z = this.m;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void f(int r2, int r3, boolean z) {
        this.r.h(r2, r3);
        uf ufVar = this.t;
        if (ufVar != null) {
            ufVar.h(r2, r3, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void g(boolean z) {
        synchronized (this.d) {
            this.o = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void h() {
        synchronized (this.d) {
            this.l = false;
            this.m = true;
            cs.e.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.tw
                private final qw d;

                {
                    this.d = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    qw qwVar = this.d;
                    qwVar.f5066a.y();
                    com.google.android.gms.ads.internal.overlay.e eVarW0 = qwVar.f5066a.w0();
                    if (eVarW0 != null) {
                        eVarW0.I8();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void i() {
        im imVar = this.u;
        if (imVar != null) {
            WebView webView = this.f5066a.getWebView();
            if (b.i.p.f0.J0(webView)) {
                r(webView, imVar, 10);
                return;
            }
            F();
            this.z = new uw(this, imVar);
            this.f5066a.getView().addOnAttachStateChangeListener(this.z);
        }
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void j() {
        this.x--;
        G();
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void k(int r2, int r3) {
        uf ufVar = this.t;
        if (ufVar != null) {
            ufVar.k(r2, r3);
        }
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final im l() {
        return this.u;
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void m(dy dyVar) {
        this.g = dyVar;
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final com.google.android.gms.ads.internal.a n() {
        return this.s;
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void o(zv2 zv2Var, b6 b6Var, com.google.android.gms.ads.internal.overlay.p pVar, d6 d6Var, com.google.android.gms.ads.internal.overlay.v vVar, boolean z, @androidx.annotation.i0 y6 y6Var, com.google.android.gms.ads.internal.a aVar, hg hgVar, @androidx.annotation.i0 im imVar) {
        if (aVar == null) {
            aVar = new com.google.android.gms.ads.internal.a(this.f5066a.getContext(), imVar, null);
        }
        this.t = new uf(this.f5066a, hgVar);
        this.u = imVar;
        if (((Boolean) qx2.e().c(e0.u0)).booleanValue()) {
            x("/adMetadata", new c6(b6Var));
        }
        x("/appEvent", new e6(d6Var));
        x("/backButton", f6.k);
        x("/refresh", f6.l);
        x("/canOpenApp", f6.f3377b);
        x("/canOpenURLs", f6.f3376a);
        x("/canOpenIntents", f6.f3378c);
        x("/click", f6.d);
        x("/close", f6.e);
        x("/customClose", f6.f);
        x("/instrument", f6.o);
        x("/delayPageLoaded", f6.q);
        x("/delayPageClosed", f6.r);
        x("/getLocationInfo", f6.s);
        x("/httpTrack", f6.g);
        x("/log", f6.h);
        x("/mraid", new a7(aVar, this.t, hgVar));
        x("/mraidLoaded", this.r);
        x("/open", new d7(aVar, this.t));
        x("/precache", new xv());
        x("/touch", f6.j);
        x("/video", f6.m);
        x("/videoMeta", f6.n);
        if (com.google.android.gms.ads.internal.p.A().k(this.f5066a.getContext())) {
            x("/logScionEvent", new b7(this.f5066a.getContext()));
        }
        this.e = zv2Var;
        this.f = pVar;
        this.i = b6Var;
        this.j = d6Var;
        this.q = vVar;
        this.s = aVar;
        this.l = z;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String strValueOf = String.valueOf(str);
        oo.m(strValueOf.length() != 0 ? "Loading resource: ".concat(strValueOf) : new String("Loading resource: "));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            a(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.d) {
            if (this.f5066a.g()) {
                oo.m("Blank page loaded, 1...");
                this.f5066a.R();
                return;
            }
            this.v = true;
            gy gyVar = this.h;
            if (gyVar != null) {
                gyVar.a();
                this.h = null;
            }
            G();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        ut2 ut2VarD0 = this.f5066a.d0();
        if (ut2VarD0 != null && webView == ut2VarD0.getWebView()) {
            ut2VarD0.b(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f5066a.V(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void p() {
        synchronized (this.d) {
            this.p = true;
        }
        this.x++;
        G();
    }

    public final void q() {
        im imVar = this.u;
        if (imVar != null) {
            imVar.f();
            this.u = null;
        }
        F();
        synchronized (this.d) {
            this.f5068c.clear();
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.l = false;
            this.m = false;
            this.n = false;
            this.p = false;
            this.q = null;
            this.k = null;
            if (this.t != null) {
                this.t.i(true);
                this.t = null;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    @androidx.annotation.i0
    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return M(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) throws h42, NumberFormatException {
        String strValueOf = String.valueOf(str);
        oo.m(strValueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(strValueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uriB = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriB.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriB.getHost())) {
            a(uriB);
        } else {
            if (this.l && webView == this.f5066a.getWebView()) {
                String scheme = uriB.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    zv2 zv2Var = this.e;
                    if (zv2Var != null) {
                        zv2Var.p();
                        im imVar = this.u;
                        if (imVar != null) {
                            imVar.d(str);
                        }
                        this.e = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.f5066a.getWebView().willNotDraw()) {
                String strValueOf2 = String.valueOf(str);
                tr.i(strValueOf2.length() != 0 ? "AdWebView unable to handle URL: ".concat(strValueOf2) : new String("AdWebView unable to handle URL: "));
            } else {
                try {
                    i52 i52VarK = this.f5066a.k();
                    if (i52VarK != null && i52VarK.f(uriB)) {
                        uriB = i52VarK.b(uriB, this.f5066a.getContext(), this.f5066a.getView(), this.f5066a.a());
                    }
                } catch (h42 unused) {
                    String strValueOf3 = String.valueOf(str);
                    tr.i(strValueOf3.length() != 0 ? "Unable to append parameter to URL: ".concat(strValueOf3) : new String("Unable to append parameter to URL: "));
                }
                com.google.android.gms.ads.internal.a aVar = this.s;
                if (aVar == null || aVar.d()) {
                    t(new com.google.android.gms.ads.internal.overlay.b("android.intent.action.VIEW", uriB.toString(), null, null, null, null, null));
                } else {
                    this.s.b(str);
                }
            }
        }
        return true;
    }

    public final void t(com.google.android.gms.ads.internal.overlay.b bVar) throws NumberFormatException {
        boolean zC = this.f5066a.c();
        s(new AdOverlayInfoParcel(bVar, (!zC || this.f5066a.h().e()) ? this.e : null, zC ? null : this.f, this.q, this.f5066a.b()));
    }

    public final void w(String str, com.google.android.gms.common.util.w<z6<? super rw>> wVar) {
        synchronized (this.d) {
            List<z6<? super rw>> list = this.f5068c.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (z6<? super rw> z6Var : list) {
                if (wVar.a(z6Var)) {
                    arrayList.add(z6Var);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final void x(String str, z6<? super rw> z6Var) {
        synchronized (this.d) {
            List<z6<? super rw>> copyOnWriteArrayList = this.f5068c.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                this.f5068c.put(str, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(z6Var);
        }
    }

    public final void z(boolean z, int r16, String str) throws NumberFormatException {
        boolean zC = this.f5066a.c();
        zv2 zv2Var = (!zC || this.f5066a.h().e()) ? this.e : null;
        ww wwVar = zC ? null : new ww(this.f5066a, this.f);
        b6 b6Var = this.i;
        d6 d6Var = this.j;
        com.google.android.gms.ads.internal.overlay.v vVar = this.q;
        rw rwVar = this.f5066a;
        s(new AdOverlayInfoParcel(zv2Var, wwVar, b6Var, d6Var, vVar, rwVar, z, r16, str, rwVar.b()));
    }
}
