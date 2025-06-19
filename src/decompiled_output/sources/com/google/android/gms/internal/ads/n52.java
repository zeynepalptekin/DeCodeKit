package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class n52 implements pz1 {

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f4493a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4494b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f4495c;
    private byte[] d;

    public n52(byte[] bArr, int r5) throws GeneralSecurityException {
        d72.a(bArr.length);
        if (r5 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, min is 10 bytes");
        }
        if (r5 > 16) {
            throw new InvalidAlgorithmParameterException("tag size too large, max is 16 bytes");
        }
        this.f4493a = new SecretKeySpec(bArr, "AES");
        this.f4494b = r5;
        Cipher cipherB = b();
        cipherB.init(1, this.f4493a);
        byte[] bArrA = v52.a(cipherB.doFinal(new byte[16]));
        this.f4495c = bArrA;
        this.d = v52.a(bArrA);
    }

    private static Cipher b() throws GeneralSecurityException {
        return l62.f.a("AES/ECB/NoPadding");
    }

    @Override // com.google.android.gms.internal.ads.pz1
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        byte[] bArrD;
        Cipher cipherB = b();
        cipherB.init(1, this.f4493a);
        int r1 = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        if ((r1 << 4) == bArr.length) {
            bArrD = u52.b(bArr, (r1 - 1) << 4, this.f4495c, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (r1 - 1) << 4, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = Byte.MIN_VALUE;
            bArrD = u52.d(bArrCopyOf, this.d);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int r7 = 0; r7 < r1 - 1; r7++) {
            bArrDoFinal = cipherB.doFinal(u52.b(bArrDoFinal, 0, bArr, r7 << 4, 16));
        }
        byte[] bArrD2 = u52.d(bArrD, bArrDoFinal);
        byte[] bArr2 = new byte[this.f4494b];
        System.arraycopy(cipherB.doFinal(bArrD2), 0, bArr2, 0, this.f4494b);
        return bArr2;
    }
}
