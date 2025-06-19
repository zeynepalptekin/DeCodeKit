package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;

@com.google.android.gms.common.internal.v
@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f2590a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f2591b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static String a(@RecentlyNonNull byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int r2 = 0;
        for (byte b2 : bArr) {
            int r3 = b2 & 255;
            int r4 = r2 + 1;
            char[] cArr2 = f2591b;
            cArr[r2] = cArr2[r3 >>> 4];
            r2 = r4 + 1;
            cArr[r4] = cArr2[r3 & 15];
        }
        return new String(cArr);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static String b(@RecentlyNonNull byte[] bArr) {
        return c(bArr, false);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static String c(@RecentlyNonNull byte[] bArr, @RecentlyNonNull boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length << 1);
        for (int r2 = 0; r2 < length && (!z || r2 != length - 1 || (bArr[r2] & 255) != 0); r2++) {
            sb.append(f2590a[(bArr[r2] & 240) >>> 4]);
            sb.append(f2590a[bArr[r2] & 15]);
        }
        return sb.toString();
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static byte[] d(@RecentlyNonNull String str) throws IllegalArgumentException {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int r2 = 0;
        while (r2 < length) {
            int r4 = r2 + 2;
            bArr[r2 / 2] = (byte) Integer.parseInt(str.substring(r2, r4), 16);
            r2 = r4;
        }
        return bArr;
    }
}
