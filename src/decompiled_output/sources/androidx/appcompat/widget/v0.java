package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.p0;
import b.a.a;

@androidx.annotation.p0({p0.a.LIBRARY})
/* loaded from: classes.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f198a = "ThemeUtils";

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f199b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    static final int[] f200c = {-16842910};
    static final int[] d = {R.attr.state_focused};
    static final int[] e = {R.attr.state_activated};
    static final int[] f = {R.attr.state_pressed};
    static final int[] g = {R.attr.state_checked};
    static final int[] h = {R.attr.state_selected};
    static final int[] i = {-16842919, -16842908};
    static final int[] j = new int[0];
    private static final int[] k = new int[1];

    private v0() {
    }

    public static void a(@androidx.annotation.h0 View view, @androidx.annotation.h0 Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(a.m.AppCompatTheme);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(a.m.AppCompatTheme_windowActionBar)) {
                Log.e(f198a, "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @androidx.annotation.h0
    public static ColorStateList b(int r4, int r5) {
        return new ColorStateList(new int[][]{f200c, j}, new int[]{r5, r4});
    }

    public static int c(@androidx.annotation.h0 Context context, int r5) {
        ColorStateList colorStateListF = f(context, r5);
        if (colorStateListF != null && colorStateListF.isStateful()) {
            return colorStateListF.getColorForState(f200c, colorStateListF.getDefaultColor());
        }
        TypedValue typedValueG = g();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueG, true);
        return e(context, r5, typedValueG.getFloat());
    }

    public static int d(@androidx.annotation.h0 Context context, int r3) {
        int[] r0 = k;
        r0[0] = r3;
        a1 a1VarF = a1.F(context, null, r0);
        try {
            return a1VarF.c(0, 0);
        } finally {
            a1VarF.I();
        }
    }

    static int e(@androidx.annotation.h0 Context context, int r1, float f2) {
        return b.i.e.e.B(d(context, r1), Math.round(Color.alpha(r0) * f2));
    }

    @androidx.annotation.i0
    public static ColorStateList f(@androidx.annotation.h0 Context context, int r3) {
        int[] r0 = k;
        r0[0] = r3;
        a1 a1VarF = a1.F(context, null, r0);
        try {
            return a1VarF.d(0);
        } finally {
            a1VarF.I();
        }
    }

    private static TypedValue g() {
        TypedValue typedValue = f199b.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f199b.set(typedValue2);
        return typedValue2;
    }
}
