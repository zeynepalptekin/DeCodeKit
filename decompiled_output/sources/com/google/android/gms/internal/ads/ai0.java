package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class ai0 implements ut2 {

    /* renamed from: a, reason: collision with root package name */
    private mu1 f2694a;

    @Override // com.google.android.gms.internal.ads.ut2
    public final void a(Activity activity, WebView webView) {
        try {
            this.f2694a = new mu1(activity, webView);
        } catch (RuntimeException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 46);
            sb.append(" Failed to initialize the internal ArWebView: ");
            sb.append(strValueOf);
            tr.g(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.ut2
    public final void b(WebView webView, String str, Bitmap bitmap) {
        if (this.f2694a != null) {
            mu1.a(webView, str, bitmap);
        }
    }

    @Override // com.google.android.gms.internal.ads.ut2
    public final void c(String str, String str2) {
        if (this.f2694a == null) {
            tr.g("ArWebView is not initialized.");
        } else {
            mu1.getWebView().loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.ut2
    public final View getView() {
        return this.f2694a;
    }

    @Override // com.google.android.gms.internal.ads.ut2
    public final WebView getWebView() {
        if (this.f2694a == null) {
            return null;
        }
        return mu1.getWebView();
    }
}
