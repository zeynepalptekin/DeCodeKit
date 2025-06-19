package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
public final class oo extends tr {
    public static void l(String str, Throwable th) {
        if (n()) {
            Log.v(c.a.a.a.f1583b, str, th);
        }
    }

    public static void m(String str) {
        if (n()) {
            Log.v(c.a.a.a.f1583b, str);
        }
    }

    public static boolean n() {
        return tr.a(2) && z1.f6208a.a().booleanValue();
    }
}
