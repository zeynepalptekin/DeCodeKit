package b.x.c.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.annotation.p0;
import org.xmlpull.v1.XmlPullParser;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class g implements Interpolator {

    /* renamed from: c, reason: collision with root package name */
    private static final float f1539c = 0.002f;
    public static final int d = 3000;
    public static final double e = 1.0E-5d;

    /* renamed from: a, reason: collision with root package name */
    private float[] f1540a;

    /* renamed from: b, reason: collision with root package name */
    private float[] f1541b;

    public g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayS = b.i.c.j.h.s(resources, theme, attributeSet, a.r0);
        d(typedArrayS, xmlPullParser);
        typedArrayS.recycle();
    }

    private void a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        b(path);
    }

    private void b(Path path) {
        int r1 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int r2 = Math.min(d, ((int) (length / f1539c)) + 1);
        if (r2 <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f1540a = new float[r2];
        this.f1541b = new float[r2];
        float[] fArr = new float[2];
        for (int r5 = 0; r5 < r2; r5++) {
            pathMeasure.getPosTan((r5 * length) / (r2 - 1), fArr, null);
            this.f1540a[r5] = fArr[0];
            this.f1541b[r5] = fArr[1];
        }
        if (Math.abs(this.f1540a[0]) <= 1.0E-5d && Math.abs(this.f1541b[0]) <= 1.0E-5d) {
            int r4 = r2 - 1;
            if (Math.abs(this.f1540a[r4] - 1.0f) <= 1.0E-5d && Math.abs(this.f1541b[r4] - 1.0f) <= 1.0E-5d) {
                float f = 0.0f;
                int r3 = 0;
                while (r1 < r2) {
                    float[] fArr2 = this.f1540a;
                    int r52 = r3 + 1;
                    float f2 = fArr2[r3];
                    if (f2 < f) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                    }
                    fArr2[r1] = f2;
                    r1++;
                    f = f2;
                    r3 = r52;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f1540a[0]);
        sb.append(",");
        sb.append(this.f1541b[0]);
        sb.append(" end:");
        int r22 = r2 - 1;
        sb.append(this.f1540a[r22]);
        sb.append(",");
        sb.append(this.f1541b[r22]);
        throw new IllegalArgumentException(sb.toString());
    }

    private void c(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        b(path);
    }

    private void d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (b.i.c.j.h.r(xmlPullParser, "pathData")) {
            String strM = b.i.c.j.h.m(typedArray, xmlPullParser, "pathData", 4);
            Path pathE = b.i.e.h.e(strM);
            if (pathE != null) {
                b(pathE);
                return;
            }
            throw new InflateException("The path is null, which is created from " + strM);
        }
        if (!b.i.c.j.h.r(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (!b.i.c.j.h.r(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float fJ = b.i.c.j.h.j(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
        float fJ2 = b.i.c.j.h.j(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
        boolean zR = b.i.c.j.h.r(xmlPullParser, "controlX2");
        if (zR != b.i.c.j.h.r(xmlPullParser, "controlY2")) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (zR) {
            a(fJ, fJ2, b.i.c.j.h.j(typedArray, xmlPullParser, "controlX2", 2, 0.0f), b.i.c.j.h.j(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        } else {
            c(fJ, fJ2);
        }
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
        int length = this.f1540a.length - 1;
        while (length - r1 > 1) {
            int r4 = (r1 + length) / 2;
            if (f < this.f1540a[r4]) {
                length = r4;
            } else {
                r1 = r4;
            }
        }
        float[] fArr = this.f1540a;
        float f2 = fArr[length] - fArr[r1];
        if (f2 == 0.0f) {
            return this.f1541b[r1];
        }
        float f3 = (f - fArr[r1]) / f2;
        float[] fArr2 = this.f1541b;
        float f4 = fArr2[r1];
        return f4 + (f3 * (fArr2[length] - f4));
    }
}
