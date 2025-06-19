package b.w;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import b.w.m0;
import java.util.Map;

/* loaded from: classes.dex */
public class g extends g0 {
    private static final String Z = "android:changeImageTransform:matrix";
    private static final String a0 = "android:changeImageTransform:bounds";
    private static final String[] b0 = {Z, a0};
    private static final TypeEvaluator<Matrix> c0 = new a();
    private static final Property<ImageView, Matrix> d0 = new b(Matrix.class, "animatedTransform");

    static class a implements TypeEvaluator<Matrix> {
        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    static class b extends Property<ImageView, Matrix> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ImageView imageView, Matrix matrix) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            t.a(imageView, matrix);
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1438a;

        static {
            int[] r0 = new int[ImageView.ScaleType.values().length];
            f1438a = r0;
            try {
                r0[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1438a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public g() {
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void L0(n0 n0Var) {
        View view = n0Var.f1494b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = n0Var.f1493a;
            map.put(a0, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put(Z, N0(imageView));
        }
    }

    private static Matrix M0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f2 = intrinsicHeight;
        float fMax = Math.max(width / f, height / f2);
        int r2 = Math.round((width - (f * fMax)) / 2.0f);
        int r5 = Math.round((height - (f2 * fMax)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(r2, r5);
        return matrix;
    }

    @androidx.annotation.h0
    private static Matrix N0(@androidx.annotation.h0 ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int r0 = c.f1438a[imageView.getScaleType().ordinal()];
            if (r0 == 1) {
                return Q0(imageView);
            }
            if (r0 == 2) {
                return M0(imageView);
            }
        }
        return new Matrix(imageView.getImageMatrix());
    }

    private ObjectAnimator O0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) d0, (TypeEvaluator) new m0.a(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    @androidx.annotation.h0
    private ObjectAnimator P0(@androidx.annotation.h0 ImageView imageView) {
        Property<ImageView, Matrix> property = d0;
        TypeEvaluator<Matrix> typeEvaluator = c0;
        Matrix matrix = u.f1509a;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    private static Matrix Q0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    @Override // b.w.g0
    public String[] e0() {
        return b0;
    }

    @Override // b.w.g0
    public void n(@androidx.annotation.h0 n0 n0Var) {
        L0(n0Var);
    }

    @Override // b.w.g0
    public void q(@androidx.annotation.h0 n0 n0Var) {
        L0(n0Var);
    }

    @Override // b.w.g0
    public Animator u(@androidx.annotation.h0 ViewGroup viewGroup, n0 n0Var, n0 n0Var2) {
        if (n0Var == null || n0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) n0Var.f1493a.get(a0);
        Rect rect2 = (Rect) n0Var2.f1493a.get(a0);
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) n0Var.f1493a.get(Z);
        Matrix matrix2 = (Matrix) n0Var2.f1493a.get(Z);
        boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) n0Var2.f1494b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return P0(imageView);
        }
        if (matrix == null) {
            matrix = u.f1509a;
        }
        if (matrix2 == null) {
            matrix2 = u.f1509a;
        }
        d0.set(imageView, matrix);
        return O0(imageView, matrix, matrix2);
    }
}
