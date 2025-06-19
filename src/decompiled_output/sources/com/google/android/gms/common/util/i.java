package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import javax.annotation.concurrent.GuardedBy;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f2579a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.i0
    private static DropBoxManager f2580b = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f2581c = false;
    private static int d = -1;

    @GuardedBy("CrashUtils.class")
    private static int e;

    @GuardedBy("CrashUtils.class")
    private static int f;

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean a(@RecentlyNonNull Context context, @RecentlyNonNull Throwable th) {
        return b(context, th, 536870912);
    }

    private static boolean b(Context context, Throwable th, int r3) {
        try {
            com.google.android.gms.common.internal.r.k(context);
            com.google.android.gms.common.internal.r.k(th);
            return false;
        } catch (Exception e2) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e2);
            return false;
        }
    }
}
