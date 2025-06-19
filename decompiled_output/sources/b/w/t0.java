package b.w;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class t0 {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f1506a = true;

    /* renamed from: b, reason: collision with root package name */
    private static Method f1507b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f1508c;

    private t0() {
    }

    static int a(@androidx.annotation.h0 ViewGroup viewGroup, int r8) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(r8);
        }
        if (!f1508c) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", Integer.TYPE, Integer.TYPE);
                f1507b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f1508c = true;
        }
        Method method = f1507b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(r8))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return r8;
    }

    static s0 b(@androidx.annotation.h0 ViewGroup viewGroup) {
        return Build.VERSION.SDK_INT >= 18 ? new r0(viewGroup) : q0.g(viewGroup);
    }

    @androidx.annotation.m0(18)
    @SuppressLint({"NewApi"})
    private static void c(@androidx.annotation.h0 ViewGroup viewGroup, boolean z) {
        if (f1506a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f1506a = false;
            }
        }
    }

    static void d(@androidx.annotation.h0 ViewGroup viewGroup, boolean z) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 29) {
            viewGroup.suppressLayout(z);
        } else if (r0 >= 18) {
            c(viewGroup, z);
        } else {
            u0.b(viewGroup, z);
        }
    }
}
