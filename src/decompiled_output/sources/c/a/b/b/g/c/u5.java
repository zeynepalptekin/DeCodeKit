package c.a.b.b.g.c;

import java.io.IOException;

/* loaded from: classes.dex */
final class u5 {
    static int a(int r2, byte[] bArr, int r4, int r5, t5 t5Var) throws q7 {
        if ((r2 >>> 3) == 0) {
            throw q7.d();
        }
        int r0 = r2 & 7;
        if (r0 == 0) {
            return k(bArr, r4, t5Var);
        }
        if (r0 == 1) {
            return r4 + 8;
        }
        if (r0 == 2) {
            return i(bArr, r4, t5Var) + t5Var.f1823a;
        }
        if (r0 != 3) {
            if (r0 == 5) {
                return r4 + 4;
            }
            throw q7.d();
        }
        int r22 = (r2 & (-8)) | 4;
        int r02 = 0;
        while (r4 < r5) {
            r4 = i(bArr, r4, t5Var);
            r02 = t5Var.f1823a;
            if (r02 == r22) {
                break;
            }
            r4 = a(r02, bArr, r4, r5, t5Var);
        }
        if (r4 > r5 || r02 != r22) {
            throw q7.g();
        }
        return r4;
    }

    static int b(int r2, byte[] bArr, int r4, int r5, r7<?> r7Var, t5 t5Var) {
        j7 j7Var = (j7) r7Var;
        int i = i(bArr, r4, t5Var);
        while (true) {
            j7Var.j(t5Var.f1823a);
            if (i >= r5) {
                break;
            }
            int i2 = i(bArr, i, t5Var);
            if (r2 != t5Var.f1823a) {
                break;
            }
            i = i(bArr, i2, t5Var);
        }
        return i;
    }

    static int c(int r9, byte[] bArr, int r11, int r12, fa faVar, t5 t5Var) throws q7 {
        if ((r9 >>> 3) == 0) {
            throw q7.d();
        }
        int r0 = r9 & 7;
        if (r0 == 0) {
            int r10 = k(bArr, r11, t5Var);
            faVar.c(r9, Long.valueOf(t5Var.f1824b));
            return r10;
        }
        if (r0 == 1) {
            faVar.c(r9, Long.valueOf(l(bArr, r11)));
            return r11 + 8;
        }
        if (r0 == 2) {
            int i = i(bArr, r11, t5Var);
            int r122 = t5Var.f1823a;
            if (r122 < 0) {
                throw q7.b();
            }
            if (r122 > bArr.length - i) {
                throw q7.a();
            }
            faVar.c(r9, r122 == 0 ? y5.e : y5.r(bArr, i, r122));
            return i + r122;
        }
        if (r0 != 3) {
            if (r0 != 5) {
                throw q7.d();
            }
            faVar.c(r9, Integer.valueOf(h(bArr, r11)));
            return r11 + 4;
        }
        fa faVarG = fa.g();
        int r7 = (r9 & (-8)) | 4;
        int r02 = 0;
        while (true) {
            if (r11 >= r12) {
                break;
            }
            int i2 = i(bArr, r11, t5Var);
            int r112 = t5Var.f1823a;
            r02 = r112;
            if (r112 == r7) {
                r11 = i2;
                break;
            }
            int r03 = c(r02, bArr, i2, r12, faVarG, t5Var);
            r02 = r112;
            r11 = r03;
        }
        if (r11 > r12 || r02 != r7) {
            throw q7.g();
        }
        faVar.c(r9, faVarG);
        return r11;
    }

