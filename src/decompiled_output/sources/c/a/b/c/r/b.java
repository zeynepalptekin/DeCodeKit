package c.a.b.c.r;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k0;
import androidx.annotation.o;
import androidx.annotation.p0;
import c.a.b.c.a;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class b {
    @i0
    public static TypedValue a(@h0 Context context, @androidx.annotation.f int r3) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(r3, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(@h0 Context context, @androidx.annotation.f int r2, boolean z) {
        TypedValue typedValueA = a(context, r2);
        return (typedValueA == null || typedValueA.type != 18) ? z : typedValueA.data != 0;
    }

    public static boolean c(@h0 Context context, @androidx.annotation.f int r1, @h0 String str) {
        return f(context, r1, str) != 0;
    }

    @k0
    public static int d(@h0 Context context, @androidx.annotation.f int r3, @o int r4) {
        TypedValue typedValueA = a(context, r3);
        return (int) ((typedValueA == null || typedValueA.type != 5) ? context.getResources().getDimension(r4) : typedValueA.getDimension(context.getResources().getDisplayMetrics()));
    }

    @k0
    public static int e(@h0 Context context) {
        return d(context, a.c.minTouchTargetSize, a.f.mtrl_min_touch_target_size);
    }

    public static int f(@h0 Context context, @androidx.annotation.f int r4, @h0 String str) {
        TypedValue typedValueA = a(context, r4);
        if (typedValueA != null) {
            return typedValueA.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(r4)));
    }

    public static int g(@h0 View view, @androidx.annotation.f int r2) {
        return f(view.getContext(), r2, view.getClass().getCanonicalName());
    }
}
