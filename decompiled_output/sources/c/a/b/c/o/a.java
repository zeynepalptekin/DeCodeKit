package c.a.b.c.o;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1984a = 1.0E-4f;

    private a() {
    }

    public static float a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    public static float b(float f, float f2, float f3, float f4, float f5, float f6) {
        return g(a(f, f2, f3, f4), a(f, f2, f5, f4), a(f, f2, f5, f6), a(f, f2, f3, f6));
    }

    public static float c(float f, int r4) {
        float f2 = r4;
        int r1 = (int) (f / f2);
        if (Math.signum(f) * f2 < 0.0f && r1 * r4 != f) {
            r1--;
        }
        return f - (r1 * r4);
    }

    public static int d(int r2, int r3) {
        int r0 = r2 / r3;
        if ((r2 ^ r3) < 0 && r0 * r3 != r2) {
            r0--;
        }
        return r2 - (r0 * r3);
    }

    public static boolean e(float f, float f2, float f3) {
        return f + f3 >= f2;
    }

    public static float f(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    private static float g(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
