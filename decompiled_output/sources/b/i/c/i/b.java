package b.i.c.i;

import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public final class b {
    private b() {
    }

    public static long a(@h0 PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }
}
