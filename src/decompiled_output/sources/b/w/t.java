package b.w;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
class t {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f1503a = true;

    /* renamed from: b, reason: collision with root package name */
    private static Field f1504b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f1505c;

    private t() {
    }

    static void a(@androidx.annotation.h0 ImageView imageView, @androidx.annotation.i0 Matrix matrix) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 29) {
            imageView.animateTransform(matrix);
            return;
        }
        if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null) {
                return;
            } else {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
            }
        } else {
            if (r0 >= 21) {
                c(imageView, matrix);
                return;
            }
            Drawable drawable2 = imageView.getDrawable();
            if (drawable2 == null) {
                return;
            }
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            Matrix matrix2 = null;
            b();
            Field field = f1504b;
            if (field != null) {
                try {
                    Matrix matrix3 = (Matrix) field.get(imageView);
                    if (matrix3 == null) {
                        try {
                            matrix2 = new Matrix();
                            f1504b.set(imageView, matrix2);
                        } catch (IllegalAccessException unused) {
                        }
                    } else {
                        matrix2 = matrix3;
                    }
                } catch (IllegalAccessException unused2) {
                }
            }
            if (matrix2 != null) {
                matrix2.set(matrix);
            }
        }
        imageView.invalidate();
    }

    private static void b() throws NoSuchFieldException {
        if (f1505c) {
            return;
        }
        try {
            Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
            f1504b = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f1505c = true;
    }

    @androidx.annotation.m0(21)
    @SuppressLint({"NewApi"})
    private static void c(@androidx.annotation.h0 ImageView imageView, @androidx.annotation.i0 Matrix matrix) {
        if (f1503a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f1503a = false;
            }
        }
    }
}
