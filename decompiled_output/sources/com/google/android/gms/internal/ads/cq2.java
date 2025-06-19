package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class cq2 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3017a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final float[] f3018b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final Object f3019c = new Object();
    private static int[] d = new int[10];

    public static boolean a(String str, byte b2) {
        return ("video/avc".equals(str) && (b2 & 31) == 6) || ("video/hevc".equals(str) && ((b2 & 126) >> 1) == 39);
    }

    public static int b(byte[] bArr, int r9) {
        int r92;
        synchronized (f3019c) {
            int r2 = 0;
            int r3 = 0;
            while (r2 < r9) {
                while (true) {
                    if (r2 >= r9 - 2) {
                        r2 = r9;
                        break;
                    }
                    if (bArr[r2] == 0 && bArr[r2 + 1] == 0 && bArr[r2 + 2] == 3) {
                        break;
                    }
                    r2++;
                }
                if (r2 < r9) {
                    if (d.length <= r3) {
                        d = Arrays.copyOf(d, d.length << 1);
                    }
                    d[r3] = r2;
                    r2 += 3;
                    r3++;
                }
            }
            r92 = r9 - r3;
            int r4 = 0;
            int r5 = 0;
            for (int r22 = 0; r22 < r3; r22++) {
                int r6 = d[r22] - r5;
                System.arraycopy(bArr, r5, bArr, r4, r6);
                int r42 = r4 + r6;
                int r7 = r42 + 1;
                bArr[r42] = 0;
                r4 = r7 + 1;
                bArr[r7] = 0;
                r5 += r6 + 3;
            }
            System.arraycopy(bArr, r5, bArr, r4, r92 - r4);
        }
        return r92;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.fq2 c(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cq2.c(byte[], int, int):com.google.android.gms.internal.ads.fq2");
    }

    public static void d(ByteBuffer byteBuffer) {
        int r0 = byteBuffer.position();
        int r2 = 0;
        int r3 = 0;
        while (true) {
            int r4 = r2 + 1;
            if (r4 >= r0) {
                byteBuffer.clear();
                return;
            }
            int r5 = byteBuffer.get(r2) & 255;
            if (r3 == 3) {
                if (r5 == 1 && (byteBuffer.get(r4) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(r2 - 3);
                    byteBufferDuplicate.limit(r0);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (r5 == 0) {
                r3++;
            }
            if (r5 != 0) {
                r3 = 0;
            }
            r2 = r4;
        }
    }
}
