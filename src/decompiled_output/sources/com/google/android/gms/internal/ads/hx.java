package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.ActivityChooserView;
import com.google.android.gms.internal.ads.cv2;
import com.google.android.gms.internal.ads.vu2;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@com.google.android.gms.common.util.d0
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
final class hx extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, rw {

    @GuardedBy("this")
    private Boolean A;

    @GuardedBy("this")
    private int B;

    @GuardedBy("this")
    private boolean C;

    @GuardedBy("this")
    private boolean D;

    @GuardedBy("this")
    private String E;

    @GuardedBy("this")
    private mx F;

    @GuardedBy("this")
    private boolean G;

    @GuardedBy("this")
    private boolean H;

    @GuardedBy("this")
    private x2 I;

    @GuardedBy("this")
    private s2 J;

    @GuardedBy("this")
    private ct2 K;

    @GuardedBy("this")
    private int L;

    @GuardedBy("this")
    private int M;
    private t0 N;
    private t0 O;
    private t0 P;
    private s0 Q;
    private WeakReference<View.OnClickListener> R;

    @GuardedBy("this")
    private com.google.android.gms.ads.internal.overlay.e S;

    @GuardedBy("this")
    private boolean T;
    private kr U;
    private int V;
    private int W;
    private int a0;
    private int b0;
    private Map<String, sv> c0;
    private final iy d;
    private final WindowManager d0;

    @androidx.annotation.i0
    private final i52 e;
    private final tu2 e0;

    @androidx.annotation.i0
    private final f1 f;
    private final as g;
    private final com.google.android.gms.ads.internal.k h;
    private final com.google.android.gms.ads.internal.b i;
    private final DisplayMetrics j;
    private final float k;

    @androidx.annotation.i0
    private final ut2 l;
    private final boolean m;

    @androidx.annotation.i0
    private km1 n;

    @androidx.annotation.i0
    private lm1 o;
    private boolean p;
    private boolean q;
    private qw r;

    @GuardedBy("this")
    private com.google.android.gms.ads.internal.overlay.e s;

    @GuardedBy("this")
    private c.a.b.b.e.c t;

    @GuardedBy("this")
    private hy u;

    @GuardedBy("this")
    private String v;

    @GuardedBy("this")
    private boolean w;

    @GuardedBy("this")
    private boolean x;

    @GuardedBy("this")
    private boolean y;

    @GuardedBy("this")
    private boolean z;

