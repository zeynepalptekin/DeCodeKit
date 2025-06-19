package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class r82 extends m82 {
    private final InputStream f;
    private final byte[] g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private q82 n;

    private r82(InputStream inputStream, int r4) {
        super();
        this.m = ActivityChooserView.f.j;
        this.n = null;
        o92.d(inputStream, "input");
        this.f = inputStream;
        this.g = new byte[r4];
        this.h = 0;
        this.j = 0;
        this.l = 0;
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
            byte[] r2 = r5.g
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r82.C():int");
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r82.D():long");
    }

    private final int E() throws IOException {
        int r0 = this.j;
        if (this.h - r0 < 4) {
            K(4);
            r0 = this.j;
        }
        byte[] bArr = this.g;
        this.j = r0 + 4;
        return ((bArr[r0 + 3] & 255) << 24) | (bArr[r0] & 255) | ((bArr[r0 + 1] & 255) << 8) | ((bArr[r0 + 2] & 255) << 16);
    }

    private final long F() throws IOException {
        int r0 = this.j;
        if (this.h - r0 < 8) {
            K(8);
            r0 = this.j;
        }
        byte[] bArr = this.g;
        this.j = r0 + 8;
        return ((bArr[r0 + 7] & 255) << 56) | (bArr[r0] & 255) | ((bArr[r0 + 1] & 255) << 8) | ((bArr[r0 + 2] & 255) << 16) | ((bArr[r0 + 3] & 255) << 24) | ((bArr[r0 + 4] & 255) << 32) | ((bArr[r0 + 5] & 255) << 40) | ((bArr[r0 + 6] & 255) << 48);
    }

    private final void G() {
        int r0 = this.h + this.i;
        this.h = r0;
        int r1 = this.l + r0;
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
        if (this.j == this.h) {
            K(1);
        }
        byte[] bArr = this.g;
        int r1 = this.j;
        this.j = r1 + 1;
        return bArr[r1];
    }

    private final byte[] I(int r5, boolean z) throws IOException {
        byte[] bArrM = M(r5);
        if (bArrM != null) {
            return bArrM;
        }
        int r6 = this.j;
        int r0 = this.h;
        int length = r0 - r6;
        this.l += r0;
        this.j = 0;
        this.h = 0;
        List<byte[]> listN = N(r5 - length);
        byte[] bArr = new byte[r5];
        System.arraycopy(this.g, r6, bArr, 0, length);
        for (byte[] bArr2 : listN) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    private final void J(int r9) throws IOException {
        int r0 = this.h;
        int r1 = this.j;
        if (r9 <= r0 - r1 && r9 >= 0) {
            this.j = r1 + r9;
            return;
        }
        if (r9 < 0) {
            throw w92.b();
        }
        int r02 = this.l;
        int r12 = this.j;
        int r2 = r02 + r12 + r9;
        int r3 = this.m;
        if (r2 > r3) {
            J((r3 - r02) - r12);
            throw w92.a();
        }
        this.l = r02 + r12;
        int r03 = this.h - r12;
        this.h = 0;
        this.j = 0;
        while (r03 < r9) {
            try {
                long j = r9 - r03;
                long jSkip = this.f.skip(j);
                if (jSkip >= 0 && jSkip <= j) {
                    if (jSkip == 0) {
                        break;
                    } else {
                        r03 += (int) jSkip;
                    }
                } else {
                    String strValueOf = String.valueOf(this.f.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 92);
                    sb.append(strValueOf);
                    sb.append("#skip returned invalid result: ");
                    sb.append(jSkip);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                }
            } finally {
                this.l += r03;
                G();
            }
        }
        if (r03 >= r9) {
            return;
        }
        int r04 = this.h;
        int r13 = r04 - this.j;
        this.j = r04;
        while (true) {
            K(1);
            int r22 = r9 - r13;
            int r32 = this.h;
            if (r22 <= r32) {
                this.j = r22;
                return;
            } else {
                r13 += r32;
                this.j = r32;
            }
        }
    }

    private final void K(int r3) throws IOException {
        if (L(r3)) {
            return;
        }
        if (r3 <= (this.f4365c - this.l) - this.j) {
            throw w92.a();
        }
        throw w92.g();
    }

    private final boolean L(int r8) throws IOException {
        do {
            int r0 = this.j;
            int r1 = r0 + r8;
            int r2 = this.h;
            if (r1 <= r2) {
                StringBuilder sb = new StringBuilder(77);
                sb.append("refillBuffer() called when ");
                sb.append(r8);
                sb.append(" bytes were already available in buffer");
                throw new IllegalStateException(sb.toString());
            }
            int r12 = this.f4365c;
            int r3 = this.l;
            if (r8 > (r12 - r3) - r0 || r3 + r0 + r8 > this.m) {
                return false;
            }
            if (r0 > 0) {
                if (r2 > r0) {
                    byte[] bArr = this.g;
                    System.arraycopy(bArr, r0, bArr, 0, r2 - r0);
                }
                this.l += r0;
                this.h -= r0;
                this.j = 0;
            }
            InputStream inputStream = this.f;
            byte[] bArr2 = this.g;
            int r22 = this.h;
            int r02 = inputStream.read(bArr2, r22, Math.min(bArr2.length - r22, (this.f4365c - this.l) - r22));
            if (r02 == 0 || r02 < -1 || r02 > this.g.length) {
                String strValueOf = String.valueOf(this.f.getClass());
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 91);
                sb2.append(strValueOf);
                sb2.append("#read(byte[]) returned invalid result: ");
                sb2.append(r02);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (r02 <= 0) {
                return false;
            }
            this.h += r02;
            G();
        } while (this.h < r8);
        return true;
    }

    private final byte[] M(int r6) throws IOException {
        if (r6 == 0) {
            return o92.f4661c;
        }
        if (r6 < 0) {
            throw w92.b();
        }
        int r0 = this.l;
        int r1 = this.j;
        int r2 = r0 + r1 + r6;
        if (r2 - this.f4365c > 0) {
            throw w92.g();
        }
        int r3 = this.m;
        if (r2 > r3) {
            J((r3 - r0) - r1);
            throw w92.a();
        }
        int r02 = this.h - r1;
        int r12 = r6 - r02;
        if (r12 >= 4096 && r12 > this.f.available()) {
            return null;
        }
        byte[] bArr = new byte[r6];
        System.arraycopy(this.g, this.j, bArr, 0, r02);
        this.l += this.h;
        this.j = 0;
        this.h = 0;
        while (r02 < r6) {
            int r22 = this.f.read(bArr, r02, r6 - r02);
            if (r22 == -1) {
                throw w92.a();
            }
            this.l += r22;
            r02 += r22;
        }
        return bArr;
    }

    private final List<byte[]> N(int r7) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (r7 > 0) {
            int r1 = Math.min(r7, 4096);
            byte[] bArr = new byte[r1];
            int r3 = 0;
            while (r3 < r1) {
                int r4 = this.f.read(bArr, r3, r1 - r3);
                if (r4 == -1) {
                    throw w92.a();
                }
                this.l += r4;
                r3 += r4;
            }
            r7 -= r1;
            arrayList.add(bArr);
        }
        return arrayList;
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
            String str = new String(this.g, this.j, r0, o92.f4659a);
            this.j += r0;
            return str;
        }
        if (r0 == 0) {
            return "";
        }
        if (r0 > this.h) {
            return new String(I(r0, false), o92.f4659a);
        }
        K(r0);
        String str2 = new String(this.g, this.j, r0, o92.f4659a);
        this.j += r0;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final int e() throws IOException {
        if (u()) {
            this.k = 0;
            return 0;
        }
        int r0 = C();
        this.k = r0;
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
        byte[] bArrI;
        int r0 = C();
        int r1 = this.j;
        if (r0 <= this.h - r1 && r0 > 0) {
            bArrI = this.g;
            this.j = r1 + r0;
        } else {
            if (r0 == 0) {
                return "";
            }
            if (r0 <= this.h) {
                K(r0);
                bArrI = this.g;
                this.j = r0;
            } else {
                bArrI = I(r0, false);
            }
            r1 = 0;
        }
        return wc2.l(bArrI, r1, r0);
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final a82 m() throws IOException {
        int r0 = C();
        int r1 = this.h;
        int r2 = this.j;
        if (r0 <= r1 - r2 && r0 > 0) {
            a82 a82VarP = a82.P(this.g, r2, r0);
            this.j += r0;
            return a82VarP;
        }
        if (r0 == 0) {
            return a82.e;
        }
        byte[] bArrM = M(r0);
        if (bArrM != null) {
            return a82.S(bArrM);
        }
        int r12 = this.j;
        int r22 = this.h;
        int length = r22 - r12;
        this.l += r22;
        this.j = 0;
        this.h = 0;
        List<byte[]> listN = N(r0 - length);
        byte[] bArr = new byte[r0];
        System.arraycopy(this.g, r12, bArr, 0, length);
        for (byte[] bArr2 : listN) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return a82.T(bArr);
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
        return this.j == this.h && !L(1);
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final int v() {
        return this.l + this.j;
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final void x(int r2) throws w92 {
        if (this.k != r2) {
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
                byte[] bArr = this.g;
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
            J(8);
            return true;
        }
        if (r02 == 2) {
            J(C());
            return true;
        }
        if (r02 != 3) {
            if (r02 == 4) {
                return false;
            }
            if (r02 != 5) {
                throw w92.f();
            }
            J(4);
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
    public final int z(int r3) throws w92 {
        if (r3 < 0) {
            throw w92.b();
        }
        int r32 = r3 + this.l + this.j;
        int r0 = this.m;
        if (r32 > r0) {
            throw w92.a();
        }
        this.m = r32;
        G();
        return r0;
    }
}
