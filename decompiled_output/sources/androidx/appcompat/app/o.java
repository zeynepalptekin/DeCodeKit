package androidx.appcompat.app;

/* loaded from: classes.dex */
class o {
    private static o d = null;
    public static final int e = 0;
    public static final int f = 1;
    private static final float g = 0.017453292f;
    private static final float h = 9.0E-4f;
    private static final float i = -0.10471976f;
    private static final float j = 0.0334196f;
    private static final float k = 3.49066E-4f;
    private static final float l = 5.236E-6f;
    private static final float m = 0.4092797f;
    private static final long n = 946728000000L;

    /* renamed from: a, reason: collision with root package name */
    public long f78a;

    /* renamed from: b, reason: collision with root package name */
    public long f79b;

    /* renamed from: c, reason: collision with root package name */
    public int f80c;

    o() {
    }

    static o b() {
        if (d == null) {
            d = new o();
        }
        return d;
    }

    public void a(long j2, double d2, double d3) {
        double d4 = (0.01720197f * ((j2 - n) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(d4) * 0.03341960161924362d) + d4 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = Math.round((r3 - h) - r9) + h + ((-d3) / 360.0d) + (Math.sin(d4) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d5 = 0.01745329238474369d * d2;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d5) * Math.sin(dAsin))) / (Math.cos(d5) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f80c = 1;
        } else {
            if (dSin2 > -1.0d) {
                double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
                this.f78a = Math.round((dRound + dAcos) * 8.64E7d) + n;
                long jRound = Math.round((dRound - dAcos) * 8.64E7d) + n;
                this.f79b = jRound;
                if (jRound >= j2 || this.f78a <= j2) {
                    this.f80c = 1;
                    return;
                } else {
                    this.f80c = 0;
                    return;
                }
            }
            this.f80c = 0;
        }
        this.f78a = -1L;
        this.f79b = -1L;
    }
}
