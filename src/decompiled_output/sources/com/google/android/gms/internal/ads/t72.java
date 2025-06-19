package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class t72 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f5356a = c("libcore.io.Memory");

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f5357b;

    static {
        f5357b = c("org.robolectric.Robolectric") != null;
    }

    static boolean a() {
        return (f5356a == null || f5357b) ? false : true;
    }

    static Class<?> b() {
        return f5356a;
    }

    private static <T> Class<T> c(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
