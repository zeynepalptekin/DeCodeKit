package androidx.core.app;

import android.app.ActivityManager;
import android.os.Build;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public final class b {
    private b() {
    }

    public static boolean a(@h0 ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return false;
    }
}
