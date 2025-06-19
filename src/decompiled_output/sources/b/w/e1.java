package b.w;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import b.w.a0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class e1 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f1401b = "ViewUtilsBase";

    /* renamed from: c, reason: collision with root package name */
    private static Method f1402c = null;
    private static boolean d = false;
    private static Field e = null;
    private static boolean f = false;
    private static final int g = 12;

    /* renamed from: a, reason: collision with root package name */
    private float[] f1403a;

    e1() {
    }

    @SuppressLint({"PrivateApi"})
    private void b() throws NoSuchMethodException, SecurityException {
        if (d) {
            return;
        }
        try {
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            f1402c = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e2) {
            Log.i(f1401b, "Failed to retrieve setFrame method", e2);
        }
        d = true;
    }

    public void a(@androidx.annotation.h0 View view) {
        if (view.getVisibility() == 0) {
            view.setTag(a0.e.save_non_transition_alpha, null);
        }
    }

    public float c(@androidx.annotation.h0 View view) {
        Float f2 = (Float) view.getTag(a0.e.save_non_transition_alpha);
        float alpha = view.getAlpha();
        return f2 != null ? alpha / f2.floatValue() : alpha;
    }

    public void d(@androidx.annotation.h0 View view) {
        if (view.getTag(a0.e.save_non_transition_alpha) == null) {
            view.setTag(a0.e.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    public void e(@androidx.annotation.h0 View view, @androidx.annotation.i0 Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX(view.getWidth() / 2);
            view.setPivotY(view.getHeight() / 2);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f1403a;
        if (fArr == null) {
            fArr = new float[9];
            this.f1403a = fArr;
        }
        matrix.getValues(fArr);
        float f2 = fArr[3];
        float fSqrt = ((float) Math.sqrt(1.0f - (f2 * f2))) * (fArr[0] < 0.0f ? -1 : 1);
        float degrees = (float) Math.toDegrees(Math.atan2(f2, fSqrt));
        float f3 = fArr[0] / fSqrt;
        float f4 = fArr[4] / fSqrt;
        float f5 = fArr[2];
        float f6 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        view.setRotation(degrees);
        view.setScaleX(f3);
        view.setScaleY(f4);
    }

    public void f(@androidx.annotation.h0 View view, int r5, int r6, int r7, int r8) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b();
        Method method = f1402c;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(r5), Integer.valueOf(r6), Integer.valueOf(r7), Integer.valueOf(r8));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    public void g(@androidx.annotation.h0 View view, float f2) {
        Float f3 = (Float) view.getTag(a0.e.save_non_transition_alpha);
        if (f3 != null) {
            view.setAlpha(f3.floatValue() * f2);
        } else {
            view.setAlpha(f2);
        }
    }

    public void h(@androidx.annotation.h0 View view, int r5) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (!f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i(f1401b, "fetchViewFlagsField: ");
            }
            f = true;
        }
        Field field = e;
        if (field != null) {
            try {
                e.setInt(view, r5 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void i(@androidx.annotation.h0 View view, @androidx.annotation.h0 Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            i((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    public void j(@androidx.annotation.h0 View view, @androidx.annotation.h0 Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            j((View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}
