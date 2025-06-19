package com.google.android.gms.common.util;

import android.util.Base64;
import androidx.annotation.RecentlyNonNull;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class c {
    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static byte[] a(@RecentlyNonNull String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static byte[] b(@RecentlyNonNull String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static byte[] c(@RecentlyNonNull String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static String d(@RecentlyNonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static String e(@RecentlyNonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static String f(@RecentlyNonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
