package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebView;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class yy {

    /* renamed from: a, reason: collision with root package name */
    @GuardedBy("InvokeJavascriptWorkaround.class")
    @com.google.android.gms.common.util.d0
    private static Boolean f6194a;

    private yy() {
    }

    @TargetApi(19)
    static void a(WebView webView, String str) {
        if (com.google.android.gms.common.util.v.h() && b(webView)) {
            webView.evaluateJavascript(str, null);
        } else {
            String strValueOf = String.valueOf(str);
            webView.loadUrl(strValueOf.length() != 0 ? "javascript:".concat(strValueOf) : new String("javascript:"));
        }
    }

    @TargetApi(19)
    private static boolean b(WebView webView) {
        boolean zBooleanValue;
        synchronized (yy.class) {
            if (f6194a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    f6194a = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    f6194a = Boolean.FALSE;
                }
                zBooleanValue = f6194a.booleanValue();
            } else {
                zBooleanValue = f6194a.booleanValue();
            }
        }
        return zBooleanValue;
    }
}
