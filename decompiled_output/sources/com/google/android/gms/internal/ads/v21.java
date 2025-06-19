package com.google.android.gms.internal.ads;

import android.util.Base64;

/* loaded from: classes.dex */
public final class v21 {
    public static String a(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, z ? 11 : 2);
    }

    public static byte[] b(String str, boolean z) throws IllegalArgumentException {
        byte[] bArrDecode = Base64.decode(str, z ? 11 : 2);
        if (bArrDecode.length != 0 || str.length() <= 0) {
            return bArrDecode;
        }
        String strValueOf = String.valueOf(str);
        throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unable to decode ".concat(strValueOf) : new String("Unable to decode "));
    }
}
