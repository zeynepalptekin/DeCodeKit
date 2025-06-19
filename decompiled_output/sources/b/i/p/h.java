package b.i.p;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1197a = 8388608;

    /* renamed from: b, reason: collision with root package name */
    public static final int f1198b = 8388611;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1199c = 8388613;
    public static final int d = 8388615;

    private h() {
    }

    public static void a(int r2, int r3, int r4, Rect rect, int r6, int r7, Rect rect2, int r9) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(r2, r3, r4, rect, r6, r7, rect2, r9);
        } else {
            Gravity.apply(r2, r3, r4, rect, r6, r7, rect2);
        }
    }

    public static void b(int r2, int r3, int r4, Rect rect, Rect rect2, int r7) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(r2, r3, r4, rect, rect2, r7);
        } else {
            Gravity.apply(r2, r3, r4, rect, rect2);
        }
    }

    public static void c(int r2, Rect rect, Rect rect2, int r5) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.applyDisplay(r2, rect, rect2, r5);
        } else {
            Gravity.applyDisplay(r2, rect, rect2);
        }
    }

    public static int d(int r2, int r3) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(r2, r3) : r2 & (-8388609);
    }
}
