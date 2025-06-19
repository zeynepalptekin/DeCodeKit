package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.ads.wm2;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class ol2 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f4710a = nq2.l("vide");

    /* renamed from: b, reason: collision with root package name */
    private static final int f4711b = nq2.l("soun");

    /* renamed from: c, reason: collision with root package name */
    private static final int f4712c = nq2.l("text");
    private static final int d = nq2.l("sbtl");
    private static final int e = nq2.l("subt");
    private static final int f = nq2.l("clcp");
    private static final int g = nq2.l("cenc");
    private static final int h = nq2.l("meta");

    private static int a(hq2 hq2Var, int r16, int r17, pl2 pl2Var, int r19) {
        int r1 = hq2Var.b();
        while (true) {
            if (r1 - r16 >= r17) {
                return 0;
            }
            hq2Var.l(r1);
            int r2 = hq2Var.d();
            vp2.b(r2 > 0, "childAtomSize should be positive");
            if (hq2Var.d() == jl2.W) {
                int r6 = r1 + 8;
                Pair pairCreate = null;
                Integer numValueOf = null;
                jm2 jm2Var = null;
                boolean z = false;
                while (r6 - r1 < r2) {
                    hq2Var.l(r6);
                    int r11 = hq2Var.d();
                    int r12 = hq2Var.d();
                    if (r12 == jl2.c0) {
                        numValueOf = Integer.valueOf(hq2Var.d());
                    } else if (r12 == jl2.X) {
                        hq2Var.m(4);
                        z = hq2Var.d() == g;
                    } else if (r12 == jl2.Y) {
                        int r10 = r6 + 8;
                        while (true) {
                            if (r10 - r6 >= r11) {
                                jm2Var = null;
                                break;
                            }
                            hq2Var.l(r10);
                            int r122 = hq2Var.d();
                            if (hq2Var.d() == jl2.Z) {
                                hq2Var.m(6);
                                boolean z2 = hq2Var.g() == 1;
                                int r123 = hq2Var.g();
                                byte[] bArr = new byte[16];
                                hq2Var.p(bArr, 0, 16);
                                jm2Var = new jm2(z2, r123, bArr);
                            } else {
                                r10 += r122;
                            }
                        }
                    }
                    r6 += r11;
                }
                if (z) {
                    vp2.b(numValueOf != null, "frma atom is mandatory");
                    vp2.b(jm2Var != null, "schi->tenc atom is mandatory");
                    pairCreate = Pair.create(numValueOf, jm2Var);
                }
                if (pairCreate != null) {
                    pl2Var.f4834a[r19] = (jm2) pairCreate.second;
                    return ((Integer) pairCreate.first).intValue();
                }
            }
            r1 += r2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x081c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.gm2 b(com.google.android.gms.internal.ads.ml2 r49, com.google.android.gms.internal.ads.ll2 r50, long r51, com.google.android.gms.internal.ads.ek2 r53, boolean r54) throws com.google.android.gms.internal.ads.ki2 {
        /*
            Method dump skipped, instructions count: 2134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ol2.b(com.google.android.gms.internal.ads.ml2, com.google.android.gms.internal.ads.ll2, long, com.google.android.gms.internal.ads.ek2, boolean):com.google.android.gms.internal.ads.gm2");
    }

    public static lm2 c(gm2 gm2Var, ml2 ml2Var, qk2 qk2Var) throws ki2 {
        ql2 rl2Var;
        boolean z;
        int r15;
        int r6;
        gm2 gm2Var2;
        int r24;
        long[] jArr;
        int[] r11;
        int r10;
        long[] jArr2;
        int[] r62;
        long j;
        long j2;
        long[] jArr3;
        long[] jArr4;
        boolean z2;
        int[] r3;
        int[] r13;
        int[] r12;
        int r46;
        int r0;
        int r4;
        int r32;
        ll2 ll2VarF = ml2Var.f(jl2.r0);
        if (ll2VarF != null) {
            rl2Var = new tl2(ll2VarF);
        } else {
            ll2 ll2VarF2 = ml2Var.f(jl2.s0);
            if (ll2VarF2 == null) {
                throw new ki2("Track has no sample table size information");
            }
            rl2Var = new rl2(ll2VarF2);
        }
        int r33 = rl2Var.c();
        if (r33 == 0) {
            return new lm2(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        ll2 ll2VarF3 = ml2Var.f(jl2.t0);
        if (ll2VarF3 == null) {
            ll2VarF3 = ml2Var.f(jl2.u0);
            z = true;
        } else {
            z = false;
        }
        hq2 hq2Var = ll2VarF3.Q0;
        hq2 hq2Var2 = ml2Var.f(jl2.q0).Q0;
        hq2 hq2Var3 = ml2Var.f(jl2.n0).Q0;
        ll2 ll2VarF4 = ml2Var.f(jl2.o0);
        hq2 hq2Var4 = null;
        hq2 hq2Var5 = ll2VarF4 != null ? ll2VarF4.Q0 : null;
        ll2 ll2VarF5 = ml2Var.f(jl2.p0);
        hq2 hq2Var6 = ll2VarF5 != null ? ll2VarF5.Q0 : null;
        nl2 nl2Var = new nl2(hq2Var2, hq2Var, z);
        hq2Var3.l(12);
        int r8 = hq2Var3.v() - 1;
        int r9 = hq2Var3.v();
        int r14 = hq2Var3.v();
        if (hq2Var6 != null) {
            hq2Var6.l(12);
            r15 = hq2Var6.v();
        } else {
            r15 = 0;
        }
        int r16 = -1;
        if (hq2Var5 != null) {
            hq2Var5.l(12);
            r6 = hq2Var5.v();
            if (r6 > 0) {
                r16 = hq2Var5.v() - 1;
                hq2Var4 = hq2Var5;
            }
        } else {
            hq2Var4 = hq2Var5;
            r6 = 0;
        }
        long j3 = 0;
        if (rl2Var.b() && "audio/raw".equals(gm2Var.f.i) && r8 == 0 && r15 == 0 && r6 == 0) {
            gm2Var2 = gm2Var;
            r24 = r33;
            ql2 ql2Var = rl2Var;
            int r02 = nl2Var.f4565a;
            long[] jArr5 = new long[r02];
            int[] r34 = new int[r02];
            while (nl2Var.a()) {
                int r42 = nl2Var.f4566b;
                jArr5[r42] = nl2Var.d;
                r34[r42] = nl2Var.f4567c;
            }
            int r43 = ql2Var.a();
            long j4 = r14;
            int r7 = 8192 / r43;
            int r92 = 0;
            for (int r82 = 0; r82 < r02; r82++) {
                r92 += nq2.q(r34[r82], r7);
            }
            long[] jArr6 = new long[r92];
            int[] r122 = new int[r92];
            long[] jArr7 = new long[r92];
            int[] r152 = new int[r92];
            int r83 = 0;
            int r93 = 0;
            int r102 = 0;
            int r132 = 0;
            while (r83 < r02) {
                int r162 = r34[r83];
                long j5 = jArr5[r83];
                int r163 = r02;
                int r03 = r162;
                while (r03 > 0) {
                    int r23 = Math.min(r7, r03);
                    jArr6[r102] = j5;
                    r122[r102] = r43 * r23;
                    r132 = Math.max(r132, r122[r102]);
                    jArr7[r102] = r93 * j4;
                    r152[r102] = 1;
                    j5 += r122[r102];
                    r93 += r23;
                    r03 -= r23;
                    r102++;
                    jArr5 = jArr5;
                    r34 = r34;
                }
                r83++;
                r02 = r163;
            }
            wl2 wl2Var = new wl2(jArr6, r122, r132, jArr7, r152);
            jArr = wl2Var.f5852a;
            r11 = wl2Var.f5853b;
            r10 = wl2Var.f5854c;
            jArr2 = wl2Var.d;
            r62 = wl2Var.e;
            j = 0;
        } else {
            long[] jArr8 = new long[r33];
            r11 = new int[r33];
            jArr2 = new long[r33];
            int r45 = r6;
            r62 = new int[r33];
            int r2 = r16;
            long j6 = 0;
            j = 0;
            int r04 = 0;
            r10 = 0;
            int r21 = 0;
            int r22 = 0;
            int r242 = 0;
            int r164 = r15;
            int r153 = r14;
            int r142 = r9;
            int r94 = r8;
            int r84 = r45;
            while (r04 < r33) {
                while (r22 == 0) {
                    vp2.e(nl2Var.a());
                    j6 = nl2Var.d;
                    r22 = nl2Var.f4567c;
                    r153 = r153;
                    r142 = r142;
                }
                int r452 = r142;
                int r29 = r153;
                if (hq2Var6 != null) {
                    while (r21 == 0 && r164 > 0) {
                        r21 = hq2Var6.v();
                        r242 = hq2Var6.d();
                        r164--;
                    }
                    r21--;
                }
                int r143 = r242;
                jArr8[r04] = j6;
                r11[r04] = rl2Var.a();
                if (r11[r04] > r10) {
                    r10 = r11[r04];
                }
                int r243 = r33;
                ql2 ql2Var2 = rl2Var;
                jArr2[r04] = j + r143;
                r62[r04] = hq2Var4 == null ? 1 : 0;
                if (r04 == r2) {
                    r62[r04] = 1;
                    r84--;
                    if (r84 > 0) {
                        r2 = hq2Var4.v() - 1;
                    }
                }
                long[] jArr9 = jArr8;
                j += r29;
                int r44 = r452 - 1;
                if (r44 != 0 || r94 <= 0) {
                    r4 = r29;
                    r32 = r44;
                } else {
                    r32 = hq2Var3.v();
                    r4 = hq2Var3.v();
                    r94--;
                }
                int r453 = r32;
                j6 += r11[r04];
                r22--;
                r04++;
                r33 = r243;
                jArr8 = jArr9;
                r2 = r2;
                r242 = r143;
                r142 = r453;
                r153 = r4;
                rl2Var = ql2Var2;
            }
            r24 = r33;
            long[] jArr10 = jArr8;
            int r454 = r142;
            vp2.a(r21 == 0);
            while (r164 > 0) {
                vp2.a(hq2Var6.v() == 0);
                hq2Var6.d();
                r164--;
            }
            if (r84 == 0 && r454 == 0) {
                r0 = r22;
                if (r0 == 0 && r94 == 0) {
                    gm2Var2 = gm2Var;
                }
                jArr = jArr10;
            } else {
                r0 = r22;
            }
            gm2Var2 = gm2Var;
            int r25 = gm2Var2.f3558a;
            StringBuilder sb = new StringBuilder(215);
            sb.append("Inconsistent stbl box for track ");
            sb.append(r25);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(r84);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(r454);
            sb.append(", remainingSamplesInChunk ");
            sb.append(r0);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(r94);
            Log.w("AtomParsers", sb.toString());
            jArr = jArr10;
        }
        if (gm2Var2.i == null || qk2Var.c()) {
            int[] r455 = r11;
            nq2.f(jArr2, 1000000L, gm2Var2.f3560c);
            return new lm2(jArr, r455, r10, jArr2, r62);
        }
        long[] jArr11 = gm2Var2.i;
        if (jArr11.length == 1 && gm2Var2.f3559b == 1 && jArr2.length >= 2) {
            long j7 = gm2Var2.j[0];
            long jC = nq2.c(jArr11[0], gm2Var2.f3560c, gm2Var2.d) + j7;
            if (jArr2[0] <= j7 && j7 < jArr2[1] && jArr2[jArr2.length - 1] < jC && jC <= j) {
                long j8 = j - jC;
                long jC2 = nq2.c(j7 - jArr2[0], gm2Var2.f.v, gm2Var2.f3560c);
                long jC3 = nq2.c(j8, gm2Var2.f.v, gm2Var2.f3560c);
                if ((jC2 != 0 || jC3 != 0) && jC2 <= 2147483647L && jC3 <= 2147483647L) {
                    qk2Var.f5029a = (int) jC2;
                    qk2Var.f5030b = (int) jC3;
                    nq2.f(jArr2, 1000000L, gm2Var2.f3560c);
                    return new lm2(jArr, r11, r10, jArr2, r62);
                }
            }
        }
        long[] jArr12 = gm2Var2.i;
        if (jArr12.length == 1) {
            char c2 = 0;
            if (jArr12[0] == 0) {
                int r05 = 0;
                while (r05 < jArr2.length) {
                    jArr2[r05] = nq2.c(jArr2[r05] - gm2Var2.j[c2], 1000000L, gm2Var2.f3560c);
                    r05++;
                    c2 = 0;
                }
                return new lm2(jArr, r11, r10, jArr2, r62);
            }
        }
        boolean z3 = gm2Var2.f3559b == 1;
        boolean z4 = false;
        int r26 = 0;
        int r47 = 0;
        int r85 = 0;
        while (true) {
            long[] jArr13 = gm2Var2.i;
            j2 = -1;
            if (r85 >= jArr13.length) {
                break;
            }
            int r154 = r10;
            int[] r456 = r11;
            long j9 = gm2Var2.j[r85];
            if (j9 != -1) {
                r46 = r154;
                long jC4 = nq2.c(jArr13[r85], gm2Var2.f3560c, gm2Var2.d);
                int r144 = nq2.h(jArr2, j9, true, true);
                int r103 = nq2.h(jArr2, j9 + jC4, z3, false);
                r26 += r103 - r144;
                z4 |= r47 != r144;
                r47 = r103;
            } else {
                r46 = r154;
            }
            r85++;
            r11 = r456;
            r10 = r46;
        }
        int r462 = r10;
        int[] r457 = r11;
        boolean z5 = z4 | (r26 != r24);
        long[] jArr14 = z5 ? new long[r26] : jArr;
        int[] r86 = z5 ? new int[r26] : r457;
        int r104 = z5 ? 0 : r462;
        int[] r95 = z5 ? new int[r26] : r62;
        long[] jArr15 = new long[r26];
        int r244 = r104;
        int r105 = 0;
        int r112 = 0;
        while (true) {
            long[] jArr16 = gm2Var2.i;
            if (r105 >= jArr16.length) {
                break;
            }
            int[] r165 = r86;
            int[] r27 = r95;
            long j10 = gm2Var2.j[r105];
            long j11 = jArr16[r105];
            if (j10 != j2) {
                jArr3 = jArr14;
                long[] jArr17 = jArr;
                long jC5 = nq2.c(j11, gm2Var2.f3560c, gm2Var2.d) + j10;
                int r145 = nq2.h(jArr2, j10, true, true);
                int r48 = nq2.h(jArr2, jC5, z3, false);
                if (z5) {
                    int r5 = r48 - r145;
                    System.arraycopy(jArr17, r145, jArr3, r112, r5);
                    r13 = r457;
                    z2 = z3;
                    r3 = r165;
                    System.arraycopy(r13, r145, r3, r112, r5);
                    jArr4 = jArr17;
                    r12 = r27;
                    System.arraycopy(r62, r145, r12, r112, r5);
                } else {
                    r13 = r457;
                    jArr4 = jArr17;
                    r12 = r27;
                    z2 = z3;
                    r3 = r165;
                }
                int r52 = r244;
                while (r145 < r48) {
                    int[] r272 = r12;
                    int[] r458 = r13;
                    long j12 = j10;
                    jArr15[r112] = nq2.c(j3, 1000000L, gm2Var2.d) + nq2.c(jArr2[r145] - j10, 1000000L, gm2Var2.f3560c);
                    if (z5 && r3[r112] > r52) {
                        r52 = r458[r145];
                    }
                    r112++;
                    r145++;
                    r13 = r458;
                    j10 = j12;
                    r12 = r272;
                }
                r27 = r12;
                r457 = r13;
                r244 = r52;
            } else {
                jArr3 = jArr14;
                jArr4 = jArr;
                z2 = z3;
                r3 = r165;
            }
            j3 += j11;
            r105++;
            r86 = r3;
            jArr14 = jArr3;
            z3 = z2;
            r95 = r27;
            jArr = jArr4;
            j2 = -1;
        }
        long[] jArr18 = jArr14;
        int[] r35 = r86;
        int[] r63 = r95;
        boolean z6 = false;
        for (int r87 = 0; r87 < r63.length && !z6; r87++) {
            z6 |= (r63[r87] & 1) != 0;
        }
        if (z6) {
            return new lm2(jArr18, r35, r244, jArr15, r63);
        }
        throw new ki2("The edited sample sequence does not contain a sync sample.");
    }

    public static wm2 d(ll2 ll2Var, boolean z) {
        if (z) {
            return null;
        }
        hq2 hq2Var = ll2Var.Q0;
        hq2Var.l(8);
        while (hq2Var.q() >= 8) {
            int r1 = hq2Var.b();
            int r2 = hq2Var.d();
            if (hq2Var.d() == jl2.C0) {
                hq2Var.l(r1);
                int r12 = r1 + r2;
                hq2Var.m(12);
                while (true) {
                    if (hq2Var.b() >= r12) {
                        break;
                    }
                    int r22 = hq2Var.b();
                    int r3 = hq2Var.d();
                    if (hq2Var.d() == jl2.D0) {
                        hq2Var.l(r22);
                        int r23 = r22 + r3;
                        hq2Var.m(8);
                        ArrayList arrayList = new ArrayList();
                        while (hq2Var.b() < r23) {
                            wm2.a aVarD = dm2.d(hq2Var);
                            if (aVarD != null) {
                                arrayList.add(aVarD);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new wm2(arrayList);
                        }
                    } else {
                        hq2Var.m(r3 - 8);
                    }
                }
                return null;
            }
            hq2Var.m(r2 - 8);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.util.Pair<java.lang.String, byte[]> e(com.google.android.gms.internal.ads.hq2 r3, int r4) {
        /*
            int r4 = r4 + 8
            int r4 = r4 + 4
            r3.l(r4)
            r4 = 1
            r3.m(r4)
            f(r3)
            r0 = 2
            r3.m(r0)
            int r1 = r3.g()
            r2 = r1 & 128(0x80, float:1.8E-43)
            if (r2 == 0) goto L1d
            r3.m(r0)
        L1d:
            r2 = r1 & 64
            if (r2 == 0) goto L28
            int r2 = r3.h()
            r3.m(r2)
        L28:
            r2 = 32
            r1 = r1 & r2
            if (r1 == 0) goto L30
            r3.m(r0)
        L30:
            r3.m(r4)
            f(r3)
            int r0 = r3.g()
            r1 = 0
            if (r0 == r2) goto L80
            r2 = 33
            if (r0 == r2) goto L7d
            r2 = 35
            if (r0 == r2) goto L7a
            r2 = 64
            if (r0 == r2) goto L77
            r2 = 107(0x6b, float:1.5E-43)
            if (r0 == r2) goto L70
            r2 = 165(0xa5, float:2.31E-43)
            if (r0 == r2) goto L6d
            r2 = 166(0xa6, float:2.33E-43)
            if (r0 == r2) goto L6a
            switch(r0) {
                case 102: goto L77;
                case 103: goto L77;
                case 104: goto L77;
                default: goto L58;
            }
        L58:
            switch(r0) {
                case 169: goto L63;
                case 170: goto L5c;
                case 171: goto L5c;
                case 172: goto L63;
                default: goto L5b;
            }
        L5b:
            goto L82
        L5c:
            java.lang.String r3 = "audio/vnd.dts.hd"
            android.util.Pair r3 = android.util.Pair.create(r3, r1)
            return r3
        L63:
            java.lang.String r3 = "audio/vnd.dts"
            android.util.Pair r3 = android.util.Pair.create(r3, r1)
            return r3
        L6a:
            java.lang.String r1 = "audio/eac3"
            goto L82
        L6d:
            java.lang.String r1 = "audio/ac3"
            goto L82
        L70:
            java.lang.String r3 = "audio/mpeg"
            android.util.Pair r3 = android.util.Pair.create(r3, r1)
            return r3
        L77:
            java.lang.String r1 = "audio/mp4a-latm"
            goto L82
        L7a:
            java.lang.String r1 = "video/hevc"
            goto L82
        L7d:
            java.lang.String r1 = "video/avc"
            goto L82
        L80:
            java.lang.String r1 = "video/mp4v-es"
        L82:
            r0 = 12
            r3.m(r0)
            r3.m(r4)
            int r4 = f(r3)
            byte[] r0 = new byte[r4]
            r2 = 0
            r3.p(r0, r2, r4)
            android.util.Pair r3 = android.util.Pair.create(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ol2.e(com.google.android.gms.internal.ads.hq2, int):android.util.Pair");
    }

    private static int f(hq2 hq2Var) {
        int r0 = hq2Var.g();
        int r1 = r0 & 127;
        while ((r0 & 128) == 128) {
            r0 = hq2Var.g();
            r1 = (r1 << 7) | (r0 & 127);
        }
        return r1;
    }
}
