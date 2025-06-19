package b.w;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class b extends w {
    private static final float g = 0.0f;
    private static final float h = 70.0f;
    private static final float i = (float) Math.tan(Math.toRadians(35.0d));

    /* renamed from: a, reason: collision with root package name */
    private float f1376a;

    /* renamed from: b, reason: collision with root package name */
    private float f1377b;

    /* renamed from: c, reason: collision with root package name */
    private float f1378c;
    private float d;
    private float e;
    private float f;

    public b() {
        this.f1376a = 0.0f;
        this.f1377b = 0.0f;
        this.f1378c = h;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = i;
    }

    @SuppressLint({"RestrictedApi"})
    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1376a = 0.0f;
        this.f1377b = 0.0f;
        this.f1378c = h;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        g(b.i.c.j.h.j(typedArrayObtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        f(b.i.c.j.h.j(typedArrayObtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        e(b.i.c.j.h.j(typedArrayObtainStyledAttributes, xmlPullParser, "maximumAngle", 2, h));
        typedArrayObtainStyledAttributes.recycle();
    }

    private static float h(float f) {
        if (f < 0.0f || f > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f / 2.0f));
    }

    @Override // b.w.w
    public Path a(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        Path path = new Path();
        path.moveTo(f, f2);
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = (f8 * f8) + (f9 * f9);
        float f11 = (f + f3) / 2.0f;
        float f12 = (f2 + f4) / 2.0f;
        float f13 = 0.25f * f10;
        boolean z = f2 > f4;
        if (Math.abs(f8) < Math.abs(f9)) {
            float fAbs = Math.abs(f10 / (f9 * 2.0f));
            if (z) {
                f6 = fAbs + f4;
                f5 = f3;
            } else {
                f6 = fAbs + f2;
                f5 = f;
            }
            f7 = this.e;
        } else {
            float f14 = f10 / (f8 * 2.0f);
            if (z) {
                f6 = f2;
                f5 = f14 + f;
            } else {
                f5 = f3 - f14;
                f6 = f4;
            }
            f7 = this.d;
        }
        float f15 = f13 * f7 * f7;
        float f16 = f11 - f5;
        float f17 = f12 - f6;
        float f18 = (f16 * f16) + (f17 * f17);
        float f19 = this.f;
        float f20 = f13 * f19 * f19;
        if (f18 >= f15) {
            f15 = f18 > f20 ? f20 : 0.0f;
        }
        if (f15 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f15 / f18);
            f5 = ((f5 - f11) * fSqrt) + f11;
            f6 = f12 + (fSqrt * (f6 - f12));
        }
        path.cubicTo((f + f5) / 2.0f, (f2 + f6) / 2.0f, (f5 + f3) / 2.0f, (f6 + f4) / 2.0f, f3, f4);
        return path;
    }

    public float b() {
        return this.f1378c;
    }

    public float c() {
        return this.f1376a;
    }

    public float d() {
        return this.f1377b;
    }

    public void e(float f) {
        this.f1378c = f;
        this.f = h(f);
    }

    public void f(float f) {
        this.f1376a = f;
        this.d = h(f);
    }

    public void g(float f) {
        this.f1377b = f;
        this.e = h(f);
    }
}
