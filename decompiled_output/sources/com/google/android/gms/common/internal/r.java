package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class r {
    private r() {
        throw new AssertionError("Uninstantiable");
    }

    @com.google.android.gms.common.annotation.a
    public static void a(@RecentlyNonNull boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @com.google.android.gms.common.annotation.a
    public static void b(@RecentlyNonNull boolean z, @RecentlyNonNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @com.google.android.gms.common.annotation.a
    public static void c(@RecentlyNonNull boolean z, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @com.google.android.gms.common.annotation.a
    public static void d(@RecentlyNonNull Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 36 + String.valueOf(name).length());
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    @com.google.android.gms.common.annotation.a
    public static void e(@RecentlyNonNull Handler handler, @RecentlyNonNull String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    @com.google.android.gms.common.annotation.a
    public static void f(@RecentlyNonNull String str) {
        if (!com.google.android.gms.common.util.h0.a()) {
            throw new IllegalStateException(str);
        }
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static String g(@RecentlyNonNull String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static String h(@RecentlyNonNull String str, @RecentlyNonNull Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    @com.google.android.gms.common.annotation.a
    public static void i() {
        j("Must not be called on the main application thread");
    }

    @com.google.android.gms.common.annotation.a
    public static void j(@RecentlyNonNull String str) {
        if (com.google.android.gms.common.util.h0.a()) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    @androidx.annotation.h0
    @com.google.android.gms.common.annotation.a
    public static <T> T k(@androidx.annotation.i0 T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    @EnsuresNonNull({"#1"})
    @androidx.annotation.h0
    @com.google.android.gms.common.annotation.a
    public static <T> T l(@RecentlyNonNull T t, @RecentlyNonNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static int m(@RecentlyNonNull int r1) {
        if (r1 != 0) {
            return r1;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static int n(@RecentlyNonNull int r0, @RecentlyNonNull Object obj) {
        if (r0 != 0) {
            return r0;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static long o(@RecentlyNonNull long j) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static long p(@RecentlyNonNull long j, @RecentlyNonNull Object obj) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @com.google.android.gms.common.annotation.a
    public static void q(@RecentlyNonNull boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @com.google.android.gms.common.annotation.a
    public static void r(@RecentlyNonNull boolean z, @RecentlyNonNull Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @com.google.android.gms.common.annotation.a
    public static void s(@RecentlyNonNull boolean z, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
