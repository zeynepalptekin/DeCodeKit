package com.google.android.gms.common.util;

import android.os.Build;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;

@d0
@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f2597a;

    private v() {
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean a() {
        return true;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean b() {
        return true;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean c() {
        return true;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean d() {
        return Build.VERSION.SDK_INT >= 15;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean e() {
        return Build.VERSION.SDK_INT >= 16;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean f() {
        return Build.VERSION.SDK_INT >= 17;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean g() {
        return Build.VERSION.SDK_INT >= 18;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean h() {
        return Build.VERSION.SDK_INT >= 19;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean i() {
        return Build.VERSION.SDK_INT >= 20;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean j() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean k() {
        return Build.VERSION.SDK_INT >= 22;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean l() {
        return Build.VERSION.SDK_INT >= 23;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean m() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean n() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean o() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean p() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean q() {
        boolean z = false;
        if (!p()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.CODENAME.equals("REL")) {
            return true;
        }
        if (!(Build.VERSION.CODENAME.length() == 1 && Build.VERSION.CODENAME.charAt(0) >= 'R' && Build.VERSION.CODENAME.charAt(0) <= 'Z')) {
            return false;
        }
        Boolean bool = f2597a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if ("google".equals(Build.BRAND) && !Build.ID.startsWith("RPP1") && !Build.ID.startsWith("RPP2") && Integer.parseInt(Build.VERSION.INCREMENTAL) >= 6301457) {
                z = true;
            }
            f2597a = Boolean.valueOf(z);
        } catch (NumberFormatException unused) {
            f2597a = Boolean.TRUE;
        }
        if (!f2597a.booleanValue()) {
            Log.w("PlatformVersion", "Build version must be at least 6301457 to support R in gmscore");
        }
        return f2597a.booleanValue();
    }
}
