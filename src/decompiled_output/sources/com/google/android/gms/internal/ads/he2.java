package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class he2 {
    public static he2 b(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new ae2(cls.getSimpleName()) : new ce2(cls.getSimpleName());
    }

    public abstract void a(String str);
}
