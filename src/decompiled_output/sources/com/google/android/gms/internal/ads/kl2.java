package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class kl2 {
    private static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f4105a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private int f4106b;

    /* renamed from: c, reason: collision with root package name */
    private int f4107c;

    public static long c(byte[] bArr, int r7, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~d[r7 - 1];
        }
        for (int r8 = 1; r8 < r7; r8++) {
            j = (j << 8) | (bArr[r8] & 255);
        }
        return j;
    }

    public static int d(int r6) {
        long j;
        int r0 = 0;
        do {
            long[] jArr = d;
            if (r0 >= jArr.length) {
                return -1;
            }
            j = jArr[r0] & r6;
            r0++;
        } while (j == 0);
        return r0;
    }

    public final void a() {
        this.f4106b = 0;
        this.f4107c = 0;
    }

    public final long b(pk2 pk2Var, boolean z, boolean z2, int r7) throws InterruptedException, IOException {
        if (this.f4106b == 0) {
            if (!pk2Var.f(this.f4105a, 0, 1, z)) {
                return -1L;
            }
            int r5 = d(this.f4105a[0] & 255);
            this.f4107c = r5;
            if (r5 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f4106b = 1;
        }
        int r52 = this.f4107c;
        if (r52 > r7) {
            this.f4106b = 0;
            return -2L;
        }
        if (r52 != 1) {
            pk2Var.readFully(this.f4105a, 1, r52 - 1);
        }
        this.f4106b = 0;
        return c(this.f4105a, this.f4107c, z2);
    }

    public final int e() {
        return this.f4107c;
    }
}
