package c.a.b.b.g.c;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.IOException;

/* loaded from: classes.dex */
final class n6 extends l6 {
    private final byte[] f;
    private final boolean g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    private n6(byte[] bArr, int r3, int r4, boolean z) {
        super();
        this.m = ActivityChooserView.f.j;
        this.f = bArr;
        this.h = r4 + r3;
        this.j = r3;
        this.k = r3;
        this.g = z;
    }

    private final byte C() throws IOException {
        int r0 = this.j;
        if (r0 == this.h) {
            throw q7.a();
        }
        byte[] bArr = this.f;
        this.j = r0 + 1;
        return bArr[r0];
    }

    private final void D(int r3) throws IOException {
        if (r3 >= 0) {
            int r0 = this.h;
            int r1 = this.j;
            if (r3 <= r0 - r1) {
                this.j = r1 + r3;
                return;
            }
        }
        if (r3 >= 0) {
            throw q7.a();
        }
        throw q7.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int E() throws java.io.IOException {
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
            long r0 = r5.z()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.n6.E():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        if (r2[r0] >= 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long F() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.n6.F():long");
    }

    private final int G() throws IOException {
        int r0 = this.j;
        if (this.h - r0 < 4) {
            throw q7.a();
        }
        byte[] bArr = this.f;
        this.j = r0 + 4;
        return ((bArr[r0 + 3] & 255) << 24) | (bArr[r0] & 255) | ((bArr[r0 + 1] & 255) << 8) | ((bArr[r0 + 2] & 255) << 16);
    }

    private final long H() throws IOException {
        int r0 = this.j;
        if (this.h - r0 < 8) {
            throw q7.a();
        }
        byte[] bArr = this.f;
        this.j = r0 + 8;
        return ((bArr[r0 + 7] & 255) << 56) | (bArr[r0] & 255) | ((bArr[r0 + 1] & 255) << 8) | ((bArr[r0 + 2] & 255) << 16) | ((bArr[r0 + 3] & 255) << 24) | ((bArr[r0 + 4] & 255) << 32) | ((bArr[r0 + 5] & 255) << 40) | ((bArr[r0 + 6] & 255) << 48);
    }

    private final void I() {
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

    @Override // c.a.b.b.g.c.l6
    public final boolean A() throws IOException {
        return this.j == this.h;
    }

    @Override // c.a.b.b.g.c.l6
    public final int B() {
        return this.j - this.k;
    }

    @Override // c.a.b.b.g.c.l6
    public final int a() throws IOException {
        if (A()) {
            this.l = 0;
            return 0;
        }
        int r0 = E();
        this.l = r0;
        if ((r0 >>> 3) != 0) {
            return r0;
        }
        throw q7.d();
    }

    @Override // c.a.b.b.g.c.l6
    public final void d(int r2) throws q7 {
        if (this.l != r2) {
            throw q7.e();
        }
    }

    @Override // c.a.b.b.g.c.l6
    public final double e() throws IOException {
        return Double.longBitsToDouble(H());
    }

    @Override // c.a.b.b.g.c.l6
    public final boolean f(int r6) throws IOException {
        int r0;
        int r02 = r6 & 7;
        int r1 = 0;
        if (r02 == 0) {
            if (this.h - this.j < 10) {
                while (r1 < 10) {
                    if (C() < 0) {
                        r1++;
                    }
                }
                throw q7.c();
            }
            while (r1 < 10) {
                byte[] bArr = this.f;
                int r3 = this.j;
                this.j = r3 + 1;
                if (bArr[r3] < 0) {
                    r1++;
                }
            }
            throw q7.c();
            return true;
        }
        if (r02 == 1) {
            D(8);
            return true;
        }
        if (r02 == 2) {
            D(E());
            return true;
        }
        if (r02 != 3) {
            if (r02 == 4) {
                return false;
            }
            if (r02 != 5) {
                throw q7.f();
            }
            D(4);
            return true;
        }
        do {
            r0 = a();
            if (r0 == 0) {
                break;
            }
        } while (f(r0));
        d(((r6 >>> 3) << 3) | 4);
        return true;
    }

    @Override // c.a.b.b.g.c.l6
    public final float g() throws IOException {
        return Float.intBitsToFloat(G());
    }

    @Override // c.a.b.b.g.c.l6
    public final int h(int r2) throws q7 {
        if (r2 < 0) {
            throw q7.b();
        }
        int r22 = r2 + B();
        int r0 = this.m;
        if (r22 > r0) {
            throw q7.a();
        }
        this.m = r22;
        I();
        return r0;
    }

    @Override // c.a.b.b.g.c.l6
    public final long i() throws IOException {
        return F();
    }

    @Override // c.a.b.b.g.c.l6
    public final void j(int r1) {
        this.m = r1;
        I();
    }

    @Override // c.a.b.b.g.c.l6
    public final long l() throws IOException {
        return F();
    }

    @Override // c.a.b.b.g.c.l6
    public final int m() throws IOException {
        return E();
    }

    @Override // c.a.b.b.g.c.l6
    public final long n() throws IOException {
        return H();
    }

    @Override // c.a.b.b.g.c.l6
    public final int o() throws IOException {
        return G();
    }

    @Override // c.a.b.b.g.c.l6
    public final boolean p() throws IOException {
        return F() != 0;
    }

    @Override // c.a.b.b.g.c.l6
    public final String q() throws IOException {
        int r0 = E();
        if (r0 > 0 && r0 <= this.h - this.j) {
            String str = new String(this.f, this.j, r0, l7.f1762a);
            this.j += r0;
            return str;
        }
        if (r0 == 0) {
            return "";
        }
        if (r0 < 0) {
            throw q7.b();
        }
        throw q7.a();
    }

    @Override // c.a.b.b.g.c.l6
    public final String r() throws IOException {
        int r0 = E();
        if (r0 > 0) {
            int r1 = this.h;
            int r2 = this.j;
            if (r0 <= r1 - r2) {
                String strK = ma.k(this.f, r2, r0);
                this.j += r0;
                return strK;
            }
        }
        if (r0 == 0) {
            return "";
        }
        if (r0 <= 0) {
            throw q7.b();
        }
        throw q7.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // c.a.b.b.g.c.l6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c.a.b.b.g.c.y5 s() throws java.io.IOException {
        /*
            r3 = this;
            int r0 = r3.E()
            if (r0 <= 0) goto L19
            int r1 = r3.h
            int r2 = r3.j
            int r1 = r1 - r2
            if (r0 > r1) goto L19
            byte[] r1 = r3.f
            c.a.b.b.g.c.y5 r1 = c.a.b.b.g.c.y5.r(r1, r2, r0)
            int r2 = r3.j
            int r2 = r2 + r0
            r3.j = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            c.a.b.b.g.c.y5 r0 = c.a.b.b.g.c.y5.e
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
            byte[] r0 = c.a.b.b.g.c.l7.f1764c
        L37:
            c.a.b.b.g.c.y5 r0 = c.a.b.b.g.c.y5.o(r0)
            return r0
        L3c:
            c.a.b.b.g.c.q7 r0 = c.a.b.b.g.c.q7.b()
            throw r0
        L41:
            c.a.b.b.g.c.q7 r0 = c.a.b.b.g.c.q7.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.n6.s():c.a.b.b.g.c.y5");
    }

    @Override // c.a.b.b.g.c.l6
    public final int t() throws IOException {
        return E();
    }

    @Override // c.a.b.b.g.c.l6
    public final int u() throws IOException {
        return E();
    }

    @Override // c.a.b.b.g.c.l6
    public final int v() throws IOException {
        return G();
    }

    @Override // c.a.b.b.g.c.l6
    public final long w() throws IOException {
        return H();
    }

    @Override // c.a.b.b.g.c.l6
    public final int x() throws IOException {
        return l6.k(E());
    }

    @Override // c.a.b.b.g.c.l6
    public final long y() throws IOException {
        return l6.b(F());
    }

    @Override // c.a.b.b.g.c.l6
    final long z() throws IOException {
        long j = 0;
        for (int r2 = 0; r2 < 64; r2 += 7) {
            j |= (r3 & Byte.MAX_VALUE) << r2;
            if ((C() & 128) == 0) {
                return j;
            }
        }
        throw q7.c();
    }
}
