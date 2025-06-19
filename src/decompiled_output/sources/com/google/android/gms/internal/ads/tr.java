package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
public class tr {
    public static boolean a(int r1) {
        return r1 >= 5 || Log.isLoggable(c.a.a.a.f1583b, r1);
    }

    public static void b(String str, Throwable th) {
        if (a(3)) {
            Log.d(c.a.a.a.f1583b, str, th);
        }
    }

    public static void c(String str, Throwable th) {
        if (a(6)) {
            Log.e(c.a.a.a.f1583b, str, th);
        }
    }

    public static void d(String str, Throwable th) {
        if (a(5)) {
            Log.w(c.a.a.a.f1583b, str, th);
        }
    }

    public static void e(String str, @androidx.annotation.i0 Throwable th) {
        if (a(5)) {
            String strJ = j(str);
            if (th != null) {
                d(strJ, th);
            } else {
                i(strJ);
            }
        }
    }

    public static void f(String str) {
        if (a(3)) {
            Log.d(c.a.a.a.f1583b, str);
        }
    }

    public static void g(String str) {
        if (a(6)) {
            Log.e(c.a.a.a.f1583b, str);
        }
    }

    public static void h(String str) {
        if (a(4)) {
            Log.i(c.a.a.a.f1583b, str);
        }
    }

    public static void i(String str) {
        if (a(5)) {
            Log.w(c.a.a.a.f1583b, str);
        }
    }

    @com.google.android.gms.common.util.d0
    private static String j(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    public static void k(String str) {
        e(str, null);
    }
}
