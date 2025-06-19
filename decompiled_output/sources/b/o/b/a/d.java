package b.o.b.a;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f1310a;

    /* renamed from: b, reason: collision with root package name */
    private final float f1311b;

    protected d(float[] fArr) {
        this.f1310a = fArr;
        this.f1311b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1310a;
        int r0 = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f1311b;
        float f3 = (f - (r0 * f2)) / f2;
        float[] fArr2 = this.f1310a;
        return fArr2[r0] + (f3 * (fArr2[r0 + 1] - fArr2[r0]));
    }
}
