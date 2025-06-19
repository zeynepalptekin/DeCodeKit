package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class v82 extends x72 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f5647b = Logger.getLogger(v82.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f5648c = tc2.m();

    /* renamed from: a, reason: collision with root package name */
    x82 f5649a;

    public static class a extends IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        a(String str, Throwable th) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
        }

        a(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    static class b extends v82 {
        private final byte[] d;
        private final int e;
        private final int f;
        private int g;

        b(byte[] bArr, int r4, int r5) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int r1 = r5 + 0;
            if ((r5 | 0 | (bArr.length - r1)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(r5)));
            }
            this.d = bArr;
            this.e = 0;
            this.g = 0;
            this.f = r1;
        }

        private final void G0(byte[] bArr, int r5, int r6) throws IOException {
            try {
                System.arraycopy(bArr, r5, this.d, this.g, r6);
                this.g += r6;
            } catch (IndexOutOfBoundsException e) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(r6)), e);
            }
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final void B(int r4, a82 a82Var) throws IOException {
            b(1, 3);
            l(2, r4);
            g(3, a82Var);
            b(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final int C() {
            return this.f - this.g;
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final void N(byte b2) throws IOException {
            try {
                byte[] bArr = this.d;
                int r1 = this.g;
                this.g = r1 + 1;
                bArr[r1] = b2;
            } catch (IndexOutOfBoundsException e) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final void P(long j) throws IOException {
            if (v82.f5648c && C() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.d;
                    int r6 = this.g;
                    this.g = r6 + 1;
                    tc2.h(bArr, r6, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.d;
                int r1 = this.g;
                this.g = r1 + 1;
                tc2.h(bArr2, r1, (byte) j);
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
                    throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
                }
            }
            byte[] bArr4 = this.d;
            int r12 = this.g;
            this.g = r12 + 1;
            bArr4[r12] = (byte) j;
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final void R(long j) throws IOException {
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
                throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final void Z(xa2 xa2Var) throws IOException {
            b0(xa2Var.b());
            xa2Var.d(this);
        }

        @Override // com.google.android.gms.internal.ads.x72
        public final void a(byte[] bArr, int r2, int r3) throws IOException {
            G0(bArr, r2, r3);
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final void a0(int r3) throws IOException {
            if (r3 >= 0) {
                b0(r3);
            } else {
                P(r3);
            }
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final void b(int r1, int r2) throws IOException {
            b0((r1 << 3) | r2);
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final void b0(int r5) throws IOException {
            if (!v82.f5648c || t72.a() || C() < 5) {
                while ((r5 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.d;
                        int r1 = this.g;
                        this.g = r1 + 1;
                        bArr[r1] = (byte) ((r5 & 127) | 128);
                        r5 >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
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
                tc2.h(bArr3, r13, (byte) r5);
                return;
            }
            byte[] bArr4 = this.d;
            int r14 = this.g;
            this.g = r14 + 1;
            tc2.h(bArr4, r14, (byte) (r5 | 128));
            int r52 = r5 >>> 7;
            if ((r52 & (-128)) == 0) {
                byte[] bArr5 = this.d;
                int r15 = this.g;
                this.g = r15 + 1;
                tc2.h(bArr5, r15, (byte) r52);
                return;
            }
            byte[] bArr6 = this.d;
            int r16 = this.g;
            this.g = r16 + 1;
            tc2.h(bArr6, r16, (byte) (r52 | 128));
            int r53 = r52 >>> 7;
            if ((r53 & (-128)) == 0) {
                byte[] bArr7 = this.d;
                int r17 = this.g;
                this.g = r17 + 1;
                tc2.h(bArr7, r17, (byte) r53);
                return;
            }
            byte[] bArr8 = this.d;
            int r18 = this.g;
            this.g = r18 + 1;
            tc2.h(bArr8, r18, (byte) (r53 | 128));
            int r54 = r53 >>> 7;
            if ((r54 & (-128)) == 0) {
                byte[] bArr9 = this.d;
                int r19 = this.g;
                this.g = r19 + 1;
                tc2.h(bArr9, r19, (byte) r54);
                return;
            }
            byte[] bArr10 = this.d;
            int r110 = this.g;
            this.g = r110 + 1;
            tc2.h(bArr10, r110, (byte) (r54 | 128));
            byte[] bArr11 = this.d;
            int r111 = this.g;
            this.g = r111 + 1;
            tc2.h(bArr11, r111, (byte) (r54 >>> 7));
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final void d0(int r5) throws IOException {
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
                throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final void g(int r2, a82 a82Var) throws IOException {
            b(r2, 2);
            r(a82Var);
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final void h(int r4, xa2 xa2Var) throws IOException {
            b(1, 3);
            l(2, r4);
            b(3, 2);
            Z(xa2Var);
            b(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.v82
        final void i(int r3, xa2 xa2Var, ub2 ub2Var) throws IOException {
            b(r3, 2);
            q72 q72Var = (q72) xa2Var;
            int i = q72Var.i();
            if (i == -1) {
                i = ub2Var.d(q72Var);
                q72Var.j(i);
            }
            b0(i);
            ub2Var.j(xa2Var, this.f5649a);
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final void k(int r2, int r3) throws IOException {
            b(r2, 0);
            a0(r3);
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final void l(int r2, int r3) throws IOException {
            b(r2, 0);
            b0(r3);
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final void n(int r2, int r3) throws IOException {
            b(r2, 5);
            d0(r3);
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final void o0(int r2, long j) throws IOException {
            b(r2, 0);
            P(j);
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final void p0(int r2, boolean z) throws IOException {
            b(r2, 0);
            N(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final void q0(String str) throws IOException {
            int r0 = this.g;
            try {
                int r1 = v82.g0(str.length() * 3);
                int r2 = v82.g0(str.length());
                if (r2 != r1) {
                    b0(wc2.a(str));
                    this.g = wc2.b(str, this.d, this.g, C());
                    return;
                }
                int r12 = r0 + r2;
                this.g = r12;
                int r13 = wc2.b(str, this.d, r12, C());
                this.g = r0;
                b0((r13 - r0) - r2);
                this.g = r13;
            } catch (zc2 e) {
                this.g = r0;
                j(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new a(e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final void r(a82 a82Var) throws IOException {
            b0(a82Var.size());
            a82Var.j(this);
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final void v0(int r2, String str) throws IOException {
            b(r2, 2);
            q0(str);
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final void x0(int r2, long j) throws IOException {
            b(r2, 1);
            R(j);
        }

        @Override // com.google.android.gms.internal.ads.v82
        public final void z0(byte[] bArr, int r2, int r3) throws IOException {
            b0(r3);
            G0(bArr, 0, r3);
        }
    }

    private v82() {
    }

    public static int A0(int r0, long j) {
        return e0(r0) + T(j);
    }

    public static int B0(int r0, long j) {
        return e0(r0) + T(X(j));
    }

    public static int C0(int r0, long j) {
        return e0(r0) + 8;
    }

    public static int D0(int r0, long j) {
        return e0(r0) + 8;
    }

    public static v82 E0(byte[] bArr) {
        return new b(bArr, 0, bArr.length);
    }

    public static int F0(byte[] bArr) {
        int length = bArr.length;
        return g0(length) + length;
    }

    public static int G(boolean z) {
        return 1;
    }

    public static int H(int r0, double d) {
        return e0(r0) + 8;
    }

    public static int I(int r1, a82 a82Var) {
        int r12 = e0(r1);
        int size = a82Var.size();
        return r12 + g0(size) + size;
    }

    @Deprecated
    static int J(int r2, xa2 xa2Var, ub2 ub2Var) {
        int r22 = e0(r2) << 1;
        q72 q72Var = (q72) xa2Var;
        int i = q72Var.i();
        if (i == -1) {
            i = ub2Var.d(q72Var);
            q72Var.j(i);
        }
        return r22 + i;
    }

    public static int L(double d) {
        return 8;
    }

    public static int M(int r2, a82 a82Var) {
        return (e0(1) << 1) + p(2, r2) + I(3, a82Var);
    }

    public static int S(long j) {
        return T(j);
    }

    public static int T(long j) {
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

    public static int U(long j) {
        return T(X(j));
    }

    public static int V(long j) {
        return 8;
    }

    public static int W(long j) {
        return 8;
    }

    private static long X(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int Y(float f) {
        return 4;
    }

    public static int c(int r1, fa2 fa2Var) {
        int r12 = e0(r1);
        int r2 = fa2Var.b();
        return r12 + g0(r2) + r2;
    }

    public static int d(fa2 fa2Var) {
        int r1 = fa2Var.b();
        return g0(r1) + r1;
    }

    static int e(xa2 xa2Var, ub2 ub2Var) {
        q72 q72Var = (q72) xa2Var;
        int i = q72Var.i();
        if (i == -1) {
            i = ub2Var.d(q72Var);
            q72Var.j(i);
        }
        return g0(i) + i;
    }

    public static int e0(int r0) {
        return g0(r0 << 3);
    }

    public static int f0(int r0) {
        if (r0 >= 0) {
            return g0(r0);
        }
        return 10;
    }

    public static int g0(int r1) {
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

    public static int h0(int r0) {
        return g0(l0(r0));
    }

    public static int i0(int r0) {
        return 4;
    }

    public static int j0(int r0) {
        return 4;
    }

    public static int k0(int r0) {
        return f0(r0);
    }

    private static int l0(int r1) {
        return (r1 >> 31) ^ (r1 << 1);
    }

    @Deprecated
    public static int m0(int r0) {
        return g0(r0);
    }

    public static int n0(xa2 xa2Var) {
        int r1 = xa2Var.b();
        return g0(r1) + r1;
    }

    public static int o(int r0, int r1) {
        return e0(r0) + f0(r1);
    }

    public static int p(int r0, int r1) {
        return e0(r0) + g0(r1);
    }

    public static int q(int r0, int r1) {
        return e0(r0) + g0(l0(r1));
    }

    public static int r0(String str) {
        int length;
        try {
            length = wc2.a(str);
        } catch (zc2 unused) {
            length = str.getBytes(o92.f4659a).length;
        }
        return g0(length) + length;
    }

    public static int s(int r0, int r1) {
        return e0(r0) + 4;
    }

    public static int s0(int r0, boolean z) {
        return e0(r0) + 1;
    }

    public static int t(a82 a82Var) {
        int size = a82Var.size();
        return g0(size) + size;
    }

    @Deprecated
    public static int t0(xa2 xa2Var) {
        return xa2Var.b();
    }

    public static int u(int r0, int r1) {
        return e0(r0) + 4;
    }

    public static int v(int r0, int r1) {
        return e0(r0) + f0(r1);
    }

    public static int w(int r0, float f) {
        return e0(r0) + 4;
    }

    public static int w0(int r0, String str) {
        return e0(r0) + r0(str);
    }

    public static int x(int r2, fa2 fa2Var) {
        return (e0(1) << 1) + p(2, r2) + c(3, fa2Var);
    }

    public static int y(int r2, xa2 xa2Var) {
        return (e0(1) << 1) + p(2, r2) + e0(3) + n0(xa2Var);
    }

    public static int y0(int r0, long j) {
        return e0(r0) + T(j);
    }

    static int z(int r0, xa2 xa2Var, ub2 ub2Var) {
        return e0(r0) + e(xa2Var, ub2Var);
    }

    public final void A(int r1, double d) throws IOException {
        x0(r1, Double.doubleToRawLongBits(d));
    }

    public abstract void B(int r1, a82 a82Var) throws IOException;

    public abstract int C();

    public final void D() {
        if (C() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void F(boolean z) throws IOException {
        N(z ? (byte) 1 : (byte) 0);
    }

    public final void K(double d) throws IOException {
        R(Double.doubleToRawLongBits(d));
    }

    public abstract void N(byte b2) throws IOException;

    public final void O(float f) throws IOException {
        d0(Float.floatToRawIntBits(f));
    }

    public abstract void P(long j) throws IOException;

    public final void Q(long j) throws IOException {
        P(X(j));
    }

    public abstract void R(long j) throws IOException;

    public abstract void Z(xa2 xa2Var) throws IOException;

    public abstract void a0(int r1) throws IOException;

    public abstract void b(int r1, int r2) throws IOException;

    public abstract void b0(int r1) throws IOException;

    public final void c0(int r1) throws IOException {
        b0(l0(r1));
    }

    public abstract void d0(int r1) throws IOException;

    public final void f(int r1, float f) throws IOException {
        n(r1, Float.floatToRawIntBits(f));
    }

    public abstract void g(int r1, a82 a82Var) throws IOException;

    public abstract void h(int r1, xa2 xa2Var) throws IOException;

    abstract void i(int r1, xa2 xa2Var, ub2 ub2Var) throws IOException;

    final void j(String str, zc2 zc2Var) throws IOException {
        f5647b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zc2Var);
        byte[] bytes = str.getBytes(o92.f4659a);
        try {
            b0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (a e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new a(e2);
        }
    }

    public abstract void k(int r1, int r2) throws IOException;

    public abstract void l(int r1, int r2) throws IOException;

    public final void m(int r1, int r2) throws IOException {
        l(r1, l0(r2));
    }

    public abstract void n(int r1, int r2) throws IOException;

    public abstract void o0(int r1, long j) throws IOException;

    public abstract void p0(int r1, boolean z) throws IOException;

    public abstract void q0(String str) throws IOException;

    public abstract void r(a82 a82Var) throws IOException;

    public final void u0(int r1, long j) throws IOException {
        o0(r1, X(j));
    }

    public abstract void v0(int r1, String str) throws IOException;

    public abstract void x0(int r1, long j) throws IOException;

    abstract void z0(byte[] bArr, int r2, int r3) throws IOException;
}
