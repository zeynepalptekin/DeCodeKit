package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.internal.ads.by;
import com.google.android.gms.internal.ads.rx;
import com.google.android.gms.internal.ads.zx;

@TargetApi(17)
/* loaded from: classes.dex */
public final class nx<WebViewT extends rx & zx & by> {

    /* renamed from: a, reason: collision with root package name */
    private final sx f4613a;

    /* renamed from: b, reason: collision with root package name */
    private final WebViewT f4614b;

    private nx(WebViewT webviewt, sx sxVar) {
        this.f4613a = sxVar;
        this.f4614b = webviewt;
    }

    public static nx<rw> a(final rw rwVar) {
        return new nx<>(rwVar, new sx(rwVar) { // from class: com.google.android.gms.internal.ads.qx

            /* renamed from: a, reason: collision with root package name */
            private final rw f5069a;

            {
                this.f5069a = rwVar;
            }

            @Override // com.google.android.gms.internal.ads.sx
            public final void a(Uri uri) {
                ey eyVarC0 = this.f5069a.C0();
                if (eyVarC0 == null) {
                    tr.g("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                } else {
                    eyVarC0.a(uri);
                }
            }
        });
    }

    final /* synthetic */ void b(String str) {
        this.f4613a.a(Uri.parse(str));
    }

    @JavascriptInterface
    public final String getClickSignals(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Click string is empty, not proceeding.";
        } else {
            i52 i52VarK = this.f4614b.k();
            if (i52VarK == null) {
                str2 = "Signal utils is empty, ignoring.";
            } else {
                xu1 xu1VarH = i52VarK.h();
                if (xu1VarH == null) {
                    str2 = "Signals object is empty, ignoring.";
                } else {
                    if (this.f4614b.getContext() != null) {
                        return xu1VarH.g(this.f4614b.getContext(), str, this.f4614b.getView(), this.f4614b.a());
                    }
                    str2 = "Context is null, ignoring.";
                }
            }
        }
        oo.m(str2);
        return "";
    }

    @JavascriptInterface
    public final void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            tr.i("URL is empty, ignoring message");
        } else {
            to.h.post(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.px
                private final nx d;
                private final String e;

                {
                    this.d = this;
                    this.e = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b(this.e);
                }
            });
        }
    }
}
