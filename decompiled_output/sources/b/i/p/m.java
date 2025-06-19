package b.i.p;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class m {
    private m() {
    }

    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int layoutDirection = Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getLayoutDirection() : 0;
        if (layoutDirection == 0 || layoutDirection == 1) {
            return layoutDirection;
        }
        return 0;
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginEnd() : marginLayoutParams.rightMargin;
    }

    public static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin;
    }

    public static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.isMarginRelative();
        }
        return false;
    }

    public static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int r3) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.resolveLayoutDirection(r3);
        }
    }

    public static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int r3) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setLayoutDirection(r3);
        }
    }

    public static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int r3) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginEnd(r3);
        } else {
            marginLayoutParams.rightMargin = r3;
        }
    }

    public static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int r3) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginStart(r3);
        } else {
            marginLayoutParams.leftMargin = r3;
        }
    }
}
