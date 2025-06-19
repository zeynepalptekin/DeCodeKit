package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.RecentlyNonNull;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    private static final int f2528c = 15;

    @androidx.annotation.i0
    private static final String d = null;

    /* renamed from: a, reason: collision with root package name */
    private final String f2529a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.i0
    private final String f2530b;

    public i(@RecentlyNonNull String str) {
        this(str, null);
    }

    public i(@RecentlyNonNull String str, @androidx.annotation.i0 String str2) {
        r.l(str, "log tag cannot be null");
        r.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f2529a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f2530b = null;
        } else {
            this.f2530b = str2;
        }
    }

    private final String r(String str) {
        String str2 = this.f2530b;
        return str2 == null ? str : str2.concat(str);
    }

    private final String s(String str, Object... objArr) {
        String str2 = String.format(str, objArr);
        String str3 = this.f2530b;
        return str3 == null ? str2 : str3.concat(str2);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public final boolean a(@RecentlyNonNull int r2) {
        return Log.isLoggable(this.f2529a, r2);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public final boolean b() {
        return false;
    }

    @com.google.android.gms.common.annotation.a
    public final void c(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        if (a(3)) {
            Log.d(str, r(str2));
        }
    }

    @com.google.android.gms.common.annotation.a
    public final void d(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Throwable th) {
        if (a(3)) {
            Log.d(str, r(str2), th);
        }
    }

    @com.google.android.gms.common.annotation.a
    public final void e(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        if (a(6)) {
            Log.e(str, r(str2));
        }
    }

    @com.google.android.gms.common.annotation.a
    public final void f(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Throwable th) {
        if (a(6)) {
            Log.e(str, r(str2), th);
        }
    }

    @com.google.android.gms.common.annotation.a
    public final void g(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Object... objArr) {
        if (a(6)) {
            Log.e(str, s(str2, objArr));
        }
    }

    @com.google.android.gms.common.annotation.a
    public final void h(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        if (a(4)) {
            Log.i(str, r(str2));
        }
    }

    @com.google.android.gms.common.annotation.a
    public final void i(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Throwable th) {
        if (a(4)) {
            Log.i(str, r(str2), th);
        }
    }

    @com.google.android.gms.common.annotation.a
    public final void j(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        if (b()) {
            String strValueOf = String.valueOf(str);
            Log.i(" PII_LOG".length() != 0 ? strValueOf.concat(" PII_LOG") : new String(strValueOf), r(str2));
        }
    }

    @com.google.android.gms.common.annotation.a
    public final void k(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Throwable th) {
        if (b()) {
            String strValueOf = String.valueOf(str);
            Log.i(" PII_LOG".length() != 0 ? strValueOf.concat(" PII_LOG") : new String(strValueOf), r(str2), th);
        }
    }

    @com.google.android.gms.common.annotation.a
    public final void l(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        if (a(2)) {
            Log.v(str, r(str2));
        }
    }

    @com.google.android.gms.common.annotation.a
    public final void m(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Throwable th) {
        if (a(2)) {
            Log.v(str, r(str2), th);
        }
    }

    @com.google.android.gms.common.annotation.a
    public final void n(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        if (a(5)) {
            Log.w(str, r(str2));
        }
    }

    @com.google.android.gms.common.annotation.a
    public final void o(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Throwable th) {
        if (a(5)) {
            Log.w(str, r(str2), th);
        }
    }

    @com.google.android.gms.common.annotation.a
    public final void p(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Object... objArr) {
        if (a(5)) {
            Log.w(this.f2529a, s(str2, objArr));
        }
    }

    @com.google.android.gms.common.annotation.a
    public final void q(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Throwable th) {
        if (a(7)) {
            Log.e(str, r(str2), th);
            Log.wtf(str, r(str2), th);
        }
    }
}
