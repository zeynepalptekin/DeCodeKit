package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    private static Object f2544a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("sLock")
    private static boolean f2545b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.i0
    private static String f2546c;
    private static int d;

    @androidx.annotation.i0
    public static String a(Context context) {
        c(context);
        return f2546c;
    }

    public static int b(Context context) {
        c(context);
        return d;
    }

    private static void c(Context context) {
        Bundle bundle;
        synchronized (f2544a) {
            if (f2545b) {
                return;
            }
            f2545b = true;
            try {
                bundle = c.a.b.b.d.s.c.a(context).c(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
            if (bundle == null) {
                return;
            }
            f2546c = bundle.getString("com.google.app.id");
            d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