    @com.google.android.gms.common.util.d0
    private hx(iy iyVar, hy hyVar, String str, boolean z, boolean z2, @androidx.annotation.i0 i52 i52Var, @androidx.annotation.i0 f1 f1Var, as asVar, v0 v0Var, com.google.android.gms.ads.internal.k kVar, com.google.android.gms.ads.internal.b bVar, tu2 tu2Var, ut2 ut2Var, boolean z3, km1 km1Var, lm1 lm1Var) {
        super(iyVar);
        this.p = false;
        this.q = false;
        this.C = true;
        this.D = false;
        this.E = "";
        this.V = -1;
        this.W = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.d = iyVar;
        this.u = hyVar;
        this.v = str;
        this.y = z;
        this.B = -1;
        this.e = i52Var;
        this.f = f1Var;
        this.g = asVar;
        this.h = kVar;
        this.i = bVar;
        this.d0 = (WindowManager) getContext().getSystemService("window");
        com.google.android.gms.ads.internal.p.c();
        DisplayMetrics displayMetricsB = to.b(this.d0);
        this.j = displayMetricsB;
        this.k = displayMetricsB.density;
        this.e0 = tu2Var;
        this.l = ut2Var;
        this.m = z3;
        this.n = km1Var;
        this.o = lm1Var;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            tr.c("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        com.google.android.gms.ads.internal.p.c().k(iyVar, asVar.d, settings);
        com.google.android.gms.ads.internal.p.e().i(getContext(), settings);
        setDownloadListener(this);
        M0();
        if (com.google.android.gms.common.util.v.f()) {
            addJavascriptInterface(nx.a(this), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.U = new kr(this.d.b(), this, this, null);
        Q0();
        s0 s0Var = new s0(new v0(true, "make_wv", this.v));
        this.Q = s0Var;
        s0Var.c().b(v0Var);
        t0 t0VarB = m0.b(this.Q.c());
        this.O = t0VarB;
        this.Q.a("native:view_create", t0VarB);
        this.P = null;
        this.N = null;
        com.google.android.gms.ads.internal.p.e().m(iyVar);
        com.google.android.gms.ads.internal.p.g().o();
    }

    @com.google.android.gms.common.util.d0
    private final void G0(Boolean bool) {
        synchronized (this) {
            this.A = bool;
        }
        com.google.android.gms.ads.internal.p.g().d(bool);
    }

    @TargetApi(19)
    private final synchronized void H0(String str, ValueCallback<String> valueCallback) {
        if (g()) {
            tr.i("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    static final /* synthetic */ void I0(boolean z, int r3, cv2.n.a aVar) {
        cv2.f.a aVarL = cv2.f.L();
        if (aVarL.w() != z) {
            aVarL.x(z);
        }
        aVar.w((cv2.f) ((l92) aVarL.v(r3).P()));
    }

    private final boolean J0() throws JSONException {
        int r6;
        int r7;
        if (!this.r.e() && !this.r.B()) {
            return false;
        }
        qx2.a();
        DisplayMetrics displayMetrics = this.j;
        int r4 = jr.k(displayMetrics, displayMetrics.widthPixels);
        qx2.a();
        DisplayMetrics displayMetrics2 = this.j;
        int r5 = jr.k(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityB = this.d.b();
        if (activityB == null || activityB.getWindow() == null) {
            r6 = r4;
            r7 = r5;
        } else {
            com.google.android.gms.ads.internal.p.c();
            int[] r0 = to.S(activityB);
            qx2.a();
            int r3 = jr.k(this.j, r0[0]);
            qx2.a();
            r7 = jr.k(this.j, r0[1]);
            r6 = r3;
        }
        if (this.W == r4 && this.V == r5 && this.a0 == r6 && this.b0 == r7) {
            return false;
        }
        boolean z = (this.W == r4 && this.V == r5) ? false : true;
        this.W = r4;
        this.V = r5;
        this.a0 = r6;
        this.b0 = r7;
        new eg(this).c(r4, r5, r6, r7, this.j.density, this.d0.getDefaultDisplay().getRotation());
        return z;
    }

    private final synchronized void K0() {
        Boolean boolM = com.google.android.gms.ads.internal.p.g().m();
        this.A = boolM;
        if (boolM == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                G0(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                G0(Boolean.FALSE);
            }
        }
    }

    private final void L0() {
        m0.a(this.Q.c(), this.O, "aeh2");
    }

    private final synchronized void M0() {
        if (!this.y && !this.u.e()) {
            if (Build.VERSION.SDK_INT < 18) {
                tr.f("Disabling hardware acceleration on an AdView.");
                N0();
                return;
            } else {
                tr.f("Enabling hardware acceleration on an AdView.");
                O0();
                return;
            }
        }
        tr.f("Enabling hardware acceleration on an overlay.");
        O0();
    }

    private final synchronized void N0() {
        if (!this.z) {
            com.google.android.gms.ads.internal.p.e();
            setLayerType(1, null);
        }
        this.z = true;
    }

    private final synchronized void O0() {
        if (this.z) {
            com.google.android.gms.ads.internal.p.e();
            setLayerType(0, null);
        }
        this.z = false;
    }

    private final synchronized void P0() {
        if (this.c0 != null) {
            Iterator<sv> it = this.c0.values().iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
        this.c0 = null;
    }

    private final void Q0() {
        v0 v0VarC;
        s0 s0Var = this.Q;
        if (s0Var == null || (v0VarC = s0Var.c()) == null || com.google.android.gms.ads.internal.p.g().l() == null) {
            return;
        }
        com.google.android.gms.ads.internal.p.g().l().d(v0VarC);
    }

    static hx R0(Context context, hy hyVar, String str, boolean z, boolean z2, @androidx.annotation.i0 i52 i52Var, @androidx.annotation.i0 f1 f1Var, as asVar, v0 v0Var, com.google.android.gms.ads.internal.k kVar, com.google.android.gms.ads.internal.b bVar, tu2 tu2Var, ut2 ut2Var, boolean z3, km1 km1Var, lm1 lm1Var) {
        return new hx(new iy(context), hyVar, str, z, z2, i52Var, f1Var, asVar, v0Var, kVar, bVar, tu2Var, ut2Var, z3, km1Var, lm1Var);
    }

    private final void T0(boolean z) {
        HashMap map = new HashMap();
        map.put("isVisible", z ? "1" : "0");
        M("onAdVisibilityChanged", map);
    }

    private final synchronized void U0(String str) {
        if (g()) {
            tr.i("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    private final synchronized void V0(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e) {
            com.google.android.gms.ads.internal.p.g().e(e, "AdWebViewImpl.loadUrlUnsafe");
            tr.d("Could not call loadUrl. ", e);
        }
    }

    private final void W0(String str) {
        if (!com.google.android.gms.common.util.v.h()) {
            String strValueOf = String.valueOf(str);
            U0(strValueOf.length() != 0 ? "javascript:".concat(strValueOf) : new String("javascript:"));
            return;
        }
        if (X0() == null) {
            K0();
        }
        if (X0().booleanValue()) {
            H0(str, null);
        } else {
            String strValueOf2 = String.valueOf(str);
            U0(strValueOf2.length() != 0 ? "javascript:".concat(strValueOf2) : new String("javascript:"));
        }
    }

    @com.google.android.gms.common.util.d0
    private final synchronized Boolean X0() {
        return this.A;
    }

    private final synchronized void Y0() {
        if (!this.T) {
            this.T = true;
            com.google.android.gms.ads.internal.p.g().p();
        }
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized com.google.android.gms.ads.internal.overlay.e A() {
        return this.S;
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void A0(boolean z, long j) {
        HashMap map = new HashMap(2);
        map.put(FirebaseAnalytics.b.J, z ? "1" : "0");
        map.put("duration", Long.toString(j));
        M("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void B(boolean z) {
        this.C = z;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void B0() {
        if (this.N == null) {
            m0.a(this.Q.c(), this.O, "aes2");
            t0 t0VarB = m0.b(this.Q.c());
            this.N = t0VarB;
            this.Q.a("native:view_show", t0VarB);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.g.d);
        M("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void C() {
        oo.m("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final /* synthetic */ ey C0() {
        return this.r;
    }

    @Override // com.google.android.gms.internal.ads.yx
    public final void D(boolean z, int r3) throws NumberFormatException {
        this.r.L(z, r3);
    }

    @Override // com.google.android.gms.internal.ads.yx
    public final void D0(com.google.android.gms.ads.internal.overlay.b bVar) throws NumberFormatException {
        this.r.t(bVar);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void E(Context context) {
        this.d.setBaseContext(context);
        this.U.c(this.d.b());
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void E0() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void F(String str, com.google.android.gms.common.util.w<z6<? super rw>> wVar) {
        qw qwVar = this.r;
        if (qwVar != null) {
            qwVar.w(str, wVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void G(boolean z) {
        this.r.I(z);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final WebViewClient H() {
        return this.r;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void I(ct2 ct2Var) {
        this.K = ct2Var;
    }

    @Override // com.google.android.gms.internal.ads.sr2
    public final void K(pr2 pr2Var) {
        synchronized (this) {
            this.G = pr2Var.m;
        }
        T0(pr2Var.m);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final boolean L() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.c9
    public final void M(String str, Map<String, ?> map) {
        try {
            e(str, com.google.android.gms.ads.internal.p.c().e0(map));
        } catch (JSONException unused) {
            tr.i("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void N(c.a.b.b.e.c cVar) {
        this.t = cVar;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void O() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.p.h().e()));
        map.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.p.h().d()));
        map.put("device_volume", String.valueOf(mp.c(getContext())));
        M("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final int P() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.ads.internal.k
    public final synchronized void Q() {
        this.D = true;
        if (this.h != null) {
            this.h.Q();
        }
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void R() {
        oo.m("Destroying WebView!");
        Y0();
        to.h.post(new jx(this));
    }

    @Override // com.google.android.gms.internal.ads.yx
    public final void T(boolean z, int r3, String str) throws NumberFormatException {
        this.r.z(z, r3, str);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final boolean V(final boolean z, final int r4) {
        destroy();
        this.e0.a(new su2(z, r4) { // from class: com.google.android.gms.internal.ads.gx

            /* renamed from: a, reason: collision with root package name */
            private final boolean f3588a;

            /* renamed from: b, reason: collision with root package name */
            private final int f3589b;

            {
                this.f3588a = z;
                this.f3589b = r4;
            }

            @Override // com.google.android.gms.internal.ads.su2
            public final void a(cv2.n.a aVar) {
                hx.I0(this.f3588a, this.f3589b, aVar);
            }
        });
        this.e0.b(vu2.a.b.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void W() {
        if (this.P == null) {
            t0 t0VarB = m0.b(this.Q.c());
            this.P = t0VarB;
            this.Q.a("native:view_load", t0VarB);
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final synchronized void X() {
        if (this.J != null) {
            this.J.k8();
        }
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized boolean Y() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void Z(boolean z) {
        int r0 = this.L + (z ? 1 : -1);
        this.L = r0;
        if (r0 <= 0 && this.s != null) {
            this.s.O8();
        }
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zt, com.google.android.gms.internal.ads.rx
    public final Activity a() {
        return this.d.b();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized ct2 a0() {
        return this.K;
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zt, com.google.android.gms.internal.ads.cy
    public final as b() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void b0(String str, String str2, @androidx.annotation.i0 String str3) {
        if (g()) {
            tr.i("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, xx.b(str2, xx.a()), "text/html", "UTF-8", str3);
        }
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.ux
    public final synchronized boolean c() {
        return this.y;
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zt
    public final com.google.android.gms.ads.internal.b d() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final ut2 d0() {
        return this.l;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.rw
    public final synchronized void destroy() {
        Q0();
        this.U.f();
        if (this.s != null) {
            this.s.z8();
            this.s.onDestroy();
            this.s = null;
        }
        this.t = null;
        this.r.q();
        if (this.x) {
            return;
        }
        com.google.android.gms.ads.internal.p.y();
        pv.i(this);
        P0();
        this.x = true;
        oo.m("Initiating WebView self destruct sequence in 3...");
        oo.m("Loading blank page in WebView, 2...");
        V0("about:blank");
    }

    @Override // com.google.android.gms.internal.ads.c9
    public final void e(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(string);
        sb.append(");");
        String strValueOf = String.valueOf(sb.toString());
        tr.f(strValueOf.length() != 0 ? "Dispatching AFMA event: ".concat(strValueOf) : new String("Dispatching AFMA event: "));
        W0(sb.toString());
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!g()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        tr.k("#004 The webview is destroyed. Ignoring action.");
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zt
    public final synchronized void f(String str, sv svVar) {
        if (this.c0 == null) {
            this.c0 = new HashMap();
        }
        this.c0.put(str, svVar);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final Context f0() {
        return this.d.a();
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.x) {
                    this.r.q();
                    com.google.android.gms.ads.internal.p.y();
                    pv.i(this);
                    P0();
                    Y0();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized boolean g() {
        return this.x;
    }

    @Override // com.google.android.gms.ads.internal.k
    public final synchronized void g0() {
        this.D = false;
        if (this.h != null) {
            this.h.g0();
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final synchronized String getRequestId() {
        return this.E;
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.by
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final WebView getWebView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.ay
    public final synchronized hy h() {
        return this.u;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized String h0() {
        return this.v;
    }

    @Override // com.google.android.gms.internal.ads.ea
    public final void i(String str) {
        W0(str);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized boolean i0() {
        return this.C;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void j(String str, z6<? super rw> z6Var) {
        qw qwVar = this.r;
        if (qwVar != null) {
            qwVar.K(str, z6Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final t0 j0() {
        return this.O;
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zx
    public final i52 k() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void k0() {
        com.google.android.gms.ads.internal.overlay.e eVarW0 = w0();
        if (eVarW0 != null) {
            eVarW0.N8();
        }
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zt
    public final synchronized void l(mx mxVar) {
        if (this.F != null) {
            tr.g("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.F = mxVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized x2 l0() {
        return this.I;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.rw
    public final synchronized void loadData(String str, String str2, String str3) {
        if (g()) {
            tr.i("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.rw
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (g()) {
            tr.i("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.rw
    public final synchronized void loadUrl(String str) {
        if (g()) {
            tr.i("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.p.g().e(e, "AdWebViewImpl.loadUrl");
            tr.d("Could not call loadUrl. ", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zt
    public final s0 m() {
        return this.Q;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final boolean m0() {
        return ((Boolean) qx2.e().c(e0.x4)).booleanValue() && this.l != null && this.m;
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zt
    public final synchronized mx n() {
        return this.F;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void n0(x2 x2Var) {
        this.I = x2Var;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void o(String str, z6<? super rw> z6Var) {
        qw qwVar = this.r;
        if (qwVar != null) {
            qwVar.x(str, z6Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void o0(boolean z) {
        this.r.J(z);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!g()) {
            this.U.a();
        }
        boolean z = this.G;
        if (this.r != null && this.r.B()) {
            if (!this.H) {
                this.r.D();
                this.r.E();
                this.H = true;
            }
            J0();
            z = true;
        }
        T0(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        synchronized (this) {
            if (!g()) {
                this.U.b();
            }
            super.onDetachedFromWindow();
            if (this.H && this.r != null && this.r.B() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.r.D();
                this.r.E();
                this.H = false;
            }
        }
        T0(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            com.google.android.gms.ads.internal.p.c();
            to.i(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            tr.f(sb.toString());
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    protected final void onDraw(Canvas canvas) {
        if (g()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws JSONException {
        boolean zJ0 = J0();
        com.google.android.gms.ads.internal.overlay.e eVarW0 = w0();
        if (eVarW0 == null || !zJ0) {
            return;
        }
        eVarW0.L8();
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @SuppressLint({"DrawAllocation"})
    protected final synchronized void onMeasure(int r8, int r9) {
        if (g()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.y && !this.u.f()) {
            if (this.u.h()) {
                super.onMeasure(r8, r9);
                return;
            }
            if (this.u.g()) {
                if (((Boolean) qx2.e().c(e0.o2)).booleanValue()) {
                    super.onMeasure(r8, r9);
                    return;
                }
                mx mxVarN = n();
                float fD0 = mxVarN != null ? mxVarN.d0() : 0.0f;
                if (fD0 == 0.0f) {
                    super.onMeasure(r8, r9);
                    return;
                }
                int size = View.MeasureSpec.getSize(r8);
                int size2 = View.MeasureSpec.getSize(r9);
                int r1 = (int) (size2 * fD0);
                int r2 = (int) (size / fD0);
                if (size2 == 0 && r2 != 0) {
                    r1 = (int) (r2 * fD0);
                    size2 = r2;
                } else if (size == 0 && r1 != 0) {
                    r2 = (int) (r1 / fD0);
                    size = r1;
                }
                setMeasuredDimension(Math.min(r1, size), Math.min(r2, size2));
                return;
            }
            if (this.u.a()) {
                if (!((Boolean) qx2.e().c(e0.r2)).booleanValue() && com.google.android.gms.common.util.v.f()) {
                    o("/contentHeight", new kx(this));
                    W0("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                    setMeasuredDimension(View.MeasureSpec.getSize(r8), this.M != -1 ? (int) (this.M * this.j.density) : View.MeasureSpec.getSize(r9));
                    return;
                }
                super.onMeasure(r8, r9);
                return;
            }
            if (this.u.e()) {
                setMeasuredDimension(this.j.widthPixels, this.j.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(r8);
            int size3 = View.MeasureSpec.getSize(r8);
            int mode2 = View.MeasureSpec.getMode(r9);
            int size4 = View.MeasureSpec.getSize(r9);
            int r5 = ActivityChooserView.f.j;
            int r0 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size3 : ActivityChooserView.f.j;
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                r5 = size4;
            }
            boolean z = this.u.f3733c > r0 || this.u.f3732b > r5;
            if (((Boolean) qx2.e().c(e0.C3)).booleanValue()) {
                boolean z2 = ((float) this.u.f3733c) / this.k <= ((float) r0) / this.k && ((float) this.u.f3732b) / this.k <= ((float) r5) / this.k;
                if (z) {
                    z = z2;
                }
            }
            if (z) {
                int r22 = (int) (this.u.f3733c / this.k);
                int r4 = (int) (this.u.f3732b / this.k);
                int r82 = (int) (size3 / this.k);
                int r92 = (int) (size4 / this.k);
                StringBuilder sb = new StringBuilder(103);
                sb.append("Not enough space to show ad. Needs ");
                sb.append(r22);
                sb.append("x");
                sb.append(r4);
                sb.append(" dp, but only has ");
                sb.append(r82);
                sb.append("x");
                sb.append(r92);
                sb.append(" dp.");
                tr.i(sb.toString());
                if (getVisibility() != 8) {
                    setVisibility(4);
                }
                setMeasuredDimension(0, 0);
                if (!this.p) {
                    this.e0.b(vu2.a.b.BANNER_SIZE_INVALID);
                    this.p = true;
                    return;
                }
            } else {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.q) {
                    this.e0.b(vu2.a.b.BANNER_SIZE_VALID);
                    this.q = true;
                }
                setMeasuredDimension(this.u.f3733c, this.u.f3732b);
            }
            return;
        }
        super.onMeasure(r8, r9);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.rw
    public final void onPause() {
        if (g()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            tr.c("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.rw
    public final void onResume() {
        if (g()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            tr.c("Could not resume webview.", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.r.B() || this.r.C()) {
            i52 i52Var = this.e;
            if (i52Var != null) {
                i52Var.d(motionEvent);
            }
            f1 f1Var = this.f;
            if (f1Var != null) {
                f1Var.a(motionEvent);
            }
        } else {
            synchronized (this) {
                if (this.I != null) {
                    this.I.M0(motionEvent);
                }
            }
        }
        if (g()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final int p() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void p0(hy hyVar) {
        this.u = hyVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.ea
    public final void q(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(string).length());
        sb.append(str);
        sb.append("(");
        sb.append(string);
        sb.append(");");
        W0(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void q0(int r4) {
        if (r4 == 0) {
            m0.a(this.Q.c(), this.O, "aebb2");
        }
        L0();
        if (this.Q.c() != null) {
            this.Q.c().d("close_type", String.valueOf(r4));
        }
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(r4));
        map.put("version", this.g.d);
        M("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void r(s2 s2Var) {
        this.J = s2Var;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void s0(ViewGroup viewGroup, Activity activity, String str, String str2) {
        if (!m0()) {
            oo.m("AR ad is not enabled or the ad from the server is not an AR ad.");
            return;
        }
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
        oo.m("Initializing ArWebView object.");
        this.l.a(activity, this);
        this.l.c(str, str2);
        if (viewGroup != null) {
            viewGroup.addView(this.l.getView());
        } else {
            tr.g("The FrameLayout object cannot be null.");
        }
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.rw
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.R = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void setRequestedOrientation(int r2) {
        this.B = r2;
        if (this.s != null) {
            this.s.A8(r2);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.rw
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof qw) {
            this.r = (qw) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (g()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            tr.c("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final st t() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final synchronized sv t0(String str) {
        if (this.c0 == null) {
            return null;
        }
        return this.c0.get(str);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized c.a.b.b.e.c u0() {
        return this.t;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void v() {
        L0();
        HashMap map = new HashMap(1);
        map.put("version", this.g.d);
        M("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.yx
    public final void v0(boolean z, int r3, String str, String str2) throws NumberFormatException {
        this.r.A(z, r3, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void w(boolean z) {
        if (this.s != null) {
            this.s.D8(this.r.e(), z);
        } else {
            this.w = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized com.google.android.gms.ads.internal.overlay.e w0() {
        return this.s;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void x(com.google.android.gms.ads.internal.overlay.e eVar) {
        this.s = eVar;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void x0(com.google.android.gms.ads.internal.overlay.e eVar) {
        this.S = eVar;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void y() {
        this.U.e();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void y0(boolean z) {
        boolean z2 = z != this.y;
        this.y = z;
        M0();
        if (z2) {
            if (!((Boolean) qx2.e().c(e0.J)).booleanValue() || !this.u.e()) {
                new eg(this).g(z ? "expanded" : "default");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void z(km1 km1Var, lm1 lm1Var) {
        this.n = km1Var;
        this.o = lm1Var;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized boolean z0() {
        return this.L > 0;
    }
}
