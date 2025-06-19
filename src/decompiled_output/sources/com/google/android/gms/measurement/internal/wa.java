package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public final class wa {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f6553a = false;

    wa(Context context) {
    }

    public static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
