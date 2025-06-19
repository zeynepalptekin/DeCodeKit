package c.a.b.b.g.c;

/* loaded from: classes.dex */
final class qa extends na {
    qa() {
    }

    @Override // c.a.b.b.g.c.na
    final int a(int r7, byte[] bArr, int r9, int r10) {
        while (r9 < r10 && bArr[r9] >= 0) {
            r9++;
        }
        if (r9 >= r10) {
            return 0;
        }
        while (r9 < r10) {
            int r0 = r9 + 1;
            byte b2 = bArr[r9];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (r0 >= r10) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        r9 = r0 + 1;
                        if (bArr[r0] > -65) {
                        }
                    }
                    return -1;
                }
                if (b2 >= -16) {
                    if (r0 >= r10 - 2) {
                        return ma.m(bArr, r0, r10);
                    }
                    int r1 = r0 + 1;
                    byte b3 = bArr[r0];
                    if (b3 <= -65 && (((b2 << 28) + (b3 + 112)) >> 30) == 0) {
                        int r92 = r1 + 1;
                        if (bArr[r1] <= -65) {
                            r0 = r92 + 1;
                            if (bArr[r92] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (r0 >= r10 - 1) {
                    return ma.m(bArr, r0, r10);
                }
                int r4 = r0 + 1;
                byte b4 = bArr[r0];
                if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                    r9 = r4 + 1;
                    if (bArr[r4] > -65) {
                    }
                }
                return -1;
            }
            r9 = r0;
        }
        return 0;
    }

    @Override // c.a.b.b.g.c.na
    final int b(CharSequence charSequence, byte[] bArr, int r10, int r11) {
        int r4;
        int r9;
        int r3;
        char cCharAt;
        int length = charSequence.length();
        int r112 = r11 + r10;
        int r1 = 0;
        while (r1 < length && (r3 = r1 + r10) < r112 && (cCharAt = charSequence.charAt(r1)) < 128) {
            bArr[r3] = (byte) cCharAt;
            r1++;
        }
        if (r1 == length) {
            return r10 + length;
        }
        int r102 = r10 + r1;
        while (r1 < length) {
            char cCharAt2 = charSequence.charAt(r1);
            if (cCharAt2 >= 128 || r102 >= r112) {
                if (cCharAt2 < 2048 && r102 <= r112 - 2) {
                    int r42 = r102 + 1;
                    bArr[r102] = (byte) ((cCharAt2 >>> 6) | 960);
                    r102 = r42 + 1;
                    bArr[r42] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || r102 > r112 - 3) {
                        if (r102 > r112 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((r9 = r1 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(r9)))) {
                                throw new pa(r1, length);
                            }
                            StringBuilder sb = new StringBuilder(37);
                            sb.append("Failed writing ");
                            sb.append(cCharAt2);
                            sb.append(" at index ");
                            sb.append(r102);
                            throw new ArrayIndexOutOfBoundsException(sb.toString());
                        }
                        int r43 = r1 + 1;
                        if (r43 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(r43);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int r32 = r102 + 1;
                                bArr[r102] = (byte) ((codePoint >>> 18) | 240);
                                int r103 = r32 + 1;
                                bArr[r32] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int r33 = r103 + 1;
                                bArr[r103] = (byte) (((codePoint >>> 6) & 63) | 128);
                                r102 = r33 + 1;
                                bArr[r33] = (byte) ((codePoint & 63) | 128);
                                r1 = r43;
                            } else {
                                r1 = r43;
                            }
                        }
                        throw new pa(r1 - 1, length);
                    }
                    int r44 = r102 + 1;
                    bArr[r102] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int r104 = r44 + 1;
                    bArr[r44] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    r4 = r104 + 1;
                    bArr[r104] = (byte) ((cCharAt2 & '?') | 128);
                }
                r1++;
            } else {
                r4 = r102 + 1;
                bArr[r102] = (byte) cCharAt2;
            }
            r102 = r4;
            r1++;
        }
        return r102;
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
            byte b2 = bArr[r13];
            if (!oa.l(b2)) {
                break;
            }
            r13++;
            oa.i(b2, cArr, r3);
            r3++;
        }
        int r8 = r3;
        while (r13 < r0) {
            int r32 = r13 + 1;
            byte b3 = bArr[r13];
            if (oa.l(b3)) {
                int r4 = r8 + 1;
                oa.i(b3, cArr, r8);
                while (r32 < r0) {
                    byte b4 = bArr[r32];
                    if (!oa.l(b4)) {
                        break;
                    }
                    r32++;
                    oa.i(b4, cArr, r4);
                    r4++;
                }
                r13 = r32;
                r8 = r4;
            } else if (oa.m(b3)) {
                if (r32 >= r0) {
                    throw q7.h();
                }
                oa.h(b3, bArr[r32], cArr, r8);
                r13 = r32 + 1;
                r8++;
            } else if (oa.n(b3)) {
                if (r32 >= r0 - 1) {
                    throw q7.h();
                }
                int r42 = r32 + 1;
                oa.g(b3, bArr[r32], bArr[r42], cArr, r8);
                r13 = r42 + 1;
                r8++;
            } else {
                if (r32 >= r0 - 2) {
                    throw q7.h();
                }
                int r43 = r32 + 1;
                byte b5 = bArr[r32];
                int r33 = r43 + 1;
                oa.f(b3, b5, bArr[r43], bArr[r33], cArr, r8);
                r13 = r33 + 1;
                r8 = r8 + 1 + 1;
            }
        }
        return new String(cArr, 0, r8);
    }
}
