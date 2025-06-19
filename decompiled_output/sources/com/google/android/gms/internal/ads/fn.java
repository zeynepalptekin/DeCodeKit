package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class fn {
    @com.google.android.gms.common.util.d0
    private static Uri a(String str, String str2, String str3) {
        int r0 = str.indexOf("&adurl");
        if (r0 == -1) {
            r0 = str.indexOf("?adurl");
        }
        if (r0 == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int r02 = r0 + 1;
        return Uri.parse(str.substring(0, r02) + str2 + "=" + str3 + "&" + str.substring(r02));
    }

    public static String b(Uri uri, Context context) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String strP;
        if (com.google.android.gms.ads.internal.p.A().k(context) && (strP = com.google.android.gms.ads.internal.p.A().p(context)) != null) {
            if (((Boolean) qx2.e().c(e0.W)).booleanValue()) {
                String str = (String) qx2.e().c(e0.X);
                String string = uri.toString();
                if (string.contains(str)) {
                    com.google.android.gms.ads.internal.p.A().x(context, strP);
                    return c(string, context).replace(str, strP);
                }
            } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
                String string2 = a(c(uri.toString(), context), "fbs_aeid", strP).toString();
                com.google.android.gms.ads.internal.p.A().x(context, strP);
                return string2;
            }
            return uri.toString();
        }
        return uri.toString();
    }

    private static String c(String str, Context context) {
        String strN = com.google.android.gms.ads.internal.p.A().n(context);
        String strO = com.google.android.gms.ads.internal.p.A().o(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strN)) {
            str = a(str, "gmp_app_id", strN).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strO)) ? str : a(str, "fbs_aiid", strO).toString();
    }

    public static String d(String str, Context context, boolean z) {
        String strP;
        if ((((Boolean) qx2.e().c(e0.e0)).booleanValue() && !z) || !com.google.android.gms.ads.internal.p.A().k(context) || TextUtils.isEmpty(str) || (strP = com.google.android.gms.ads.internal.p.A().p(context)) == null) {
            return str;
        }
        if (!((Boolean) qx2.e().c(e0.W)).booleanValue()) {
            if (str.contains("fbs_aeid")) {
                return str;
            }
            if (com.google.android.gms.ads.internal.p.c().X(str)) {
                com.google.android.gms.ads.internal.p.A().x(context, strP);
                return a(c(str, context), "fbs_aeid", strP).toString();
            }
            if (!com.google.android.gms.ads.internal.p.c().Y(str)) {
                return str;
            }
            com.google.android.gms.ads.internal.p.A().y(context, strP);
            return a(c(str, context), "fbs_aeid", strP).toString();
        }
        String str2 = (String) qx2.e().c(e0.X);
        if (!str.contains(str2)) {
            return str;
        }
        if (com.google.android.gms.ads.internal.p.c().X(str)) {
            com.google.android.gms.ads.internal.p.A().x(context, strP);
            return c(str, context).replace(str2, strP);
        }
        if (!com.google.android.gms.ads.internal.p.c().Y(str)) {
            return str;
        }
        com.google.android.gms.ads.internal.p.A().y(context, strP);
        return c(str, context).replace(str2, strP);
    }
}
