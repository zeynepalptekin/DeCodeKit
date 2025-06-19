package com.google.android.gms.internal.ads;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

@TargetApi(11)
/* loaded from: classes.dex */
public final class jw extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private final rw f4018a;

    public jw(rw rwVar) {
        this.f4018a = rwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Context a(WebView webView) {
        if (!(webView instanceof rw)) {
            return webView.getContext();
        }
        rw rwVar = (rw) webView;
        Activity activityA = rwVar.a();
        return activityA != null ? activityA : rwVar.getContext();
    }

    private final boolean b(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        AlertDialog alertDialogCreate;
        com.google.android.gms.ads.internal.a aVarN;
        try {
        } catch (WindowManager.BadTokenException e) {
            tr.d("Fail to display Dialog.", e);
        }
        if (this.f4018a != null && this.f4018a.C0() != null && this.f4018a.C0().n() != null && (aVarN = this.f4018a.C0().n()) != null && !aVarN.d()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            aVarN.b(sb.toString());
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str2);
        if (z) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            alertDialogCreate = builder.setView(linearLayout).setPositiveButton(R.string.ok, new pw(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new mw(jsPromptResult)).setOnCancelListener(new nw(jsPromptResult)).create();
        } else {
            alertDialogCreate = builder.setMessage(str3).setPositiveButton(R.string.ok, new kw(jsResult)).setNegativeButton(R.string.cancel, new lw(jsResult)).setOnCancelListener(new iw(jsResult)).create();
        }
        alertDialogCreate.show();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        String str;
        if (webView instanceof rw) {
            com.google.android.gms.ads.internal.overlay.e eVarW0 = ((rw) webView).w0();
            if (eVarW0 != null) {
                eVarW0.z8();
                return;
            }
            str = "Tried to close an AdWebView not associated with an overlay.";
        } else {
            str = "Tried to close a WebView that wasn't an AdWebView.";
        }
        tr.i(str);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        int r2 = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(strMessage).length() + 19 + String.valueOf(strSourceId).length());
        sb.append("JS: ");
        sb.append(strMessage);
        sb.append(" (");
        sb.append(strSourceId);
        sb.append(":");
        sb.append(r2);
        sb.append(")");
        String string = sb.toString();
        if (string.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int r1 = ow.f4750a[consoleMessage.messageLevel().ordinal()];
        if (r1 == 1) {
            tr.g(string);
        } else if (r1 == 2) {
            tr.i(string);
        } else if (r1 == 3 || r1 == 4 || r1 != 5) {
            tr.h(string);
        } else {
            tr.f(string);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f4018a.H() != null) {
            webView2.setWebViewClient(this.f4018a.H());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min(131072L, j4), 1048576L);
            } else if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > 1048576) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onGeolocationPermissionsShowPrompt(java.lang.String r4, android.webkit.GeolocationPermissions.Callback r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L2c
            com.google.android.gms.ads.internal.p.c()
            com.google.android.gms.internal.ads.rw r0 = r3.f4018a
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = com.google.android.gms.internal.ads.to.l0(r0, r1)
            r1 = 1
            if (r0 != 0) goto L28
            com.google.android.gms.ads.internal.p.c()
            com.google.android.gms.internal.ads.rw r0 = r3.f4018a
            android.content.Context r0 = r0.getContext()
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = com.google.android.gms.internal.ads.to.l0(r0, r2)
            if (r0 == 0) goto L26
            goto L28
        L26:
            r0 = 0
            goto L29
        L28:
            r0 = 1
        L29:
            r5.invoke(r4, r0, r1)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jw.onGeolocationPermissionsShowPrompt(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.e eVarW0 = this.f4018a.w0();
        if (eVarW0 == null) {
            tr.i("Could not get ad overlay when hiding custom view.");
        } else {
            eVarW0.H8();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return b(a(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return b(a(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return b(a(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return b(a(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(21)
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (!com.google.android.gms.common.util.v.j() || m2.f4330a.a().booleanValue()) {
            super.onPermissionRequest(permissionRequest);
            return;
        }
        rw rwVar = this.f4018a;
        if (rwVar == null || rwVar.C0() == null || this.f4018a.C0().l() == null) {
            super.onPermissionRequest(permissionRequest);
            return;
        }
        String[] strArrA = this.f4018a.C0().l().a(permissionRequest.getResources());
        if (strArrA.length > 0) {
            permissionRequest.grant(strArrA);
        } else {
            permissionRequest.deny();
        }
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = j + 131072;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0L);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int r3, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.e eVarW0 = this.f4018a.w0();
        if (eVarW0 == null) {
            tr.i("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            eVarW0.C8(view, customViewCallback);
            eVarW0.A8(r3);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
