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
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@com.google.android.gms.common.util.d0
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
final class qy extends wy implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, k9, rw {

    @GuardedBy("this")
    private boolean A;

    @GuardedBy("this")
    private boolean B;

    @GuardedBy("this")
    private String C;

    @GuardedBy("this")
    private mx D;

    @GuardedBy("this")
    private boolean E;

    @GuardedBy("this")
    private boolean F;

    @GuardedBy("this")
    private x2 G;

    @GuardedBy("this")
    private s2 H;

    @GuardedBy("this")
    private ct2 I;

    @GuardedBy("this")
    private int J;

    @GuardedBy("this")
    private int K;
    private t0 L;
    private t0 M;
    private t0 N;
    private s0 O;
    private WeakReference<View.OnClickListener> P;

    @GuardedBy("this")
    private com.google.android.gms.ads.internal.overlay.e Q;
    private kr R;
    private final AtomicReference<c.a.b.b.e.c> S;
    private int T;
    private int U;
    private int V;
    private int W;
    private Map<String, sv> a0;
    private final WindowManager b0;
    private final iy g;
    private final ly h;

    @androidx.annotation.i0
    private final i52 i;
    private final f1 j;
    private final as k;
    private final com.google.android.gms.ads.internal.k l;
    private final com.google.android.gms.ads.internal.b m;
    private final DisplayMetrics n;
    private final tu2 o;

    @androidx.annotation.i0
    private final ut2 p;
    private final boolean q;

    @androidx.annotation.i0
    private km1 r;

    @androidx.annotation.i0
    private lm1 s;

    @GuardedBy("this")
    private com.google.android.gms.ads.internal.overlay.e t;

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
    private int z;

    @com.google.android.gms.common.util.d0
    protected qy(iy iyVar, ly lyVar, hy hyVar, String str, boolean z, boolean z2, @androidx.annotation.i0 i52 i52Var, f1 f1Var, as asVar, v0 v0Var, com.google.android.gms.ads.internal.k kVar, com.google.android.gms.ads.internal.b bVar, tu2 tu2Var, ut2 ut2Var, boolean z3, km1 km1Var, lm1 lm1Var) {
        super(iyVar, lyVar);
        this.A = true;
        this.B = false;
        this.C = "";
        this.S = new AtomicReference<>();
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.g = iyVar;
        this.h = lyVar;
        this.u = hyVar;
        this.v = str;
        this.x = z;
        this.z = -1;
        this.i = i52Var;
        this.j = f1Var;
        this.k = asVar;
        this.l = kVar;
        this.m = bVar;
        this.b0 = (WindowManager) getContext().getSystemService("window");
        com.google.android.gms.ads.internal.p.c();
        this.n = to.b(this.b0);
        this.o = tu2Var;
        this.p = ut2Var;
        this.q = z3;
        this.r = km1Var;
        this.s = lm1Var;
        this.R = new kr(this.g.b(), this, this, null);
        com.google.android.gms.ads.internal.p.c().k(iyVar, asVar.d, getSettings());
        setDownloadListener(this);
        N0();
        if (com.google.android.gms.common.util.v.f()) {
            addJavascriptInterface(nx.a(this), "googleAdsJsInterface");
        }
        R0();
        s0 s0Var = new s0(new v0(true, "make_wv", this.v));
        this.O = s0Var;
        s0Var.c().b(v0Var);
        t0 t0VarB = m0.b(this.O.c());
        this.M = t0VarB;
        this.O.a("native:view_create", t0VarB);
        this.N = null;
        this.L = null;
        com.google.android.gms.ads.internal.p.e().m(iyVar);
    }

    static final /* synthetic */ void K0(boolean z, int r3, cv2.n.a aVar) {
        cv2.f.a aVarL = cv2.f.L();
        if (aVarL.w() != z) {
            aVarL.x(z);
        }
        aVar.w((cv2.f) ((l92) aVarL.v(r3).P()));
    }

