package b.w;

import android.animation.TypeEvaluator;

/* loaded from: classes.dex */
class m implements TypeEvaluator<float[]> {

    /* renamed from: a, reason: collision with root package name */
    private float[] f1476a;

    m(float[] fArr) {
        this.f1476a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f1476a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int r1 = 0; r1 < fArr3.length; r1++) {
            float f2 = fArr[r1];
            fArr3[r1] = f2 + ((fArr2[r1] - f2) * f);
        }
        return fArr3;
    }
}
