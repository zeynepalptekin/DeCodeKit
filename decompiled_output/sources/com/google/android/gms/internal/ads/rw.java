package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import javax.annotation.ParametersAreNonnullByDefault;

@com.google.android.gms.common.util.d0
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public interface rw extends com.google.android.gms.ads.internal.k, c9, ea, zt, fw, rx, ux, yx, zx, by, cy, sr2 {
    com.google.android.gms.ads.internal.overlay.e A();

    void B(boolean z);

    void B0();

    void C();

    @androidx.annotation.i0
    ey C0();

    void E(Context context);

    void E0();

    void F(String str, com.google.android.gms.common.util.w<z6<? super rw>> wVar);

    WebViewClient H();

    void I(ct2 ct2Var);

    boolean L();

    void N(c.a.b.b.e.c cVar);

    void O();

    void R();

    boolean V(boolean z, int r2);

    void W();

    boolean Y();

    void Z(boolean z);

    Activity a();

    ct2 a0();

    as b();

    void b0(String str, String str2, @androidx.annotation.i0 String str3);

    boolean c();

    com.google.android.gms.ads.internal.b d();

    ut2 d0();

    void destroy();

    void f(String str, sv svVar);

    Context f0();

    boolean g();

    @Override // com.google.android.gms.internal.ads.zt, com.google.android.gms.internal.ads.rx
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] r1);

    ViewParent getParent();

    View getView();

    WebView getWebView();

    int getWidth();

    hy h();

    String h0();

    boolean i0();

    void j(String str, z6<? super rw> z6Var);

    i52 k();

    void l(mx mxVar);

    x2 l0();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, @androidx.annotation.i0 String str5);

    void loadUrl(String str);

    s0 m();

    boolean m0();

    void measure(int r1, int r2);

    @androidx.annotation.i0
    mx n();

    void n0(x2 x2Var);

    void o(String str, z6<? super rw> z6Var);

    void o0(boolean z);

    void onPause();

    void onResume();

    void p0(hy hyVar);

    void q0(int r1);

    void r(s2 s2Var);

    void s0(ViewGroup viewGroup, Activity activity, String str, String str2);

    @Override // com.google.android.gms.internal.ads.zt
    void setBackgroundColor(int r1);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setRequestedOrientation(int r1);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @androidx.annotation.i0
    c.a.b.b.e.c u0();

    void v();

    void w(boolean z);

    com.google.android.gms.ads.internal.overlay.e w0();

    void x(com.google.android.gms.ads.internal.overlay.e eVar);

    void x0(com.google.android.gms.ads.internal.overlay.e eVar);

    void y();

    void y0(boolean z);

    void z(km1 km1Var, lm1 lm1Var);

    boolean z0();
}
