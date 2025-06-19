package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class c {
    private c() {
        throw new AssertionError("Uninstantiable");
    }

    @com.google.android.gms.common.annotation.a
    public static void a(@RecentlyNonNull String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        String strValueOf = String.valueOf(Thread.currentThread());
        String strValueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 57 + String.valueOf(strValueOf2).length());
        sb.append("checkMainThread: current thread ");
        sb.append(strValueOf);
        sb.append(" IS NOT the main thread ");
        sb.append(strValueOf2);
        sb.append("!");
        Log.e("Asserts", sb.toString());
        throw new IllegalStateException(str);
    }

    @com.google.android.gms.common.annotation.a
    public static void b(@RecentlyNonNull String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        String strValueOf = String.valueOf(Thread.currentThread());
        String strValueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 56 + String.valueOf(strValueOf2).length());
        sb.append("checkNotMainThread: current thread ");
        sb.append(strValueOf);
        sb.append(" IS the main thread ");
        sb.append(strValueOf2);
        sb.append("!");
        Log.e("Asserts", sb.toString());
        throw new IllegalStateException(str);
    }

    @com.google.android.gms.common.annotation.a
    public static void c(@RecentlyNonNull Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    @com.google.android.gms.common.annotation.a
    public static void d(@RecentlyNonNull Object obj, @RecentlyNonNull Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    @com.google.android.gms.common.annotation.a
    public static void e(@RecentlyNonNull Object obj) {
        if (obj != null) {
            throw new IllegalArgumentException("non-null reference");
        }
    }

    @com.google.android.gms.common.annotation.a
    public static void f(@RecentlyNonNull boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @com.google.android.gms.common.annotation.a
    public static void g(@RecentlyNonNull boolean z, @RecentlyNonNull Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
