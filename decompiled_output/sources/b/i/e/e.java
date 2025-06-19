package b.i.e;

import android.graphics.Color;
import androidx.annotation.h0;
import androidx.annotation.m0;
import androidx.annotation.x0;
import androidx.annotation.z;
import b.i.p.f0;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final double f1011a = 95.047d;

    /* renamed from: b, reason: collision with root package name */
    private static final double f1012b = 100.0d;

    /* renamed from: c, reason: collision with root package name */
    private static final double f1013c = 108.883d;
    private static final double d = 0.008856d;
    private static final double e = 903.3d;
    private static final int f = 10;
    private static final int g = 1;
    private static final ThreadLocal<double[]> h = new ThreadLocal<>();

    private e() {
    }

    private static double A(double d2) {
        return d2 > d ? Math.pow(d2, 0.3333333333333333d) : ((d2 * e) + 16.0d) / 116.0d;
    }

    @androidx.annotation.k
    public static int B(@androidx.annotation.k int r1, @z(from = FabTransformationScrimBehavior.j, to = 255) int r2) {
        if (r2 < 0 || r2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (r1 & f0.s) | (r2 << 24);
    }

    @androidx.annotation.k
    public static int a(@h0 float[] fArr) {
        int r1;
        int r3;
        int r6;
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float fAbs = (1.0f - Math.abs((f4 * 2.0f) - 1.0f)) * f3;
        float f5 = f4 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f2 / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f2) / 60) {
            case 0:
                r1 = Math.round((fAbs + f5) * 255.0f);
                r3 = Math.round((fAbs2 + f5) * 255.0f);
                r6 = Math.round(f5 * 255.0f);
                break;
            case 1:
                r1 = Math.round((fAbs2 + f5) * 255.0f);
                r3 = Math.round((fAbs + f5) * 255.0f);
                r6 = Math.round(f5 * 255.0f);
                break;
            case 2:
                r1 = Math.round(f5 * 255.0f);
                r3 = Math.round((fAbs + f5) * 255.0f);
                r6 = Math.round((fAbs2 + f5) * 255.0f);
                break;
            case 3:
                r1 = Math.round(f5 * 255.0f);
                r3 = Math.round((fAbs2 + f5) * 255.0f);
                r6 = Math.round((fAbs + f5) * 255.0f);
                break;
            case 4:
                r1 = Math.round((fAbs2 + f5) * 255.0f);
                r3 = Math.round(f5 * 255.0f);
                r6 = Math.round((fAbs + f5) * 255.0f);
                break;
            case 5:
            case 6:
                r1 = Math.round((fAbs + f5) * 255.0f);
                r3 = Math.round(f5 * 255.0f);
                r6 = Math.round((fAbs2 + f5) * 255.0f);
                break;
            default:
                r6 = 0;
                r1 = 0;
                r3 = 0;
                break;
        }
        return Color.rgb(x(r1, 0, 255), x(r3, 0, 255), x(r6, 0, 255));
    }

    @androidx.annotation.k
    public static int b(@androidx.annotation.r(from = 0.0d, to = f1012b) double d2, @androidx.annotation.r(from = -128.0d, to = 127.0d) double d3, @androidx.annotation.r(from = -128.0d, to = 127.0d) double d4) {
        double[] dArrZ = z();
        c(d2, d3, d4, dArrZ);
        return g(dArrZ[0], dArrZ[1], dArrZ[2]);
    }

    public static void c(@androidx.annotation.r(from = 0.0d, to = f1012b) double d2, @androidx.annotation.r(from = -128.0d, to = 127.0d) double d3, @androidx.annotation.r(from = -128.0d, to = 127.0d) double d4, @h0 double[] dArr) {
        double d5 = (d2 + 16.0d) / 116.0d;
        double d6 = (d3 / 500.0d) + d5;
        double d7 = d5 - (d4 / 200.0d);
        double dPow = Math.pow(d6, 3.0d);
        if (dPow <= d) {
            dPow = ((d6 * 116.0d) - 16.0d) / e;
        }
        double dPow2 = d2 > 7.9996247999999985d ? Math.pow(d5, 3.0d) : d2 / e;
        double dPow3 = Math.pow(d7, 3.0d);
        if (dPow3 <= d) {
            dPow3 = ((d7 * 116.0d) - 16.0d) / e;
        }
        dArr[0] = dPow * f1011a;
        dArr[1] = dPow2 * f1012b;
        dArr[2] = dPow3 * f1013c;
    }

    public static void d(@z(from = FabTransformationScrimBehavior.j, to = 255) int r7, @z(from = FabTransformationScrimBehavior.j, to = 255) int r8, @z(from = FabTransformationScrimBehavior.j, to = 255) int r9, @h0 float[] fArr) {
        float f2;
        float fAbs;
        float f3 = r7 / 255.0f;
        float f4 = r8 / 255.0f;
        float f5 = r9 / 255.0f;
        float fMax = Math.max(f3, Math.max(f4, f5));
        float fMin = Math.min(f3, Math.min(f4, f5));
        float f6 = fMax - fMin;
        float f7 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f2 = 0.0f;
            fAbs = 0.0f;
        } else {
            f2 = fMax == f3 ? ((f4 - f5) / f6) % 6.0f : fMax == f4 ? ((f5 - f3) / f6) + 2.0f : 4.0f + ((f3 - f4) / f6);
            fAbs = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f8 = (f2 * 60.0f) % 360.0f;
        if (f8 < 0.0f) {
            f8 += 360.0f;
        }
        fArr[0] = w(f8, 0.0f, 360.0f);
        fArr[1] = w(fAbs, 0.0f, 1.0f);
        fArr[2] = w(f7, 0.0f, 1.0f);
    }

    public static void e(@z(from = FabTransformationScrimBehavior.j, to = 255) int r7, @z(from = FabTransformationScrimBehavior.j, to = 255) int r8, @z(from = FabTransformationScrimBehavior.j, to = 255) int r9, @h0 double[] dArr) {
        f(r7, r8, r9, dArr);
        h(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void f(@z(from = FabTransformationScrimBehavior.j, to = 255) int r16, @z(from = FabTransformationScrimBehavior.j, to = 255) int r17, @z(from = FabTransformationScrimBehavior.j, to = 255) int r18, @h0 double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d2 = r16 / 255.0d;
        double dPow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = r17 / 255.0d;
        double dPow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d4 = r18 / 255.0d;
        double dPow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * f1012b;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * f1012b;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * f1012b;
    }

    @androidx.annotation.k
    public static int g(@androidx.annotation.r(from = 0.0d, to = f1011a) double d2, @androidx.annotation.r(from = 0.0d, to = f1012b) double d3, @androidx.annotation.r(from = 0.0d, to = f1013c) double d4) {
        double d5 = (((3.2406d * d2) + ((-1.5372d) * d3)) + ((-0.4986d) * d4)) / f1012b;
        double d6 = ((((-0.9689d) * d2) + (1.8758d * d3)) + (0.0415d * d4)) / f1012b;
        double d7 = (((0.0557d * d2) + ((-0.204d) * d3)) + (1.057d * d4)) / f1012b;
        return Color.rgb(x((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d), 0, 255), x((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, 255), x((int) Math.round((d7 > 0.0031308d ? (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d) * 255.0d), 0, 255));
    }

    public static void h(@androidx.annotation.r(from = 0.0d, to = f1011a) double d2, @androidx.annotation.r(from = 0.0d, to = f1012b) double d3, @androidx.annotation.r(from = 0.0d, to = f1013c) double d4, @h0 double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double dA = A(d2 / f1011a);
        double dA2 = A(d3 / f1012b);
        double dA3 = A(d4 / f1013c);
        dArr[0] = Math.max(0.0d, (116.0d * dA2) - 16.0d);
        dArr[1] = (dA - dA2) * 500.0d;
        dArr[2] = (dA2 - dA3) * 200.0d;
    }

    @androidx.annotation.k
    public static int i(@androidx.annotation.k int r5, @androidx.annotation.k int r6, @androidx.annotation.r(from = 0.0d, to = 1.0d) float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((Color.alpha(r5) * f3) + (Color.alpha(r6) * f2)), (int) ((Color.red(r5) * f3) + (Color.red(r6) * f2)), (int) ((Color.green(r5) * f3) + (Color.green(r6) * f2)), (int) ((Color.blue(r5) * f3) + (Color.blue(r6) * f2)));
    }

    public static void j(@h0 float[] fArr, @h0 float[] fArr2, @androidx.annotation.r(from = 0.0d, to = 1.0d) float f2, @h0 float[] fArr3) {
        if (fArr3.length != 3) {
            throw new IllegalArgumentException("result must have a length of 3.");
        }
        float f3 = 1.0f - f2;
        fArr3[0] = o(fArr[0], fArr2[0], f2);
        fArr3[1] = (fArr[1] * f3) + (fArr2[1] * f2);
        fArr3[2] = (fArr[2] * f3) + (fArr2[2] * f2);
    }

    public static void k(@h0 double[] dArr, @h0 double[] dArr2, @androidx.annotation.r(from = 0.0d, to = 1.0d) double d2, @h0 double[] dArr3) {
        if (dArr3.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        double d3 = 1.0d - d2;
        dArr3[0] = (dArr[0] * d3) + (dArr2[0] * d2);
        dArr3[1] = (dArr[1] * d3) + (dArr2[1] * d2);
        dArr3[2] = (dArr[2] * d3) + (dArr2[2] * d2);
    }

    public static double l(@androidx.annotation.k int r4, @androidx.annotation.k int r5) {
        if (Color.alpha(r5) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(r5));
        }
        if (Color.alpha(r4) < 255) {
            r4 = t(r4, r5);
        }
        double dM = m(r4) + 0.05d;
        double dM2 = m(r5) + 0.05d;
        return Math.max(dM, dM2) / Math.min(dM, dM2);
    }

    @androidx.annotation.r(from = 0.0d, to = 1.0d)
    public static double m(@androidx.annotation.k int r5) {
        double[] dArrZ = z();
        r(r5, dArrZ);
        return dArrZ[1] / f1012b;
    }

    public static int n(@androidx.annotation.k int r8, @androidx.annotation.k int r9, float f2) {
        int r1 = 255;
        if (Color.alpha(r9) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(r9));
        }
        double d2 = f2;
        if (l(B(r8, 255), r9) < d2) {
            return -1;
        }
        int r0 = 0;
        for (int r10 = 0; r10 <= 10 && r1 - r0 > 1; r10++) {
            int r2 = (r0 + r1) / 2;
            if (l(B(r8, r2), r9) < d2) {
                r0 = r2;
            } else {
                r1 = r2;
            }
        }
        return r1;
    }

    @x0
    static float o(float f2, float f3, float f4) {
        if (Math.abs(f3 - f2) > 180.0f) {
            if (f3 > f2) {
                f2 += 360.0f;
            } else {
                f3 += 360.0f;
            }
        }
        return (f2 + ((f3 - f2) * f4)) % 360.0f;
    }

    public static void p(@androidx.annotation.k int r2, @h0 float[] fArr) {
        d(Color.red(r2), Color.green(r2), Color.blue(r2), fArr);
    }

    public static void q(@androidx.annotation.k int r2, @h0 double[] dArr) {
        e(Color.red(r2), Color.green(r2), Color.blue(r2), dArr);
    }

    public static void r(@androidx.annotation.k int r2, @h0 double[] dArr) {
        f(Color.red(r2), Color.green(r2), Color.blue(r2), dArr);
    }

    private static int s(int r0, int r1) {
        return 255 - (((255 - r1) * (255 - r0)) / 255);
    }

    public static int t(@androidx.annotation.k int r6, @androidx.annotation.k int r7) {
        int r0 = Color.alpha(r7);
        int r1 = Color.alpha(r6);
        int r2 = s(r1, r0);
        return Color.argb(r2, v(Color.red(r6), r1, Color.red(r7), r0, r2), v(Color.green(r6), r1, Color.green(r7), r0, r2), v(Color.blue(r6), r1, Color.blue(r7), r0, r2));
    }

    @m0(26)
    @h0
    public static Color u(@h0 Color color, @h0 Color color2) {
        if (!Objects.equals(color.getModel(), color2.getModel())) {
            throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + ")");
        }
        if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
            color = color.convert(color2.getColorSpace());
        }
        float[] components = color.getComponents();
        float[] components2 = color2.getComponents();
        float fAlpha = color.alpha();
        float fAlpha2 = color2.alpha() * (1.0f - fAlpha);
        int componentCount = color2.getComponentCount() - 1;
        components2[componentCount] = fAlpha + fAlpha2;
        if (components2[componentCount] > 0.0f) {
            fAlpha /= components2[componentCount];
            fAlpha2 /= components2[componentCount];
        }
        for (int r4 = 0; r4 < componentCount; r4++) {
            components2[r4] = (components[r4] * fAlpha) + (components2[r4] * fAlpha2);
        }
        return Color.valueOf(components2, color2.getColorSpace());
    }

    private static int v(int r0, int r1, int r2, int r3, int r4) {
        if (r4 == 0) {
            return 0;
        }
        return (((r0 * 255) * r1) + ((r2 * r3) * (255 - r1))) / (r4 * 255);
    }

    private static float w(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    private static int x(int r0, int r1, int r2) {
        return r0 < r1 ? r1 : r0 > r2 ? r2 : r0;
    }

    public static double y(@h0 double[] dArr, @h0 double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[0] - dArr2[0], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[2] - dArr2[2], 2.0d));
    }

    private static double[] z() {
        double[] dArr = h.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        h.set(dArr2);
        return dArr2;
    }
}
