package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.h0;
import b.i.p.f0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final String f406a = "PopupWindowCompatApi21";

    /* renamed from: b, reason: collision with root package name */
    private static Method f407b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f408c;
    private static Method d;
    private static boolean e;
    private static Field f;
    private static boolean g;

    private k() {
    }

    public static boolean a(@h0 PopupWindow popupWindow) throws NoSuchFieldException {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 23) {
            return popupWindow.getOverlapAnchor();
        }
        if (r0 < 21) {
            return false;
        }
        if (!g) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i(f406a, "Could not fetch mOverlapAnchor field from PopupWindow", e2);
            }
            g = true;
        }
        Field field = f;
        if (field == null) {
            return false;
        }
        try {
            return ((Boolean) field.get(popupWindow)).booleanValue();
        } catch (IllegalAccessException e3) {
            Log.i(f406a, "Could not get overlap anchor field in PopupWindow", e3);
            return false;
        }
    }

    public static int b(@h0 PopupWindow popupWindow) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT >= 23) {
            return popupWindow.getWindowLayoutType();
        }
        if (!e) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("getWindowLayoutType", new Class[0]);
                d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            e = true;
        }
        Method method = d;
        if (method != null) {
            try {
                return ((Integer) method.invoke(popupWindow, new Object[0])).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    public static void c(@h0 PopupWindow popupWindow, boolean z) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 23) {
            popupWindow.setOverlapAnchor(z);
            return;
        }
        if (r0 >= 21) {
            if (!g) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.i(f406a, "Could not fetch mOverlapAnchor field from PopupWindow", e2);
                }
                g = true;
            }
            Field field = f;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e3) {
                    Log.i(f406a, "Could not set overlap anchor field in PopupWindow", e3);
                }
            }
        }
    }

    public static void d(@h0 PopupWindow popupWindow, int r7) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(r7);
            return;
        }
        if (!f408c) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f407b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f408c = true;
        }
        Method method = f407b;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(r7));
            } catch (Exception unused2) {
            }
        }
    }

    public static void e(@h0 PopupWindow popupWindow, @h0 View view, int r4, int r5, int r6) {
        if (Build.VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, r4, r5, r6);
            return;
        }
        if ((b.i.p.h.d(r6, f0.W(view)) & 7) == 5) {
            r4 -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, r4, r5);
    }
}
