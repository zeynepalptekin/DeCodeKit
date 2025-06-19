package b.f;

/* loaded from: classes.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f891a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    static final long[] f892b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    static final Object[] f893c = new Object[0];

    private e() {
    }

    static int a(int[] r3, int r4, int r5) {
        int r42 = r4 - 1;
        int r0 = 0;
        while (r0 <= r42) {
            int r1 = (r0 + r42) >>> 1;
            int r2 = r3[r1];
            if (r2 < r5) {
                r0 = r1 + 1;
            } else {
                if (r2 <= r5) {
                    return r1;
                }
                r42 = r1 - 1;
            }
        }
        return ~r0;
    }

    static int b(long[] jArr, int r6, long j) {
        int r62 = r6 - 1;
        int r0 = 0;
        while (r0 <= r62) {
            int r1 = (r0 + r62) >>> 1;
            long j2 = jArr[r1];
            if (j2 < j) {
                r0 = r1 + 1;
            } else {
                if (j2 <= j) {
                    return r1;
                }
                r62 = r1 - 1;
            }
        }
        return ~r0;
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int d(int r2) {
        for (int r0 = 4; r0 < 32; r0++) {
            int r1 = (1 << r0) - 12;
            if (r2 <= r1) {
                return r1;
            }
        }
        return r2;
    }

    public static int e(int r0) {
        return d(r0 * 4) / 4;
    }

    public static int f(int r0) {
        return d(r0 * 8) / 8;
    }
}
