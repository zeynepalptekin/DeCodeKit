package com.google.android.gms.internal.ads;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* loaded from: classes.dex */
public class jp extends gp {
    @Override // com.google.android.gms.internal.ads.dp
    public final WebResourceResponse e(String str, String str2, int r11, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, r11, str3, map, inputStream);
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final qw f(rw rwVar, tu2 tu2Var, boolean z) {
        return new vx(rwVar, tu2Var, z);
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final CookieManager n(Context context) {
        if (dp.s()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            tr.c("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.p.g().e(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final int t() {
        return R.style.Theme.Material.Dialog.Alert;
    }
}
