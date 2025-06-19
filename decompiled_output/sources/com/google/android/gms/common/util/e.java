package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class e {
    private e() {
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static int a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        PackageInfo packageInfoD = d(context, str);
        if (packageInfoD == null || (applicationInfo = packageInfoD.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean b() {
        return false;
    }

    @RecentlyNonNull
    public static boolean c(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        "com.google.android.gms".equals(str);
        return (c.a.b.b.d.s.c.a(context).c(str, 0).flags & 2097152) != 0;
    }

    @androidx.annotation.i0
    private static PackageInfo d(Context context, String str) {
        try {
            return c.a.b.b.d.s.c.a(context).e(str, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
