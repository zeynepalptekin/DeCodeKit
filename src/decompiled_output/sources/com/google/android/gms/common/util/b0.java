package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.regex.Pattern;

@d0
@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f2568a = Pattern.compile("\\$\\{(.*?)\\}");

    private b0() {
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public static String a(@androidx.annotation.i0 String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean b(@androidx.annotation.i0 String str) {
        return str == null || str.trim().isEmpty();
    }
}
