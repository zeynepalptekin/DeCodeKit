package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class aq {
    private static int a(int r4) {
        if (r4 == 513) {
            return 1;
        }
        if (r4 == 514) {
            return 2;
        }
        if (r4 == 769) {
            return 1;
        }
        switch (r4) {
            case b.i.p.i.i /* 257 */:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String strValueOf = String.valueOf(Long.toHexString(r4));
                throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(strValueOf) : new String("Unknown signature algorithm: 0x"));
        }
    }

    private static ByteBuffer b(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            int r4 = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(93);
            sb.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb.append(r4);
            throw new IOException(sb.toString());
        }
        int r0 = byteBuffer.getInt();
        if (r0 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (r0 <= byteBuffer.remaining()) {
            return c(byteBuffer, r0);
        }
        int r42 = byteBuffer.remaining();
        StringBuilder sb2 = new StringBuilder(101);
        sb2.append("Length-prefixed field longer than remaining buffer. Field length: ");
        sb2.append(r0);
        sb2.append(", remaining: ");
        sb2.append(r42);
        throw new IOException(sb2.toString());
    }

    private static ByteBuffer c(ByteBuffer byteBuffer, int r4) throws BufferUnderflowException {
        if (r4 < 0) {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(r4);
            throw new IllegalArgumentException(sb.toString());
        }
        int r0 = byteBuffer.limit();
        int r1 = byteBuffer.position();
        int r42 = r4 + r1;
        if (r42 < r1 || r42 > r0) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(r42);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(r42);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(r0);
        }
    }

    private static ByteBuffer d(ByteBuffer byteBuffer, int r4, int r5) {
        if (r5 < 8) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("end < start: ");
            sb.append(r5);
            sb.append(" < 8");
            throw new IllegalArgumentException(sb.toString());
        }
        int r0 = byteBuffer.capacity();
        if (r5 > byteBuffer.capacity()) {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("end > capacity: ");
            sb2.append(r5);
            sb2.append(" > ");
            sb2.append(r0);
            throw new IllegalArgumentException(sb2.toString());
        }
        int r02 = byteBuffer.limit();
        int r1 = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(r5);
            byteBuffer.position(8);
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            return byteBufferSlice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(r02);
            byteBuffer.position(r1);
        }
    }

    private static void e(int r1, byte[] bArr, int r3) {
        bArr[1] = (byte) r1;
        bArr[2] = (byte) (r1 >>> 8);
        bArr[3] = (byte) (r1 >>> 16);
        bArr[4] = (byte) (r1 >>> 24);
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a8 A[Catch: SignatureException -> 0x02d0, InvalidAlgorithmParameterException -> 0x02d2, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x02d4, InvalidKeySpecException -> 0x02d6, NoSuchAlgorithmException -> 0x02d8, TryCatch #5 {InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x02d4, blocks: (B:86:0x0192, B:88:0x01a8, B:89:0x01ab), top: B:155:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.security.cert.X509Certificate[] f(java.nio.ByteBuffer r22, java.util.Map<java.lang.Integer, byte[]> r23, java.security.cert.CertificateFactory r24) throws java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.io.IOException, java.security.InvalidKeyException, java.lang.SecurityException, java.security.InvalidAlgorithmParameterException {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aq.f(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] g(int[] r26, zg0[] zg0VarArr) throws DigestException {
        long j;
        zg0[] zg0VarArr2 = zg0VarArr;
        int length = zg0VarArr2.length;
        long j2 = 0;
        int r5 = 0;
        long size = 0;
        int r6 = 0;
        while (true) {
            j = 1048576;
            if (r6 >= length) {
                break;
            }
            size += ((zg0VarArr2[r6].size() + 1048576) - 1) / 1048576;
            r6++;
        }
        if (size >= 2097151) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Too many chunks: ");
            sb.append(size);
            throw new DigestException(sb.toString());
        }
        int r2 = (int) size;
        byte[][] bArr = new byte[r26.length][];
        for (int r7 = 0; r7 < r26.length; r7++) {
            byte[] bArr2 = new byte[(l(r26[r7]) * r2) + 5];
            bArr2[0] = 90;
            e(r2, bArr2, 1);
            bArr[r7] = bArr2;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        int length2 = r26.length;
        MessageDigest[] messageDigestArr = new MessageDigest[length2];
        for (int r13 = 0; r13 < r26.length; r13++) {
            String strJ = j(r26[r13]);
            try {
                messageDigestArr[r13] = MessageDigest.getInstance(strJ);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(String.valueOf(strJ).concat(" digest not supported"), e);
            }
        }
        int length3 = zg0VarArr2.length;
        int r14 = 0;
        int r16 = 0;
        while (r14 < length3) {
            zg0 zg0Var = zg0VarArr2[r14];
            long j3 = j2;
            int r20 = r16;
            int r18 = length3;
            long size2 = zg0Var.size();
            while (size2 > j2) {
                int r4 = (int) Math.min(size2, j);
                e(r4, bArr3, 1);
                for (int r3 = 0; r3 < length2; r3++) {
                    messageDigestArr[r3].update(bArr3);
                }
                long j4 = j3;
                try {
                    zg0Var.a(messageDigestArr, j4, r4);
                    int r32 = 0;
                    while (r32 < r26.length) {
                        int r1 = r26[r32];
                        byte[] bArr4 = bArr3;
                        byte[] bArr5 = bArr[r32];
                        int r12 = l(r1);
                        int r21 = length2;
                        MessageDigest messageDigest = messageDigestArr[r32];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int r8 = r20;
                        zg0 zg0Var2 = zg0Var;
                        int r22 = messageDigest.digest(bArr5, (r8 * r12) + 5, r12);
                        if (r22 != r12) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 46);
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(r22);
                            throw new RuntimeException(sb2.toString());
                        }
                        r32++;
                        r20 = r8;
                        bArr3 = bArr4;
                        length2 = r21;
                        messageDigestArr = messageDigestArr2;
                        zg0Var = zg0Var2;
                    }
                    long j5 = r4;
                    long j6 = j4 + j5;
                    size2 -= j5;
                    r20++;
                    bArr3 = bArr3;
                    messageDigestArr = messageDigestArr;
                    j = 1048576;
                    j3 = j6;
                    j2 = 0;
                } catch (IOException e2) {
                    StringBuilder sb3 = new StringBuilder(59);
                    sb3.append("Failed to digest chunk #");
                    sb3.append(r20);
                    sb3.append(" of section #");
                    sb3.append(r5);
                    throw new DigestException(sb3.toString(), e2);
                }
            }
            r5++;
            r14++;
            zg0VarArr2 = zg0VarArr;
            r16 = r20;
            length3 = r18;
            messageDigestArr = messageDigestArr;
            j2 = 0;
            j = 1048576;
        }
        byte[][] bArr6 = new byte[r26.length][];
        for (int r52 = 0; r52 < r26.length; r52++) {
            int r23 = r26[r52];
            byte[] bArr7 = bArr[r52];
            String strJ2 = j(r23);
            try {
                bArr6[r52] = MessageDigest.getInstance(strJ2).digest(bArr7);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(String.valueOf(strJ2).concat(" digest not supported"), e3);
            }
        }
        return bArr6;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.security.cert.X509Certificate[][] h(java.lang.String r18) throws java.io.IOException, com.google.android.gms.internal.ads.oh2, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aq.h(java.lang.String):java.security.cert.X509Certificate[][]");
    }

    private static X509Certificate[][] i(FileChannel fileChannel, bz1 bz1Var) throws SecurityException, CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferB = b(bz1Var.f2901a);
                int r5 = 0;
                while (byteBufferB.hasRemaining()) {
                    r5++;
                    try {
                        arrayList.add(f(b(byteBufferB), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(r5);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (r5 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j = bz1Var.f2902b;
                long j2 = bz1Var.f2903c;
                long j3 = bz1Var.d;
                ByteBuffer byteBuffer = bz1Var.e;
                if (map.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                mf2 mf2Var = new mf2(fileChannel, 0L, j);
                mf2 mf2Var2 = new mf2(fileChannel, j2, j3 - j2);
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                pi2.c(byteBufferDuplicate, j);
                a81 a81Var = new a81(byteBufferDuplicate);
                int size = map.size();
                int[] r52 = new int[size];
                Iterator it = map.keySet().iterator();
                int r7 = 0;
                while (it.hasNext()) {
                    r52[r7] = ((Integer) it.next()).intValue();
                    r7++;
                }
                try {
                    byte[][] bArrG = g(r52, new zg0[]{mf2Var, mf2Var2, a81Var});
                    for (int r4 = 0; r4 < size; r4++) {
                        int r6 = r52[r4];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(r6)), bArrG[r4])) {
                            throw new SecurityException(String.valueOf(j(r6)).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e2) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e2);
                }
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }

    private static String j(int r3) {
        if (r3 == 1) {
            return "SHA-256";
        }
        if (r3 == 2) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(r3);
        throw new IllegalArgumentException(sb.toString());
    }

    private static byte[] k(ByteBuffer byteBuffer) throws IOException {
        int r0 = byteBuffer.getInt();
        if (r0 < 0) {
            throw new IOException("Negative length");
        }
        if (r0 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[r0];
            byteBuffer.get(bArr);
            return bArr;
        }
        int r4 = byteBuffer.remaining();
        StringBuilder sb = new StringBuilder(90);
        sb.append("Underflow while reading length-prefixed value. Length: ");
        sb.append(r0);
        sb.append(", available: ");
        sb.append(r4);
        throw new IOException(sb.toString());
    }

    private static int l(int r3) {
        if (r3 == 1) {
            return 32;
        }
        if (r3 == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(r3);
        throw new IllegalArgumentException(sb.toString());
    }
}
