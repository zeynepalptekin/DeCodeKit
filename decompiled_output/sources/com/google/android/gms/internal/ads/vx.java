package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(21)
/* loaded from: classes.dex */
public final class vx extends wx {
    public vx(rw rwVar, tu2 tu2Var, boolean z) {
        super(rwVar, tu2Var, z);
    }

    @Override // android.webkit.WebViewClient
    @androidx.annotation.i0
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return O(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
