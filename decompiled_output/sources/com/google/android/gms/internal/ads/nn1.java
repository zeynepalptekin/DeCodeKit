package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class nn1 {
    public static void a(int r2, Throwable th, String str) {
        StringBuilder sb = new StringBuilder(31);
        sb.append("Ad failed to load : ");
        sb.append(r2);
        tr.h(sb.toString());
        oo.l(str, th);
        if (r2 == 3) {
            return;
        }
        com.google.android.gms.ads.internal.p.g().h(th, str);
    }

    public static void b(Context context, boolean z) {
        String string;
        if (z) {
            string = "This request is sent from a test device.";
        } else {
            qx2.a();
            String strL = jr.l(context);
            StringBuilder sb = new StringBuilder(String.valueOf(strL).length() + 101);
            sb.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
            sb.append(strL);
            sb.append("\") to get test ads on this device.");
            string = sb.toString();
        }
        tr.h(string);
    }
}
