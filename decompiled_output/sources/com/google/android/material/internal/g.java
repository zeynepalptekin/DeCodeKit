package com.google.android.material.internal;

import android.os.Build;
import androidx.annotation.p0;
import java.util.Locale;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6730a = "lge";

    /* renamed from: b, reason: collision with root package name */
    private static final String f6731b = "samsung";

    /* renamed from: c, reason: collision with root package name */
    private static final String f6732c = "meizu";

    private g() {
    }

    public static boolean a() {
        return b() || d();
    }

    public static boolean b() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f6730a);
    }

    public static boolean c() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f6732c);
    }

    public static boolean d() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f6731b);
    }
}
