package c.a.b.b.g.c;

/* loaded from: classes.dex */
final class oa {
    /* JADX INFO: Access modifiers changed from: private */
    public static void f(byte b2, byte b3, byte b4, byte b5, char[] cArr, int r7) throws q7 {
        if (o(b3) || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || o(b4) || o(b5)) {
            throw q7.h();
        }
        int r2 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
        cArr[r7] = (char) ((r2 >>> 10) + 55232);
        cArr[r7 + 1] = (char) ((r2 & 1023) + 56320);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(byte b2, byte b3, byte b4, char[] cArr, int r6) throws q7 {
        if (o(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || o(b4)))) {
            throw q7.h();
        }
        cArr[r6] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(byte b2, byte b3, char[] cArr, int r4) throws q7 {
        if (b2 < -62 || o(b3)) {
            throw q7.h();
        }
        cArr[r4] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(byte b2, char[] cArr, int r2) {
        cArr[r2] = (char) b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(byte b2) {
        return b2 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(byte b2) {
        return b2 < -32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n(byte b2) {
        return b2 < -16;
    }

    private static boolean o(byte b2) {
        return b2 > -65;
    }
}
