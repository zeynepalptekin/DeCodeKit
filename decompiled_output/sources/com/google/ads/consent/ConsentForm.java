package com.google.ads.consent;

import android.R;
import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.app.p;
import c.a.e.f;
import com.google.android.gms.common.internal.o;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ConsentForm {
    private final boolean adFreeOption;
    private final URL appPrivacyPolicyURL;
    private final Context context;
    private final Dialog dialog;
    private final ConsentFormListener listener;
    private LoadState loadState;
    private final boolean nonPersonalizedAdsOption;
    private final boolean personalizedAdsOption;
    private final WebView webView;

    public static class Builder {
        private final URL appPrivacyPolicyURL;
        private final Context context;
        private ConsentFormListener listener;
        private boolean personalizedAdsOption = false;
        private boolean nonPersonalizedAdsOption = false;
        private boolean adFreeOption = false;

        public Builder(Context context, URL appPrivacyPolicyURL) {
            this.context = context;
            this.appPrivacyPolicyURL = appPrivacyPolicyURL;
            if (appPrivacyPolicyURL == null) {
                throw new IllegalArgumentException("Must provide valid app privacy policy url to create a ConsentForm");
            }
        }

        public ConsentForm g() {
            return new ConsentForm(this);
        }

        public Builder h() {
            this.adFreeOption = true;
            return this;
        }

        public Builder i(ConsentFormListener listener) {
            this.listener = listener;
            return this;
        }

        public Builder j() {
            this.nonPersonalizedAdsOption = true;
            return this;
        }

        public Builder k() {
            this.personalizedAdsOption = true;
            return this;
        }
    }

    private enum LoadState {
        NOT_READY,
        LOADING,
        LOADED
    }

    private ConsentForm(Builder builder) {
        this.context = builder.context;
        this.listener = builder.listener == null ? new ConsentFormListener(this) { // from class: com.google.ads.consent.ConsentForm.1
        } : builder.listener;
        this.personalizedAdsOption = builder.personalizedAdsOption;
        this.nonPersonalizedAdsOption = builder.nonPersonalizedAdsOption;
        this.adFreeOption = builder.adFreeOption;
        this.appPrivacyPolicyURL = builder.appPrivacyPolicyURL;
        this.dialog = new Dialog(this.context, R.style.Theme.Translucent.NoTitleBar);
        this.loadState = LoadState.NOT_READY;
        WebView webView = new WebView(this.context);
        this.webView = webView;
        webView.setBackgroundColor(0);
        this.dialog.setContentView(this.webView);
        this.dialog.setCancelable(false);
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.setWebViewClient(new WebViewClient() { // from class: com.google.ads.consent.ConsentForm.2
            boolean isInternalRedirect;

            private void a(String url) {
                if (b(url)) {
                    this.isInternalRedirect = true;
                    Uri uri = Uri.parse(url);
                    String queryParameter = uri.getQueryParameter("action");
                    String queryParameter2 = uri.getQueryParameter(p.t0);
                    String queryParameter3 = uri.getQueryParameter(o.f2536a);
                    char c2 = 65535;
                    int r4 = queryParameter.hashCode();
                    if (r4 != -1370505102) {
                        if (r4 != 150940456) {
                            if (r4 == 1671672458 && queryParameter.equals("dismiss")) {
                                c2 = 1;
                            }
                        } else if (queryParameter.equals("browser")) {
                            c2 = 2;
                        }
                    } else if (queryParameter.equals("load_complete")) {
                        c2 = 0;
                    }
                    if (c2 == 0) {
                        ConsentForm.this.k(queryParameter2);
                        return;
                    }
                    if (c2 == 1) {
                        this.isInternalRedirect = false;
                        ConsentForm.this.j(queryParameter2);
                    } else {
                        if (c2 != 2) {
                            return;
                        }
                        ConsentForm.this.l(queryParameter3);
                    }
                }
            }

            private boolean b(String url) {
                return !TextUtils.isEmpty(url) && url.startsWith("consent://");
            }

            @Override // android.webkit.WebViewClient
            public void onLoadResource(WebView view, String url) {
                a(url);
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                if (!this.isInternalRedirect) {
                    ConsentForm.this.p(view);
                }
                super.onPageFinished(view, url);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                ConsentForm.this.loadState = LoadState.NOT_READY;
                ConsentForm.this.listener.b(error.toString());
            }

            @Override // android.webkit.WebViewClient
            @TargetApi(24)
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                String string = request.getUrl().toString();
                if (!b(string)) {
                    return false;
                }
                a(string);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (!b(url)) {
                    return false;
                }
                a(url);
                return true;
            }
        });
    }

    private static String g(String command, String argumentsJSON) {
        HashMap map = new HashMap();
        map.put("info", argumentsJSON);
        HashMap map2 = new HashMap();
        map2.put("args", map);
        return String.format("javascript:%s(%s)", command, new f().z(map2));
    }

    private static String h(Context context) {
        Drawable applicationIcon = context.getPackageManager().getApplicationIcon(context.getApplicationInfo());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        applicationIcon.draw(canvas);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String strValueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
        return strValueOf.length() != 0 ? "data:image/png;base64,".concat(strValueOf) : new String("data:image/png;base64,");
    }

    private static String i(Context context) {
        return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(String status) {
        ConsentStatus consentStatus;
        this.loadState = LoadState.NOT_READY;
        this.dialog.dismiss();
        if (TextUtils.isEmpty(status)) {
            this.listener.b("No information provided.");
            return;
        }
        if (status.contains("Error")) {
            this.listener.b(status);
            return;
        }
        char c2 = 65535;
        int r1 = status.hashCode();
        boolean z = false;
        if (r1 != -1152655096) {
            if (r1 != -258041904) {
                if (r1 == 1666911234 && status.equals("non_personalized")) {
                    c2 = 1;
                }
            } else if (status.equals("personalized")) {
                c2 = 0;
            }
        } else if (status.equals("ad_free")) {
            c2 = 2;
        }
        if (c2 == 0) {
            consentStatus = ConsentStatus.PERSONALIZED;
        } else if (c2 != 1) {
            consentStatus = ConsentStatus.UNKNOWN;
            if (c2 == 2) {
                z = true;
            }
        } else {
            consentStatus = ConsentStatus.NON_PERSONALIZED;
        }
        ConsentInformation.g(this.context).t(consentStatus, "form");
        this.listener.a(consentStatus, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(String status) {
        if (TextUtils.isEmpty(status)) {
            this.loadState = LoadState.NOT_READY;
            this.listener.b("No information");
        } else if (status.contains("Error")) {
            this.loadState = LoadState.NOT_READY;
            this.listener.b(status);
        } else {
            this.loadState = LoadState.LOADED;
            this.listener.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(String urlString) {
        if (TextUtils.isEmpty(urlString)) {
            this.listener.b("No valid URL for browser navigation.");
            return;
        }
        try {
            this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(urlString)));
        } catch (ActivityNotFoundException unused) {
            this.listener.b("No Activity found to handle browser intent.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(WebView webView) {
        HashMap map = new HashMap();
        map.put("app_name", i(this.context));
        map.put("app_icon", h(this.context));
        map.put("offer_personalized", Boolean.valueOf(this.personalizedAdsOption));
        map.put("offer_non_personalized", Boolean.valueOf(this.nonPersonalizedAdsOption));
        map.put("offer_ad_free", Boolean.valueOf(this.adFreeOption));
        map.put("is_request_in_eea_or_unknown", Boolean.valueOf(ConsentInformation.g(this.context).j()));
        map.put("app_privacy_url", this.appPrivacyPolicyURL);
        ConsentData consentDataM = ConsentInformation.g(this.context).m();
        map.put("plat", consentDataM.g());
        map.put("consent_info", consentDataM);
        webView.loadUrl(g("setUpConsentDialog", new f().z(map)));
    }

    public boolean m() {
        return this.dialog.isShowing();
    }

    public void n() {
        LoadState loadState = this.loadState;
        if (loadState == LoadState.LOADING) {
            this.listener.b("Cannot simultaneously load multiple consent forms.");
        } else if (loadState == LoadState.LOADED) {
            this.listener.c();
        } else {
            this.loadState = LoadState.LOADING;
            this.webView.loadUrl("file:///android_asset/consentform.html");
        }
    }

    public void o() {
        ConsentFormListener consentFormListener;
        String str;
        if (this.loadState != LoadState.LOADED) {
            consentFormListener = this.listener;
            str = "Consent form is not ready to be displayed.";
        } else {
            if (!ConsentInformation.g(this.context).k()) {
                this.dialog.getWindow().setLayout(-1, -1);
                this.dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                this.dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.google.ads.consent.ConsentForm.3
                    @Override // android.content.DialogInterface.OnShowListener
                    public void onShow(DialogInterface dialog) {
                        ConsentForm.this.listener.d();
                    }
                });
                this.dialog.show();
                if (this.dialog.isShowing()) {
                    return;
                }
                this.listener.b("Consent form could not be displayed.");
                return;
            }
            consentFormListener = this.listener;
            str = "Error: tagged for under age of consent";
        }
        consentFormListener.b(str);
    }
}
