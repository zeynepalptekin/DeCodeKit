package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gq2 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f3572a;

    /* renamed from: b, reason: collision with root package name */
    private int f3573b;

    /* renamed from: c, reason: collision with root package name */
    private int f3574c;
    private int d = 0;

    public gq2(byte[] bArr, int r2, int r3) {
        this.f3572a = bArr;
        this.f3574c = r2;
        this.f3573b = r3;
        h();
    }

    private final boolean c(int r4) {
        if (2 > r4 || r4 >= this.f3573b) {
            return false;
        }
        byte[] bArr = this.f3572a;
        return bArr[r4] == 3 && bArr[r4 + (-2)] == 0 && bArr[r4 - 1] == 0;
    }

    private final int g() {
        int r1 = 0;
        while (!d()) {
            r1++;
        }
        return ((1 << r1) - 1) + (r1 > 0 ? a(r1) : 0);
    }

    private final void h() {
        int r1;
        int r2;
        int r0 = this.f3574c;
        vp2.e(r0 >= 0 && (r1 = this.d) >= 0 && r1 < 8 && (r0 < (r2 = this.f3573b) || (r0 == r2 && r1 == 0)));
    }

    public final int a(int r9) {
        int r92;
        int r5;
        if (r9 == 0) {
            return 0;
        }
        int r1 = r9 / 8;
        int r2 = 0;
        for (int r0 = 0; r0 < r1; r0++) {
            int r4 = c(this.f3574c + 1) ? this.f3574c + 2 : this.f3574c + 1;
            int r52 = this.d;
            if (r52 != 0) {
                byte[] bArr = this.f3572a;
                r5 = ((bArr[r4] & 255) >>> (8 - r52)) | ((bArr[this.f3574c] & 255) << r52);
            } else {
                r5 = this.f3572a[this.f3574c];
            }
            r9 -= 8;
            r2 |= (255 & r5) << r9;
            this.f3574c = r4;
        }
        if (r9 > 0) {
            int r02 = this.d + r9;
            byte b2 = (byte) (255 >> (8 - r9));
            int r42 = c(this.f3574c + 1) ? this.f3574c + 2 : this.f3574c + 1;
            byte[] bArr2 = this.f3572a;
            int r6 = this.f3574c;
            if (r02 > 8) {
                r92 = (b2 & (((255 & bArr2[r42]) >> (16 - r02)) | ((bArr2[r6] & 255) << (r02 - 8)))) | r2;
            } else {
                r92 = (b2 & ((255 & bArr2[r6]) >> (8 - r02))) | r2;
                if (r02 == 8) {
                }
                r2 = r92;
                this.d = r02 % 8;
            }
            this.f3574c = r42;
            r2 = r92;
            this.d = r02 % 8;
        }
        h();
        return r2;
    }

    public final void b(int r4) {
        int r0 = this.f3574c;
        int r1 = (r4 / 8) + r0;
        this.f3574c = r1;
        int r2 = this.d + (r4 % 8);
        this.d = r2;
        if (r2 > 7) {
            this.f3574c = r1 + 1;
            this.d = r2 - 8;
        }
        while (true) {
            r0++;
            if (r0 > this.f3574c) {
                h();
                return;
            } else if (c(r0)) {
                this.f3574c++;
                r0 += 2;
            }
        }
    }

    public final boolean d() {
        return a(1) == 1;
    }

    public final int e() {
        return g();
    }

    public final int f() {
        int r0 = g();
        return (r0 % 2 == 0 ? -1 : 1) * ((r0 + 1) / 2);
    }
}
