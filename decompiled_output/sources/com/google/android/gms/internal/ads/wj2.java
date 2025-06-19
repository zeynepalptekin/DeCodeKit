package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class wj2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f5842a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5843b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5844c;
    private final int d;
    private final int e;
    private final short[] f;
    private int g;
    private short[] h;
    private int i;
    private short[] j;
    private int k;
    private short[] l;
    private int q;
    private int r;
    private int s;
    private int t;
    private int v;
    private int w;
    private int x;
    private int m = 0;
    private int n = 0;
    private int u = 0;
    private float o = 1.0f;
    private float p = 1.0f;

    public wj2(int r2, int r3) {
        this.f5842a = r2;
        this.f5843b = r3;
        this.f5844c = r2 / 400;
        int r22 = r2 / 65;
        this.d = r22;
        int r23 = r22 * 2;
        this.e = r23;
        this.f = new short[r23];
        this.g = r23;
        this.h = new short[r23 * r3];
        this.i = r23;
        this.j = new short[r23 * r3];
        this.k = r23;
        this.l = new short[r23 * r3];
    }

    private final int b(short[] sArr, int r11, int r12, int r13) {
        int r112 = r11 * this.f5843b;
        int r0 = 1;
        int r2 = 255;
        int r3 = 0;
        int r4 = 0;
        while (r12 <= r13) {
            int r6 = 0;
            for (int r5 = 0; r5 < r12; r5++) {
                short s = sArr[r112 + r5];
                short s2 = sArr[r112 + r12 + r5];
                r6 += s >= s2 ? s - s2 : s2 - s;
            }
            if (r6 * r3 < r0 * r12) {
                r3 = r12;
                r0 = r6;
            }
            if (r6 * r2 > r4 * r12) {
                r2 = r12;
                r4 = r6;
            }
            r12++;
        }
        this.w = r0 / r3;
        this.x = r4 / r2;
        return r3;
    }

    private static void c(int r8, int r9, short[] sArr, int r11, short[] sArr2, int r13, short[] sArr3, int r15) {
        for (int r1 = 0; r1 < r9; r1++) {
            int r2 = (r11 * r9) + r1;
            int r3 = (r15 * r9) + r1;
            int r4 = (r13 * r9) + r1;
            for (int r5 = 0; r5 < r8; r5++) {
                sArr[r2] = (short) (((sArr2[r4] * (r8 - r5)) + (sArr3[r3] * r5)) / r8);
                r2 += r9;
                r4 += r9;
                r3 += r9;
            }
        }
    }

    private final void e(short[] sArr, int r5, int r6) {
        f(r6);
        int r0 = this.f5843b;
        System.arraycopy(sArr, r5 * r0, this.j, this.r * r0, r0 * r6);
        this.r += r6;
    }

    private final void f(int r3) {
        int r0 = this.r + r3;
        int r1 = this.i;
        if (r0 > r1) {
            int r12 = r1 + (r1 / 2) + r3;
            this.i = r12;
            this.j = Arrays.copyOf(this.j, r12 * this.f5843b);
        }
    }

    private final void g(int r3) {
        int r0 = this.q + r3;
        int r1 = this.g;
        if (r0 > r1) {
            int r12 = r1 + (r1 / 2) + r3;
            this.g = r12;
            this.h = Arrays.copyOf(this.h, r12 * this.f5843b);
        }
    }

    private final void i(short[] sArr, int r8, int r9) {
        int r0 = this.e / r9;
        int r1 = this.f5843b;
        int r92 = r9 * r1;
        int r82 = r8 * r1;
        for (int r2 = 0; r2 < r0; r2++) {
            int r4 = 0;
            for (int r3 = 0; r3 < r92; r3++) {
                r4 += sArr[(r2 * r92) + r82 + r3];
            }
            this.f[r2] = (short) (r4 / r92);
        }
    }

    private final void m() {
        int r10;
        int r18;
        int r13;
        int r4;
        int r42;
        int r7;
        int r1 = this.r;
        float f = this.o / this.p;
        double d = f;
        int r72 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int r8 = this.q;
            if (r8 >= this.e) {
                int r9 = 0;
                while (true) {
                    int r102 = this.t;
                    if (r102 > 0) {
                        int r103 = Math.min(this.e, r102);
                        e(this.h, r9, r103);
                        this.t -= r103;
                        r9 += r103;
                    } else {
                        short[] sArr = this.h;
                        int r11 = this.f5842a;
                        int r112 = r11 > 4000 ? r11 / 4000 : 1;
                        if (this.f5843b == r72 && r112 == r72) {
                            r10 = b(sArr, r9, this.f5844c, this.d);
                        } else {
                            i(sArr, r9, r112);
                            int r12 = b(this.f, 0, this.f5844c / r112, this.d / r112);
                            if (r112 != r72) {
                                int r122 = r12 * r112;
                                int r113 = r112 << 2;
                                int r132 = r122 - r113;
                                int r123 = r122 + r113;
                                int r114 = this.f5844c;
                                if (r132 < r114) {
                                    r132 = r114;
                                }
                                int r115 = this.d;
                                if (r123 > r115) {
                                    r123 = r115;
                                }
                                if (this.f5843b == r72) {
                                    r10 = b(sArr, r9, r132, r123);
                                } else {
                                    i(sArr, r9, r72);
                                    r10 = b(this.f, 0, r132, r123);
                                }
                            } else {
                                r10 = r12;
                            }
                        }
                        int r116 = this.w;
                        int r15 = r116 != 0 && this.u != 0 && this.x <= r116 * 3 && (r116 << 1) > this.v * 3 ? this.u : r10;
                        this.v = this.w;
                        this.u = r10;
                        if (d > 1.0d) {
                            short[] sArr2 = this.h;
                            if (f >= 2.0f) {
                                r13 = (int) (r15 / (f - 1.0f));
                            } else {
                                this.t = (int) ((r15 * (2.0f - f)) / (f - 1.0f));
                                r13 = r15;
                            }
                            f(r13);
                            int r182 = r13;
                            c(r13, this.f5843b, this.j, this.r, sArr2, r9, sArr2, r9 + r15);
                            this.r += r182;
                            r9 += r15 + r182;
                        } else {
                            int r73 = r15;
                            short[] sArr3 = this.h;
                            if (f < 0.5f) {
                                r18 = (int) ((r73 * f) / (1.0f - f));
                            } else {
                                this.t = (int) ((r73 * ((2.0f * f) - 1.0f)) / (1.0f - f));
                                r18 = r73;
                            }
                            int r14 = r73 + r18;
                            f(r14);
                            int r104 = this.f5843b;
                            System.arraycopy(sArr3, r9 * r104, this.j, this.r * r104, r104 * r73);
                            c(r18, this.f5843b, this.j, this.r + r73, sArr3, r73 + r9, sArr3, r9);
                            this.r += r14;
                            r9 += r18;
                        }
                    }
                    if (this.e + r9 > r8) {
                        break;
                    } else {
                        r72 = 1;
                    }
                }
                int r2 = this.q - r9;
                short[] sArr4 = this.h;
                int r43 = this.f5843b;
                System.arraycopy(sArr4, r9 * r43, sArr4, 0, r43 * r2);
                this.q = r2;
            }
        } else {
            e(this.h, 0, this.q);
            this.q = 0;
        }
        float f2 = this.p;
        if (f2 == 1.0f || this.r == r1) {
            return;
        }
        int r3 = this.f5842a;
        int r22 = (int) (r3 / f2);
        while (true) {
            if (r22 <= 16384 && r3 <= 16384) {
                break;
            }
            r22 /= 2;
            r3 /= 2;
        }
        int r44 = this.r - r1;
        int r5 = this.s + r44;
        int r74 = this.k;
        if (r5 > r74) {
            int r75 = r74 + (r74 / 2) + r44;
            this.k = r75;
            this.l = Arrays.copyOf(this.l, r75 * this.f5843b);
        }
        short[] sArr5 = this.j;
        int r76 = this.f5843b;
        System.arraycopy(sArr5, r1 * r76, this.l, this.s * r76, r76 * r44);
        this.r = r1;
        this.s += r44;
        int r16 = 0;
        while (true) {
            r4 = this.s;
            if (r16 >= r4 - 1) {
                break;
            }
            while (true) {
                r42 = this.m;
                int r52 = (r42 + 1) * r22;
                r7 = this.n;
                if (r52 <= r7 * r3) {
                    break;
                }
                f(1);
                int r45 = 0;
                while (true) {
                    int r53 = this.f5843b;
                    if (r45 < r53) {
                        short[] sArr6 = this.j;
                        int r82 = (this.r * r53) + r45;
                        short[] sArr7 = this.l;
                        int r105 = (r16 * r53) + r45;
                        short s = sArr7[r105];
                        short s2 = sArr7[r105 + r53];
                        int r92 = this.n * r3;
                        int r106 = this.m;
                        int r124 = r106 * r22;
                        int r107 = (r106 + 1) * r22;
                        int r93 = r107 - r92;
                        int r108 = r107 - r124;
                        sArr6[r82] = (short) (((s * r93) + ((r108 - r93) * s2)) / r108);
                        r45++;
                    }
                }
                this.n++;
                this.r++;
            }
            int r46 = r42 + 1;
            this.m = r46;
            if (r46 == r3) {
                this.m = 0;
                vp2.e(r7 == r22);
                this.n = 0;
            }
            r16++;
        }
        int r17 = r4 - 1;
        if (r17 != 0) {
            short[] sArr8 = this.l;
            int r32 = this.f5843b;
            System.arraycopy(sArr8, r17 * r32, sArr8, 0, (r4 - r17) * r32);
            this.s -= r17;
        }
    }

    public final void a(float f) {
        this.o = f;
    }

    public final void d(ShortBuffer shortBuffer) {
        int r0 = shortBuffer.remaining();
        int r1 = this.f5843b;
        int r02 = r0 / r1;
        g(r02);
        shortBuffer.get(this.h, this.q * this.f5843b, ((r1 * r02) << 1) / 2);
        this.q += r02;
        m();
    }

    public final void h(ShortBuffer shortBuffer) {
        int r0 = Math.min(shortBuffer.remaining() / this.f5843b, this.r);
        shortBuffer.put(this.j, 0, this.f5843b * r0);
        int r5 = this.r - r0;
        this.r = r5;
        short[] sArr = this.j;
        int r2 = this.f5843b;
        System.arraycopy(sArr, r0 * r2, sArr, 0, r5 * r2);
    }

    public final void j(float f) {
        this.p = f;
    }

    public final void k() {
        int r4;
        int r0 = this.q;
        float f = this.o;
        float f2 = this.p;
        int r3 = this.r + ((int) ((((r0 / (f / f2)) + this.s) / f2) + 0.5f));
        g((this.e * 2) + r0);
        int r2 = 0;
        while (true) {
            r4 = this.e;
            int r6 = this.f5843b;
            if (r2 >= r4 * 2 * r6) {
                break;
            }
            this.h[(r6 * r0) + r2] = 0;
            r2++;
        }
        this.q += r4 * 2;
        m();
        if (this.r > r3) {
            this.r = r3;
        }
        this.q = 0;
        this.t = 0;
        this.s = 0;
    }

    public final int l() {
        return this.r;
    }
}
