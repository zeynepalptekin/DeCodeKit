package b.w;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private static Method f1383a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f1384b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f1385c;

    private d() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    static void a(@androidx.annotation.h0 Canvas canvas, boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 21) {
            return;
        }
        if (r0 >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (r0 == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!f1385c) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f1383a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                f1384b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f1385c = true;
        }
        if (z) {
            try {
                if (f1383a != null) {
                    f1383a.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        if (z || f1384b == null) {
            return;
        }
        f1384b.invoke(canvas, new Object[0]);
    }
}
