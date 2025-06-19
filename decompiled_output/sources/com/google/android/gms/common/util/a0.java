package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RecentlyNonNull;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class a0 {
    private a0() {
    }

    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static void a(@RecentlyNonNull Context context, @RecentlyNonNull SharedPreferences.Editor editor, @RecentlyNonNull String str) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
