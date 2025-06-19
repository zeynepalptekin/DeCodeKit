package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class c0 {
    private c0() {
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean a(@RecentlyNonNull Context context, @RecentlyNonNull int r4) throws PackageManager.NameNotFoundException {
        if (!b(context, r4, "com.google.android.gms")) {
            return false;
        }
        try {
            return c.a.b.b.d.j.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @RecentlyNonNull
    @TargetApi(19)
    @com.google.android.gms.common.annotation.a
    public static boolean b(@RecentlyNonNull Context context, @RecentlyNonNull int r1, @RecentlyNonNull String str) {
        return c.a.b.b.d.s.c.a(context).g(r1, str);
    }
}
