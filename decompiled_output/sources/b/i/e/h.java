package b.i.e;

import android.graphics.Path;
import android.util.Log;
import androidx.annotation.i0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1020a = "PathParser";

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        int f1021a;

        /* renamed from: b, reason: collision with root package name */
        boolean f1022b;

        a() {
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public char f1023a;

        /* renamed from: b, reason: collision with root package name */
        public float[] f1024b;

        b(char c2, float[] fArr) {
            this.f1023a = c2;
            this.f1024b = fArr;
        }

        b(b bVar) {
            this.f1023a = bVar.f1023a;
            float[] fArr = bVar.f1024b;
            this.f1024b = h.c(fArr, 0, fArr.length);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private static void a(Path path, float[] fArr, char c2, char c3, float[] fArr2) {
            int r19;
            int r24;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            char c4 = c3;
            float f9 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            float f12 = fArr[3];
            float f13 = fArr[4];
            float f14 = fArr[5];
            switch (c4) {
                case 'A':
                case 'a':
                    r19 = 7;
                    break;
                case 'C':
                case 'c':
                    r19 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    r19 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    r19 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    r19 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f13, f14);
                    f9 = f13;
                    f11 = f9;
                    f10 = f14;
                    f12 = f10;
                    r19 = 2;
                    break;
            }
            float f15 = f9;
            float f16 = f10;
            float f17 = f13;
            float f18 = f14;
            int r7 = 0;
            char c5 = c2;
            while (r7 < fArr2.length) {
                if (c4 != 'A') {
                    if (c4 == 'C') {
                        r24 = r7;
                        int r72 = r24 + 2;
                        int r8 = r24 + 3;
                        int r9 = r24 + 4;
                        int r11 = r24 + 5;
                        path.cubicTo(fArr2[r24 + 0], fArr2[r24 + 1], fArr2[r72], fArr2[r8], fArr2[r9], fArr2[r11]);
                        f15 = fArr2[r9];
                        float f19 = fArr2[r11];
                        float f20 = fArr2[r72];
                        float f21 = fArr2[r8];
                        f16 = f19;
                        f12 = f21;
                        f11 = f20;
                    } else if (c4 == 'H') {
                        r24 = r7;
                        int r73 = r24 + 0;
                        path.lineTo(fArr2[r73], f16);
                        f15 = fArr2[r73];
                    } else if (c4 == 'Q') {
                        r24 = r7;
                        int r74 = r24 + 0;
                        int r1 = r24 + 1;
                        int r3 = r24 + 2;
                        int r5 = r24 + 3;
                        path.quadTo(fArr2[r74], fArr2[r1], fArr2[r3], fArr2[r5]);
                        float f22 = fArr2[r74];
                        float f23 = fArr2[r1];
                        f15 = fArr2[r3];
                        f16 = fArr2[r5];
                        f11 = f22;
                        f12 = f23;
                    } else if (c4 == 'V') {
                        r24 = r7;
                        int r75 = r24 + 0;
                        path.lineTo(f15, fArr2[r75]);
                        f16 = fArr2[r75];
                    } else if (c4 != 'a') {
                        if (c4 != 'c') {
                            if (c4 == 'h') {
                                int r0 = r7 + 0;
                                path.rLineTo(fArr2[r0], 0.0f);
                                f15 += fArr2[r0];
                            } else if (c4 != 'q') {
                                if (c4 == 'v') {
                                    int r02 = r7 + 0;
                                    path.rLineTo(0.0f, fArr2[r02]);
                                    f4 = fArr2[r02];
                                } else if (c4 == 'L') {
                                    int r03 = r7 + 0;
                                    int r4 = r7 + 1;
                                    path.lineTo(fArr2[r03], fArr2[r4]);
                                    f15 = fArr2[r03];
                                    f16 = fArr2[r4];
                                } else if (c4 == 'M') {
                                    int r04 = r7 + 0;
                                    f15 = fArr2[r04];
                                    int r12 = r7 + 1;
                                    f16 = fArr2[r12];
                                    if (r7 > 0) {
                                        path.lineTo(fArr2[r04], fArr2[r12]);
                                    } else {
                                        path.moveTo(fArr2[r04], fArr2[r12]);
                                        r24 = r7;
                                        f18 = f16;
                                        f17 = f15;
                                    }
                                } else if (c4 == 'S') {
                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                        f15 = (f15 * 2.0f) - f11;
                                        f16 = (f16 * 2.0f) - f12;
                                    }
                                    float f24 = f16;
                                    int r82 = r7 + 0;
                                    int r92 = r7 + 1;
                                    int r13 = r7 + 2;
                                    int r14 = r7 + 3;
                                    path.cubicTo(f15, f24, fArr2[r82], fArr2[r92], fArr2[r13], fArr2[r14]);
                                    f = fArr2[r82];
                                    f2 = fArr2[r92];
                                    f15 = fArr2[r13];
                                    f16 = fArr2[r14];
                                    f11 = f;
                                    f12 = f2;
                                } else if (c4 == 'T') {
                                    if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                        f15 = (f15 * 2.0f) - f11;
                                        f16 = (f16 * 2.0f) - f12;
                                    }
                                    int r05 = r7 + 0;
                                    int r2 = r7 + 1;
                                    path.quadTo(f15, f16, fArr2[r05], fArr2[r2]);
                                    float f25 = fArr2[r05];
                                    float f26 = fArr2[r2];
                                    r24 = r7;
                                    f12 = f16;
                                    f11 = f15;
                                    f15 = f25;
                                    f16 = f26;
                                } else if (c4 == 'l') {
                                    int r06 = r7 + 0;
                                    int r42 = r7 + 1;
                                    path.rLineTo(fArr2[r06], fArr2[r42]);
                                    f15 += fArr2[r06];
                                    f4 = fArr2[r42];
                                } else if (c4 == 'm') {
                                    int r07 = r7 + 0;
                                    f15 += fArr2[r07];
                                    int r15 = r7 + 1;
                                    f16 += fArr2[r15];
                                    if (r7 > 0) {
                                        path.rLineTo(fArr2[r07], fArr2[r15]);
                                    } else {
                                        path.rMoveTo(fArr2[r07], fArr2[r15]);
                                        r24 = r7;
                                        f18 = f16;
                                        f17 = f15;
                                    }
                                } else if (c4 == 's') {
                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                        float f27 = f15 - f11;
                                        f5 = f16 - f12;
                                        f6 = f27;
                                    } else {
                                        f6 = 0.0f;
                                        f5 = 0.0f;
                                    }
                                    int r132 = r7 + 0;
                                    int r142 = r7 + 1;
                                    int r152 = r7 + 2;
                                    int r22 = r7 + 3;
                                    path.rCubicTo(f6, f5, fArr2[r132], fArr2[r142], fArr2[r152], fArr2[r22]);
                                    f = fArr2[r132] + f15;
                                    f2 = fArr2[r142] + f16;
                                    f15 += fArr2[r152];
                                    f3 = fArr2[r22];
                                } else if (c4 == 't') {
                                    if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                        f7 = f15 - f11;
                                        f8 = f16 - f12;
                                    } else {
                                        f8 = 0.0f;
                                        f7 = 0.0f;
                                    }
                                    int r16 = r7 + 0;
                                    int r32 = r7 + 1;
                                    path.rQuadTo(f7, f8, fArr2[r16], fArr2[r32]);
                                    float f28 = f7 + f15;
                                    float f29 = f8 + f16;
                                    f15 += fArr2[r16];
                                    f16 += fArr2[r32];
                                    f12 = f29;
                                    f11 = f28;
                                }
                                f16 += f4;
                            } else {
                                int r08 = r7 + 0;
                                int r23 = r7 + 1;
                                int r43 = r7 + 2;
                                int r6 = r7 + 3;
                                path.rQuadTo(fArr2[r08], fArr2[r23], fArr2[r43], fArr2[r6]);
                                f = fArr2[r08] + f15;
                                f2 = fArr2[r23] + f16;
                                f15 += fArr2[r43];
                                f3 = fArr2[r6];
                            }
                            r24 = r7;
                        } else {
                            int r133 = r7 + 2;
                            int r143 = r7 + 3;
                            int r153 = r7 + 4;
                            int r222 = r7 + 5;
                            path.rCubicTo(fArr2[r7 + 0], fArr2[r7 + 1], fArr2[r133], fArr2[r143], fArr2[r153], fArr2[r222]);
                            f = fArr2[r133] + f15;
                            f2 = fArr2[r143] + f16;
                            f15 += fArr2[r153];
                            f3 = fArr2[r222];
                        }
                        f16 += f3;
                        f11 = f;
                        f12 = f2;
                        r24 = r7;
                    } else {
                        int r134 = r7 + 5;
                        int r144 = r7 + 6;
                        r24 = r7;
                        c(path, f15, f16, fArr2[r134] + f15, fArr2[r144] + f16, fArr2[r7 + 0], fArr2[r7 + 1], fArr2[r7 + 2], fArr2[r7 + 3] != 0.0f, fArr2[r7 + 4] != 0.0f);
                        f15 += fArr2[r134];
                        f16 += fArr2[r144];
                    }
                    r7 = r24 + r19;
                    c5 = c3;
                    c4 = c5;
                } else {
                    r24 = r7;
                    int r135 = r24 + 5;
                    int r145 = r24 + 6;
                    c(path, f15, f16, fArr2[r135], fArr2[r145], fArr2[r24 + 0], fArr2[r24 + 1], fArr2[r24 + 2], fArr2[r24 + 3] != 0.0f, fArr2[r24 + 4] != 0.0f);
                    f15 = fArr2[r135];
                    f16 = fArr2[r145];
                }
                f12 = f16;
                f11 = f15;
                r7 = r24 + r19;
                c5 = c3;
                c4 = c5;
            }
            fArr[0] = f15;
            fArr[1] = f16;
            fArr[2] = f11;
            fArr[3] = f12;
            fArr[4] = f17;
            fArr[5] = f18;
        }

        private static void b(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int r4 = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d7);
            double dSin = Math.sin(d7);
            double dCos2 = Math.cos(d8);
            double dSin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * dCos;
            double d13 = d4 * dSin;
            double d14 = (d12 * dSin2) - (d13 * dCos2);
            double d15 = d11 * dSin;
            double d16 = d4 * dCos;
            double d17 = (dSin2 * d15) + (dCos2 * d16);
            double d18 = d9 / r4;
            double d19 = d8;
            double d20 = d17;
            double d21 = d14;
            int r2 = 0;
            double d22 = d5;
            double d23 = d6;
            while (r2 < r4) {
                double d24 = d19 + d18;
                double dSin3 = Math.sin(d24);
                double dCos3 = Math.cos(d24);
                double d25 = (d + ((d10 * dCos) * dCos3)) - (d13 * dSin3);
                double d26 = d2 + (d10 * dSin * dCos3) + (d16 * dSin3);
                double d27 = (d12 * dSin3) - (d13 * dCos3);
                double d28 = (dSin3 * d15) + (dCos3 * d16);
                double d29 = d24 - d19;
                double dTan = Math.tan(d29 / 2.0d);
                double dSin4 = (Math.sin(d29) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d30 = d22 + (d21 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d30, (float) (d23 + (d20 * dSin4)), (float) (d25 - (dSin4 * d27)), (float) (d26 - (dSin4 * d28)), (float) d25, (float) d26);
                r2++;
                d18 = d18;
                dSin = dSin;
                d22 = d25;
                d15 = d15;
                dCos = dCos;
                d19 = d24;
                d20 = d28;
                d21 = d27;
                r4 = r4;
                d23 = d26;
                d10 = d3;
            }
        }

        private static void c(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians(f7);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d3 = f;
            double d4 = d3 * dCos;
            double d5 = f2;
            double d6 = f5;
            double d7 = (d4 + (d5 * dSin)) / d6;
            double d8 = ((-f) * dSin) + (d5 * dCos);
            double d9 = f6;
            double d10 = d8 / d9;
            double d11 = f4;
            double d12 = ((f3 * dCos) + (d11 * dSin)) / d6;
            double d13 = (((-f3) * dSin) + (d11 * dCos)) / d9;
            double d14 = d7 - d12;
            double d15 = d10 - d13;
            double d16 = (d7 + d12) / 2.0d;
            double d17 = (d10 + d13) / 2.0d;
            double d18 = (d14 * d14) + (d15 * d15);
            if (d18 == 0.0d) {
                Log.w(h.f1020a, " Points are coincident");
                return;
            }
            double d19 = (1.0d / d18) - 0.25d;
            if (d19 < 0.0d) {
                Log.w(h.f1020a, "Points are too far apart " + d18);
                float fSqrt = (float) (Math.sqrt(d18) / 1.99999d);
                c(path, f, f2, f3, f4, f5 * fSqrt, f6 * fSqrt, f7, z, z2);
                return;
            }
            double dSqrt = Math.sqrt(d19);
            double d20 = d14 * dSqrt;
            double d21 = dSqrt * d15;
            if (z == z2) {
                d = d16 - d21;
                d2 = d17 + d20;
            } else {
                d = d16 + d21;
                d2 = d17 - d20;
            }
            double dAtan2 = Math.atan2(d10 - d2, d7 - d);
            double dAtan22 = Math.atan2(d13 - d2, d12 - d) - dAtan2;
            if (z2 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d22 = d * d6;
            double d23 = d2 * d9;
            b(path, (d22 * dCos) - (d23 * dSin), (d22 * dSin) + (d23 * dCos), d6, d9, d3, d5, radians, dAtan2, dAtan22);
        }

        public static void e(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c2 = 'm';
            for (int r2 = 0; r2 < bVarArr.length; r2++) {
                a(path, fArr, c2, bVarArr[r2].f1023a, bVarArr[r2].f1024b);
                c2 = bVarArr[r2].f1023a;
            }
        }

        public void d(b bVar, b bVar2, float f) {
            this.f1023a = bVar.f1023a;
            int r0 = 0;
            while (true) {
                float[] fArr = bVar.f1024b;
                if (r0 >= fArr.length) {
                    return;
                }
                this.f1024b[r0] = (fArr[r0] * (1.0f - f)) + (bVar2.f1024b[r0] * f);
                r0++;
            }
        }
    }

    private h() {
    }

    private static void a(ArrayList<b> arrayList, char c2, float[] fArr) {
        arrayList.add(new b(c2, fArr));
    }

    public static boolean b(@i0 b[] bVarArr, @i0 b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int r1 = 0; r1 < bVarArr.length; r1++) {
            if (bVarArr[r1].f1023a != bVarArr2[r1].f1023a || bVarArr[r1].f1024b.length != bVarArr2[r1].f1024b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] c(float[] fArr, int r3, int r4) {
        if (r3 > r4) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (r3 < 0 || r3 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int r42 = r4 - r3;
        int r0 = Math.min(r42, length - r3);
        float[] fArr2 = new float[r42];
        System.arraycopy(fArr, r3, fArr2, 0, r0);
        return fArr2;
    }

    public static b[] d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int r3 = 1;
        int r4 = 0;
        while (r3 < str.length()) {
            int r32 = j(str, r3);
            String strTrim = str.substring(r4, r32).trim();
            if (strTrim.length() > 0) {
                a(arrayList, strTrim.charAt(0), h(strTrim));
            }
            r4 = r32;
            r3 = r32 + 1;
        }
        if (r3 - r4 == 1 && r4 < str.length()) {
            a(arrayList, str.charAt(r4), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    public static Path e(String str) {
        Path path = new Path();
        b[] bVarArrD = d(str);
        if (bVarArrD == null) {
            return null;
        }
        try {
            b.e(bVarArrD, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    public static b[] f(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int r1 = 0; r1 < bVarArr.length; r1++) {
            bVarArr2[r1] = new b(bVarArr[r1]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r2 == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038 A[LOOP:0: B:3:0x0007->B:24:0x0038, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(java.lang.String r8, int r9, b.i.e.h.a r10) {
        /*
            r0 = 0
            r10.f1022b = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3b
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L33
            r6 = 69
            if (r5 == r6) goto L31
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L31
            switch(r5) {
                case 44: goto L33;
                case 45: goto L2a;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L2f
        L22:
            if (r3 != 0) goto L27
            r2 = 0
            r3 = 1
            goto L35
        L27:
            r10.f1022b = r7
            goto L33
        L2a:
            if (r1 == r9) goto L2f
            if (r2 != 0) goto L2f
            goto L27
        L2f:
            r2 = 0
            goto L35
        L31:
            r2 = 1
            goto L35
        L33:
            r2 = 0
            r4 = 1
        L35:
            if (r4 == 0) goto L38
            goto L3b
        L38:
            int r1 = r1 + 1
            goto L7
        L3b:
            r10.f1021a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.i.e.h.g(java.lang.String, int, b.i.e.h$a):void");
    }

    private static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int r4 = 1;
            int r5 = 0;
            while (r4 < length) {
                g(str, r4, aVar);
                int r6 = aVar.f1021a;
                if (r4 < r6) {
                    fArr[r5] = Float.parseFloat(str.substring(r4, r6));
                    r5++;
                }
                r4 = aVar.f1022b ? r6 : r6 + 1;
            }
            return c(fArr, 0, r5);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }

    public static boolean i(b[] bVarArr, b[] bVarArr2, b[] bVarArr3, float f) {
        if (bVarArr == null || bVarArr2 == null || bVarArr3 == null) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes cannot be null");
        }
        if (bVarArr.length != bVarArr2.length || bVarArr2.length != bVarArr3.length) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
        if (!b(bVarArr2, bVarArr3)) {
            return false;
        }
        for (int r1 = 0; r1 < bVarArr.length; r1++) {
            bVarArr[r1].d(bVarArr2[r1], bVarArr3[r1], f);
        }
        return true;
    }

    private static int j(String str, int r4) {
        while (r4 < str.length()) {
            char cCharAt = str.charAt(r4);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return r4;
            }
            r4++;
        }
        return r4;
    }

    public static void k(b[] bVarArr, b[] bVarArr2) {
        for (int r1 = 0; r1 < bVarArr2.length; r1++) {
            bVarArr[r1].f1023a = bVarArr2[r1].f1023a;
            for (int r2 = 0; r2 < bVarArr2[r1].f1024b.length; r2++) {
                bVarArr[r1].f1024b[r2] = bVarArr2[r1].f1024b[r2];
            }
        }
    }
}
