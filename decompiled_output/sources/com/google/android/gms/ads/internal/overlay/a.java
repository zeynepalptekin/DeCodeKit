package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.e0;
import com.google.android.gms.internal.ads.oo;
import com.google.android.gms.internal.ads.qx2;
import com.google.android.gms.internal.ads.to;
import com.google.android.gms.internal.ads.tr;

/* loaded from: classes.dex */
public final class a {
    private static boolean a(Context context, Intent intent, v vVar) {
        try {
            String strValueOf = String.valueOf(intent.toURI());
            oo.m(strValueOf.length() != 0 ? "Launching an intent: ".concat(strValueOf) : new String("Launching an intent: "));
            com.google.android.gms.ads.internal.p.c();
            to.i(context, intent);
            if (vVar == null) {
                return true;
            }
            vVar.a();
            return true;
        } catch (ActivityNotFoundException e) {
            tr.i(e.getMessage());
            return false;
        }
    }

    public static boolean b(Context context, b bVar, v vVar) throws NumberFormatException {
        String str;
        int r0 = 0;
        if (bVar == null) {
            str = "No intent data for launcher overlay.";
        } else {
            e0.a(context);
            Intent intent = bVar.k;
            if (intent != null) {
                return a(context, intent, vVar);
            }
            Intent intent2 = new Intent();
            if (!TextUtils.isEmpty(bVar.e)) {
                if (TextUtils.isEmpty(bVar.f)) {
                    intent2.setData(Uri.parse(bVar.e));
                } else {
                    intent2.setDataAndType(Uri.parse(bVar.e), bVar.f);
                }
                intent2.setAction("android.intent.action.VIEW");
                if (!TextUtils.isEmpty(bVar.g)) {
                    intent2.setPackage(bVar.g);
                }
                if (!TextUtils.isEmpty(bVar.h)) {
                    String[] strArrSplit = bVar.h.split("/", 2);
                    if (strArrSplit.length < 2) {
                        String strValueOf = String.valueOf(bVar.h);
                        tr.i(strValueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(strValueOf) : new String("Could not parse component name from open GMSG: "));
                        return false;
                    }
                    intent2.setClassName(strArrSplit[0], strArrSplit[1]);
                }
                String str2 = bVar.i;
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        r0 = Integer.parseInt(str2);
                    } catch (NumberFormatException unused) {
                        tr.i("Could not parse intent flags.");
                    }
                    intent2.addFlags(r0);
                }
                if (((Boolean) qx2.e().c(e0.S2)).booleanValue()) {
                    intent2.addFlags(268435456);
                    intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
                } else {
                    if (((Boolean) qx2.e().c(e0.R2)).booleanValue()) {
                        com.google.android.gms.ads.internal.p.c();
                        to.F(context, intent2);
                    }
                }
                return a(context, intent2, vVar);
            }
            str = "Open GMSG did not contain a URL.";
        }
        tr.i(str);
        return false;
    }
}
