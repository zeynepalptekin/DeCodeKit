package c.a.b.b.g.c;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class o6 extends v5 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f1782b = Logger.getLogger(o6.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f1783c = ia.m();

    /* renamed from: a, reason: collision with root package name */
    r6 f1784a;

    private static class a extends o6 {
        private final byte[] d;
        private final int e;
        private final int f;
        private int g;

        a(byte[] bArr, int r4, int r5) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((r5 | 0 | (bArr.length - r5)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(r5)));
            }
            this.d = bArr;
            this.e = 0;
            this.g = 0;
            this.f = r5;
        }

        private final void G0(byte[] bArr, int r5, int r6) throws IOException {
            try {
                System.arraycopy(bArr, r5, this.d, this.g, r6);
                this.g += r6;
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(r6)), e);
            }
        }

        @Override // c.a.b.b.g.c.o6
        public final void O(int r5) throws IOException {
            if (!o6.f1783c || r5.b() || b() < 5) {
                while ((r5 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.d;
                        int r1 = this.g;
                        this.g = r1 + 1;
                        bArr[r1] = (byte) ((r5 & 127) | 128);
                        r5 >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
                    }
                }
                byte[] bArr2 = this.d;
                int r12 = this.g;
                this.g = r12 + 1;
                bArr2[r12] = (byte) r5;
                return;
            }
            if ((r5 & (-128)) == 0) {
                byte[] bArr3 = this.d;
                int r13 = this.g;
                this.g = r13 + 1;
                ia.l(bArr3, r13, (byte) r5);
                return;
            }
            byte[] bArr4 = this.d;
            int r14 = this.g;
            this.g = r14 + 1;
            ia.l(bArr4, r14, (byte) (r5 | 128));
            int r52 = r5 >>> 7;
            if ((r52 & (-128)) == 0) {
                byte[] bArr5 = this.d;
                int r15 = this.g;
                this.g = r15 + 1;
                ia.l(bArr5, r15, (byte) r52);
                return;
            }
            byte[] bArr6 = this.d;
            int r16 = this.g;
            this.g = r16 + 1;
            ia.l(bArr6, r16, (byte) (r52 | 128));
            int r53 = r52 >>> 7;
            if ((r53 & (-128)) == 0) {
                byte[] bArr7 = this.d;
                int r17 = this.g;
                this.g = r17 + 1;
                ia.l(bArr7, r17, (byte) r53);
                return;
            }
            byte[] bArr8 = this.d;
            int r18 = this.g;
            this.g = r18 + 1;
            ia.l(bArr8, r18, (byte) (r53 | 128));
            int r54 = r53 >>> 7;
            if ((r54 & (-128)) == 0) {
                byte[] bArr9 = this.d;
                int r19 = this.g;
                this.g = r19 + 1;
                ia.l(bArr9, r19, (byte) r54);
                return;
            }
            byte[] bArr10 = this.d;
            int r110 = this.g;
            this.g = r110 + 1;
            ia.l(bArr10, r110, (byte) (r54 | 128));
            byte[] bArr11 = this.d;
            int r111 = this.g;
            this.g = r111 + 1;
            ia.l(bArr11, r111, (byte) (r54 >>> 7));
        }

        @Override // c.a.b.b.g.c.o6
        public final void P(int r2, int r3) throws IOException {
            m(r2, 0);
            j(r3);
        }

        @Override // c.a.b.b.g.c.o6
        public final void R(int r4, y5 y5Var) throws IOException {
            m(1, 3);
            Y(2, r4);
            o(3, y5Var);
            m(1, 4);
        }

        @Override // c.a.b.b.g.c.o6
        public final void T(byte[] bArr, int r2, int r3) throws IOException {
            O(r3);
            G0(bArr, 0, r3);
        }

        @Override // c.a.b.b.g.c.o6
        public final void Y(int r2, int r3) throws IOException {
            m(r2, 0);
            O(r3);
        }

        @Override // c.a.b.b.g.c.o6
        public final void Z(int r2, long j) throws IOException {
            m(r2, 1);
            a0(j);
        }

        @Override // c.a.b.b.g.c.v5
        public final void a(byte[] bArr, int r2, int r3) throws IOException {
            G0(bArr, r2, r3);
        }

        @Override // c.a.b.b.g.c.o6
        public final void a0(long j) throws IOException {
            try {
                byte[] bArr = this.d;
                int r1 = this.g;
                int r2 = r1 + 1;
                this.g = r2;
                bArr[r1] = (byte) j;
                byte[] bArr2 = this.d;
                int r12 = r2 + 1;
                this.g = r12;
                bArr2[r2] = (byte) (j >> 8);
                byte[] bArr3 = this.d;
                int r22 = r12 + 1;
                this.g = r22;
                bArr3[r12] = (byte) (j >> 16);
                byte[] bArr4 = this.d;
                int r13 = r22 + 1;
                this.g = r13;
                bArr4[r22] = (byte) (j >> 24);
                byte[] bArr5 = this.d;
                int r23 = r13 + 1;
                this.g = r23;
                bArr5[r13] = (byte) (j >> 32);
                byte[] bArr6 = this.d;
                int r14 = r23 + 1;
                this.g = r14;
                bArr6[r23] = (byte) (j >> 40);
                byte[] bArr7 = this.d;
                int r24 = r14 + 1;
                this.g = r24;
                bArr7[r14] = (byte) (j >> 48);
                byte[] bArr8 = this.d;
                this.g = r24 + 1;
                bArr8[r24] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // c.a.b.b.g.c.o6
        public final int b() {
            return this.f - this.g;
        }

        @Override // c.a.b.b.g.c.o6
        public final void f0(int r5) throws IOException {
            try {
                byte[] bArr = this.d;
                int r1 = this.g;
                int r2 = r1 + 1;
                this.g = r2;
                bArr[r1] = (byte) r5;
                byte[] bArr2 = this.d;
                int r12 = r2 + 1;
                this.g = r12;
                bArr2[r2] = (byte) (r5 >> 8);
                byte[] bArr3 = this.d;
                int r22 = r12 + 1;
                this.g = r22;
                bArr3[r12] = (byte) (r5 >> 16);
                byte[] bArr4 = this.d;
                this.g = r22 + 1;
                bArr4[r22] = (byte) (r5 >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // c.a.b.b.g.c.o6
        public final void g(byte b2) throws IOException {
            try {
                byte[] bArr = this.d;
                int r1 = this.g;
                this.g = r1 + 1;
                bArr[r1] = b2;
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // c.a.b.b.g.c.o6
        public final void j(int r3) throws IOException {
            if (r3 >= 0) {
                O(r3);
            } else {
                t(r3);
            }
        }

        @Override // c.a.b.b.g.c.o6
        public final void k0(int r2, int r3) throws IOException {
            m(r2, 5);
            f0(r3);
        }

        @Override // c.a.b.b.g.c.o6
        public final void m(int r1, int r2) throws IOException {
            O((r1 << 3) | r2);
        }

        @Override // c.a.b.b.g.c.o6
        public final void n(int r2, long j) throws IOException {
            m(r2, 0);
            t(j);
        }

        @Override // c.a.b.b.g.c.o6
        public final void o(int r2, y5 y5Var) throws IOException {
            m(r2, 2);
            u(y5Var);
        }

        @Override // c.a.b.b.g.c.o6
        public final void p(int r4, r8 r8Var) throws IOException {
            m(1, 3);
            Y(2, r4);
            m(3, 2);
            v(r8Var);
            m(1, 4);
        }

        @Override // c.a.b.b.g.c.o6
        final void q(int r3, r8 r8Var, j9 j9Var) throws IOException {
            m(r3, 2);
            o5 o5Var = (o5) r8Var;
            int r0 = o5Var.m();
            if (r0 == -1) {
                r0 = j9Var.c(o5Var);
                o5Var.n(r0);
            }
            O(r0);
            j9Var.h(r8Var, this.f1784a);
        }

        @Override // c.a.b.b.g.c.o6
        public final void r(int r2, String str) throws IOException {
            m(r2, 2);
            w(str);
        }

        @Override // c.a.b.b.g.c.o6
        public final void s(int r2, boolean z) throws IOException {
            m(r2, 0);
            g(z ? (byte) 1 : (byte) 0);
        }

        @Override // c.a.b.b.g.c.o6
        public final void t(long j) throws IOException {
            if (o6.f1783c && b() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.d;
                    int r6 = this.g;
                    this.g = r6 + 1;
                    ia.l(bArr, r6, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.d;
                int r1 = this.g;
                this.g = r1 + 1;
                ia.l(bArr2, r1, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.d;
                    int r62 = this.g;
                    this.g = r62 + 1;
                    bArr3[r62] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
                }
            }
            byte[] bArr4 = this.d;
            int r12 = this.g;
            this.g = r12 + 1;
            bArr4[r12] = (byte) j;
        }

        @Override // c.a.b.b.g.c.o6
        public final void u(y5 y5Var) throws IOException {
            O(y5Var.h());
            y5Var.t(this);
        }

        @Override // c.a.b.b.g.c.o6
        public final void v(r8 r8Var) throws IOException {
            O(r8Var.b());
            r8Var.d(this);
        }

        @Override // c.a.b.b.g.c.o6
        public final void w(String str) throws IOException {
            int r0 = this.g;
            try {
                int r1 = o6.p0(str.length() * 3);
                int r2 = o6.p0(str.length());
                if (r2 != r1) {
                    O(ma.d(str));
                    this.g = ma.e(str, this.d, this.g, b());
                    return;
                }
                int r12 = r0 + r2;
                this.g = r12;
                int r13 = ma.e(str, this.d, r12, b());
                this.g = r0;
                O((r13 - r0) - r2);
                this.g = r13;
            } catch (pa e) {
                this.g = r0;
                x(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new b(e2);
            }
        }
    }

    public static class b extends IOException {
        b() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        b(String str, Throwable th) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
        }

        b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private o6() {
    }

    public static int A(float f) {
        return 4;
    }

    public static int A0(int r0) {
        return 4;
    }

    public static int B(int r0, double d) {
        return p0(r0 << 3) + 8;
    }

    public static int B0(int r0, int r1) {
        return p0(r0 << 3) + 4;
    }

    public static int C(int r0, float f) {
        return p0(r0 << 3) + 4;
    }

    public static int C0(int r0) {
        return l0(r0);
    }

    public static int D(int r2, z7 z7Var) {
        return (p0(8) << 1) + q0(2, r2) + c(3, z7Var);
    }

    public static int D0(int r0, int r1) {
        return p0(r0 << 3) + l0(r1);
    }

    public static int E(int r2, r8 r8Var) {
        return (p0(8) << 1) + q0(2, r2) + p0(24) + J(r8Var);
    }

    @Deprecated
    public static int E0(int r0) {
        return p0(r0);
    }

    static int F(int r0, r8 r8Var, j9 j9Var) {
        return p0(r0 << 3) + e(r8Var, j9Var);
    }

    private static int F0(int r1) {
        return (r1 >> 31) ^ (r1 << 1);
    }

    public static int G(int r0, String str) {
        return p0(r0 << 3) + K(str);
    }

    public static int H(int r0, boolean z) {
        return p0(r0 << 3) + 1;
    }

    public static int I(y5 y5Var) {
        int r1 = y5Var.h();
        return p0(r1) + r1;
    }

    public static int J(r8 r8Var) {
        int r1 = r8Var.b();
        return p0(r1) + r1;
    }

    public static int K(String str) {
        int length;
        try {
            length = ma.d(str);
        } catch (pa unused) {
            length = str.getBytes(l7.f1762a).length;
        }
        return p0(length) + length;
    }

    public static int L(boolean z) {
        return 1;
    }

    public static int M(byte[] bArr) {
        int length = bArr.length;
        return p0(length) + length;
    }

    public static int U(int r1, y5 y5Var) {
        int r12 = p0(r1 << 3);
        int r2 = y5Var.h();
        return r12 + p0(r2) + r2;
    }

    @Deprecated
    static int V(int r2, r8 r8Var, j9 j9Var) {
        int r22 = p0(r2 << 3) << 1;
        o5 o5Var = (o5) r8Var;
        int r0 = o5Var.m();
        if (r0 == -1) {
            r0 = j9Var.c(o5Var);
            o5Var.n(r0);
        }
        return r22 + r0;
    }

    @Deprecated
    public static int W(r8 r8Var) {
        return r8Var.b();
    }

    public static int c(int r1, z7 z7Var) {
        int r12 = p0(r1 << 3);
        int r2 = z7Var.b();
        return r12 + p0(r2) + r2;
    }

    public static int c0(int r0, long j) {
        return p0(r0 << 3) + j0(j);
    }

    public static int d(z7 z7Var) {
        int r1 = z7Var.b();
        return p0(r1) + r1;
    }

    public static int d0(int r2, y5 y5Var) {
        return (p0(8) << 1) + q0(2, r2) + U(3, y5Var);
    }

    static int e(r8 r8Var, j9 j9Var) {
        o5 o5Var = (o5) r8Var;
        int r0 = o5Var.m();
        if (r0 == -1) {
            r0 = j9Var.c(o5Var);
            o5Var.n(r0);
        }
        return p0(r0) + r0;
    }

    public static int e0(long j) {
        return j0(j);
    }

    public static o6 f(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int h0(int r0) {
        return p0(r0 << 3);
    }

    public static int i0(int r0, long j) {
        return p0(r0 << 3) + j0(j);
    }

    public static int j0(long j) {
        int r0;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            r0 = 6;
            j >>>= 28;
        } else {
            r0 = 2;
        }
        if (((-2097152) & j) != 0) {
            r0 += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? r0 + 1 : r0;
    }

    public static int l0(int r0) {
        if (r0 >= 0) {
            return p0(r0);
        }
        return 10;
    }

    public static int m0(int r0, int r1) {
        return p0(r0 << 3) + l0(r1);
    }

    public static int n0(int r0, long j) {
        return p0(r0 << 3) + j0(z0(j));
    }

    public static int o0(long j) {
        return j0(z0(j));
    }

    public static int p0(int r1) {
        if ((r1 & (-128)) == 0) {
            return 1;
        }
        if ((r1 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & r1) == 0) {
            return 3;
        }
        return (r1 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int q0(int r0, int r1) {
        return p0(r0 << 3) + p0(r1);
    }

    public static int r0(int r0, long j) {
        return p0(r0 << 3) + 8;
    }

    public static int s0(long j) {
        return 8;
    }

    public static int t0(int r0) {
        return p0(F0(r0));
    }

    public static int u0(int r0, int r1) {
        return p0(r0 << 3) + p0(F0(r1));
    }

    public static int v0(int r0, long j) {
        return p0(r0 << 3) + 8;
    }

    public static int w0(long j) {
        return 8;
    }

    public static int x0(int r0) {
        return 4;
    }

    public static int y0(int r0, int r1) {
        return p0(r0 << 3) + 4;
    }

    public static int z(double d) {
        return 8;
    }

    private static long z0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public final void N() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void O(int r1) throws IOException;

    public abstract void P(int r1, int r2) throws IOException;

    public final void Q(int r1, long j) throws IOException {
        n(r1, z0(j));
    }

    public abstract void R(int r1, y5 y5Var) throws IOException;

    public final void S(long j) throws IOException {
        t(z0(j));
    }

    abstract void T(byte[] bArr, int r2, int r3) throws IOException;

    public final void X(int r1) throws IOException {
        O(F0(r1));
    }

    public abstract void Y(int r1, int r2) throws IOException;

    public abstract void Z(int r1, long j) throws IOException;

    public abstract void a0(long j) throws IOException;

    public abstract int b();

    public abstract void f0(int r1) throws IOException;

    public abstract void g(byte b2) throws IOException;

    public final void g0(int r1, int r2) throws IOException {
        Y(r1, F0(r2));
    }

    public final void h(double d) throws IOException {
        a0(Double.doubleToRawLongBits(d));
    }

    public final void i(float f) throws IOException {
        f0(Float.floatToRawIntBits(f));
    }

    public abstract void j(int r1) throws IOException;

    public final void k(int r1, double d) throws IOException {
        Z(r1, Double.doubleToRawLongBits(d));
    }

    public abstract void k0(int r1, int r2) throws IOException;

    public final void l(int r1, float f) throws IOException {
        k0(r1, Float.floatToRawIntBits(f));
    }

    public abstract void m(int r1, int r2) throws IOException;

    public abstract void n(int r1, long j) throws IOException;

    public abstract void o(int r1, y5 y5Var) throws IOException;

    public abstract void p(int r1, r8 r8Var) throws IOException;

    abstract void q(int r1, r8 r8Var, j9 j9Var) throws IOException;

    public abstract void r(int r1, String str) throws IOException;

    public abstract void s(int r1, boolean z) throws IOException;

    public abstract void t(long j) throws IOException;

    public abstract void u(y5 y5Var) throws IOException;

    public abstract void v(r8 r8Var) throws IOException;

    public abstract void w(String str) throws IOException;

    final void x(String str, pa paVar) throws IOException {
        f1782b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) paVar);
        byte[] bytes = str.getBytes(l7.f1762a);
        try {
            O(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (b e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new b(e2);
        }
    }

    public final void y(boolean z) throws IOException {
        g(z ? (byte) 1 : (byte) 0);
    }
}
