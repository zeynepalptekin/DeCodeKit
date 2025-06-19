package c.a.b.b.g.c;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class c4 {
    static int a(int r1, int r2, int r3) {
        return (r1 & (~r3)) | (r2 & r3);
    }

    static int b(Object obj, int r2) {
        return obj instanceof byte[] ? ((byte[]) obj)[r2] & 255 : obj instanceof short[] ? ((short[]) obj)[r2] & 65535 : ((int[]) obj)[r2];
    }

    static int c(@NullableDecl Object obj, @NullableDecl Object obj2, int r11, Object obj3, int[] r13, Object[] objArr, @NullableDecl Object[] objArr2) {
        int r2;
        int r6;
        int r0 = e4.b(obj);
        int r1 = r0 & r11;
        int r22 = b(obj3, r1);
        if (r22 == 0) {
            return -1;
        }
        int r4 = ~r11;
        int r02 = r0 & r4;
        int r5 = -1;
        while (true) {
            r2 = r22 - 1;
            r6 = r13[r2];
            if ((r6 & r4) == r02 && d3.a(obj, objArr[r2]) && (objArr2 == null || d3.a(obj2, objArr2[r2]))) {
                break;
            }
            int r52 = r6 & r11;
            if (r52 == 0) {
                return -1;
            }
            r5 = r2;
            r22 = r52;
        }
        int r9 = r6 & r11;
        if (r5 == -1) {
            e(obj3, r1, r9);
        } else {
            r13[r5] = a(r13[r5], r9, r11);
        }
        return r2;
    }

    static Object d(int r3) {
        if (r3 >= 2 && r3 <= 1073741824 && Integer.highestOneBit(r3) == r3) {
            return r3 <= 256 ? new byte[r3] : r3 <= 65536 ? new short[r3] : new int[r3];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(r3);
        throw new IllegalArgumentException(sb.toString());
    }

    static void e(Object obj, int r2, int r3) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[r2] = (byte) r3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[r2] = (short) r3;
        } else {
            ((int[]) obj)[r2] = r3;
        }
    }

    static int f(int r1) {
        return (r1 < 32 ? 4 : 2) * (r1 + 1);
    }
}
