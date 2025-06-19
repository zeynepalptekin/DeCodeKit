package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class hl2 {

    /* renamed from: a, reason: collision with root package name */
    private final hq2 f3687a = new hq2(8);

    /* renamed from: b, reason: collision with root package name */
    private int f3688b;

    private final long b(pk2 pk2Var) throws InterruptedException, IOException {
        int r1 = 0;
        pk2Var.a(this.f3687a.f3710a, 0, 1);
        int r0 = this.f3687a.f3710a[0] & 255;
        if (r0 == 0) {
            return Long.MIN_VALUE;
        }
        int r3 = 128;
        int r4 = 0;
        while ((r0 & r3) == 0) {
            r3 >>= 1;
            r4++;
        }
        int r02 = r0 & (~r3);
        pk2Var.a(this.f3687a.f3710a, 1, r4);
        while (r1 < r4) {
            r1++;
            r02 = (this.f3687a.f3710a[r1] & 255) + (r02 << 8);
        }
        this.f3688b += r4 + 1;
        return r02;
    }

    public final boolean a(pk2 pk2Var) throws InterruptedException, IOException {
        long jD = pk2Var.d();
        long j = 1024;
        if (jD != -1 && jD <= 1024) {
            j = jD;
        }
        int r5 = (int) j;
        pk2Var.a(this.f3687a.f3710a, 0, 4);
        long jS = this.f3687a.s();
        this.f3688b = 4;
        while (jS != 440786851) {
            int r7 = this.f3688b + 1;
            this.f3688b = r7;
            if (r7 == r5) {
                return false;
            }
            pk2Var.a(this.f3687a.f3710a, 0, 1);
            jS = ((jS << 8) & (-256)) | (this.f3687a.f3710a[0] & 255);
        }
        long jB = b(pk2Var);
        long j2 = this.f3688b;
        if (jB != Long.MIN_VALUE && (jD == -1 || j2 + jB < jD)) {
            while (true) {
                int r2 = this.f3688b;
                long j3 = j2 + jB;
                if (r2 < j3) {
                    if (b(pk2Var) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jB2 = b(pk2Var);
                    if (jB2 < 0 || jB2 > 2147483647L) {
                        break;
                    }
                    if (jB2 != 0) {
                        pk2Var.g((int) jB2);
                        this.f3688b = (int) (this.f3688b + jB2);
                    }
                } else if (r2 == j3) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
