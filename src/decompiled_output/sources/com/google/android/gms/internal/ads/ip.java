package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;

@TargetApi(24)
/* loaded from: classes.dex */
public class ip extends jp {
    @androidx.annotation.x0
    private static boolean v(int r0, int r1, int r2) {
        return Math.abs(r0 - r1) <= r2;
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final boolean h(Activity activity, Configuration configuration) {
        if (!((Boolean) qx2.e().c(e0.a3)).booleanValue()) {
            return false;
        }
        if (((Boolean) qx2.e().c(e0.c3)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        qx2.a();
        int r0 = jr.r(activity, configuration.screenHeightDp);
        int r11 = jr.r(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        com.google.android.gms.ads.internal.p.c();
        DisplayMetrics displayMetricsB = to.b(windowManager);
        int r3 = displayMetricsB.heightPixels;
        int r2 = displayMetricsB.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int r10 = ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((Integer) qx2.e().c(e0.Z2)).intValue();
        return !(v(r3, r0 + dimensionPixelSize, r10) && v(r2, r11, r10));
    }
}
