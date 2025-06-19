package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class we2 {
    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static <T> T b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static <T> void c(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
