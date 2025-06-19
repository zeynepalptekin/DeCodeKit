package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Map;

/* loaded from: classes.dex */
public final class p20 implements m20 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4774a;

    public p20(Context context) {
        this.f4774a = context;
    }

    @Override // com.google.android.gms.internal.ads.m20
    public final void a(Map<String, String> map) {
        CookieManager cookieManagerN;
        String str = map.get("cookie");
        if (TextUtils.isEmpty(str) || (cookieManagerN = com.google.android.gms.ads.internal.p.e().n(this.f4774a)) == null) {
            return;
        }
        cookieManagerN.setCookie((String) qx2.e().c(e0.q0), str);
    }
}
