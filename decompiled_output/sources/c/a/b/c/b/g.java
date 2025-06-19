package c.a.b.c.b;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f1943a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f1944b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f1945c = new Matrix();

    @Override // android.animation.TypeEvaluator
    @h0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix evaluate(float f, @h0 Matrix matrix, @h0 Matrix matrix2) {
        matrix.getValues(this.f1943a);
        matrix2.getValues(this.f1944b);
        for (int r5 = 0; r5 < 9; r5++) {
            float[] fArr = this.f1944b;
            float f2 = fArr[r5];
            float[] fArr2 = this.f1943a;
            fArr[r5] = fArr2[r5] + ((f2 - fArr2[r5]) * f);
        }
        this.f1945c.setValues(this.f1944b);
        return this.f1945c;
    }
}
