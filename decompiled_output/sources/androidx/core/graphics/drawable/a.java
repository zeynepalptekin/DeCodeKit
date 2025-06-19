package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f388a = "DrawableCompat";

    /* renamed from: b, reason: collision with root package name */
    private static Method f389b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f390c;
    private static Method d;
    private static boolean e;

    private a() {
    }

    public static void a(@h0 Drawable drawable, @h0 Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    public static boolean b(@h0 Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(@h0 Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable drawableB;
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 23 || r0 < 21) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            drawableB = ((InsetDrawable) drawable).getDrawable();
        } else {
            if (!(drawable instanceof f)) {
                if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
                    return;
                }
                int childCount = drawableContainerState.getChildCount();
                for (int r02 = 0; r02 < childCount; r02++) {
                    Drawable child = drawableContainerState.getChild(r02);
                    if (child != null) {
                        c(child);
                    }
                }
                return;
            }
            drawableB = ((f) drawable).b();
        }
        c(drawableB);
    }

    public static int d(@h0 Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    public static ColorFilter e(@h0 Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    public static int f(@h0 Drawable drawable) throws NoSuchMethodException, SecurityException {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 23) {
            return drawable.getLayoutDirection();
        }
        if (r0 >= 17) {
            if (!e) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    d = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i(f388a, "Failed to retrieve getLayoutDirection() method", e2);
                }
                e = true;
            }
            Method method = d;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e3) {
                    Log.i(f388a, "Failed to invoke getLayoutDirection() via reflection", e3);
                    d = null;
                }
            }
        }
        return 0;
    }

    public static void g(@h0 Drawable drawable, @h0 Resources resources, @h0 XmlPullParser xmlPullParser, @h0 AttributeSet attributeSet, @i0 Resources.Theme theme) throws XmlPullParserException, IOException {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    public static boolean h(@h0 Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    @Deprecated
    public static void i(@h0 Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void j(@h0 Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    public static void k(@h0 Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    public static void l(@h0 Drawable drawable, int r3, int r4, int r5, int r6) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(r3, r4, r5, r6);
        }
    }

    public static boolean m(@h0 Drawable drawable, int r8) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 23) {
            return drawable.setLayoutDirection(r8);
        }
        if (r0 >= 17) {
            if (!f390c) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                    f389b = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i(f388a, "Failed to retrieve setLayoutDirection(int) method", e2);
                }
                f390c = true;
            }
            Method method = f389b;
            if (method != null) {
                try {
                    method.invoke(drawable, Integer.valueOf(r8));
                    return true;
                } catch (Exception e3) {
                    Log.i(f388a, "Failed to invoke setLayoutDirection(int) via reflection", e3);
                    f389b = null;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void n(@h0 Drawable drawable, @k int r3) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(r3);
        } else if (drawable instanceof e) {
            ((e) drawable).setTint(r3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void o(@h0 Drawable drawable, @i0 ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof e) {
            ((e) drawable).setTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void p(@h0 Drawable drawable, @h0 PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof e) {
            ((e) drawable).setTintMode(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T q(@h0 Drawable drawable) {
        return drawable instanceof f ? (T) ((f) drawable).b() : drawable;
    }

    public static Drawable r(@h0 Drawable drawable) {
        int r0 = Build.VERSION.SDK_INT;
        return r0 >= 23 ? drawable : r0 >= 21 ? !(drawable instanceof e) ? new h(drawable) : drawable : !(drawable instanceof e) ? new g(drawable) : drawable;
    }
}
