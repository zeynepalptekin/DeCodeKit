package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class dq2 {
    public static boolean a(String str) {
        return "audio".equals(c(str));
    }

    public static boolean b(String str) {
        return "video".equals(c(str));
    }

    private static String c(String str) {
        if (str == null) {
            return null;
        }
        int r0 = str.indexOf(47);
        if (r0 != -1) {
            return str.substring(0, r0);
        }
        String strValueOf = String.valueOf(str);
        throw new IllegalArgumentException(strValueOf.length() != 0 ? "Invalid mime type: ".concat(strValueOf) : new String("Invalid mime type: "));
    }
}
