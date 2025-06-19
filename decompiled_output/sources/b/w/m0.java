package b.w;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: classes.dex */
class m0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f1477a = 1048576;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f1478b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f1479c;
    private static final boolean d;

    static class a implements TypeEvaluator<Matrix> {

        /* renamed from: a, reason: collision with root package name */
        final float[] f1480a = new float[9];

        /* renamed from: b, reason: collision with root package name */
        final float[] f1481b = new float[9];

        /* renamed from: c, reason: collision with root package name */
        final Matrix f1482c = new Matrix();

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f1480a);
            matrix2.getValues(this.f1481b);
            for (int r5 = 0; r5 < 9; r5++) {
                float[] fArr = this.f1481b;
                float f2 = fArr[r5];
                float[] fArr2 = this.f1480a;
                fArr[r5] = fArr2[r5] + ((f2 - fArr2[r5]) * f);
            }
            this.f1482c.setValues(this.f1481b);
            return this.f1482c;
        }
    }

    static {
        f1478b = Build.VERSION.SDK_INT >= 19;
        f1479c = Build.VERSION.SDK_INT >= 18;
        d = Build.VERSION.SDK_INT >= 28;
    }

    private m0() {
    }

    static View a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        y0.j(view, matrix);
        y0.k(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int r1 = Math.round(rectF.left);
        int r2 = Math.round(rectF.top);
        int r3 = Math.round(rectF.right);
        int r4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap bitmapB = b(view, matrix, rectF, viewGroup);
        if (bitmapB != null) {
            imageView.setImageBitmap(bitmapB);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(r3 - r1, 1073741824), View.MeasureSpec.makeMeasureSpec(r4 - r2, 1073741824));
        imageView.layout(r1, r2, r3, r4);
        return imageView;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap b(android.view.View r8, android.graphics.Matrix r9, android.graphics.RectF r10, android.view.ViewGroup r11) {
        /*
            boolean r0 = b.w.m0.f1478b
            r1 = 0
            if (r0 == 0) goto L13
            boolean r0 = r8.isAttachedToWindow()
            r0 = r0 ^ 1
            if (r11 != 0) goto Le
            goto L14
        Le:
            boolean r2 = r11.isAttachedToWindow()
            goto L15
        L13:
            r0 = 0
        L14:
            r2 = 0
        L15:
            boolean r3 = b.w.m0.f1479c
            r4 = 0
            if (r3 == 0) goto L31
            if (r0 == 0) goto L31
            if (r2 != 0) goto L1f
            return r4
        L1f:
            android.view.ViewParent r1 = r8.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.indexOfChild(r8)
            android.view.ViewGroupOverlay r3 = r11.getOverlay()
            r3.add(r8)
            goto L33
        L31:
            r1 = r4
            r2 = 0
        L33:
            float r3 = r10.width()
            int r3 = java.lang.Math.round(r3)
            float r5 = r10.height()
            int r5 = java.lang.Math.round(r5)
            if (r3 <= 0) goto L99
            if (r5 <= 0) goto L99
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = 1233125376(0x49800000, float:1048576.0)
            int r7 = r3 * r5
            float r7 = (float) r7
            float r6 = r6 / r7
            float r4 = java.lang.Math.min(r4, r6)
            float r3 = (float) r3
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            float r5 = (float) r5
            float r5 = r5 * r4
            int r5 = java.lang.Math.round(r5)
            float r6 = r10.left
            float r6 = -r6
            float r10 = r10.top
            float r10 = -r10
            r9.postTranslate(r6, r10)
            r9.postScale(r4, r4)
            boolean r10 = b.w.m0.d
            if (r10 == 0) goto L88
            android.graphics.Picture r10 = new android.graphics.Picture
            r10.<init>()
            android.graphics.Canvas r3 = r10.beginRecording(r3, r5)
            r3.concat(r9)
            r8.draw(r3)
            r10.endRecording()
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r10)
            goto L99
        L88:
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r3, r5, r10)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r4)
            r10.concat(r9)
            r8.draw(r10)
        L99:
            boolean r9 = b.w.m0.f1479c
            if (r9 == 0) goto La9
            if (r0 == 0) goto La9
            android.view.ViewGroupOverlay r9 = r11.getOverlay()
            r9.remove(r8)
            r1.addView(r8, r2)
        La9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.w.m0.b(android.view.View, android.graphics.Matrix, android.graphics.RectF, android.view.ViewGroup):android.graphics.Bitmap");
    }

    static Animator c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
