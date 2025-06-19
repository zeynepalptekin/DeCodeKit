package c.a.b.b.g.c;

/* loaded from: classes.dex */
final class sa extends na {
    sa() {
    }

    private static int e(byte[] bArr, int r3, long j, int r6) {
        if (r6 == 0) {
            return ma.h(r3);
        }
        if (r6 == 1) {
            return ma.i(r3, ia.a(bArr, j));
        }
        if (r6 == 2) {
            return ma.j(r3, ia.a(bArr, j), ia.a(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008b, code lost:
    
        return -1;
     */
    @Override // c.a.b.b.g.c.na
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int a(int r16, byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.sa.a(int, byte[], int, int):int");
    }

    @Override // c.a.b.b.g.c.na
    final int b(CharSequence charSequence, byte[] bArr, int r25, int r26) {
        char c2;
        long j;
        long j2;
        long j3;
        int r1;
        char cCharAt;
        long j4 = r25;
        long j5 = r26 + j4;
        int length = charSequence.length();
        if (length > r26 || bArr.length - r26 < r25) {
            char cCharAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(cCharAt2);
            sb.append(" at index ");
            sb.append(r25 + r26);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int r2 = 0;
        while (true) {
            c2 = 128;
            j = 1;
            if (r2 >= length || (cCharAt = charSequence.charAt(r2)) >= 128) {
                break;
            }
            ia.l(bArr, j4, (byte) cCharAt);
            r2++;
            j4 = 1 + j4;
        }
        if (r2 == length) {
            return (int) j4;
        }
        while (r2 < length) {
            char cCharAt3 = charSequence.charAt(r2);
            if (cCharAt3 >= c2 || j4 >= j5) {
                if (cCharAt3 < 2048 && j4 <= j5 - 2) {
                    long j6 = j4 + j;
                    ia.l(bArr, j4, (byte) ((cCharAt3 >>> 6) | 960));
                    ia.l(bArr, j6, (byte) ((cCharAt3 & '?') | 128));
                    j2 = j6 + j;
                    j3 = j;
                } else {
                    if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || j4 > j5 - 3) {
                        if (j4 > j5 - 4) {
                            if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((r1 = r2 + 1) == length || !Character.isSurrogatePair(cCharAt3, charSequence.charAt(r1)))) {
                                throw new pa(r2, length);
                            }
                            StringBuilder sb2 = new StringBuilder(46);
                            sb2.append("Failed writing ");
                            sb2.append(cCharAt3);
                            sb2.append(" at index ");
                            sb2.append(j4);
                            throw new ArrayIndexOutOfBoundsException(sb2.toString());
                        }
                        int r3 = r2 + 1;
                        if (r3 != length) {
                            char cCharAt4 = charSequence.charAt(r3);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                long j7 = j4 + 1;
                                ia.l(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                long j8 = j7 + 1;
                                ia.l(bArr, j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j9 = j8 + 1;
                                ia.l(bArr, j8, (byte) (((codePoint >>> 6) & 63) | 128));
                                j3 = 1;
                                j2 = j9 + 1;
                                ia.l(bArr, j9, (byte) ((codePoint & 63) | 128));
                                r2 = r3;
                            } else {
                                r2 = r3;
                            }
                        }
                        throw new pa(r2 - 1, length);
                    }
                    long j10 = j4 + j;
                    ia.l(bArr, j4, (byte) ((cCharAt3 >>> '\f') | 480));
                    long j11 = j10 + j;
                    ia.l(bArr, j10, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                    ia.l(bArr, j11, (byte) ((cCharAt3 & '?') | 128));
                    j2 = j11 + 1;
                    j3 = 1;
                }
                r2++;
                c2 = 128;
                long j12 = j3;
                j4 = j2;
                j = j12;
            } else {
                long j13 = j4 + j;
                ia.l(bArr, j4, (byte) cCharAt3);
                j3 = j;
                j2 = j13;
            }
            r2++;
            c2 = 128;
            long j122 = j3;
            j4 = j2;
            j = j122;
        }
        return (int) j4;
    }

    @Override // c.a.b.b.g.c.na
    final String d(byte[] bArr, int r13, int r14) throws q7 {
        if ((r13 | r14 | ((bArr.length - r13) - r14)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(r13), Integer.valueOf(r14)));
        }
        int r0 = r13 + r14;
        char[] cArr = new char[r14];
        int r3 = 0;
        while (r13 < r0) {
            byte bA = ia.a(bArr, r13);
            if (!oa.l(bA)) {
                break;
            }
            r13++;
            oa.i(bA, cArr, r3);
            r3++;
        }
        int r8 = r3;
        while (r13 < r0) {
            int r32 = r13 + 1;
            byte bA2 = ia.a(bArr, r13);
            if (oa.l(bA2)) {
                int r4 = r8 + 1;
                oa.i(bA2, cArr, r8);
                while (r32 < r0) {
                    byte bA3 = ia.a(bArr, r32);
                    if (!oa.l(bA3)) {
                        break;
                    }
                    r32++;
                    oa.i(bA3, cArr, r4);
                    r4++;
                }
                r13 = r32;
                r8 = r4;
            } else if (oa.m(bA2)) {
                if (r32 >= r0) {
                    throw q7.h();
                }
                oa.h(bA2, ia.a(bArr, r32), cArr, r8);
                r13 = r32 + 1;
                r8++;
            } else if (oa.n(bA2)) {
                if (r32 >= r0 - 1) {
                    throw q7.h();
                }
                int r42 = r32 + 1;
                oa.g(bA2, ia.a(bArr, r32), ia.a(bArr, r42), cArr, r8);
                r13 = r42 + 1;
                r8++;
            } else {
                if (r32 >= r0 - 2) {
                    throw q7.h();
                }
                int r43 = r32 + 1;
                byte bA4 = ia.a(bArr, r32);
                int r33 = r43 + 1;
                oa.f(bA2, bA4, ia.a(bArr, r43), ia.a(bArr, r33), cArr, r8);
                r13 = r33 + 1;
                r8 = r8 + 1 + 1;
            }
        }
        return new String(cArr, 0, r8);
    }
}
