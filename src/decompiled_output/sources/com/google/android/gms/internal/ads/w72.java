package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class w72 {
    static int a(int r2, byte[] bArr, int r4, int r5, v72 v72Var) throws w92 {
        if ((r2 >>> 3) == 0) {
            throw w92.d();
        }
        int r0 = r2 & 7;
        if (r0 == 0) {
            return j(bArr, r4, v72Var);
        }
        if (r0 == 1) {
            return r4 + 8;
        }
        if (r0 == 2) {
            return h(bArr, r4, v72Var) + v72Var.f5640a;
        }
        if (r0 != 3) {
            if (r0 == 5) {
                return r4 + 4;
            }
            throw w92.d();
        }
        int r22 = (r2 & (-8)) | 4;
        int r02 = 0;
        while (r4 < r5) {
            r4 = h(bArr, r4, v72Var);
            r02 = v72Var.f5640a;
            if (r02 == r22) {
                break;
            }
            r4 = a(r02, bArr, r4, r5, v72Var);
        }
        if (r4 > r5 || r02 != r22) {
            throw w92.h();
        }
        return r4;
    }

    static int b(int r2, byte[] bArr, int r4, int r5, x92<?> x92Var, v72 v72Var) {
        p92 p92Var = (p92) x92Var;
        int r42 = h(bArr, r4, v72Var);
        while (true) {
            p92Var.U(v72Var.f5640a);
            if (r42 >= r5) {
                break;
            }
            int r0 = h(bArr, r42, v72Var);
            if (r2 != v72Var.f5640a) {
                break;
            }
            r42 = h(bArr, r0, v72Var);
        }
        return r42;
    }

    static int c(int r9, byte[] bArr, int r11, int r12, qc2 qc2Var, v72 v72Var) throws w92 {
        if ((r9 >>> 3) == 0) {
            throw w92.d();
        }
        int r0 = r9 & 7;
        if (r0 == 0) {
            int r10 = j(bArr, r11, v72Var);
            qc2Var.k(r9, Long.valueOf(v72Var.f5641b));
            return r10;
        }
        if (r0 == 1) {
            qc2Var.k(r9, Long.valueOf(o(bArr, r11)));
            return r11 + 8;
        }
        if (r0 == 2) {
            int r112 = h(bArr, r11, v72Var);
            int r122 = v72Var.f5640a;
            if (r122 < 0) {
                throw w92.b();
            }
            if (r122 > bArr.length - r112) {
                throw w92.a();
            }
            qc2Var.k(r9, r122 == 0 ? a82.e : a82.P(bArr, r112, r122));
            return r112 + r122;
        }
        if (r0 != 3) {
            if (r0 != 5) {
                throw w92.d();
            }
            qc2Var.k(r9, Integer.valueOf(n(bArr, r11)));
            return r11 + 4;
        }
        qc2 qc2VarI = qc2.i();
        int r7 = (r9 & (-8)) | 4;
        int r02 = 0;
        while (true) {
            if (r11 >= r12) {
                break;
            }
            int r2 = h(bArr, r11, v72Var);
            int r113 = v72Var.f5640a;
            r02 = r113;
            if (r113 == r7) {
                r11 = r2;
                break;
            }
            int r03 = c(r02, bArr, r2, r12, qc2VarI, v72Var);
            r02 = r113;
            r11 = r03;
        }
        if (r11 > r12 || r02 != r7) {
            throw w92.h();
        }
        qc2Var.k(r9, qc2VarI);
        return r11;
    }

    static int d(int r1, byte[] bArr, int r3, v72 v72Var) {
        int r2;
        int r22;
        int r12 = r1 & 127;
        int r0 = r3 + 1;
        byte b2 = bArr[r3];
        if (b2 < 0) {
            int r13 = r12 | ((b2 & Byte.MAX_VALUE) << 7);
            int r32 = r0 + 1;
            byte b3 = bArr[r0];
            if (b3 >= 0) {
                r2 = b3 << 14;
            } else {
                r12 = r13 | ((b3 & Byte.MAX_VALUE) << 14);
                r0 = r32 + 1;
                byte b4 = bArr[r32];
                if (b4 >= 0) {
                    r22 = b4 << 21;
                } else {
                    r13 = r12 | ((b4 & Byte.MAX_VALUE) << 21);
                    r32 = r0 + 1;
                    byte b5 = bArr[r0];
                    if (b5 >= 0) {
                        r2 = b5 << 28;
                    } else {
                        int r14 = r13 | ((b5 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int r02 = r32 + 1;
                            if (bArr[r32] >= 0) {
                                v72Var.f5640a = r14;
                                return r02;
                            }
                            r32 = r02;
                        }
                    }
                }
            }
            v72Var.f5640a = r13 | r2;
            return r32;
        }
        r22 = b2 << 7;
        v72Var.f5640a = r12 | r22;
        return r0;
    }

    static int e(ub2<?> ub2Var, int r3, byte[] bArr, int r5, int r6, x92<?> x92Var, v72 v72Var) throws IOException {
        int r52 = g(ub2Var, bArr, r5, r6, v72Var);
        while (true) {
            x92Var.add(v72Var.f5642c);
            if (r52 >= r6) {
                break;
            }
            int r0 = h(bArr, r52, v72Var);
            if (r3 != v72Var.f5640a) {
                break;
            }
            r52 = g(ub2Var, bArr, r0, r6, v72Var);
        }
        return r52;
    }

    static int f(ub2 ub2Var, byte[] bArr, int r10, int r11, int r12, v72 v72Var) throws IOException {
        bb2 bb2Var = (bb2) ub2Var;
        Object objG = bb2Var.g();
        int r9 = bb2Var.o(objG, bArr, r10, r11, r12, v72Var);
        bb2Var.c(objG);
        v72Var.f5642c = objG;
        return r9;
    }

    static int g(ub2 ub2Var, byte[] bArr, int r8, int r9, v72 v72Var) throws IOException {
        int r0 = r8 + 1;
        int r82 = bArr[r8];
        if (r82 < 0) {
            r0 = d(r82, bArr, r0, v72Var);
            r82 = v72Var.f5640a;
        }
        int r3 = r0;
        if (r82 < 0 || r82 > r9 - r3) {
            throw w92.a();
        }
        Object objG = ub2Var.g();
        int r83 = r82 + r3;
        ub2Var.a(objG, bArr, r3, r83, v72Var);
        ub2Var.c(objG);
        v72Var.f5642c = objG;
        return r83;
    }

    static int h(byte[] bArr, int r2, v72 v72Var) {
        int r0 = r2 + 1;
        byte b2 = bArr[r2];
        if (b2 < 0) {
            return d(b2, bArr, r0, v72Var);
        }
        v72Var.f5640a = b2;
        return r0;
    }

    static int i(byte[] bArr, int r3, x92<?> x92Var, v72 v72Var) throws IOException {
        p92 p92Var = (p92) x92Var;
        int r32 = h(bArr, r3, v72Var);
        int r0 = v72Var.f5640a + r32;
        while (r32 < r0) {
            r32 = h(bArr, r32, v72Var);
            p92Var.U(v72Var.f5640a);
        }
        if (r32 == r0) {
            return r32;
        }
        throw w92.a();
    }

    static int j(byte[] bArr, int r10, v72 v72Var) {
        int r0 = r10 + 1;
        long j = bArr[r10];
        if (j >= 0) {
            v72Var.f5641b = j;
            return r0;
        }
        int r102 = r0 + 1;
        byte b2 = bArr[r0];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int r3 = 7;
        while (b2 < 0) {
            int r02 = r102 + 1;
            r3 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << r3;
            b2 = bArr[r102];
            r102 = r02;
        }
        v72Var.f5641b = j2;
        return r102;
    }

    static int k(byte[] bArr, int r4, v72 v72Var) throws w92 {
        int r42 = h(bArr, r4, v72Var);
        int r0 = v72Var.f5640a;
        if (r0 < 0) {
            throw w92.b();
        }
        if (r0 == 0) {
            v72Var.f5642c = "";
            return r42;
        }
        v72Var.f5642c = new String(bArr, r42, r0, o92.f4659a);
        return r42 + r0;
    }

    static int l(byte[] bArr, int r2, v72 v72Var) throws w92 {
        int r22 = h(bArr, r2, v72Var);
        int r0 = v72Var.f5640a;
        if (r0 < 0) {
            throw w92.b();
        }
        if (r0 == 0) {
            v72Var.f5642c = "";
            return r22;
        }
        v72Var.f5642c = wc2.l(bArr, r22, r0);
        return r22 + r0;
    }

    static int m(byte[] bArr, int r3, v72 v72Var) throws w92 {
        int r32 = h(bArr, r3, v72Var);
        int r0 = v72Var.f5640a;
        if (r0 < 0) {
            throw w92.b();
        }
        if (r0 > bArr.length - r32) {
            throw w92.a();
        }
        if (r0 == 0) {
            v72Var.f5642c = a82.e;
            return r32;
        }
        v72Var.f5642c = a82.P(bArr, r32, r0);
        return r32 + r0;
    }

    static int n(byte[] bArr, int r3) {
        return ((bArr[r3 + 3] & 255) << 24) | (bArr[r3] & 255) | ((bArr[r3 + 1] & 255) << 8) | ((bArr[r3 + 2] & 255) << 16);
    }

    static long o(byte[] bArr, int r8) {
        return ((bArr[r8 + 7] & 255) << 56) | (bArr[r8] & 255) | ((bArr[r8 + 1] & 255) << 8) | ((bArr[r8 + 2] & 255) << 16) | ((bArr[r8 + 3] & 255) << 24) | ((bArr[r8 + 4] & 255) << 32) | ((bArr[r8 + 5] & 255) << 40) | ((bArr[r8 + 6] & 255) << 48);
    }

    static double p(byte[] bArr, int r1) {
        return Double.longBitsToDouble(o(bArr, r1));
    }

    static float q(byte[] bArr, int r1) {
        return Float.intBitsToFloat(n(bArr, r1));
    }
}
