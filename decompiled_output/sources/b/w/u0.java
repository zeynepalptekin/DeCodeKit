package b.w;

import android.animation.LayoutTransition;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class u0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1510a = "ViewGroupUtilsApi14";

    /* renamed from: b, reason: collision with root package name */
    private static final int f1511b = 4;

    /* renamed from: c, reason: collision with root package name */
    private static LayoutTransition f1512c;
    private static Field d;
    private static boolean e;
    private static Method f;
    private static boolean g;

    static class a extends LayoutTransition {
        a() {
        }

        @Override // android.animation.LayoutTransition
        public boolean isChangingLayout() {
            return true;
        }
    }

    private u0() {
    }

    private static void a(LayoutTransition layoutTransition) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!g) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i(f1510a, "Failed to access cancel method by reflection");
            }
            g = true;
        }
        Method method = f;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i(f1510a, "Failed to access cancel method by reflection");
            } catch (InvocationTargetException unused3) {
                Log.i(f1510a, "Failed to invoke cancel method by reflection");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void b(@androidx.annotation.h0 android.view.ViewGroup r5, boolean r6) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            android.animation.LayoutTransition r0 = b.w.u0.f1512c
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L28
            b.w.u0$a r0 = new b.w.u0$a
            r0.<init>()
            b.w.u0.f1512c = r0
            r4 = 2
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = b.w.u0.f1512c
            r0.setAnimator(r2, r3)
            android.animation.LayoutTransition r0 = b.w.u0.f1512c
            r0.setAnimator(r1, r3)
            android.animation.LayoutTransition r0 = b.w.u0.f1512c
            r4 = 3
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = b.w.u0.f1512c
            r4 = 4
            r0.setAnimator(r4, r3)
        L28:
            if (r6 == 0) goto L48
            android.animation.LayoutTransition r6 = r5.getLayoutTransition()
            if (r6 == 0) goto L42
            boolean r0 = r6.isRunning()
            if (r0 == 0) goto L39
            a(r6)
        L39:
            android.animation.LayoutTransition r0 = b.w.u0.f1512c
            if (r6 == r0) goto L42
            int r0 = b.w.a0.e.transition_layout_save
            r5.setTag(r0, r6)
        L42:
            android.animation.LayoutTransition r6 = b.w.u0.f1512c
        L44:
            r5.setLayoutTransition(r6)
            goto L94
        L48:
            r5.setLayoutTransition(r3)
            boolean r6 = b.w.u0.e
            java.lang.String r0 = "ViewGroupUtilsApi14"
            if (r6 != 0) goto L66
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.String r4 = "mLayoutSuppressed"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L5f
            b.w.u0.d = r6     // Catch: java.lang.NoSuchFieldException -> L5f
            r6.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L5f
            goto L64
        L5f:
            java.lang.String r6 = "Failed to access mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L64:
            b.w.u0.e = r1
        L66:
            java.lang.reflect.Field r6 = b.w.u0.d
            if (r6 == 0) goto L7f
            boolean r6 = r6.getBoolean(r5)     // Catch: java.lang.IllegalAccessException -> L7a
            if (r6 == 0) goto L78
            java.lang.reflect.Field r1 = b.w.u0.d     // Catch: java.lang.IllegalAccessException -> L76
            r1.setBoolean(r5, r2)     // Catch: java.lang.IllegalAccessException -> L76
            goto L78
        L76:
            r2 = r6
            goto L7a
        L78:
            r2 = r6
            goto L7f
        L7a:
            java.lang.String r6 = "Failed to get mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L7f:
            if (r2 == 0) goto L84
            r5.requestLayout()
        L84:
            int r6 = b.w.a0.e.transition_layout_save
            java.lang.Object r6 = r5.getTag(r6)
            android.animation.LayoutTransition r6 = (android.animation.LayoutTransition) r6
            if (r6 == 0) goto L94
            int r0 = b.w.a0.e.transition_layout_save
            r5.setTag(r0, r3)
            goto L44
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.w.u0.b(android.view.ViewGroup, boolean):void");
    }
}
