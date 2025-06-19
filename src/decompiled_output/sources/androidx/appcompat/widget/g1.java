package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.annotation.p0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class g1 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f157a = "ViewUtils";

    /* renamed from: b, reason: collision with root package name */
    private static Method f158b;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f158b = declaredMethod;
                if (declaredMethod.isAccessible()) {
                    return;
                }
                f158b.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.d(f157a, "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    private g1() {
    }

    public static void a(View view, Rect rect, Rect rect2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f158b;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e) {
                Log.d(f157a, "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    public static boolean b(View view) {
        return b.i.p.f0.W(view) == 1;
    }

    public static void c(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (IllegalAccessException e) {
                e = e;
                Log.d(f157a, "Could not invoke makeOptionalFitsSystemWindows", e);
            } catch (NoSuchMethodException unused) {
                Log.d(f157a, "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (InvocationTargetException e2) {
                e = e2;
                Log.d(f157a, "Could not invoke makeOptionalFitsSystemWindows", e);
            }
        }
    }
}
