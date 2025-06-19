package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class vp2 {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static <T> T d(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static void e(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void f(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static int g(int r0, int r1, int r2) {
        if (r0 < 0 || r0 >= r2) {
            throw new IndexOutOfBoundsException();
        }
        return r0;
    }
}
