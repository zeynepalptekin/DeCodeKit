package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import androidx.annotation.p0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

@SuppressLint({"RestrictedAPI"})
@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: c, reason: collision with root package name */
    private static final String f153c = "DrawableUtils";
    private static Class<?> e = null;
    private static final String f = "android.graphics.drawable.VectorDrawable";

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f151a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f152b = new int[0];
    public static final Rect d = new Rect();

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                e = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    private f0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(@androidx.annotation.h0 Drawable drawable) {
        Drawable drawable2;
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof androidx.core.graphics.drawable.f) {
                drawable2 = ((androidx.core.graphics.drawable.f) drawable).b();
            } else if (drawable instanceof b.a.c.a.c) {
                drawable2 = ((b.a.c.a.c) drawable).a();
            } else {
                if (!(drawable instanceof ScaleDrawable)) {
                    return true;
                }
                drawable2 = ((ScaleDrawable) drawable).getDrawable();
            }
            return a(drawable2);
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable3 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!a(drawable3)) {
                return false;
            }
        }
        return true;
    }

    static void b(@androidx.annotation.h0 Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && f.equals(drawable.getClass().getName())) {
            c(drawable);
        }
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f151a);
        } else {
            drawable.setState(f152b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Rect d(Drawable drawable) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (e != null) {
            try {
                Drawable drawableQ = androidx.core.graphics.drawable.a.q(drawable);
                Object objInvoke = drawableQ.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(drawableQ, new Object[0]);
                if (objInvoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : e.getFields()) {
                        String name = field.getName();
                        char c2 = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                        }
                        if (c2 == 0) {
                            rect2.left = field.getInt(objInvoke);
                        } else if (c2 == 1) {
                            rect2.top = field.getInt(objInvoke);
                        } else if (c2 == 2) {
                            rect2.right = field.getInt(objInvoke);
                        } else if (c2 == 3) {
                            rect2.bottom = field.getInt(objInvoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e(f153c, "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return d;
    }

    public static PorterDuff.Mode e(int r1, PorterDuff.Mode mode) {
        if (r1 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (r1 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (r1 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (r1) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
