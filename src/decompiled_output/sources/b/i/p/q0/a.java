package b.i.p.q0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
class a implements Interpolator {

    /* renamed from: c, reason: collision with root package name */
    private static final float f1272c = 0.002f;

    /* renamed from: a, reason: collision with root package name */
    private final float[] f1273a;

    /* renamed from: b, reason: collision with root package name */
    private final float[] f1274b;

    a(float f, float f2) {
        this(b(f, f2));
    }

    a(float f, float f2, float f3, float f4) {
        this(a(f, f2, f3, f4));
    }

    a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int r2 = ((int) (length / f1272c)) + 1;
        this.f1273a = new float[r2];
        this.f1274b = new float[r2];
        float[] fArr = new float[2];
        for (int r5 = 0; r5 < r2; r5++) {
            pathMeasure.getPosTan((r5 * length) / (r2 - 1), fArr, null);
            this.f1273a[r5] = fArr[0];
            this.f1274b[r5] = fArr[1];
        }
    }

    private static Path a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }

    private static Path b(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int r1 = 0;
        int length = this.f1273a.length - 1;
        while (length - r1 > 1) {
            int r4 = (r1 + length) / 2;
            if (f < this.f1273a[r4]) {
                length = r4;
            } else {
                r1 = r4;
            }
        }
        float[] fArr = this.f1273a;
        float f2 = fArr[length] - fArr[r1];
        if (f2 == 0.0f) {
            return this.f1274b[r1];
        }
        float f3 = (f - fArr[r1]) / f2;
        float[] fArr2 = this.f1274b;
        float f4 = fArr2[r1];
        return f4 + (f3 * (fArr2[length] - f4));
    }
}