    private final boolean L0() throws JSONException {
        int r6;
        int r7;
        if (!this.h.e() && !this.h.F()) {
            return false;
        }
        qx2.a();
        DisplayMetrics displayMetrics = this.n;
        int r4 = jr.k(displayMetrics, displayMetrics.widthPixels);
        qx2.a();
        DisplayMetrics displayMetrics2 = this.n;
        int r5 = jr.k(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityB = this.g.b();
        if (activityB == null || activityB.getWindow() == null) {
            r6 = r4;
            r7 = r5;
        } else {
            com.google.android.gms.ads.internal.p.c();
            int[] r0 = to.S(activityB);
            qx2.a();
            int r3 = jr.k(this.n, r0[0]);
            qx2.a();
            r7 = jr.k(this.n, r0[1]);
            r6 = r3;
        }
        if (this.U == r4 && this.T == r5 && this.V == r6 && this.W == r7) {
            return false;
        }
        boolean z = (this.U == r4 && this.T == r5) ? false : true;
        this.U = r4;
        this.T = r5;
        this.V = r6;
        this.W = r7;
        new eg(this).c(r4, r5, r6, r7, this.n.density, this.b0.getDefaultDisplay().getRotation());
        return z;
    }

    private final void M0() {
        m0.a(this.O.c(), this.M, "aeh2");
    }

    private final synchronized void N0() {
        if (!this.x && !this.u.e()) {
            if (Build.VERSION.SDK_INT < 18) {
                tr.f("Disabling hardware acceleration on an AdView.");
                O0();
                return;
            } else {
                tr.f("Enabling hardware acceleration on an AdView.");
                P0();
                return;
            }
        }
        tr.f("Enabling hardware acceleration on an overlay.");
        P0();
    }

    private final synchronized void O0() {
        if (!this.y) {
            com.google.android.gms.ads.internal.p.e();
            setLayerType(1, null);
        }
        this.y = true;
    }

    private final synchronized void P0() {
        if (this.y) {
            com.google.android.gms.ads.internal.p.e();
            setLayerType(0, null);
        }
        this.y = false;
    }

    private final synchronized void Q0() {
        if (this.a0 != null) {
            Iterator<sv> it = this.a0.values().iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
        this.a0 = null;
    }

    private final void R0() {
        v0 v0VarC;
        s0 s0Var = this.O;
        if (s0Var == null || (v0VarC = s0Var.c()) == null || com.google.android.gms.ads.internal.p.g().l() == null) {
            return;
        }
        com.google.android.gms.ads.internal.p.g().l().d(v0VarC);
    }

    private final void S0(boolean z) {
        HashMap map = new HashMap();
        map.put("isVisible", z ? "1" : "0");
        o9.b(this, "onAdVisibilityChanged", map);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized com.google.android.gms.ads.internal.overlay.e A() {
        return this.Q;
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void A0(boolean z, long j) {
        HashMap map = new HashMap(2);
        map.put(FirebaseAnalytics.b.J, z ? "1" : "0");
        map.put("duration", Long.toString(j));
        o9.b(this, "onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void B(boolean z) {
        this.A = z;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void B0() {
        if (this.L == null) {
            m0.a(this.O.c(), this.M, "aes2");
            t0 t0VarB = m0.b(this.O.c());
            this.L = t0VarB;
            this.O.a("native:view_show", t0VarB);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.k.d);
        o9.b(this, "onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void C() {
        oo.m("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final /* synthetic */ ey C0() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.yx
    public final void D(boolean z, int r3) throws NumberFormatException {
        this.h.P(z, r3);
    }

    @Override // com.google.android.gms.internal.ads.yx
    public final void D0(com.google.android.gms.ads.internal.overlay.b bVar) throws NumberFormatException {
        this.h.y(bVar);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void E(Context context) {
        this.g.setBaseContext(context);
        this.R.c(this.g.b());
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void E0() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void F(String str, com.google.android.gms.common.util.w<z6<? super rw>> wVar) {
        ly lyVar = this.h;
        if (lyVar != null) {
            lyVar.B(str, wVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void G(boolean z) {
        this.h.M(z);
    }

    @Override // com.google.android.gms.internal.ads.wy
    protected final synchronized void G0(boolean z) {
        if (z) {
            this.S.set(null);
            this.h.v();
            com.google.android.gms.ads.internal.p.y();
            pv.i(this);
            Q0();
        } else {
            R0();
            this.R.f();
            if (this.t != null) {
                this.t.z8();
                this.t.onDestroy();
                this.t = null;
            }
            this.S.set(null);
            this.h.v();
            com.google.android.gms.ads.internal.p.y();
            pv.i(this);
            Q0();
        }
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final WebViewClient H() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void I(ct2 ct2Var) {
        this.I = ct2Var;
    }

    @Override // com.google.android.gms.internal.ads.sr2
    public final void K(pr2 pr2Var) {
        synchronized (this) {
            this.E = pr2Var.m;
        }
        S0(pr2Var.m);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final boolean L() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.c9
    public final void M(String str, Map map) {
        o9.b(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void N(c.a.b.b.e.c cVar) {
        this.S.set(cVar);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void O() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.p.h().e()));
        map.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.p.h().d()));
        map.put("device_volume", String.valueOf(mp.c(getContext())));
        o9.b(this, "volume", map);
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final int P() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.ads.internal.k
    public final synchronized void Q() {
        this.B = true;
        if (this.l != null) {
            this.l.Q();
        }
    }

    @Override // com.google.android.gms.internal.ads.wy, com.google.android.gms.internal.ads.rw
    public final void R() {
    }

    @Override // com.google.android.gms.internal.ads.yx
    public final void T(boolean z, int r3, String str) throws NumberFormatException {
        this.h.D(z, r3, str);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final boolean V(final boolean z, final int r4) {
        destroy();
        this.o.a(new su2(z, r4) { // from class: com.google.android.gms.internal.ads.ty

            /* renamed from: a, reason: collision with root package name */
            private final boolean f5459a;

            /* renamed from: b, reason: collision with root package name */
            private final int f5460b;

            {
                this.f5459a = z;
                this.f5460b = r4;
            }

            @Override // com.google.android.gms.internal.ads.su2
            public final void a(cv2.n.a aVar) {
                qy.K0(this.f5459a, this.f5460b, aVar);
            }
        });
        this.o.b(vu2.a.b.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void W() {
        if (this.N == null) {
            t0 t0VarB = m0.b(this.O.c());
            this.N = t0VarB;
            this.O.a("native:view_load", t0VarB);
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final synchronized void X() {
        if (this.H != null) {
            this.H.k8();
        }
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized boolean Y() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void Z(boolean z) {
        int r0 = this.J + (z ? 1 : -1);
        this.J = r0;
        if (r0 <= 0 && this.t != null) {
            this.t.O8();
        }
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zt, com.google.android.gms.internal.ads.rx
    public final Activity a() {
        return this.g.b();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized ct2 a0() {
        return this.I;
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zt, com.google.android.gms.internal.ads.cy
    public final as b() {
        return this.k;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void b0(String str, String str2, @androidx.annotation.i0 String str3) {
        super.loadDataWithBaseURL(str, xx.b(str2, xx.a()), "text/html", "UTF-8", str3);
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.ux
    public final synchronized boolean c() {
        return this.x;
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zt
    public final com.google.android.gms.ads.internal.b d() {
        return this.m;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final ut2 d0() {
        return this.p;
    }

    @Override // com.google.android.gms.internal.ads.k9, com.google.android.gms.internal.ads.c9
    public final void e(String str, JSONObject jSONObject) {
        o9.d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zt
    public final synchronized void f(String str, sv svVar) {
        if (this.a0 == null) {
            this.a0 = new HashMap();
        }
        this.a0.put(str, svVar);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final Context f0() {
        return this.g.a();
    }

    @Override // com.google.android.gms.ads.internal.k
    public final synchronized void g0() {
        this.B = false;
        if (this.l != null) {
            this.l.g0();
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final synchronized String getRequestId() {
        return this.C;
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

    @Override // com.google.android.gms.internal.ads.wy, com.google.android.gms.internal.ads.vy, com.google.android.gms.internal.ads.k9, com.google.android.gms.internal.ads.ea
    public final synchronized void i(String str) {
        if (g()) {
            tr.i("The webview is destroyed. Ignoring action.");
        } else {
            super.i(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized boolean i0() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void j(String str, z6<? super rw> z6Var) {
        ly lyVar = this.h;
        if (lyVar != null) {
            lyVar.O(str, z6Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final t0 j0() {
        return this.M;
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zx
    public final i52 k() {
        return this.i;
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
        if (this.D != null) {
            tr.g("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.D = mxVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized x2 l0() {
        return this.G;
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zt
    public final s0 m() {
        return this.O;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final boolean m0() {
        return ((Boolean) qx2.e().c(e0.x4)).booleanValue() && this.p != null && this.q;
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zt
    public final synchronized mx n() {
        return this.D;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void n0(x2 x2Var) {
        this.G = x2Var;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void o(String str, z6<? super rw> z6Var) {
        ly lyVar = this.h;
        if (lyVar != null) {
            lyVar.C(str, z6Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void o0(boolean z) {
        this.h.N(z);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!g()) {
            this.R.a();
        }
        boolean z = this.E;
        if (this.h != null && this.h.F()) {
            if (!this.F) {
                this.h.H();
                this.h.I();
                this.F = true;
            }
            L0();
            z = true;
        }
        S0(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        synchronized (this) {
            if (!g()) {
                this.R.b();
            }
            super.onDetachedFromWindow();
            if (this.F && this.h != null && this.h.F() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.h.H();
                this.h.I();
                this.F = false;
            }
        }
        S0(false);
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

    @Override // com.google.android.gms.internal.ads.wy, android.webkit.WebView, android.view.View
    @TargetApi(21)
    protected final void onDraw(Canvas canvas) {
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
        boolean zL0 = L0();
        com.google.android.gms.ads.internal.overlay.e eVarW0 = w0();
        if (eVarW0 == null || !zL0) {
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
        if (!isInEditMode() && !this.x && !this.u.f()) {
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
                    o("/contentHeight", new sy(this));
                    i("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                    setMeasuredDimension(View.MeasureSpec.getSize(r8), this.K != -1 ? (int) (this.K * this.n.density) : View.MeasureSpec.getSize(r9));
                    return;
                }
                super.onMeasure(r8, r9);
                return;
            }
            if (this.u.e()) {
                setMeasuredDimension(this.n.widthPixels, this.n.heightPixels);
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
            boolean z = true;
            boolean z2 = this.u.f3733c > r0 || this.u.f3732b > r5;
            if (((Boolean) qx2.e().c(e0.C3)).booleanValue()) {
                if (this.u.f3733c / this.n.density > r0 / this.n.density || this.u.f3732b / this.n.density > r5 / this.n.density) {
                    z = false;
                }
                if (z2) {
                    z2 = z;
                }
            }
            if (!z2) {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                setMeasuredDimension(this.u.f3733c, this.u.f3732b);
                return;
            }
            int r22 = (int) (this.u.f3733c / this.n.density);
            int r3 = (int) (this.u.f3732b / this.n.density);
            int r82 = (int) (size3 / this.n.density);
            int r92 = (int) (size4 / this.n.density);
            StringBuilder sb = new StringBuilder(103);
            sb.append("Not enough space to show ad. Needs ");
            sb.append(r22);
            sb.append("x");
            sb.append(r3);
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
            return;
        }
        super.onMeasure(r8, r9);
    }

    @Override // com.google.android.gms.internal.ads.wy, android.webkit.WebView, com.google.android.gms.internal.ads.rw
    public final void onPause() {
        try {
            super.onPause();
        } catch (Exception e) {
            tr.c("Could not pause webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.wy, android.webkit.WebView, com.google.android.gms.internal.ads.rw
    public final void onResume() {
        try {
            super.onResume();
        } catch (Exception e) {
            tr.c("Could not resume webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.wy, android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.h.F() || this.h.G()) {
            i52 i52Var = this.i;
            if (i52Var != null) {
                i52Var.d(motionEvent);
            }
            f1 f1Var = this.j;
            if (f1Var != null) {
                f1Var.a(motionEvent);
            }
        } else {
            synchronized (this) {
                if (this.G != null) {
                    this.G.M0(motionEvent);
                }
            }
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
        o9.c(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void q0(int r4) {
        if (r4 == 0) {
            m0.a(this.O.c(), this.M, "aebb2");
        }
        M0();
        if (this.O.c() != null) {
            this.O.c().d("close_type", String.valueOf(r4));
        }
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(r4));
        map.put("version", this.k.d);
        o9.b(this, "onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void r(s2 s2Var) {
        this.H = s2Var;
    }

    @Override // com.google.android.gms.internal.ads.k9
    public final void s(String str, String str2) {
        o9.a(this, str, str2);
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
        this.p.a(activity, this);
        this.p.c(str, str2);
        if (viewGroup != null) {
            viewGroup.addView(this.p.getView());
        } else {
            tr.g("The FrameLayout object cannot be null.");
        }
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.rw
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.P = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void setRequestedOrientation(int r2) {
        this.z = r2;
        if (this.t != null) {
            this.t.A8(r2);
        }
    }

    @Override // com.google.android.gms.internal.ads.wy, android.webkit.WebView
    public final void stopLoading() {
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
        if (this.a0 == null) {
            return null;
        }
        return this.a0.get(str);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final c.a.b.b.e.c u0() {
        return this.S.get();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void v() {
        M0();
        HashMap map = new HashMap(1);
        map.put("version", this.k.d);
        o9.b(this, "onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.yx
    public final void v0(boolean z, int r3, String str, String str2) throws NumberFormatException {
        this.h.E(z, r3, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void w(boolean z) {
        if (this.t != null) {
            this.t.D8(this.h.e(), z);
        } else {
            this.w = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized com.google.android.gms.ads.internal.overlay.e w0() {
        return this.t;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void x(com.google.android.gms.ads.internal.overlay.e eVar) {
        this.t = eVar;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void x0(com.google.android.gms.ads.internal.overlay.e eVar) {
        this.Q = eVar;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void y() {
        this.R.e();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized void y0(boolean z) {
        boolean z2 = z != this.x;
        this.x = z;
        N0();
        if (z2) {
            if (!((Boolean) qx2.e().c(e0.J)).booleanValue() || !this.u.e()) {
                new eg(this).g(z ? "expanded" : "default");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void z(km1 km1Var, lm1 lm1Var) {
        this.r = km1Var;
        this.s = lm1Var;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final synchronized boolean z0() {
        return this.J > 0;
    }
}
