package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.IOException;

/* loaded from: classes.dex */
final class o82 extends m82 {
    private final byte[] f;
    private final boolean g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    private o82(byte[] bArr, int r3, int r4, boolean z) {
        super();
        this.m = ActivityChooserView.f.j;
        this.f = bArr;
        this.h = r4 + r3;
        this.j = r3;
        this.k = r3;
        this.g = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int C() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.j
            int r1 = r5.h
            if (r1 == r0) goto L6b
            byte[] r2 = r5.f
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.j = r3
            return r0
        L11:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6b
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L22
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L2f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L68
        L3d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6b
        L68:
            r5.j = r1
            return r0
        L6b:
            long r0 = r5.t()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o82.C():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        if (r2[r0] >= 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long D() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o82.D():long");
    }

    private final int E() throws IOException {
        int r0 = this.j;
        if (this.h - r0 < 4) {
            throw w92.a();
        }
        byte[] bArr = this.f;
        this.j = r0 + 4;
        return ((bArr[r0 + 3] & 255) << 24) | (bArr[r0] & 255) | ((bArr[r0 + 1] & 255) << 8) | ((bArr[r0 + 2] & 255) << 16);
    }

    private final long F() throws IOException {
        int r0 = this.j;
        if (this.h - r0 < 8) {
            throw w92.a();
        }
        byte[] bArr = this.f;
        this.j = r0 + 8;
        return ((bArr[r0 + 7] & 255) << 56) | (bArr[r0] & 255) | ((bArr[r0 + 1] & 255) << 8) | ((bArr[r0 + 2] & 255) << 16) | ((bArr[r0 + 3] & 255) << 24) | ((bArr[r0 + 4] & 255) << 32) | ((bArr[r0 + 5] & 255) << 40) | ((bArr[r0 + 6] & 255) << 48);
    }

    private final void G() {
        int r0 = this.h + this.i;
        this.h = r0;
        int r1 = r0 - this.k;
        int r2 = this.m;
        if (r1 <= r2) {
            this.i = 0;
            return;
        }
        int r12 = r1 - r2;
        this.i = r12;
        this.h = r0 - r12;
    }

    private final byte H() throws IOException {
        int r0 = this.j;
        if (r0 == this.h) {
            throw w92.a();
        }
        byte[] bArr = this.f;
        this.j = r0 + 1;
        return bArr[r0];
    }

    private final void I(int r3) throws IOException {
        if (r3 >= 0) {
            int r0 = this.h;
            int r1 = this.j;
            if (r3 <= r0 - r1) {
                this.j = r1 + r3;
                return;
            }
        }
        if (r3 >= 0) {
            throw w92.a();
        }
        throw w92.b();
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final void A(int r1) {
        this.m = r1;
        G();
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final double a() throws IOException {
        return Double.longBitsToDouble(F());
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final float b() throws IOException {
        return Float.intBitsToFloat(E());
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final String c() throws IOException {
        int r0 = C();
        if (r0 > 0 && r0 <= this.h - this.j) {
            String str = new String(this.f, this.j, r0, o92.f4659a);
            this.j += r0;
            return str;
        }
        if (r0 == 0) {
            return "";
        }
        if (r0 < 0) {
            throw w92.b();
        }
        throw w92.a();
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final int e() throws IOException {
        if (u()) {
            this.l = 0;
            return 0;
        }
        int r0 = C();
        this.l = r0;
        if ((r0 >>> 3) != 0) {
            return r0;
        }
        throw w92.d();
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final long f() throws IOException {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final long g() throws IOException {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final int h() throws IOException {
        return C();
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final long i() throws IOException {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final int j() throws IOException {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final boolean k() throws IOException {
        return D() != 0;
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final String l() throws IOException {
        int r0 = C();
        if (r0 > 0) {
            int r1 = this.h;
            int r2 = this.j;
            if (r0 <= r1 - r2) {
                String strL = wc2.l(this.f, r2, r0);
                this.j += r0;
                return strL;
            }
        }
        if (r0 == 0) {
            return "";
        }
        if (r0 <= 0) {
            throw w92.b();
        }
        throw w92.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // com.google.android.gms.internal.ads.m82
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.a82 m() throws java.io.IOException {
        /*
            r3 = this;
            int r0 = r3.C()
            if (r0 <= 0) goto L19
            int r1 = r3.h
            int r2 = r3.j
            int r1 = r1 - r2
            if (r0 > r1) goto L19
            byte[] r1 = r3.f
            com.google.android.gms.internal.ads.a82 r1 = com.google.android.gms.internal.ads.a82.P(r1, r2, r0)
            int r2 = r3.j
            int r2 = r2 + r0
            r3.j = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.google.android.gms.internal.ads.a82 r0 = com.google.android.gms.internal.ads.a82.e
            return r0
        L1e:
            if (r0 <= 0) goto L31
            int r1 = r3.h
            int r2 = r3.j
            int r1 = r1 - r2
            if (r0 > r1) goto L31
            int r0 = r0 + r2
            r3.j = r0
            byte[] r1 = r3.f
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r2, r0)
            goto L37
        L31:
            if (r0 > 0) goto L41
            if (r0 != 0) goto L3c
            byte[] r0 = com.google.android.gms.internal.ads.o92.f4661c
        L37:
            com.google.android.gms.internal.ads.a82 r0 = com.google.android.gms.internal.ads.a82.T(r0)
            return r0
        L3c:
            com.google.android.gms.internal.ads.w92 r0 = com.google.android.gms.internal.ads.w92.b()
            throw r0
        L41:
            com.google.android.gms.internal.ads.w92 r0 = com.google.android.gms.internal.ads.w92.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o82.m():com.google.android.gms.internal.ads.a82");
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final int n() throws IOException {
        return C();
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final int o() throws IOException {
        return C();
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final int p() throws IOException {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final long q() throws IOException {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final int r() throws IOException {
        return m82.B(C());
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final long s() throws IOException {
        return m82.w(D());
    }

    @Override // com.google.android.gms.internal.ads.m82
    final long t() throws IOException {
        long j = 0;
        for (int r2 = 0; r2 < 64; r2 += 7) {
            j |= (r3 & Byte.MAX_VALUE) << r2;
            if ((H() & 128) == 0) {
                return j;
            }
        }
        throw w92.c();
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final boolean u() throws IOException {
        return this.j == this.h;
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final int v() {
        return this.j - this.k;
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final void x(int r2) throws w92 {
        if (this.l != r2) {
            throw w92.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final boolean y(int r6) throws IOException {
        int r0;
        int r02 = r6 & 7;
        int r1 = 0;
        if (r02 == 0) {
            if (this.h - this.j < 10) {
                while (r1 < 10) {
                    if (H() < 0) {
                        r1++;
                    }
                }
                throw w92.c();
            }
            while (r1 < 10) {
                byte[] bArr = this.f;
                int r3 = this.j;
                this.j = r3 + 1;
                if (bArr[r3] < 0) {
                    r1++;
                }
            }
            throw w92.c();
            return true;
        }
        if (r02 == 1) {
            I(8);
            return true;
        }
        if (r02 == 2) {
            I(C());
            return true;
        }
        if (r02 != 3) {
            if (r02 == 4) {
                return false;
            }
            if (r02 != 5) {
                throw w92.f();
            }
            I(4);
            return true;
        }
        do {
            r0 = e();
            if (r0 == 0) {
                break;
            }
        } while (y(r0));
        x(((r6 >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final int z(int r2) throws w92 {
        if (r2 < 0) {
            throw w92.b();
        }
        int r22 = r2 + v();
        int r0 = this.m;
        if (r22 > r0) {
            throw w92.a();
        }
        this.m = r22;
        G();
        return r0;
    }
}
