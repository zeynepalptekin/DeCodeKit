package b.i.p;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1195a = "ViewConfigCompat";

    /* renamed from: b, reason: collision with root package name */
    private static Method f1196b;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f1196b = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i(f1195a, "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    private g0() {
    }

    private static float a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f1196b) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i(f1195a, "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    public static float b(@androidx.annotation.h0 ViewConfiguration viewConfiguration, @androidx.annotation.h0 Context context) {
        return Build.VERSION.SDK_INT >= 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : a(viewConfiguration, context);
    }

    public static int c(ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
    }

    @Deprecated
    public static int d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    public static float e(@androidx.annotation.h0 ViewConfiguration viewConfiguration, @androidx.annotation.h0 Context context) {
        return Build.VERSION.SDK_INT >= 26 ? viewConfiguration.getScaledVerticalScrollFactor() : a(viewConfiguration, context);
    }

    @Deprecated
    public static boolean f(ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }

    public static boolean g(ViewConfiguration viewConfiguration, @androidx.annotation.h0 Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
