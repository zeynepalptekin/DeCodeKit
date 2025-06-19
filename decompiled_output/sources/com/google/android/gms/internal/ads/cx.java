package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.f0.a;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cx extends FrameLayout implements rw {
    private final rw d;
    private final st e;
    private final AtomicBoolean f;

    public cx(rw rwVar) {
        super(rwVar.getContext());
        this.f = new AtomicBoolean();
        this.d = rwVar;
        this.e = new st(rwVar.f0(), this, this);
        if (m0()) {
            return;
        }
        addView(this.d.getView());
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final com.google.android.gms.ads.internal.overlay.e A() {
        return this.d.A();
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void A0(boolean z, long j) {
        this.d.A0(z, j);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void B(boolean z) {
        this.d.B(z);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void B0() {
        this.d.B0();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void C() {
        TextView textView = new TextView(getContext());
        Resources resourcesB = com.google.android.gms.ads.internal.p.g().b();
        textView.setText(resourcesB != null ? resourcesB.getString(a.C0161a.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final ey C0() {
        return this.d.C0();
    }

    @Override // com.google.android.gms.internal.ads.yx
    public final void D(boolean z, int r3) {
        this.d.D(z, r3);
    }

    @Override // com.google.android.gms.internal.ads.yx
    public final void D0(com.google.android.gms.ads.internal.overlay.b bVar) {
        this.d.D0(bVar);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void E(Context context) {
        this.d.E(context);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void E0() {
        setBackgroundColor(0);
        this.d.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void F(String str, com.google.android.gms.common.util.w<z6<? super rw>> wVar) {
        this.d.F(str, wVar);
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void G(boolean z) {
        this.d.G(z);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final WebViewClient H() {
        return this.d.H();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void I(ct2 ct2Var) {
        this.d.I(ct2Var);
    }

    @Override // com.google.android.gms.internal.ads.sr2
    public final void K(pr2 pr2Var) {
        this.d.K(pr2Var);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final boolean L() {
        return this.f.get();
    }

    @Override // com.google.android.gms.internal.ads.c9
    public final void M(String str, Map<String, ?> map) {
        this.d.M(str, map);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void N(c.a.b.b.e.c cVar) {
        this.d.N(cVar);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void O() {
        this.d.O();
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final int P() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.ads.internal.k
    public final void Q() {
        this.d.Q();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void R() {
        this.e.a();
        this.d.R();
    }

    @Override // com.google.android.gms.internal.ads.yx
    public final void T(boolean z, int r3, String str) {
        this.d.T(z, r3, str);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final boolean V(boolean z, int r5) {
        if (!this.f.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) qx2.e().c(e0.m0)).booleanValue()) {
            return false;
        }
        if (this.d.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.d.getParent()).removeView(this.d.getView());
        }
        return this.d.V(z, r5);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void W() {
        this.d.W();
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void X() {
        this.d.X();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final boolean Y() {
        return this.d.Y();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void Z(boolean z) {
        this.d.Z(z);
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zt, com.google.android.gms.internal.ads.rx
    public final Activity a() {
        return this.d.a();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final ct2 a0() {
        return this.d.a0();
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zt, com.google.android.gms.internal.ads.cy
    public final as b() {
        return this.d.b();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void b0(String str, String str2, @androidx.annotation.i0 String str3) {
        this.d.b0(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.ux
    public final boolean c() {
        return this.d.c();
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zt
    public final com.google.android.gms.ads.internal.b d() {
        return this.d.d();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final ut2 d0() {
        return this.d.d0();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void destroy() {
        final c.a.b.b.e.c cVarU0 = u0();
        if (cVarU0 == null) {
            this.d.destroy();
            return;
        }
        to.h.post(new Runnable(cVarU0) { // from class: com.google.android.gms.internal.ads.fx
            private final c.a.b.b.e.c d;

            {
                this.d = cVarU0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.ads.internal.p.r().f(this.d);
            }
        });
        to.h.postDelayed(new ex(this), ((Integer) qx2.e().c(e0.l3)).intValue());
    }

    @Override // com.google.android.gms.internal.ads.c9
    public final void e(String str, JSONObject jSONObject) {
        this.d.e(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zt
    public final void f(String str, sv svVar) {
        this.d.f(str, svVar);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final Context f0() {
        return this.d.f0();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final boolean g() {
        return this.d.g();
    }

    @Override // com.google.android.gms.ads.internal.k
    public final void g0() {
        this.d.g0();
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final String getRequestId() {
        return this.d.getRequestId();
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.by
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final WebView getWebView() {
        return this.d.getWebView();
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.ay
    public final hy h() {
        return this.d.h();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final String h0() {
        return this.d.h0();
    }

    @Override // com.google.android.gms.internal.ads.ea
    public final void i(String str) {
        this.d.i(str);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final boolean i0() {
        return this.d.i0();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void j(String str, z6<? super rw> z6Var) {
        this.d.j(str, z6Var);
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final t0 j0() {
        return this.d.j0();
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zx
    public final i52 k() {
        return this.d.k();
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void k0() {
        this.d.k0();
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zt
    public final void l(mx mxVar) {
        this.d.l(mxVar);
    }

    @Override // com.google.android.gms.internal.ads.rw
    @androidx.annotation.i0
    public final x2 l0() {
        return this.d.l0();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void loadData(String str, String str2, String str3) {
        this.d.loadData(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.d.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void loadUrl(String str) {
        this.d.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zt
    public final s0 m() {
        return this.d.m();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final boolean m0() {
        return this.d.m0();
    }

    @Override // com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.zt
    public final mx n() {
        return this.d.n();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void n0(@androidx.annotation.i0 x2 x2Var) {
        this.d.n0(x2Var);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void o(String str, z6<? super rw> z6Var) {
        this.d.o(str, z6Var);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void o0(boolean z) {
        this.d.o0(z);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void onPause() {
        this.e.b();
        this.d.onPause();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void onResume() {
        this.d.onResume();
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final int p() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void p0(hy hyVar) {
        this.d.p0(hyVar);
    }

    @Override // com.google.android.gms.internal.ads.ea
    public final void q(String str, JSONObject jSONObject) {
        this.d.q(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void q0(int r2) {
        this.d.q0(r2);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void r(s2 s2Var) {
        this.d.r(s2Var);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void s0(ViewGroup viewGroup, Activity activity, String str, String str2) {
        this.d.s0(this, activity, str, str2);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.rw
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.rw
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.d.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void setRequestedOrientation(int r2) {
        this.d.setRequestedOrientation(r2);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.d.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.d.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final st t() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final sv t0(String str) {
        return this.d.t0(str);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final c.a.b.b.e.c u0() {
        return this.d.u0();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void v() {
        this.d.v();
    }

    @Override // com.google.android.gms.internal.ads.yx
    public final void v0(boolean z, int r3, String str, String str2) {
        this.d.v0(z, r3, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void w(boolean z) {
        this.d.w(z);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final com.google.android.gms.ads.internal.overlay.e w0() {
        return this.d.w0();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void x(com.google.android.gms.ads.internal.overlay.e eVar) {
        this.d.x(eVar);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void x0(com.google.android.gms.ads.internal.overlay.e eVar) {
        this.d.x0(eVar);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void y() {
        this.d.y();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void y0(boolean z) {
        this.d.y0(z);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void z(km1 km1Var, lm1 lm1Var) {
        this.d.z(km1Var, lm1Var);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final boolean z0() {
        return this.d.z0();
    }
}
