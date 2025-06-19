package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class e72 {
    public static boolean a() throws ClassNotFoundException {
        try {
            Class.forName("android.app.Application", false, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
