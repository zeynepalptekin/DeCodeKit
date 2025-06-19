package b.w;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class y extends w {

    /* renamed from: a, reason: collision with root package name */
    private Path f1518a;

    /* renamed from: b, reason: collision with root package name */
    private final Path f1519b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f1520c = new Matrix();

    public y() {
        this.f1519b.lineTo(1.0f, 0.0f);
        this.f1518a = this.f1519b;
    }

    @SuppressLint({"RestrictedApi"})
    public y(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.k);
        try {
            String strM = b.i.c.j.h.m(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (strM == null) {
                throw new RuntimeException("pathData must be supplied for patternPathMotion");
            }
            d(b.i.e.h.e(strM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public y(Path path) {
        d(path);
    }

    private static float b(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    @Override // b.w.w
    public Path a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float fB = b(f5, f6);
        double dAtan2 = Math.atan2(f6, f5);
        this.f1520c.setScale(fB, fB);
        this.f1520c.postRotate((float) Math.toDegrees(dAtan2));
        this.f1520c.postTranslate(f, f2);
        Path path = new Path();
        this.f1519b.transform(this.f1520c, path);
        return path;
    }

    public Path c() {
        return this.f1518a;
    }

    public void d(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f1520c.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fB = 1.0f / b(f5, f6);
        this.f1520c.postScale(fB, fB);
        this.f1520c.postRotate((float) Math.toDegrees(-Math.atan2(f6, f5)));
        path.transform(this.f1520c, this.f1519b);
        this.f1518a = path;
    }
}
