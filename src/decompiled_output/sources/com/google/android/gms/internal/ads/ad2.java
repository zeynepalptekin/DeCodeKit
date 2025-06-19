package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ad2 extends xc2 {
    ad2() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] > (-65)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r13[r14] > (-65)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0082, code lost:
    
        if (r13[r14] > (-65)) goto L50;
     */
    @Override // com.google.android.gms.internal.ads.xc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int a(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ad2.a(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.xc2
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
                                throw new zc2(r1, length);
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
                        throw new zc2(r1 - 1, length);
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

    @Override // com.google.android.gms.internal.ads.xc2
    final String d(byte[] bArr, int r13, int r14) throws w92 {
        if ((r13 | r14 | ((bArr.length - r13) - r14)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(r13), Integer.valueOf(r14)));
        }
        int r0 = r13 + r14;
        char[] cArr = new char[r14];
        int r3 = 0;
        while (r13 < r0) {
            byte b2 = bArr[r13];
            if (!yc2.i(b2)) {
                break;
            }
            r13++;
            yc2.d(b2, cArr, r3);
            r3++;
        }
        int r8 = r3;
        while (r13 < r0) {
            int r32 = r13 + 1;
            byte b3 = bArr[r13];
            if (yc2.i(b3)) {
                int r4 = r8 + 1;
                yc2.d(b3, cArr, r8);
                while (r32 < r0) {
                    byte b4 = bArr[r32];
                    if (!yc2.i(b4)) {
                        break;
                    }
                    r32++;
                    yc2.d(b4, cArr, r4);
                    r4++;
                }
                r13 = r32;
                r8 = r4;
            } else if (yc2.j(b3)) {
                if (r32 >= r0) {
                    throw w92.i();
                }
                yc2.c(b3, bArr[r32], cArr, r8);
                r13 = r32 + 1;
                r8++;
            } else if (yc2.k(b3)) {
                if (r32 >= r0 - 1) {
                    throw w92.i();
                }
                int r42 = r32 + 1;
                yc2.b(b3, bArr[r32], bArr[r42], cArr, r8);
                r13 = r42 + 1;
                r8++;
            } else {
                if (r32 >= r0 - 2) {
                    throw w92.i();
                }
                int r43 = r32 + 1;
                byte b5 = bArr[r32];
                int r33 = r43 + 1;
                yc2.a(b3, b5, bArr[r43], bArr[r33], cArr, r8);
                r13 = r33 + 1;
                r8 = r8 + 1 + 1;
            }
        }
        return new String(cArr, 0, r8);
    }
}
