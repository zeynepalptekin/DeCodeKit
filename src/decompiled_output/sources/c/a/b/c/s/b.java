package c.a.b.c.s;

import android.R;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.p0;
import androidx.annotation.x0;
import b.i.e.e;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f1999a;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f2000b;

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f2001c;
    private static final int[] d;
    private static final int[] e;
    private static final int[] f;
    private static final int[] g;
    private static final int[] h;
    private static final int[] i;
    private static final int[] j;
    private static final int[] k;

    @x0
    static final String l;

    @x0
    static final String m = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";

    static {
        f1999a = Build.VERSION.SDK_INT >= 21;
        f2000b = new int[]{R.attr.state_pressed};
        f2001c = new int[]{R.attr.state_hovered, R.attr.state_focused};
        d = new int[]{R.attr.state_focused};
        e = new int[]{R.attr.state_hovered};
        f = new int[]{R.attr.state_selected, R.attr.state_pressed};
        g = new int[]{R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
        h = new int[]{R.attr.state_selected, R.attr.state_focused};
        i = new int[]{R.attr.state_selected, R.attr.state_hovered};
        j = new int[]{R.attr.state_selected};
        k = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        l = b.class.getSimpleName();
    }

    private b() {
    }

    @h0
    public static ColorStateList a(@i0 ColorStateList colorStateList) {
        if (f1999a) {
            return new ColorStateList(new int[][]{j, StateSet.NOTHING}, new int[]{c(colorStateList, f), c(colorStateList, f2000b)});
        }
        int[] r5 = f;
        int[] r52 = g;
        int[] r2 = h;
        int[] r22 = i;
        int[] r23 = f2000b;
        int[] r24 = f2001c;
        int[] r25 = d;
        int[] r26 = e;
        return new ColorStateList(new int[][]{r5, r52, r2, r22, j, r23, r24, r25, r26, StateSet.NOTHING}, new int[]{c(colorStateList, r5), c(colorStateList, r52), c(colorStateList, r2), c(colorStateList, r22), 0, c(colorStateList, r23), c(colorStateList, r24), c(colorStateList, r25), c(colorStateList, r26), 0});
    }

    @TargetApi(21)
    @k
    private static int b(@k int r2) {
        return e.B(r2, Math.min(Color.alpha(r2) * 2, 255));
    }

    @k
    private static int c(@i0 ColorStateList colorStateList, int[] r2) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(r2, colorStateList.getDefaultColor()) : 0;
        return f1999a ? b(colorForState) : colorForState;
    }

    @h0
    public static ColorStateList d(@i0 ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int r1 = Build.VERSION.SDK_INT;
        if (r1 >= 22 && r1 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(k, 0)) != 0) {
            Log.w(l, m);
        }
        return colorStateList;
    }

    public static boolean e(@h0 int[] r8) {
        boolean z = false;
        boolean z2 = false;
        for (int r6 : r8) {
            if (r6 == 16842910) {
                z = true;
            } else if (r6 == 16842908 || r6 == 16842919 || r6 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
