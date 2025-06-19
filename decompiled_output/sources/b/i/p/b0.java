package b.i.p;

import android.os.Build;
import android.view.ScaleGestureDetector;

/* loaded from: classes.dex */
public final class b0 {
    private b0() {
    }

    public static boolean a(ScaleGestureDetector scaleGestureDetector) {
        if (Build.VERSION.SDK_INT >= 19) {
            return scaleGestureDetector.isQuickScaleEnabled();
        }
        return false;
    }

    @Deprecated
    public static boolean b(Object obj) {
        return a((ScaleGestureDetector) obj);
    }

    public static void c(ScaleGestureDetector scaleGestureDetector, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            scaleGestureDetector.setQuickScaleEnabled(z);
        }
    }

    @Deprecated
    public static void d(Object obj, boolean z) {
        c((ScaleGestureDetector) obj, z);
    }
}
