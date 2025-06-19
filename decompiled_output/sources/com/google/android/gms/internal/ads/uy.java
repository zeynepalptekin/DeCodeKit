package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class uy extends WebViewClient {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f5610b = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f5611c = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    /* renamed from: a, reason: collision with root package name */
    private bz f5612a;

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (str == null) {
            return;
        }
        String strValueOf = String.valueOf(str);
        oo.m(strValueOf.length() != 0 ? "Loading resource: ".concat(strValueOf) : new String("Loading resource: "));
        s(new xy(str));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (str == null) {
            return;
        }
        xy xyVar = new xy(str);
        bz bzVar = this.f5612a;
        if (bzVar != null) {
            bzVar.U(xyVar);
        } else {
            q(xyVar);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int r2, String str, String str2) {
        if (r2 >= 0 || (-r2) - 1 >= f5610b.length) {
            String.valueOf(r2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError == null) {
            return;
        }
        int primaryError = sslError.getPrimaryError();
        if (primaryError < 0 || primaryError >= f5611c.length) {
            String.valueOf(primaryError);
        }
        sslError.getUrl();
    }

    public void q(xy xyVar) {
    }

    final void r(bz bzVar) {
        this.f5612a = bzVar;
    }

    public void s(xy xyVar) {
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return u(new xy(webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str == null) {
            return null;
        }
        return u(new xy(str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return false;
        }
        return t(new xy(webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        return t(new xy(str));
    }

    public boolean t(xy xyVar) {
        return false;
    }

    @androidx.annotation.i0
    public WebResourceResponse u(xy xyVar) {
        return null;
    }
}
