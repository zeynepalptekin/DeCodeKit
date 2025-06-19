package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import android.webkit.WebViewClient;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class wy extends vy implements bz {
    private final uy d;

    @GuardedBy("this")
    private boolean e;

    @GuardedBy("this")
    private boolean f;

    public wy(Context context, uy uyVar) {
        super(context);
        com.google.android.gms.ads.internal.p.g().o();
        this.d = uyVar;
        super.setWebViewClient(uyVar);
    }

    private final synchronized void H0() {
        if (!this.f) {
            this.f = true;
            com.google.android.gms.ads.internal.p.g().p();
        }
    }

    final /* synthetic */ void F0() {
        super.destroy();
    }

    @GuardedBy("this")
    protected void G0(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @com.google.android.gms.common.util.d0
    public synchronized void R() {
        oo.m("Destroying WebView!");
        H0();
        cs.e.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zy
            private final wy d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.F0();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.bz
    public final synchronized void U(xy xyVar) {
        oo.m("Blank page loaded, 1...");
        R();
    }

    @Override // com.google.android.gms.internal.ads.vy, android.webkit.WebView
    public /* bridge */ /* synthetic */ void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
    }

    @Override // android.webkit.WebView
    public synchronized void destroy() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.d.r(this);
        G0(false);
        oo.m("Initiating WebView self destruct sequence in 3...");
        oo.m("Loading blank page in WebView, 2...");
        try {
            super.loadUrl("about:blank");
        } catch (UnsatisfiedLinkError e) {
            com.google.android.gms.ads.internal.p.g().e(e, "AdWebViewImpl.loadUrlUnsafe");
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!g()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        tr.i("#004 The webview is destroyed. Ignoring action.");
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!g()) {
                    G0(true);
                }
                H0();
            }
        } finally {
            super.finalize();
        }
    }

    public final synchronized boolean g() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.vy, com.google.android.gms.internal.ads.k9, com.google.android.gms.internal.ads.ea
    public /* bridge */ /* synthetic */ void i(String str) {
        super.i(str);
    }

    @Override // android.webkit.WebView
    public synchronized void loadData(String str, String str2, String str3) {
        if (g()) {
            tr.i("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView
    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (g()) {
            tr.i("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // com.google.android.gms.internal.ads.vy, android.webkit.WebView
    public synchronized void loadUrl(String str) {
        if (g()) {
            tr.i("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadUrl(str);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    protected void onDraw(Canvas canvas) {
        if (g()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.rw
    public void onPause() {
        if (g()) {
            return;
        }
        super.onPause();
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.rw
    public void onResume() {
        if (g()) {
            return;
        }
        super.onResume();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !g() && super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (g()) {
            return;
        }
        super.stopLoading();
    }
}
