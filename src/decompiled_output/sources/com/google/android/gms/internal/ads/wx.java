package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@TargetApi(11)
/* loaded from: classes.dex */
public class wx extends qw {
    public wx(rw rwVar, tu2 tu2Var, boolean z) {
        super(rwVar, tu2Var, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.i0
    protected final WebResourceResponse O(WebView webView, String str, @androidx.annotation.i0 Map<String, String> map) {
        if (!(webView instanceof rw)) {
            tr.i("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        rw rwVar = (rw) webView;
        im imVar = this.u;
        if (imVar != null) {
            imVar.e(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.M(str, map);
        }
        if (rwVar.C0() != null) {
            rwVar.C0().h();
        }
        String str2 = (String) qx2.e().c(rwVar.h().e() ? e0.H : rwVar.c() ? e0.G : e0.F);
        com.google.android.gms.ads.internal.p.c();
        return to.P(rwVar.getContext(), rwVar.b().d, str2);
    }
}
