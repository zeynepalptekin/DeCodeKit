package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.RecentlyNonNull;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.i0
    private static Boolean f2584a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.i0
    private static Boolean f2585b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.i0
    private static Boolean f2586c;

    @androidx.annotation.i0
    private static Boolean d;

    @androidx.annotation.i0
    private static Boolean e;

    @androidx.annotation.i0
    private static Boolean f;

    @androidx.annotation.i0
    private static Boolean g;

    @androidx.annotation.i0
    private static Boolean h;

    private l() {
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean a(@RecentlyNonNull Context context) {
        return b(context.getPackageManager());
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean b(@RecentlyNonNull PackageManager packageManager) {
        if (g == null) {
            g = Boolean.valueOf(v.n() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        return g.booleanValue();
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static boolean c(@RecentlyNonNull Context context) {
        return false;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean d(@RecentlyNonNull Context context) {
        if (e == null) {
            PackageManager packageManager = context.getPackageManager();
            e = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services"));
        }
        return e.booleanValue();
    }

    @RecentlyNonNull
    @TargetApi(21)
    @com.google.android.gms.common.annotation.a
    public static boolean e(@RecentlyNonNull Context context) {
        return n(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    @androidx.annotation.RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f(@androidx.annotation.RecentlyNonNull android.content.res.Resources r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.Boolean r1 = com.google.android.gms.common.util.l.f2584a
            if (r1 != 0) goto L45
            android.content.res.Configuration r1 = r4.getConfiguration()
            int r1 = r1.screenLayout
            r1 = r1 & 15
            r2 = 3
            r3 = 1
            if (r1 <= r2) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 != 0) goto L3e
            java.lang.Boolean r1 = com.google.android.gms.common.util.l.f2585b
            if (r1 != 0) goto L36
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r1 = r4.screenLayout
            r1 = r1 & 15
            if (r1 > r2) goto L2f
            int r4 = r4.smallestScreenWidthDp
            r1 = 600(0x258, float:8.41E-43)
            if (r4 < r1) goto L2f
            r4 = 1
            goto L30
        L2f:
            r4 = 0
        L30:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            com.google.android.gms.common.util.l.f2585b = r4
        L36:
            java.lang.Boolean r4 = com.google.android.gms.common.util.l.f2585b
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L3f
        L3e:
            r0 = 1
        L3f:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            com.google.android.gms.common.util.l.f2584a = r4
        L45:
            java.lang.Boolean r4 = com.google.android.gms.common.util.l.f2584a
            boolean r4 = r4.booleanValue()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.l.f(android.content.res.Resources):boolean");
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean g(@RecentlyNonNull Context context) {
        return h(context.getPackageManager());
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean h(@RecentlyNonNull PackageManager packageManager) {
        if (h == null) {
            h = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback"));
        }
        return h.booleanValue();
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean i() {
        return "user".equals(Build.TYPE);
    }

    @RecentlyNonNull
    @TargetApi(20)
    @com.google.android.gms.common.annotation.a
    public static boolean j(@RecentlyNonNull Context context) {
        return k(context.getPackageManager());
    }

    @RecentlyNonNull
    @TargetApi(20)
    @com.google.android.gms.common.annotation.a
    public static boolean k(@RecentlyNonNull PackageManager packageManager) {
        if (f2586c == null) {
            f2586c = Boolean.valueOf(v.i() && packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f2586c.booleanValue();
    }

    @RecentlyNonNull
    @TargetApi(26)
    @com.google.android.gms.common.annotation.a
    public static boolean l(@RecentlyNonNull Context context) {
        if (!j(context)) {
            return false;
        }
        if (v.m()) {
            return n(context) && !v.n();
        }
        return true;
    }

    @RecentlyNonNull
    public static boolean m(@RecentlyNonNull Context context) {
        if (f == null) {
            f = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f.booleanValue();
    }

    @TargetApi(21)
    private static boolean n(Context context) {
        if (d == null) {
            d = Boolean.valueOf(v.j() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return d.booleanValue();
    }
}
