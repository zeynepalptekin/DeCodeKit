package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;

@com.google.android.gms.common.annotation.a
@Deprecated
/* loaded from: classes.dex */
public class c {
    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static String a(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent) {
        return String.valueOf(System.identityHashCode(intent) | (System.identityHashCode(context) << 32));
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static String b(@RecentlyNonNull PowerManager.WakeLock wakeLock, @RecentlyNonNull String str) {
        String strValueOf = String.valueOf(String.valueOf((Process.myPid() << 32) | System.identityHashCode(wakeLock)));
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        String strValueOf2 = String.valueOf(str);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }
}
