package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(11)
/* loaded from: classes.dex */
public final class tx extends wx {
    public tx(rw rwVar, tu2 tu2Var, boolean z) {
        super(rwVar, tu2Var, z);
    }

    @Override // com.google.android.gms.internal.ads.qw, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return O(webView, str, null);
    }
}
