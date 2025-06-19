package b.i.c.j;

import android.content.res.Resources;
import android.os.Build;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public final class c {
    private c() {
    }

    public static int a(@h0 Resources resources) {
        return Build.VERSION.SDK_INT >= 17 ? resources.getConfiguration().densityDpi : resources.getDisplayMetrics().densityDpi;
    }
}
