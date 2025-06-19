package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final class aw0 {
    @androidx.annotation.i0
    public static PackageInfo a(Context context, ApplicationInfo applicationInfo) {
        try {
            return c.a.b.b.d.s.c.a(context).e(applicationInfo.packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
