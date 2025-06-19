package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class bv1 {
    public static void a(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @NonNullDecl
    public static <T> T b(@NonNullDecl T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    @NonNullDecl
    public static <T> T c(@NonNullDecl T t, @NullableDecl Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @NonNullDecl
    public static <T> T d(@NonNullDecl T t, @NullableDecl String str, @NullableDecl Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(dv1.c(str, obj));
    }

    private static String e(int r4, int r5, @NullableDecl String str) {
        if (r4 < 0) {
            return dv1.c("%s (%s) must not be negative", str, Integer.valueOf(r4));
        }
        if (r5 >= 0) {
            return dv1.c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(r4), Integer.valueOf(r5));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(r5);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void f(int r2, int r3, int r4) {
        if (r2 < 0 || r3 < r2 || r3 > r4) {
            throw new IndexOutOfBoundsException((r2 < 0 || r2 > r4) ? e(r2, r4, "start index") : (r3 < 0 || r3 > r4) ? e(r3, r4, "end index") : dv1.c("end index (%s) must not be less than start index (%s)", Integer.valueOf(r3), Integer.valueOf(r2)));
        }
    }

    public static int g(int r6, int r7) {
        String strC;
        if (r6 >= 0 && r6 < r7) {
            return r6;
        }
        if (r6 < 0) {
            strC = dv1.c("%s (%s) must not be negative", FirebaseAnalytics.b.c0, Integer.valueOf(r6));
        } else {
            if (r7 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(r7);
                throw new IllegalArgumentException(sb.toString());
            }
            strC = dv1.c("%s (%s) must be less than size (%s)", FirebaseAnalytics.b.c0, Integer.valueOf(r6), Integer.valueOf(r7));
        }
        throw new IndexOutOfBoundsException(strC);
    }

    public static int h(int r2, int r3) {
        if (r2 < 0 || r2 > r3) {
            throw new IndexOutOfBoundsException(e(r2, r3, FirebaseAnalytics.b.c0));
        }
        return r2;
    }
}
