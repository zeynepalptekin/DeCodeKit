package c.a.b.b.g.c;

/* loaded from: classes.dex */
final class ma {

    /* renamed from: a, reason: collision with root package name */
    private static final na f1777a;

    static {
        f1777a = (!(ia.m() && ia.r()) || r5.b()) ? new qa() : new sa();
    }

    static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int r1 = 0;
        int r2 = 0;
        while (r2 < length && charSequence.charAt(r2) < 128) {
            r2++;
        }
        int r3 = length;
        while (true) {
            if (r2 >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(r2);
            if (cCharAt < 2048) {
                r3 += (127 - cCharAt) >>> 31;
                r2++;
            } else {
                int length2 = charSequence.length();
                while (r2 < length2) {
                    char cCharAt2 = charSequence.charAt(r2);
                    if (cCharAt2 < 2048) {
                        r1 += (127 - cCharAt2) >>> 31;
                    } else {
                        r1 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, r2) < 65536) {
                                throw new pa(r2, length2);
                            }
                            r2++;
                        }
                    }
                    r2++;
                }
                r3 += r1;
            }
        }
        if (r3 >= length) {
            return r3;
        }
        long j = r3 + 4294967296L;
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    static int e(CharSequence charSequence, byte[] bArr, int r3, int r4) {
        return f1777a.b(charSequence, bArr, r3, r4);
    }

    public static boolean f(byte[] bArr) {
        return f1777a.c(bArr, 0, bArr.length);
    }

    public static boolean g(byte[] bArr, int r2, int r3) {
        return f1777a.c(bArr, r2, r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(int r1) {
        if (r1 > -12) {
            return -1;
        }
        return r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int r1, int r2) {
        if (r1 > -12 || r2 > -65) {
            return -1;
        }
        return r1 ^ (r2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int r1, int r2, int r3) {
        if (r1 > -12 || r2 > -65 || r3 > -65) {
            return -1;
        }
        return (r1 ^ (r2 << 8)) ^ (r3 << 16);
    }

    static String k(byte[] bArr, int r2, int r3) throws q7 {
        return f1777a.d(bArr, r2, r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(byte[] bArr, int r4, int r5) {
        byte b2 = bArr[r4 - 1];
        int r52 = r5 - r4;
        if (r52 == 0) {
            return h(b2);
        }
        if (r52 == 1) {
            return i(b2, bArr[r4]);
        }
        if (r52 == 2) {
            return j(b2, bArr[r4], bArr[r4 + 1]);
        }
        throw new AssertionError();
    }
}
