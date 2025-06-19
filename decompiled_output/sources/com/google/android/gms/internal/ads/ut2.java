package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;

/* loaded from: classes.dex */
public interface ut2 {
    void a(Activity activity, WebView webView);

    void b(WebView webView, String str, Bitmap bitmap);

    void c(String str, String str2);

    View getView();

    WebView getWebView();
}
