package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class y62 {
    private static void a(byte[] bArr, long j, int r7) {
        int r0 = 0;
        while (r0 < 4) {
            bArr[r7 + r0] = (byte) (255 & j);
            r0++;
            j >>= 8;
        }
    }

    static byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jD = d(bArr, 0, 0) & 67108863;
        int r8 = 3;
        long jD2 = d(bArr, 3, 2) & 67108611;
        long jD3 = d(bArr, 6, 4) & 67092735;
        long jD4 = d(bArr, 9, 6) & 66076671;
        long jD5 = d(bArr, 12, 8) & 1048575;
        long j = jD2 * 5;
        long j2 = jD3 * 5;
        long j3 = jD4 * 5;
        long j4 = jD5 * 5;
        int r6 = 17;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int r3 = 0;
        while (r3 < bArr2.length) {
            int r12 = Math.min(16, bArr2.length - r3);
            System.arraycopy(bArr2, r3, bArr3, 0, r12);
            bArr3[r12] = 1;
            if (r12 != 16) {
                Arrays.fill(bArr3, r12 + 1, r6, (byte) 0);
            }
            long jD6 = j9 + d(bArr3, 0, 0);
            long jD7 = j5 + d(bArr3, r8, 2);
            long jD8 = j6 + d(bArr3, 6, 4);
            long jD9 = j7 + d(bArr3, 9, 6);
            long jD10 = j8 + (d(bArr3, 12, 8) | (bArr3[16] << 24));
            long j10 = (jD6 * jD) + (jD7 * j4) + (jD8 * j3) + (jD9 * j2) + (jD10 * j);
            long j11 = (jD6 * jD2) + (jD7 * jD) + (jD8 * j4) + (jD9 * j3) + (jD10 * j2);
            long j12 = (jD6 * jD3) + (jD7 * jD2) + (jD8 * jD) + (jD9 * j4) + (jD10 * j3);
            long j13 = (jD6 * jD4) + (jD7 * jD3) + (jD8 * jD2) + (jD9 * jD) + (jD10 * j4);
            long j14 = j11 + (j10 >> 26);
            long j15 = j12 + (j14 >> 26);
            long j16 = j13 + (j15 >> 26);
            long j17 = (jD6 * jD5) + (jD7 * jD4) + (jD8 * jD3) + (jD9 * jD2) + (jD10 * jD) + (j16 >> 26);
            long j18 = (j10 & 67108863) + ((j17 >> 26) * 5);
            j5 = (j14 & 67108863) + (j18 >> 26);
            r3 += 16;
            j6 = j15 & 67108863;
            j7 = j16 & 67108863;
            j8 = j17 & 67108863;
            r6 = 17;
            r8 = 3;
            j9 = j18 & 67108863;
        }
        long j19 = j6 + (j5 >> 26);
        long j20 = j19 & 67108863;
        long j21 = j7 + (j19 >> 26);
        long j22 = j21 & 67108863;
        long j23 = j8 + (j21 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j9 + ((j23 >> 26) * 5);
        long j26 = j25 & 67108863;
        long j27 = (j5 & 67108863) + (j25 >> 26);
        long j28 = j26 + 5;
        long j29 = j28 & 67108863;
        long j30 = (j28 >> 26) + j27;
        long j31 = j20 + (j30 >> 26);
        long j32 = j22 + (j31 >> 26);
        long j33 = (j24 + (j32 >> 26)) - 67108864;
        long j34 = j33 >> 63;
        long j35 = ~j34;
        long j36 = (j27 & j34) | (j30 & 67108863 & j35);
        long j37 = (j20 & j34) | (j31 & 67108863 & j35);
        long j38 = (j22 & j34) | (j32 & 67108863 & j35);
        long j39 = ((j36 << 26) | (j26 & j34) | (j29 & j35)) & 4294967295L;
        long j40 = ((j36 >> 6) | (j37 << 20)) & 4294967295L;
        long j41 = ((j37 >> 12) | (j38 << 14)) & 4294967295L;
        long j42 = ((((j33 & j35) | (j24 & j34)) << 8) | (j38 >> 18)) & 4294967295L;
        long jC = j39 + c(bArr, 16);
        long j43 = jC & 4294967295L;
        long jC2 = j40 + c(bArr, 20) + (jC >> 32);
        long jC3 = j41 + c(bArr, 24) + (jC2 >> 32);
        long jC4 = (j42 + c(bArr, 28) + (jC3 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        a(bArr4, j43, 0);
        a(bArr4, jC2 & 4294967295L, 4);
        a(bArr4, jC3 & 4294967295L, 8);
        a(bArr4, jC4, 12);
        return bArr4;
    }

    private static long c(byte[] bArr, int r3) {
        return (((bArr[r3 + 3] & 255) << 24) | (bArr[r3] & 255) | ((bArr[r3 + 1] & 255) << 8) | ((bArr[r3 + 2] & 255) << 16)) & 4294967295L;
    }

    private static long d(byte[] bArr, int r3, int r4) {
        return (c(bArr, r3) >> r4) & 67108863;
    }
}
