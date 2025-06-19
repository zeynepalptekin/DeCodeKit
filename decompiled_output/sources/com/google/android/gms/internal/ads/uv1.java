package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class uv1 {
    static Object a(Object obj, int r3) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(r3);
        throw new NullPointerException(sb.toString());
    }
}