    static int d(int r1, byte[] bArr, int r3, t5 t5Var) {
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
                                t5Var.f1823a = r14;
                                return r02;
                            }
                            r32 = r02;
                        }
                    }
                }
            }
            t5Var.f1823a = r13 | r2;
            return r32;
        }
        r22 = b2 << 7;
        t5Var.f1823a = r12 | r22;
        return r0;
    }

    static int e(j9<?> j9Var, int r3, byte[] bArr, int r5, int r6, r7<?> r7Var, t5 t5Var) throws IOException {
        int r52 = g(j9Var, bArr, r5, r6, t5Var);
        while (true) {
            r7Var.add(t5Var.f1825c);
            if (r52 >= r6) {
                break;
            }
            int i = i(bArr, r52, t5Var);
            if (r3 != t5Var.f1823a) {
                break;
            }
            r52 = g(j9Var, bArr, i, r6, t5Var);
        }
        return r52;
    }

    static int f(j9 j9Var, byte[] bArr, int r10, int r11, int r12, t5 t5Var) throws IOException {
        v8 v8Var = (v8) j9Var;
        Object objA = v8Var.a();
        int r9 = v8Var.p(objA, bArr, r10, r11, r12, t5Var);
        v8Var.g(objA);
        t5Var.f1825c = objA;
        return r9;
    }

    static int g(j9 j9Var, byte[] bArr, int r8, int r9, t5 t5Var) throws IOException {
        int r0 = r8 + 1;
        int r82 = bArr[r8];
        if (r82 < 0) {
            r0 = d(r82, bArr, r0, t5Var);
            r82 = t5Var.f1823a;
        }
        int r3 = r0;
        if (r82 < 0 || r82 > r9 - r3) {
            throw q7.a();
        }
        Object objA = j9Var.a();
        int r83 = r82 + r3;
        j9Var.d(objA, bArr, r3, r83, t5Var);
        j9Var.g(objA);
        t5Var.f1825c = objA;
        return r83;
    }

    static int h(byte[] bArr, int r3) {
        return ((bArr[r3 + 3] & 255) << 24) | (bArr[r3] & 255) | ((bArr[r3 + 1] & 255) << 8) | ((bArr[r3 + 2] & 255) << 16);
    }

    static int i(byte[] bArr, int r2, t5 t5Var) {
        int r0 = r2 + 1;
        byte b2 = bArr[r2];
        if (b2 < 0) {
            return d(b2, bArr, r0, t5Var);
        }
        t5Var.f1823a = b2;
        return r0;
    }

    static int j(byte[] bArr, int r3, r7<?> r7Var, t5 t5Var) throws IOException {
        j7 j7Var = (j7) r7Var;
        int i = i(bArr, r3, t5Var);
        int r0 = t5Var.f1823a + i;
        while (i < r0) {
            i = i(bArr, i, t5Var);
            j7Var.j(t5Var.f1823a);
        }
        if (i == r0) {
            return i;
        }
        throw q7.a();
    }

    static int k(byte[] bArr, int r10, t5 t5Var) {
        int r0 = r10 + 1;
        long j = bArr[r10];
        if (j >= 0) {
            t5Var.f1824b = j;
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
        t5Var.f1824b = j2;
        return r102;
    }

    static long l(byte[] bArr, int r8) {
        return ((bArr[r8 + 7] & 255) << 56) | (bArr[r8] & 255) | ((bArr[r8 + 1] & 255) << 8) | ((bArr[r8 + 2] & 255) << 16) | ((bArr[r8 + 3] & 255) << 24) | ((bArr[r8 + 4] & 255) << 32) | ((bArr[r8 + 5] & 255) << 40) | ((bArr[r8 + 6] & 255) << 48);
    }

    static double m(byte[] bArr, int r1) {
        return Double.longBitsToDouble(l(bArr, r1));
    }

    static int n(byte[] bArr, int r4, t5 t5Var) throws q7 {
        int i = i(bArr, r4, t5Var);
        int r0 = t5Var.f1823a;
        if (r0 < 0) {
            throw q7.b();
        }
        if (r0 == 0) {
            t5Var.f1825c = "";
            return i;
        }
        t5Var.f1825c = new String(bArr, i, r0, l7.f1762a);
        return i + r0;
    }

    static float o(byte[] bArr, int r1) {
        return Float.intBitsToFloat(h(bArr, r1));
    }

    static int p(byte[] bArr, int r2, t5 t5Var) throws q7 {
        int i = i(bArr, r2, t5Var);
        int r0 = t5Var.f1823a;
        if (r0 < 0) {
            throw q7.b();
        }
        if (r0 == 0) {
            t5Var.f1825c = "";
            return i;
        }
        t5Var.f1825c = ma.k(bArr, i, r0);
        return i + r0;
    }

    static int q(byte[] bArr, int r3, t5 t5Var) throws q7 {
        int i = i(bArr, r3, t5Var);
        int r0 = t5Var.f1823a;
        if (r0 < 0) {
            throw q7.b();
        }
        if (r0 > bArr.length - i) {
            throw q7.a();
        }
        if (r0 == 0) {
            t5Var.f1825c = y5.e;
            return i;
        }
        t5Var.f1825c = y5.r(bArr, i, r0);
        return i + r0;
    }
}
