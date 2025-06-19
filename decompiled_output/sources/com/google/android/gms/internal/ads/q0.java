package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
final class q0 extends p0 {
    q0() {
    }

    @androidx.annotation.i0
    private static String b(@androidx.annotation.i0 String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int r0 = 0;
        int length = str.length();
        while (r0 < str.length() && str.charAt(r0) == ',') {
            r0++;
        }
        while (length > 0 && str.charAt(length - 1) == ',') {
            length--;
        }
        if (length < r0) {
            return null;
        }
        return (r0 == 0 && length == str.length()) ? str : str.substring(r0, length);
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final String a(@androidx.annotation.i0 String str, String str2) {
        String strB = b(str);
        String strB2 = b(str2);
        if (TextUtils.isEmpty(strB)) {
            return strB2;
        }
        if (TextUtils.isEmpty(strB2)) {
            return strB;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(strB).length() + 1 + String.valueOf(strB2).length());
        sb.append(strB);
        sb.append(",");
        sb.append(strB2);
        return sb.toString();
    }
}
