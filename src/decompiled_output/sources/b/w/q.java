package b.w;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@androidx.annotation.m0(21)
/* loaded from: classes.dex */
class q implements o {
    private static final String e = "GhostViewApi21";
    private static Class<?> f;
    private static boolean g;
    private static Method h;
    private static boolean i;
    private static Method j;
    private static boolean k;
    private final View d;

    private q(@androidx.annotation.h0 View view) {
        this.d = view;
    }

    static o b(View view, ViewGroup viewGroup, Matrix matrix) throws NoSuchMethodException, SecurityException {
        c();
        Method method = h;
        if (method != null) {
            try {
                return new q((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        return null;
    }

    private static void c() throws NoSuchMethodException, SecurityException {
        if (i) {
            return;
        }
        try {
            d();
            Method declaredMethod = f.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
            h = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e2) {
            Log.i(e, "Failed to retrieve addGhost method", e2);
        }
        i = true;
    }

    private static void d() {
        if (g) {
            return;
        }
        try {
            f = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException e2) {
            Log.i(e, "Failed to retrieve GhostView class", e2);
        }
        g = true;
    }

    private static void e() throws NoSuchMethodException, SecurityException {
        if (k) {
            return;
        }
        try {
            d();
            Method declaredMethod = f.getDeclaredMethod("removeGhost", View.class);
            j = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e2) {
            Log.i(e, "Failed to retrieve removeGhost method", e2);
        }
        k = true;
    }

    static void f(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e();
        Method method = j;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    @Override // b.w.o
    public void a(ViewGroup viewGroup, View view) {
    }

    @Override // b.w.o
    public void setVisibility(int r2) {
        this.d.setVisibility(r2);
    }
}
