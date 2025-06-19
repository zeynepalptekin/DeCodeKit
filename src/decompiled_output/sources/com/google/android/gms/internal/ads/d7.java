package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.google.android.gms.internal.ads.by;
import com.google.android.gms.internal.ads.fw;
import com.google.android.gms.internal.ads.rx;
import com.google.android.gms.internal.ads.ux;
import com.google.android.gms.internal.ads.yx;
import com.google.android.gms.internal.ads.zx;
import java.util.Map;

/* loaded from: classes.dex */
public final class d7<T extends fw & rx & ux & yx & zx & by> implements z6<T> {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.i0
    private final com.google.android.gms.ads.internal.a f3079a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.i0
    private final uf f3080b;

    public d7(com.google.android.gms.ads.internal.a aVar, uf ufVar) {
        this.f3079a = aVar;
        this.f3080b = ufVar;
    }

    @com.google.android.gms.common.util.d0
    static Uri b(Context context, i52 i52Var, Uri uri, View view, @androidx.annotation.i0 Activity activity) {
        if (i52Var == null) {
            return uri;
        }
        try {
            return i52Var.g(uri) ? i52Var.b(uri, context, view, activity) : uri;
        } catch (h42 unused) {
            return uri;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.p.g().e(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    private final void c(boolean z) {
        uf ufVar = this.f3080b;
        if (ufVar != null) {
            ufVar.i(z);
        }
    }

    private static boolean d(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int e(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            com.google.android.gms.ads.internal.p.e();
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            com.google.android.gms.ads.internal.p.e();
            return 6;
        }
        if ("c".equalsIgnoreCase(str)) {
            return com.google.android.gms.ads.internal.p.e().q();
        }
        return -1;
    }

    @com.google.android.gms.common.util.d0
    static Uri f(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            String strValueOf = String.valueOf(uri.toString());
            tr.c(strValueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(strValueOf) : new String("Error adding click uptime parameter to url: "), e);
        }
        return uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01c1  */
    @Override // com.google.android.gms.internal.ads.z6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void a(java.lang.Object r14, java.util.Map r15) throws java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d7.a(java.lang.Object, java.util.Map):void");
    }
}
