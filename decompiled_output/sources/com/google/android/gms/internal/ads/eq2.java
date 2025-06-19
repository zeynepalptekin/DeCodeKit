package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class eq2 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f3311a;

    /* renamed from: b, reason: collision with root package name */
    private int f3312b;

    /* renamed from: c, reason: collision with root package name */
    private int f3313c;
    private int d;

    public eq2() {
    }

    public eq2(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private eq2(byte[] bArr, int r2) {
        this.f3311a = bArr;
        this.d = r2;
    }

    public final int a(int r11) {
        int r2;
        int r1;
        int r112;
        int r6;
        boolean z = false;
        if (r11 == 0) {
            return 0;
        }
        int r12 = r11 / 8;
        int r3 = 0;
        for (int r22 = 0; r22 < r12; r22++) {
            int r62 = this.f3313c;
            if (r62 != 0) {
                byte[] bArr = this.f3311a;
                int r8 = this.f3312b;
                r6 = ((bArr[r8 + 1] & 255) >>> (8 - r62)) | ((bArr[r8] & 255) << r62);
            } else {
                r6 = this.f3311a[this.f3312b];
            }
            r11 -= 8;
            r3 |= (255 & r6) << r11;
            this.f3312b++;
        }
        if (r11 > 0) {
            int r23 = this.f3313c + r11;
            byte b2 = (byte) (255 >> (8 - r11));
            byte[] bArr2 = this.f3311a;
            int r7 = this.f3312b;
            if (r23 > 8) {
                r112 = (b2 & (((255 & bArr2[r7 + 1]) >> (16 - r23)) | ((bArr2[r7] & 255) << (r23 - 8)))) | r3;
            } else {
                r112 = (b2 & ((255 & bArr2[r7]) >> (8 - r23))) | r3;
                if (r23 == 8) {
                }
                r3 = r112;
                this.f3313c = r23 % 8;
            }
            this.f3312b = r7 + 1;
            r3 = r112;
            this.f3313c = r23 % 8;
        }
        int r113 = this.f3312b;
        if (r113 >= 0 && (r2 = this.f3313c) >= 0 && r2 < 8 && (r113 < (r1 = this.d) || (r113 == r1 && r2 == 0))) {
            z = true;
        }
        vp2.e(z);
        return r3;
    }
}
