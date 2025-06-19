package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* loaded from: classes.dex */
final class ls2 implements Runnable {
    private ValueCallback<String> d = new ks2(this);
    final /* synthetic */ ds2 e;
    final /* synthetic */ WebView f;
    final /* synthetic */ boolean g;
    final /* synthetic */ js2 h;

    ls2(js2 js2Var, ds2 ds2Var, WebView webView, boolean z) {
        this.h = js2Var;
        this.e = ds2Var;
        this.f = webView;
        this.g = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f.getSettings().getJavaScriptEnabled()) {
            try {
                this.f.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.d);
            } catch (Throwable unused) {
                this.d.onReceiveValue("");
            }
        }
    }
}
